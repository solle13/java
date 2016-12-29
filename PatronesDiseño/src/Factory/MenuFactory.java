/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory;

import java.util.Scanner;

/**
 *
 * @author Rikardo
 */
public class MenuFactory {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        Factory miFabrica;
        Conexion miConexion;
        System.out.println("Base de datos:");
        String tipo = sc.nextLine();
       
        miFabrica = new Factory(tipo);
        miConexion = miFabrica.crearConexion();
       
        System.out.println("Exito: "+miConexion.conexion());
    }
}
