/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Deber_03_03.Control;

import Deber_03_03.Modelo.Pelicula;
import Deber_03_03.Servicio.PeliculaServiceImpl;
import java.util.List;

/**
 *
 * @author Juano
 */
public class PeliculaControl {

    private final PeliculaServiceImpl peliculaServiceImpl;

    public PeliculaControl() {
        this.peliculaServiceImpl = new PeliculaServiceImpl();

    }

    public String crear(String[] data) {
        var retorno = "No se pudo crear la pelicula:";

        var codigoGenero = Integer.valueOf(data[0]).intValue();
        var nombrePelicula = data[1];
        var yearLanzamiento = Integer.valueOf(data[2]).intValue();
        var idioma = data[3];
        var clasificacion = data[4];
        var duracion = Integer.valueOf(data[5]).intValue();
        var reseña = data[6];

        if (yearLanzamiento < 1980) {
            retorno += " Año de lanzamiento incorrecto.";

        } else {
            if (duracion < 0) {
                retorno += " Duracion de pelicula incorrecto.";

            } else {
                var pelicula = new Pelicula(codigoGenero, nombrePelicula, yearLanzamiento, idioma, clasificacion, duracion, reseña);

                this.peliculaServiceImpl.crear(pelicula);
            }
        }
        return retorno;

    }

    public List<Pelicula> Listar() {
        return this.peliculaServiceImpl.listar();

    }

}
