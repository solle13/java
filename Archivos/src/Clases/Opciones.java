
package Clases;

import java.io.File;
import java.util.Scanner;

public class Opciones {
    
    public void Verificar(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ruta del fichero:");
        String ruta = sc.next();
        try{
            File fichero = new File(ruta);
            if (fichero.exists())
               System.out.println("El fichero existe."); 
            else
                System.out.println("El fichero no existe.");
                
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    
    public void Borrar(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ruta del fichero:");
        String ruta = sc.next();
        try{
            File fichero = new File(ruta);
            if(fichero.exists()){
                if (fichero.delete())
                    System.out.println("El fichero " + ruta + " ha sido borrado correctamente.");
                else
                    System.out.println("El fichero " + ruta + " no se ha podido borrar.");
            }
            else
                System.out.println("El fichero no existe.");
            }
        catch(Exception e){
            System.out.println(e);
        }
    }
    
    public void Crear(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Crear 1) Archivo o 2) Carpeta");
        int opc = sc.nextInt();
        if(opc==1){
            System.out.println("Ruta del fichero:");
            String ruta = sc.next();
            try{
                File fichero = new File(ruta);
                if(!fichero.exists()){
                    if (fichero.createNewFile())
                        System.out.println("El fichero se ha creado correctamente.");
                    else
                        System.out.println("No ha podido ser creado el fichero.");
                }
                else
                    System.out.println("El fichero ya existe");
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
        else if(opc==2){
            System.out.println("Ruta del directorio:");
            String ruta = sc.next();
            try{
                File directorio = new File(ruta);
                if(!directorio.exists()){
                    if (directorio.mkdir())
                        System.out.println("El directorio se ha creado correctamente.");
                    else
                        System.out.println("No ha podido ser creado el directorio.");
                }
                else
                    System.out.println("El directorio ya existe");
            }
            catch(Exception e){
                System.out.println(e);
            }
        }else
            System.out.println("Error");
    }
    
    public void Renombrar(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nombre del fichero a modificar:");
        String nombre1 = sc.next();
        System.out.println("Nuevo nombre:");
        String nombre2 = sc.next();
        try{
            File f1 = new File(nombre1);
            if(f1.exists()){
                File f2 = new File(nombre2);
                boolean hecho = f1.renameTo(f2);
                if (hecho)
                    System.out.println("El renombrado ha sido correcto.");
                else
                    System.out.println("No se ha podido realizar el renombrado.");
            }
            else
                System.out.println("El fichero no existe.");
         }
        catch(Exception e){
            System.out.println(e);
        }
    }
    
    public void Mover(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ruta del fichero a mover:");
        String ruta = sc.next();
        try{
            File fichero = new File(ruta);
            if(fichero.exists()){
                System.out.println("Nueva ruta:");
                String ruta2 = sc.next();
                File ficheroNuevo = new File(ruta2);
                boolean hecho = fichero.renameTo(ficheroNuevo);
                if (hecho)
                    System.out.println("El fichero se ha movido correctamente.");
                else
                    System.out.println("No se ha podido realizar la accion.");
            }
            else
                System.out.println("El fichero no existe.");
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    
    public void Ver(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ruta del fichero:");
        String ruta = sc.next();
        try{
            File fichero = new File(ruta);
            if(fichero.exists()){
                File[] ficheros = fichero.listFiles();
                for(int x=0;x<ficheros.length;x++){
                    System.out.println(ficheros[x].getName());
                }
            }
            else
                System.out.println("El fichero no existe.");
         }
        catch(Exception e){
            System.out.println(e);
        }
    }
    
    public void VerTodo(File ruta, String lin){
        File listFile[] = ruta.listFiles();
        if (listFile != null) {
            for(int i = 0; i < listFile.length; i++) {
                if (listFile[i].isDirectory()) {
                   System.out.println(lin+""+listFile[i].getName());
                   VerTodo(listFile[i], "  "+lin);
                } else {
                    System.out.println(lin+""+listFile[i].getName());
                }
            }
        }
    }
}
