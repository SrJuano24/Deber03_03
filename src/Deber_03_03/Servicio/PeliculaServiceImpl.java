/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Deber_03_03.Servicio;


import Deber_03_03.Modelo.Pelicula;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Juano
 */
public class PeliculaServiceImpl implements PeliculaService {

    private final List<Pelicula> peliculaList;

    public PeliculaServiceImpl() {
        this.peliculaList = new ArrayList<>();
    }

    @Override
    public void crear(Pelicula pelicula) {
        this.peliculaList.add(pelicula);
    }

    @Override
    public List<Pelicula> listar() {
        return this.peliculaList;
    }

}
