/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Deber_03_03.Modelo;

/**
 *
 * @author Juano
 */
public class Personaje {

    private String nombrePersonaje;
    private int edadPersonaje;
    private String rol;
    private int calificacion;
    private String descripcionPersonaje;

    private Actor interprete;
    private Pelicula film;

    public Personaje(String nombrePersonaje, int edadPersonaje, String rol, int calificacion, String descripcionPersonaje) {
        this.nombrePersonaje = nombrePersonaje;
        this.edadPersonaje = edadPersonaje;
        this.rol = rol;
        this.calificacion = calificacion;
        this.descripcionPersonaje = descripcionPersonaje;
        
    }

    public String getNombrePersonaje() {
        return nombrePersonaje;
    }

    public void setNombrePersonaje(String nombrePersonaje) {
        this.nombrePersonaje = nombrePersonaje;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public Actor getInterprete() {
        return interprete;
    }

    public void setInterprete(Actor interprete) {
        this.interprete = interprete;
    }

    public Pelicula getFilm() {
        return film;
    }

    public void setFilm(Pelicula film) {
        this.film = film;
    }

    public int getEdadPersonaje() {
        return edadPersonaje;
    }

    public void setEdadPersonaje(int edadPersonaje) {
        this.edadPersonaje = edadPersonaje;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    public String getDescripcionPersonaje() {
        return descripcionPersonaje;
    }

    public void setDescripcionPersonaje(String descripcionPersonaje) {
        this.descripcionPersonaje = descripcionPersonaje;
    }

    @Override
    public String toString() {
        return "Personaje{" + "nombrePersonaje=" + nombrePersonaje
                + ", edadPersonaje=" + edadPersonaje + ", rol="
                + rol + ", calificacion=" + calificacion
                + ", descripcionPersonaje=" + descripcionPersonaje
                + ", interprete=" + interprete + ", film=" + film + '}';
    }

}
