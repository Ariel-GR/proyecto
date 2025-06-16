/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package almundo.com;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 *
 * @author Ariel Risoluto.
 */
public abstract class Persona{
    String nombre;
    String apellido;
    String id_user;
    String password;
    int dni;
    String mail;
    Date fechaDeAlta;

    public Persona(String nombre,String apellido, String id_user, String Password, int Dni, String mail, String fecha) throws ParseException {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id_user = id_user;
        this.password = Password;
        this.dni = Dni;
        this.mail = mail;
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        this.fechaDeAlta = formato.parse(fecha);
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getId_user() {
        return id_user;
    }

    public String getPassword() {
        return password;
    }

    public int getDni() {
        return dni;
    }

    public String getMail() {
        return mail;
    }

    public Date getFecha() {
        return fechaDeAlta;
    }
    
    
    public abstract boolean inciarSession(Sistema sistema);
    
    public boolean buscarCredenciales(String credenciales){
        return credenciales.equals(id_user+":"+password);
    }
    
}
