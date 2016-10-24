/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaejercicios;

/**
 * @(#)Copiar_Matriz.java
 *
 *
 * @author 
 * @version 1.00 2013/5/7
 */

import java.io.*;
 import java.util.*;
 import java. lang.*;
public class Copiar_Matriz {
    public static void main (String[] args) {
	int mat1[][]= new int [3][3];
    int mat2[][]= new int [3][3];
    int mat3[][]= new int [6] [6];
    int f, c;
   // llenar matriz 1 
    System.out.println("Matriz 1:");
    for(f=0;f<3;f++)
    {
    	for(c=0;c<3;c++)
    	{
    		mat1[f][c]=(int)(Math.random()*10);
    			System.out.print(" " + mat1[f][c]);
    	}
    	System.out.println("");
    }
    
    //llenar matriz 2
    
    System.out.println("Matriz 2:");
      for(f=0;f<3;f++)
    {
    	for(c=0;c<3;c++)
    	{
    		mat2[f][c]=(int)(Math.random()*10);
    			System.out.print(" " + mat2[f][c]);
    	}
    	System.out.println("");
    }
    
    System.arraycopy(mat1, 0, mat3, 0, mat1.length);
    
    System.out.println("Matriz tras la primera copia");


    // imprimir matriz primera copia
    for( f=0;f<6;f++)
    {
    	for( c=0;c<3;c++)
    	{
  
    			System.out.print(" " + mat3[f][c]);
    	}
    	System.out.println("");
    }
    
    
    System.arraycopy(mat2, 0, mat3, mat1.length, mat2.length);
    System.out.println("Matriz tras la segunda copia");

    
   // imprimir matriz  segunda copia
   for( f=0;f<6;f++)
    {
    	for(c=0;c<3;c++)
    	{
  
    			System.out.print(" " + mat3[f][c]);
    	}
    	System.out.println("");
    }
    }
}
