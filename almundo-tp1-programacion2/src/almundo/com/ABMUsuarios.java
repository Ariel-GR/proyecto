/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package almundo.com;
import static almundo.com.VerificarDato.*;
import static almundo.com.VistaConsola.*;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Ariel Risoluto.
 */
public class ABMUsuarios implements MenuAdministrador {

    @Override
    public void menu(BaseDeDatos baseDeDatos) {
        
        int opcion;
        
        opcion = leerNro("1) ALTA DE USUARIO\n"+
                "2) BAJA DE USUARIO\n"+
                "3) ALTA DE MODIFICACION\n"+
                "--SALIR 0--\n"+
                "Igrese el nro de la opcion deseada:");
        
        switch (opcion) {
            case 1:
                try {
                    altaUsuario(baseDeDatos);
                } catch (ParseException ex) {       
                }
                break;
 
        }
  
    }
    
    private void altaUsuario(BaseDeDatos baseDeDatos) throws ParseException{
        int opc1;
        int opc2;
        boolean validar = false;
        boolean comprobarUsuario = false;
        String nombre = "";
        String apellido = "";
        String idUser = "";
        String password = "";
        String email = "";
        String fecha = "";
        int dni = 0;

        do {
            mostrarTexto("-SISTEMA DE ALTA DE USUARIOS-\n");
            
            opc2 = leerNro("Ingresar/Corregir datos -1- terminar -0-: ");
                if(opc2 == 1){
                    try {
                        nombre = leerString("ingrese el nombre: ");
                        apellido = leerString("ingrese el apellido: ");
                        idUser = leerString("ingrese el ID User: ");
                        password = leerString("ingrese el password: ");
                        dni = leerNro("Ingrese el DNI: ");
                    } catch (Exception e) {
                            mostrarTexto("se ingresando un tipo de dato inconrrecto");
                    }

                    comprobarUsuario= baseDeDatos.buscarUsuario(idUser);
                        
                    if((validarIngreso(nombre) || validarIngreso(apellido) || validarIngreso(idUser) || validarIngreso(password) || validarIngreso(dni) || comprobarUsuario)){
                        validar = true;
                       }
                }
        }while(validar && opc2!=0);
        
        
        opc1 = leerNro("Seleccione un rol para el usuario\n"+
                "1) Ingresar a un Administrador\n"+
                "2) Ingresar a un Vendedor\n"+
                "3) Ingresar a un Cliente\n"+
                "--SALIR 0--\n"+
                "Igrese el nro de la opcion deseada: ");
        
        switch (opc1) {
            
            case 1 -> {

                if(!comprobarUsuario){
                    Usuario p = new Administrador(nombre,apellido,idUser,password,dni,email,fecha);
                    baseDeDatos.getPersona().add(p);
                }
            }
            
            case 2 -> {
                
                if(!comprobarUsuario){
                    Usuario p = new Vendedor(nombre,apellido,idUser,password,dni,email,fecha);
                    baseDeDatos.getPersona().add(p);
                }
            }
            
        }
    }
        
       
}
