/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package almundo.com;

import java.text.SimpleDateFormat;
import java.util.Date;


/**
 *
 * @author Ariel Risoluto.
 */
public class Vuelo extends Servicio{
    
    private String origen;
    private String destino;
    private final int  plazasTotales;
    private int plazasTuristaDisponibles;
    private Date fechaDelVuelo;

    public Vuelo(String origen, String destino, int plazasTotales, int plazasTuristaDisponibles, Date fechaDelVuelo, String tipoDeServicio, String nombreEmpresa) {
        super(tipoDeServicio, nombreEmpresa);
        this.origen = origen;
        this.destino = destino;
        this.plazasTotales = plazasTotales;
        this.plazasTuristaDisponibles = plazasTuristaDisponibles;
        this.fechaDelVuelo = fechaDelVuelo;
    }
    

    @Override
    public void mostrarServicio() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


}
