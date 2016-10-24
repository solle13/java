/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaejercicios;

/**
 * @(#)Arreglos.java
 *
 *
 * @author 
 * @version 1.00 2013/2/13
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class Arreglos {
    public static void main(String[]args)throws IOException{
   	ArrayList Arre1= new ArrayList();
   	int x=0,y=0,z=0;
   	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
   	System.out.println("Dame 3 numeros enteros: ");
   	System.out.println("Dame el primer numero");
   	x=Integer.parseInt(in.readLine());
   	System.out.println("Dame el segundo numero");
   	y=Integer.parseInt(in.readLine());
   	System.out.println("Dame el Tercer numero");
   	z=Integer.parseInt(in.readLine());
   	Arre1.add(new Integer(x));
   	Arre1.add(new Integer(y));
   	Arre1.add(1,new Integer(z));
   	System.out.println("Primer numero "+Arre1.get(0));
   	System.out.println("Segundo numero "+Arre1.get(1));
   	System.out.println("Tercer numero "+Arre1.get(2));
   	
   }
}
