/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Builder;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Rikardo
 */
public class Builder {
    Robot robot;
    List<Integer> acciones;
    
    public Builder(){
        acciones = new ArrayList<>();
    }
    
    public void setRobot(int i){
        if(i==1){
            robot = new RobotOfensivo();
        }
        else{
            robot = new RobotDefensivo();
        }
    }
    
    public void addActivar(){
        acciones.add(1);
    }
    
    public void addMover(){
        acciones.add(2);
    }
    
    public Robot getRobot(){
        robot.cargarAcciones(acciones);
        return robot;
    }
}
