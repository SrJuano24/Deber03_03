/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Deber_03_03.Control;

import Deber_03_03.Modelo.Personaje;
import Deber_03_03.Servicio.PersonajeServiceImpl;
import java.util.List;

/**
 *
 * @author Juano
 */
public class PersonajeControl {
    
    private final PersonajeServiceImpl personajeServiceImpl;
    
    public PersonajeControl() {
        this.personajeServiceImpl = new PersonajeServiceImpl();
    }
    
    public String crear(String[] data) {
        var retorno = "No se pudo crear la pelicula:";
        
        var nombrePersonaje = data[0];
        var edadPersonaje = Integer.valueOf(data[1]).intValue();
        var rol = data[2];
        var calificacion = Integer.valueOf(data[3]).intValue();
        var descripcionPersonaje = data[4];
        
        if (edadPersonaje < 0) {
            retorno += " Edad del personaje incorrecto.";
            
        } else {
            if (calificacion < 0) {
                retorno += " Calificacion del perosonaje incorrecto.";
                
            } else {
                var personaje = new Personaje(nombrePersonaje, edadPersonaje, rol, calificacion, descripcionPersonaje);
                this.personajeServiceImpl.crear(personaje);
                
                retorno = "Actor: " + personaje.getNombrePersonaje() + " Creado correctamente: ";
            }
        }
        return retorno;
        
    }
    
    public List<Personaje> Listar() {
        return this.personajeServiceImpl.listar();
        
    }
}
