/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Builder;

import java.util.List;

/**
 *
 * @author Rikardo
 */
public class RobotOfensivo implements Robot {

    List<Integer> acciones;
    
    public RobotOfensivo(){}
    
    private void iniciar(){
        System.out.println("Robot Ofensivo iniciado");
    }
    
    private void activarse(){
        System.out.println("Robot Ofensivo dispara 1 vez");
    }
    
    private void moverse(){
        System.out.println("Robot Ofensivo moviendose...");
    }
    
    private void terminar(){
        System.out.println("Robot Ofensivo detenido");
    }
    
    
    @Override
    public void Iniciar() {
        iniciar();
        for(Integer i:acciones){
            switch(i){
                case 1:
                    activarse();
                    break;
                case 2:
                    moverse();
                    break;
                default :
                    System.out.println("No puedo hacer eso!!!");
            }
        }
        terminar();
    }

    @Override
    public void cargarAcciones(List<Integer> accion) {
        this.acciones = accion;
    }
    
}
