
package Clases;

import java.io.File;
import java.util.Scanner;


public class Menu {
    public static void main(String[]args){
        boolean band=true;
        Opciones x = new Opciones();
        Scanner sc = new Scanner(System.in);
        while(band){
            System.out.println("---------------------------------------");
            System.out.println("Menu");
            System.out.println("1) Archivo/carpeta existe.");
            System.out.println("2) Borrar archivo/carpeta.");
            System.out.println("3) Crear archivo/carpeta en blanco.");
            System.out.println("4) Renombrar archivo/carpeta.");
            System.out.println("5) Mover un archivo/carpeta.");
            System.out.println("6) Ver los archivos que hay en una carpeta.");
            System.out.println("7) Ver todo el arbol de directorio y archivos de un carpeta.");
            System.out.println("8) Salir.");
            int opc = sc.nextInt();
            try{
            switch(opc){
                case 1:
                    x.Verificar();
                    break;
                case 2:
                    x.Borrar();
                    break;
                case 3:
                    x.Crear();
                    break;
                case 4:
                    x.Renombrar();
                    break;
                case 5:
                    x.Mover();
                    break;
                case 6:
                    x.Ver();
                    break;
                case 7:
                    System.out.println("Ruta del fichero:");
                    String ruta = sc.next();
                    try{
                        File fichero = new File(ruta);
                        if(fichero.exists())
                            x.VerTodo(fichero, "-");
                        else
                            System.out.println("El archivo no existe.");
                    }catch(Exception e){
                        System.out.println(e);
                    }
                    break;
                case 8:
                    band=false;
                    break;
            }
            }catch(Exception e){
                System.out.println(e);
            }
        }
    }
}
