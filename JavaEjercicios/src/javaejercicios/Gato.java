/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaejercicios;

/**
 * @(#)Gato.java
 *
 *
 * @author 
 * @version 1.00 2013/5/9
 */

import java.util.*;
public class Gato {
    public static void main (String[] args) {
		String g1[][]=new String [3][3];
		String gan="";
		int i=0,j=0,cont=1,par=0,fil=0,colum=0; 
		Scanner in= new Scanner(System.in);
		System.out.println("Gato");
		for(i=0;i<3;i++){
				System.out.println();
				for(j=0;j<3;j++){
					g1[i][j]="   ";
					System.out.print("|"+g1[i][j]+"|");
					}
				}
		System.out.println();
		System.out.println();
		while(cont!=9){
			par=cont%2;
			for(i=0;i<3;i++){
				System.out.println();
				for(j=0;j<3;j++){
					System.out.print("|"+g1[i][j]+"|");
					}
				}
			System.out.println();
			System.out.println();
			System.out.println("Fila:");
			fil=in.nextInt();
			System.out.println("Columna:");
			colum=in.nextInt();
			if(par==0){
				for(i=0;i<3;i++){
					if(i==fil){
						for(j=0;j<3;j++){
							if(j==colum){
								g1[i][j]=" O ";
								}
							}
						}
					}
				}
				else{
					for(i=0;i<3;i++){
						if(i==fil){
							for(j=0;j<3;j++){
								if(j==colum){
									g1[i][j]=" X ";
									}
								}
							}
						}
					}
			cont=cont+1;
			if(g1[0][0]==" X " || g1[0][0]==" O "){
				if(g1[0][1]==g1[0][0] && g1[0][2]==g1[0][0]){
					gan=g1[0][0];
					cont=9;
					}
					if(g1[1][0]==g1[0][0] && g1[2][0]==g1[0][0]){
						gan=g1[0][0];
						cont=9;
						}
				}
				if(g1[2][2]==" X " || g1[2][2]==" O "){
					if(g1[2][1]==g1[2][2] && g1[2][0]==g1[2][2]){
						gan=g1[2][2];
						cont=9;
						}
						if(g1[1][2]==g1[2][2] && g1[0][2]==g1[2][2]){
							gan=g1[2][2];
							cont=9;
							}
					}
				if(g1[1][1]==" X " || g1[1][1]==" O "){
					if(g1[0][2]==g1[1][1] && g1[2][0]==g1[1][1]){
						gan=g1[1][1];
						cont=9;
						}
						if(g1[0][0]==g1[1][1] && g1[2][2]==g1[1][1]){
							gan=g1[1][1];
							cont=9;
							}
							if(g1[0][1]==g1[1][1] && g1[2][1]==g1[1][1]){
								gan=g1[1][1];
								cont=9;
								}
								if(g1[1][0]==g1[1][1] && g1[1][2]==g1[1][1]){
									gan=g1[1][1];
									cont=9;
									}
					}
			}
			for(i=0;i<3;i++){
				System.out.println();
				for(j=0;j<3;j++){
					System.out.print("|"+g1[i][j]+"|");
					}
				}
			System.out.println();
			if(gan==" X "){
				System.out.println("Ganan X");
				}
				if(gan==" O "){
					System.out.println("Ganan O");
					}
		}   
}
