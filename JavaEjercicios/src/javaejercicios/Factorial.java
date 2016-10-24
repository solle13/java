/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaejercicios;

/**
 * @(#)Factorial.java
 *
 *
 * @author 
 * @version 1.00 2013/2/18
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.*;
public class Factorial {
    public static void main (String[] args)throws IOException {
    int num=0,i=0,fact=1;
    System.out.println("Introduce un numero para saber su factorial: ");
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	num=Integer.parseInt(in.readLine());
	for(i=1;i<=num;i++){
		fact=i*fact;
	}
	System.out.println("El factorial es: "+fact);
	}
}
