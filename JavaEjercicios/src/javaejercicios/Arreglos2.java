/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaejercicios;

/**
 * @(#)Arreglos2.java
 *
 *
 * @author 
 * @version 1.00 2013/4/22
 */

import java.util.*;
public class Arreglos2 {
    public static void main(String [] arg)
	{
	double array[], temp=0;
	int n, i, j,t=0;
	Scanner in = new Scanner(System.in);

	do{
	   System.out.println("Tamaño del Arreglo:");
	    n=in.nextInt();
	  } while(n<=0 || n>20);
 	array= new double[n];
	
	System.out.println("Arreglo 1");
	for(i=0;i<n;i++)
	   {
	    System.out.print("[" +i+"]: ");
	    array[i]=in.nextDouble();
	   }
	t=n-1;
	for(i=0;i<=n/2;i++){
		temp=array[i];
		array[i]=array[t];
		array[t]=temp;
		t=t-1;
		}

	System.out.println("Arreglo Invertido:");
	for(i=0;i<n;i++){
 	   System.out.println("[" +i+ "]: "+ array[i]);
		}    
}
}
