/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Deber_03_03.Vista;

import Deber_03_03.Control.PeliculaControl;

/**
 *
 * @author Juano
 */
public class Principal {

    public static void main(String[] args) {

        var ventanaPelicula = new Ventana_Pelicula();
        ventanaPelicula.setVisible(true);
        ventanaPelicula.setLocation(10, 20);
        var ventanaActor = new Ventana_Actor();
        ventanaActor.setVisible(true);
        ventanaActor.setLocation(630, 20);
        var ventanaPersonaje = new Ventana_Personaje();
        ventanaPersonaje.setVisible(true);
        ventanaPersonaje.setLocation(630, 440);

    }

}
