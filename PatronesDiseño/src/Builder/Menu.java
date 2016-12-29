/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Builder;

import java.util.Scanner;

/**
 *
 * @author Rikardo
 */
public class Menu {
    public static void main(String[]args){
        
        Scanner sc = new Scanner(System.in);
        Builder Constructor = new Builder();
        Robot robot;
        int tipoRobot;
        int accion;
        int res;
        boolean flag=true;
        
        System.out.println("Que tipo de robot elije: 1)Ofensivo 2)Defensivo");
        tipoRobot = sc.nextInt();
        
        Constructor.setRobot(tipoRobot);
        System.out.println("Dar acciones al robot...");
        while(flag){
            System.out.println("1)Activarse 2)Moverse");
            accion = sc.nextInt();
            switch(accion){
                case 1:
                    Constructor.addActivar();
                    break;
                case 2:
                    Constructor.addMover();
                    break;
                default:
                    System.out.println("Opcion invalida");
            }
            System.out.println("¿Desea dar otra accion al robot? 1)Si 2)No");
            res = sc.nextInt();
            if(res==2)
                flag=false;
        }
        robot = Constructor.getRobot();
        robot.Iniciar();
    }
}
