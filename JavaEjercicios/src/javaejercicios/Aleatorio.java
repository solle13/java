/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaejercicios;

/**
 * @(#)Aleatorio.java
 *
 *
 * @author 
 * @version 1.00 2013/2/12
 */
public class Aleatorio {
    public static void main (String[] args) {
		int x,y=0,z=0;
		x=(int)(Math.random()*100);
		if(x>50){
			y=9;
		}
		z=x+y;
		System.out.println(x);
		System.out.println(z);
		}    
}
