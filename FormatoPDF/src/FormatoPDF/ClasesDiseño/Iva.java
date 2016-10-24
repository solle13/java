/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FormatoPDF.ClasesDiseño;

import static FormatoPDF.ClasesDiseño.GetDatosTablas.GetData;
import javax.swing.JTable;

/**
 *
 * 
 */
public class Iva {
    public String[][] CalcularTotal(JTable tabla, int filas, int columnas,int subtotal){
        String[][] arr = new String[filas][columnas];
        try{
        for(int i=0;i<filas;i++){
            if(GetData(tabla, i, 0)==null){
                break;
            }
            else{
                for(int j=0;j<columnas;j++){
                    if(j==(subtotal+2)){
                        Object obj = GetData(tabla, i, subtotal);
                        String value=obj.toString();
                        double x=Double.parseDouble(value);
                        double iva=x*0.16;
                        double total=x+iva;
                        String value2=String.valueOf(total);
                        arr[i][j]=value2;
                    }else
                        if(j==(subtotal+1)){
                            arr[i][j]="16%";
                        }
                    else{
                        Object obj = GetData(tabla, i, j);
                        String value=obj.toString();
                        arr[i][j]=value;
                    }
                }
            }
        }
        }catch(Exception e){
            
        }
        return arr;
    }
}
