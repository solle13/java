/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaejercicios;

/**
 * @(#)Mes.java
 *
 *
 * @author 
 * @version 1.00 2013/2/13
 */

import java.io.*;
public class Mes {
    public static void main (String[] args) {
		int x=0;
		System.out.println("Introduce un valor del 1 al 12");
		try	
			{
			InputStreamReader in= new InputStreamReader (System.in);
			BufferedReader buffer= new BufferedReader(in);
			x=Integer.parseInt(buffer.readLine());
			if((x>0)&&(x<13))
				{
				if(x==1)
					{
					System.out.println("Enero");
					}
					else
						if(x==2)
							{
							System.out.println("Febrero");
							}
							else
								if(x==3)
								{
								System.out.println("Marzo");
								}
								else
									if(x==4)
										{
										System.out.println("Abril");
										}
										else
											if(x==5)
												{
												System.out.println("Mayo");
												}
												else
													if(x==6)
														{
														System.out.println("Junio");
														}
														else
															if(x==7)
																{
																System.out.println("Julio");
																}
																else
																	if(x==8)
																		{
																		System.out.println("Agosto");
																		}
																		else
																			if(x==9)
																				{
																				System.out.println("Septiembre");
																				}
																				else
																					if(x==10)
																						{
																						System.out.println("Octubre");
																						}
																						else
																							if(x==11)
																								{
																								System.out.println("Noviembre");
																								}
																								else
																									if(x==12)
																										{
																										System.out.println("Diciembre");
																										}
			}
			else
				{
				System.out.println("El valor "+x+" no es un valor permitido");
				}
			}
			catch(Exception e)
				{
				System.out.println("Error");
				}
	}    
}
