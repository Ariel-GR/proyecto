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
public class Vendedor extends Usuario implements MenuVendedor{

    public Vendedor(String nombre, String apellido, String id_user, String Password, int Dni, String mail, String fecha) throws ParseException {
        super(nombre, apellido, id_user, Password, Dni, mail, fecha);
    }


    @Override
    public boolean inciarSesion(BaseDeDatos sistema) {
        mostrarTexto("hola VENDEDOR ");
        return false;
    }

    @Override
    public void menu(BaseDeDatos baseDeDatos) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


}
