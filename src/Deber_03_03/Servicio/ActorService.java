/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Deber_03_03.Servicio;

import Deber_03_03.Modelo.Actor;
import java.util.List;

/**
 *
 * @author Juano
 */
public interface ActorService {

    public abstract void crear(Actor actor);

    public abstract List<Actor> listar();

}
