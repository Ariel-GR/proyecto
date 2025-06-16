/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package almundo.com;

import java.util.ArrayList;
import static almundo.com.VistaConsola.*;
/**
 *
 * @author Ariel Risoluto.
 */
public class Sistema{
    private ArrayList<Persona> persona;
    //private ArrayList<Sucursal> sucursal;

    public Sistema() {
       persona = new ArrayList<Persona>();
       //sucursal = new ArrayList<Sucursal>();
    }

    public ArrayList<Persona> getPersona() {
        return this.persona;
    }
    
    public Persona buscarUsuario(String credenciales) {

        for (Persona p : persona) {
            if (p.buscarCredenciales(credenciales)) {
                mostrarTexto("\n---Usuario Encontrado---\n");
                return p;
            }
        }
        return null;
    }
    
}
