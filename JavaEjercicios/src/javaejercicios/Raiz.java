/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaejercicios;

/**
 * @(#)Raiz.java
 *
 *
 * @author 
 * @version 1.00 2013/2/18
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.*;
public class Raiz {
    public static void main (String[] args)throws IOException {
		int num=0;
		double raiz=0;
		BufferedReader in= new BufferedReader(new InputStreamReader (System.in));
		System.out.println("Dame un numero: ");
		num=Integer.parseInt(in.readLine());
		raiz=Math.sqrt(num);
		System.out.println("La raiz cuadrada es: "+raiz);
		
	}    
}
