/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FormatoPDF.Clases;

/**
 *
 * 
 */
public class Datos1 {
    public String[][] GuardarTabla1(String txt1, String txt2, String txt3, String txt4,
            String txt5, String txt6, String txt7, String txt8,
            String txt9, String txt10, String txt11, String txt12){
        
        String [][] datos=new String[6][4];
        //Columna de labels
        datos[0][0]="Sesión:";
        datos[1][0]="Procedimiento:";
        datos[2][0]="Área solicitante:";
        datos[3][0]="Suficiencia general:";
        datos[4][0]="Recurso:";
        datos[5][0]="Bien o servicio a contratar:";
        //Columna de cajas
        datos[0][1]=txt1;
        datos[1][1]=txt2;
        datos[2][1]=txt3;
        datos[3][1]=txt4;
        datos[4][1]=txt5;
        datos[5][1]=txt6;
        
        datos[0][2]="Fecha:";
        datos[1][2]="Fundamento:";
        datos[2][2]="Área técnica:";
        datos[3][2]="Suficiencia específica:  (Anexar copia de Oficio)";
        datos[4][2]="Fondo o Programa:";
        datos[5][2]="Justificación del bien o servicio a contratar: ";
        
        datos[0][3]=txt7;
        datos[1][3]=txt8;
        datos[2][3]=txt9;
        datos[3][3]=txt10;
        datos[4][3]=txt11;
        datos[5][3]=txt12;
        
        return datos;
    }
}
