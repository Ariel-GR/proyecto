/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package almundo.com;

import static almundo.com.VerificarDato.*;
import static almundo.com.VistaConsola.*;
import java.text.ParseException;

/**
 *
 * @author Ariel Risoluto.
 */
public class AMBCliente implements MenuAdministrador, MenuVendedor {

    @Override
    public void menu(BaseDeDatos baseDeDatos) {
        int opcion;
        
        opcion = leerNro("1) ALTA DE USUARIO\n"+
                "Igrese el nro de la opcion deseada:");
        
        switch (opcion) {
            case 1:
                try {
                    altaCliente(baseDeDatos);
                } catch (ParseException ex) {       
                }
                break;

           
        }
    }
    
     private void altaCliente(BaseDeDatos baseDeDatos) throws ParseException{
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
        /*se debe agragar el servio contratado por el cliente los cuales puden tener 1 o mas o ninguno por el momento asignado*/
        do {
            mostrarTexto("-SISTEMA DE ALTA DE CLIENTES-\n");
            
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
        
        
        opc1 = leerNro("Seleccione el tipo de reserva para el cliente\n"+
                "1) Ingresar a un Cliente\n"+
                "--SALIR 0--\n"+
                "Igrese el nro de la opcion deseada: ");
        
        switch (opc1) {

            case 1 -> {
  
                if(!comprobarUsuario){
                    Usuario p = new Cliente(nombre,apellido,idUser,password,dni,email,fecha);
                    baseDeDatos.getPersona().add(p);
                }
            }
            
        }
    }
    
}
