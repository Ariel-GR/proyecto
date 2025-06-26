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
public abstract class Servicio {
    private String tipoDeServicio;
    private String nombreEmpresa;
    private ArrayList<Usuario> usuario;

    public Servicio(String tipoDeServicio, String nombreEmpresa) {
        this.tipoDeServicio = tipoDeServicio;
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getTipoDeServicio() {
        return tipoDeServicio;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }
    
    public abstract void mostrarServicio();
}
  