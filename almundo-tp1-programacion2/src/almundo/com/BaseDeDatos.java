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
public class BaseDeDatos{
    private ArrayList<Usuario> persona;
    private ArrayList<Sucursal> sucursal;
    private ArrayList<Servicio> servicio;

    public BaseDeDatos() {
       persona = new ArrayList<Usuario>();
       sucursal = new ArrayList<Sucursal>();
       servicio = new ArrayList<Servicio>();
    }

    public ArrayList<Servicio> getServicio() {
        return servicio;
    }

    public ArrayList<Usuario> getPersona() {
        return this.persona;
    }

    public ArrayList<Sucursal> getSucursal() {
        return sucursal;
    }

    public Usuario verificarCrdenciales(String credenciales) {

        for (Usuario p : persona) {
            if (p.buscarCredenciales(credenciales)) {
                mostrarTexto("\n---Usuario Encontrado---\n");
                return p;
            }
        }
        return null;
    }
    
    public boolean buscarUsuario(String id){
        for (Usuario p : persona) {
            if (p.getId_user().equals(id)) {
                mostrarTexto("\n---El usaurio ya se encuentra registrado ---\n");
                return true;
            }
        }
        return false;
    }
  
}
