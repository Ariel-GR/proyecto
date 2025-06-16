/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package almundo.com;
import static almundo.com.VerificarDato.*;
import static almundo.com.VistaConsola.*;
/**
 *
 * @author Ariel Risoluto.
 */
public class ControlDeIngreso {
    
    private String user;
    private String pass;
    private boolean validar = true;
    
    Sistema s = new Sistema();
   
    public void ejecutar(){

        
        
        try{
            
            mostrarTexto("Bienvenido al sistema de Almundo.com");
            s.getPersona().add(new Administrador("Juan", "Pérez", "Jperez", "1234pass", 12345678, "juan@example.com", "05/03/1990"));
            s.getPersona().add(new Vendedor("Lucía", "Martínez", "Lmartinez", "ventapass", 23456789, "lucia@example.com", "10/05/1979"));
            s.getPersona().add(new Cliente("Andrés", "Ramírez", "Aramirez", "comprapass", 34567890, "andres@example.com","22/03/2000"));
            
            while(validar){
                do {
                    this.user = leerString("Ingrese su Usuario: ");
                    this.pass = leerString("Ingrese su Contraseña: ");

                }while(validarIngreso(user) || validarIngreso(pass));
            
                Persona p = s.buscarUsuario(user+":"+pass);
            
                if(p == null){
                    mostrarTexto("Usuario no encontrado");
                }else{
                    validar = p.inciarSession(s);
                }
            
            }
            mostrarTexto("programa terminado !!!");
            
            
        } catch (Exception e) {
        }
        
    
    //persona.inciarSession(sistema);
    //emplado.trabajar(sistema);
    //hacen lo mismo, empleado deberia elminarse y ser un interfaz no una clase abastracta ...pero que hago con los atributos de sueldo y nroLegajo?
    }
    
}
