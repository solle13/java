/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaejercicios;

/**
 * @(#)tarea.java
 *
 *
 * @author 
 * @version 1.00 2013/2/6
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.io.*;
public class Edad_Date {
    public static void main(String[]args)throws IOException{
		String nom;
		int anio,mes,dia,edad;
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Introduce tu nombre: ");
    	nom = in.readLine();
    	System.out.println("Introduce tu fecha de nacimiento: ");
    	System.out.println("Año: ");
    	anio=Integer.parseInt(in.readLine());
    	System.out.println("Mes: ");
    	mes=Integer.parseInt(in.readLine());
    	System.out.println("dia: ");
    	dia=Integer.parseInt(in.readLine());
    	Date d = new Date();
    	GregorianCalendar gc = new GregorianCalendar();
    	gc.setTime(d);
    	edad=(gc.get(GregorianCalendar.YEAR))-anio;
    	if((gc.get(GregorianCalendar.MONTH))+1>=mes)
    		{
    			if((gc.get(GregorianCalendar.DAY_OF_MONTH))>dia)
    			{
    			System.out.printf("%s tu edad es: %d",nom,edad);	
    			}
    			else{
    				if((gc.get(GregorianCalendar.DAY_OF_MONTH))==dia){
    					System.out.printf("%s  tu edad es: %d...   Feliz Cumpleaños!!!",nom,edad);
    				}
    				else{
    					System.out.printf("%s tu edad es: %d",nom,(edad-1));
    				}
    			}
    		}
    		else{
    			System.out.printf("%s tu edad es: %d",nom,(edad-1));
    		}
    	
	}
}
