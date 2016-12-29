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
public final class Singleton { //clase de tipo final para evitar cambios en ella
    private static final Singleton singleton = new Singleton(); //se hace la unica instancia de tipo final para evitar cambios
    
    private Singleton(){
        System.out.println("Creado solo una vez"); //Para no poder instanciar esta clase su constructor debe ser privado
    }
    
    public static Singleton obtenerSingleton(){
                                                //se retorna ya la unica instancia por medio del metodo estatico
        return singleton;
    }
}
