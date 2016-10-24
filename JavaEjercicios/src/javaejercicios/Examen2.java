/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaejercicios;

/**
 * @(#)examen2.java
 *
 *
 * @author 
 * @version 1.00 2013/3/20
 */

import java.io.*;
import java.util.*;
public class Examen2 {
    public static void main (String[] args) {
		int a=0,b=0,opc=0;
		float c=0,d=0;
		System.out.println("Que operacion quieres hacer: 1)Suma 2)Resta 3)Multiplicación 4)Division");
		Scanner in= new Scanner(System.in);
		opc=in.nextInt();
		if(opc>0 && opc<5){
			if(opc==1){
				System.out.println("Introduce los numeros a sumar: " );
				a=in.nextInt();
				System.out.println("+");
				b=in.nextInt();
				System.out.println("El resultado es: "+operacion(a,b));
				}
				else
					if(opc==2){
						System.out.println("Introduce los numeros a restar: " );
						a=in.nextInt();
						System.out.println("-");
						b=in.nextInt();
						System.out.println("El resultado es: "+operacion(a,b));
						}
						else
							if(opc==3){
								System.out.println("Introduce los numeros a multiplicar: " );
								c=in.nextFloat();
								System.out.println("* ");
								d=in.nextFloat();
								System.out.println("El resultado es: "+operacion(c,d));
								}
								else{
									System.out.println("Introduce los numeros a dividir: " );
									c=in.nextFloat();
									System.out.println("/");
									d=in.nextFloat();
									System.out.println("El resultado es: "+operacion(c,d));
									}
			}
		}
		public static int operacion(int a,int b){
			return a+b;
			}
		public static float operacion(float c,float d){
			return c*d;
			}
}
