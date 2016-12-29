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
public class RobotDefensivo implements Robot {

    List<Integer> acciones;
    
    public RobotDefensivo(){}
    
    private void iniciar(){
        System.out.println("Robot Defensivo iniciado");
    }
    
    private void activarse(){
        System.out.println("Robot Defensivo activando escudo");
    }
    
    private void moverse(){
        System.out.println("Robot Defensivo moviendose...");
    }
    
    private void terminar(){
        System.out.println("Robot Defensivo detenido");
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
