/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaejercicios;
/*
 *
 *
 * @author 
 * @version 1.00 2013/2/18
 */


import java.io.*;
public class Cero {
    public static void main (String[] args)throws IOException {
  	int num=0,tot=0,band=0;
  	System.out.println("Introduce un numero si es cero acaba la operacion: ");
  	do{
  		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
  		num=Integer.parseInt(in.readLine());
  		if(num==0){
  			band=1;
  		}
  		else{
  			tot=num+tot;
  			}
  		}while(band!=1);
  	System.out.println("La suma total es: "+tot);
	}
}
