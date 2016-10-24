/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaejercicios;

/**
 * @(#)Ahorcado.java
 *
 *
 * @author 
 * @version 1.00 2013/5/11
 */
import java.util.*;
public class Ahorcado {
    public static void main(String[] args){
    	String A1[]=new String [5];
    	int i=1,j=0,band=0;
    	String res;
    	A1[0]="gato";
    	A1[1]="perro";
    	A1[2]="oveja";
    	A1[3]="tigre";
    	A1[4]="leon";
    	Scanner in=new Scanner(System.in);
    	System.out.println("Juego del Ahorcado");
    	System.out.println("Tienes 3 oportunidades de adivinar que palabra es");
    	j=(int)(Math.random()*5);
    	System.out.println("Las lista de palabras es: ");
    	System.out.println("1."+A1[0]);
    	System.out.println("2."+A1[1]);
    	System.out.println("3."+A1[2]);
    	System.out.println("4."+A1[3]);
    	System.out.println("5."+A1[4]);
    	for(i=1;i<4;i++){
    		System.out.println(i+"° oportunidad");
    		res=in.next();
    		if(res.equals(A1[j])){
    				i=4;
    				band=1;
    				}
    				else{
    					System.out.println("Esa no es la palabra");
    					}
    		}
    	if(band==1){
    		System.out.println("Ganaste");
    		}
    		else{
    			System.out.println("Perdiste");
    			System.out.println("La palabra era: "+A1[j]);
    			}
    	}
}
