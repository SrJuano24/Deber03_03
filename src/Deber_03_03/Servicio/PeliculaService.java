/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Deber_03_03.Servicio;


import Deber_03_03.Modelo.Pelicula;

import java.util.List;

/**
 *
 * @author Juano
 */
public interface PeliculaService {

    public abstract void crear(Pelicula pelicula);
   

    public abstract List<Pelicula> listar();
    

}
