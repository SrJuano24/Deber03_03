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
    private String rol;
    private Actor interprete;
    private Pelicula film;

    public Personaje(String nP, String r, Actor i, Pelicula f) {

        this.nombrePersonaje = nP;
        this.rol = r;
        this.interprete = i;
        this.film = f;

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

    @Override
    public String toString() {
        return "Personaje{" + "nombrePersonaje=" + nombrePersonaje + ", rol=" + rol + ", interprete=" + interprete + ", film=" + film + '}';
    }

   

}
