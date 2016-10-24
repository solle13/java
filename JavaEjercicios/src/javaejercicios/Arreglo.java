/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaejercicios;

/**
 * @(#)Arreglo.java
 *
 *
 * @author 
 * @version 1.00 2013/4/22
 */

import java.util.*;
public class Arreglo {
    public static void main(String[]args){
		double arre[];
		double arre2[];
		Scanner in= new Scanner(System.in);
		int n,n2,i;
		do{
			System.out.println("De que tamaño sera el arreglo: ");
			n=in.nextInt();
			}while(n<=0 || n>11);
		n2=n-1;
		arre=new double[n];
		arre2=new double[n];
		for(i=0;i<n;i++){
			System.out.println("Introduce un valor: ");
			arre[i]=in.nextInt();
			}
		System.out.println("Elementos en el arreglo ");
		for(i=0;i<n;i++){
			System.out.println("arre"+i+"="+arre[i]);
			}
		for(i=0;i<n;i++){
			arre2[i]=arre[n2];
			n2=n2-1;
			}
		System.out.println("Elementos invertidos");
		for(i=0;i<n;i++){
			System.out.println("arre"+i+"="+arre2[i]);
			}
		}
}
