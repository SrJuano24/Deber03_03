/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Deber_03_03.Servicio;

import Deber_03_03.Modelo.Personaje;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Juano
 */
public class PersonajeServiceImpl implements PersonajeService {

    private final List<Personaje> personajeList;

    public PersonajeServiceImpl() {
        this.personajeList = new ArrayList<>();
    }

    @Override
    public void crear(Personaje personaje) {
        this.personajeList.add(personaje);
    }

    @Override
    public List<Personaje> listar() {
        return this.personajeList;
    }

}
