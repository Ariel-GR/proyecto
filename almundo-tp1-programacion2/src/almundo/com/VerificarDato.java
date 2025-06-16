/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package almundo.com;

import static almundo.com.VistaConsola.mostrarTexto;

/**
 *
 * @author Ariel Risoluto.
 */
public class VerificarDato {
    
    public static boolean validarIngreso(String dato){
        boolean validar = (dato.equals(""));

        if (validar) {
            mostrarTexto("\n***Sean ingresado datos vacios ! ! !***\n"
                    + "Por favor ingrese nuevamente\n");
        }
        return validar;
    }
    
}
