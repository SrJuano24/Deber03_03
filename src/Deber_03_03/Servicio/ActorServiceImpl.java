/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Deber_03_03.Servicio;

import Deber_03_03.Modelo.Actor;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Juano
 */
public class ActorServiceImpl implements ActorService {

    private static List<Actor> actorList;

    public ActorServiceImpl() {
        this.actorList = new ArrayList<>();
    }

    @Override
    public void crear(Actor actor) {
        this.actorList.add(actor);
    }

    @Override
    public Actor buscarPorCodigo(int codigo) {
        Actor retorno = null;
        for (var actor : this.actorList) {
            if (codigo == actor.getCodigoActor()) {
                retorno = actor;
                break;
            }
        }
        return retorno;
    }

    @Override
    public List<Actor> listar() {
        return this.actorList;
    }

}
