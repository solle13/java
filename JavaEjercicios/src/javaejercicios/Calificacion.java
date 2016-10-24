/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaejercicios;

/**
 * @(#)Calificacion.java
 *
 *
 * @author 
 * @version 1.00 2013/2/13
 */

import java.io.*;
public class Calificacion {
    public static void main(String[]args){
		int x=0;
		System.out.println("Introduce la calificacion");
		try{
			InputStreamReader in= new InputStreamReader (System.in);
			BufferedReader buffer= new BufferedReader(in);
			x=Integer.parseInt(buffer.readLine());
			if((x<6 ) && (x>0)){
				System.out.println("Reprobaste");
				}
				else
				if((x>5) && (x<8)){
					System.out.println("Apenas pasaste");
					}
					else
					if((x>7) && (x<10)){
						System.out.println("Bien");
						}
						else
						if(x==10){
							System.out.println("Excelente");
							}
							else{
								System.out.println("Valor no dentro del rango");
							}
			}
			catch(Exception e){
				System.out.println("Error");
			}
		
		}
}
