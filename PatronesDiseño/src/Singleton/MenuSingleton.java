/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Singleton;

/**
 *
 * @author Rikardo
 */
public class MenuSingleton {
    public static void main(String[]args){
        Singleton misingleton = Singleton.obtenerSingleton();
        Singleton misingleton2 = Singleton.obtenerSingleton();
        Singleton misingleton3 = Singleton.obtenerSingleton();
        //Al correr el programa solo se ejecuta una sola vez el constructor aun si mandamos a llamar muchas veces el metodo
    }
}
