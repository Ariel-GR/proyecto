/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package almundo.com;

import java.text.ParseException;
import java.util.Date;
import static almundo.com.VistaConsola.*;

/**
 *
 * @author Ariel Risoluto.
 */
public class Administrador extends Usuario implements MenuAdministrador{
    

    public Administrador(String nombre, String apellido, String id_user, String Password, int Dni, String mail, String fecha) throws ParseException {
        super(nombre, apellido, id_user, Password, Dni, mail, fecha);
    }

    @Override
    public boolean inciarSesion(BaseDeDatos baseDeDatos) {
        mostrarTexto("Bienvenido Admin");
        menu(baseDeDatos);
        
        return false;
    }

    @Override
    public void menu(BaseDeDatos baseDeDatos) {
        
        
        int opcion=0;
        opcion = leerNro("elejir opcion");
        
        switch (opcion) {
            case 1:
                administrar(new ABMUsuarios(),baseDeDatos);
                break;
                
            case 2:
                administrar(new ABMServicio(),baseDeDatos);
                break;
        

            default:
                throw new AssertionError();
        }
        
    }
    
    public void administrar(MenuAdministrador trabajar,BaseDeDatos baseDeDatos){
        trabajar.menu(baseDeDatos);
    }

    
}                      
