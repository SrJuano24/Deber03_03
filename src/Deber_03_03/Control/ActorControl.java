/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Deber_03_03.Control;

import Deber_03_03.Modelo.Actor;
import Deber_03_03.Servicio.ActorServiceImpl;
import java.util.List;

/**
 *
 * @author Juano
 */
public class ActorControl {

    private final ActorServiceImpl actorServiceImpl;

    public ActorControl() {
        this.actorServiceImpl = new ActorServiceImpl();
    }

    public String crear(String[] data) {
        var retorno = "No se pudo crear el actor:";

        var codigoActor = Integer.valueOf(data[0]).intValue();
        var nombreActor = data[1];
        var lugarNacimiento = data[2];
        var edad = Integer.valueOf(data[3]).intValue();
        var genero = data[4];
        var nominaciones = data[5];
        var numeroNominaciones = Integer.valueOf(data[6]).intValue();

        if (edad < 1) {
            retorno += " Edad incorrecta.";

        } else {
            if (numeroNominaciones < 1) {
                retorno += " Numero de nominaciones incorrecto.";

            } else {
                var actor = new Actor(codigoActor, nombreActor, lugarNacimiento, edad, genero, nominaciones, numeroNominaciones);

                this.actorServiceImpl.crear(actor);
                retorno = "Actor: " + actor.getNombreActor() + " Creado correctamente: ";
            }
        }
        return retorno;

    }

    public List<Actor> Listar() {
        return this.actorServiceImpl.listar();

    }

}
