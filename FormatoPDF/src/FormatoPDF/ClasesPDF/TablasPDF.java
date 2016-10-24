/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FormatoPDF.ClasesPDF;

import FormatoPDF.ClasesDiseño.GetDatosTablas;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Element;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import javax.swing.JTable;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.html.WebColors;

/**
 *
 *
 */
public class TablasPDF {
    public PdfPTable DibujarTabla(int col, int fil,JTable tabla,float medidas[],PdfPTable tab){
        try { 
            tab.setWidths(medidas);
            for(int i=0;i<fil;i++){
                if(GetDatosTablas.GetData(tabla, i, 0)==null){
                    break;
                }
                for(int j=0; j<col;j++){
                    Object obj1 = GetDatosTablas.GetData(tabla, i, j);
                    String value1=obj1.toString();
                    PdfPCell cell= new PdfPCell(new Paragraph(value1,FontFactory.getFont("arial",8,Font.BOLD, BaseColor.BLACK)));
                    tab.addCell(cell);   
                }
            }
        } 
         catch (Exception e) {
             System.out.println("Error "+e);
        }
        return tab;
    }
    
    public PdfPTable DibujarTablaArre1(int col, int fil,String[][] tabla,float medidas[], boolean x,PdfPTable tab, int pdf,String ult){
        
        try { 
            BaseColor MiColor = WebColors.getRGBColor("#04B4AE");
            tab.setWidths(medidas);
            if(pdf==2)
            {fil=7;}
            for(int i=1;i<fil;i++){
                for(int j=0; j<col-2;j++){
                    if(i==6){
                        PdfPCell cell = new PdfPCell(new Phrase("Publicación de bases: ",FontFactory.getFont("arial",10,Font.BOLD, BaseColor.BLACK)));
                        cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
                        cell.setBackgroundColor(MiColor);
                        tab.addCell(cell);
                        PdfPCell cell2 = new PdfPCell(new Phrase(ult,FontFactory.getFont("arial",10,Font.BOLD, BaseColor.BLACK)));
                        cell2.setVerticalAlignment(Element.ALIGN_MIDDLE);
                        cell2.setColspan(5);
                        cell2.setRowspan(1);
                        tab.addCell(cell2);
                        break;
                    }else{
                    Object obj1 = tabla[i][j];
                    String value1=obj1.toString();
                    if(x){
                        if(j==0 || j==2){
                        PdfPCell cell= new PdfPCell(new Paragraph(value1,FontFactory.getFont("arial",10,Font.BOLD, BaseColor.BLACK)));
                        cell.setBackgroundColor(MiColor);
                        cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
                        tab.addCell(cell);
                        }else
                        if(j==3){
                            PdfPCell cell = new PdfPCell(new Phrase(value1,FontFactory.getFont("arial",10,Font.BOLD, BaseColor.BLACK)));
                            cell.setColspan(3);
                            cell.setRowspan(1);
                            cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
                            tab.addCell(cell);
                        }
                        else{
                            PdfPCell cell = new PdfPCell(new Phrase(value1,FontFactory.getFont("arial",10,Font.BOLD, BaseColor.BLACK)));
                            cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
                            tab.addCell(cell);
                        }
                    }else{
                        if(j==3){
                            PdfPCell cell = new PdfPCell(new Phrase(value1,FontFactory.getFont("arial",10,Font.BOLD, BaseColor.BLACK)));
                            cell.setColspan(3);
                            cell.setRowspan(1);
                            cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
                            tab.addCell(cell);
                        }
                        else{
                            PdfPCell cell = new PdfPCell(new Phrase(value1,FontFactory.getFont("arial",10,Font.BOLD, BaseColor.BLACK)));
                            cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
                            tab.addCell(cell);
                        }
                    }
                 }
                }
            }
        } 
         catch (Exception e) {
             System.out.println("Error "+e);
        }
        return tab;
    }
    
    //
}
