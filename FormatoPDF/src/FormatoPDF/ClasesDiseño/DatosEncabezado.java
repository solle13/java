/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FormatoPDF.ClasesDiseño;

import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.IOException;

/**
 *
 * 
 */
public class DatosEncabezado {
    public void Datos(String valores[][],PdfWriter writer) throws DocumentException, IOException{
        int x=780;
        for(int i=0; i<4;i++){ 
            PdfContentByte over = writer.getDirectContent();
            over.saveState();
            BaseFont bf = BaseFont.createFont();
            over.beginText();
            over.setFontAndSize(bf, 6);
            over.setTextMatrix((float)1.5, (float)0, (float) 0,3, 320, x);
            over.showText(" "+valores[i][0]+" "+valores[i][1]+" " );
            over.endText();
            over.restoreState();
            x-=18;
            }
    }
}
