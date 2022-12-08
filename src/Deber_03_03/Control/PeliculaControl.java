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

        var nombrePelicula = data[0];
        var codigoGenero = data[1];
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
                var pelicula = new Pelicula(nombrePelicula, codigoGenero, yearLanzamiento, idioma, clasificacion, duracion, reseña);

                this.peliculaServiceImpl.crear(pelicula);
                retorno = "Pelicula: "+pelicula.getNombrePelicula()+" Creada correctamente: ";
            }
        }
        return retorno;

    }

    public List<Pelicula> Listar() {
        return this.peliculaServiceImpl.listar();

    }

}
