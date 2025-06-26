/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package almundo.com;

import java.util.ArrayList;

/**
 *
 * @author Ariel Risoluto.
 */
public class Hotel extends Servicio{
    
    
    private String codHotel;
    private String direccion;
    private int telefono;
    private String email;
    private int plazasDisponibles;
    private String tipoPension;
    private ArrayList<habitacion> habitacion;

    public Hotel(String codHotel, String direccion, int telefono, String email, int plazasDisponibles, String tipoPension, String tipoDeServicio, String nombreEmpresa) {
        super(tipoDeServicio, nombreEmpresa);
        this.codHotel = codHotel;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
        this.plazasDisponibles = plazasDisponibles;
        this.tipoPension = tipoPension;
        habitacion = new ArrayList<habitacion>();
    }

    public String getCodHotel() {
        return codHotel;
    }

    public String getDireccion() {
        return direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public String getEmail() {
        return email;
    }

    public int getPlazasDisponibles() {
        return plazasDisponibles;
    }

    public String getTipoPension() {
        return tipoPension;
    }

    public ArrayList<habitacion> getHabitacion() {
        return habitacion;
    }
            
    @Override
    public void mostrarServicio() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
