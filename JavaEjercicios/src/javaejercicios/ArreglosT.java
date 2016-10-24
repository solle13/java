/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaejercicios;

/**
 * @(#)ArreglosT.java
 *
 *
 * @author 
 * @version 1.00 2013/4/21
 */

import java.util.*;
public class ArreglosT {
    public static void main(String[]args){
		Scanner in =new Scanner(System.in);
		double x[],mayor,menor,promedio=0,suma=0;
		int n,i;

		do{
			System.out.print("Cantidad de Elementos en el Arreglo: ");
			n=in.nextInt();
			}while((n==0) || (n>100));
		x=new double [n];
		for(i=0;i<n;i++){
			System.out.print("x["+i+i+"]:");
			x[i]=in.nextDouble();
		}
		System.out.println("Elementos del Arreglo");
		for(i=0;i<n;i++){
			System.out.println("x["+i+"]:"+x[i]);
		}
		//Calcula el Mayor y el menor//
		mayor=menor=x[0];
		for(i=1;i<n;i++){
			if(x[i]>mayor)
					mayor=x[i];
				else
					if(x[i]<menor)
							menor=x[i];
		}
		//Calculo de la Suma de los elemnetos//
		for(i=0;i<n;i++){
			suma=suma+x[i];
			promedio=suma/n;
		}
		System.out.println("El Mayor es:"+mayor);
		System.out.println("El Menores:"+menor);
		System.out.println("El Promedio es:"+promedio);

		}
}
