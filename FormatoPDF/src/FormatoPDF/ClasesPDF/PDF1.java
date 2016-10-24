/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FormatoPDF.ClasesPDF;


import FormatoPDF.ClasesDiseño.DatosEncabezado;
import FormatoPDF.ClasesDiseño.ImagenHome;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.html.WebColors;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;

/**
 *
 * 
 */
public class PDF1 {
    public void CrearPDF1(String[][]tabla, String txt1, String txt2, String txt3, String txt4, String txt5, String txt6,JTable tabla2){
        String [][]tabla1=tabla;
        float[]medidas1={8.5f, 9.0f, 7.5f, 3.5f, 4.5f, 4.0f};
        float []medidas2={7.5f, 3.5f,7.0f,5.5f,4.5f,4.5f,4.5f};
        float []medidas3={6.5f,20.5f};
        JFileChooser dlg= new JFileChooser();
        int option = dlg.showSaveDialog(dlg);
        if(option==JFileChooser.APPROVE_OPTION){
            File f=dlg.getSelectedFile();
            String f1=f.toString();
            try {
                BaseColor MiColor = WebColors.getRGBColor("#04B4AE");
                TablasPDF tab = new TablasPDF();
                ImagenHome img = new ImagenHome();
                Document document = new Document();
                PdfWriter writer = PdfWriter.getInstance(document,new FileOutputStream(f1+".pdf"));
                Paragraph saltolinea = new Paragraph();
                saltolinea.add("\n");
                document.open();
                document.add(img.CrearImg());
                DatosEncabezado en = new DatosEncabezado();
                String[][] valores=new String[4][2];
                valores[0][0]="Dependencia: ";
                valores[0][1]=txt1;
                valores[1][0]="Expediente: ";
                valores[1][1]=txt2;
                valores[2][0]="Sesión: ";
                valores[2][1]=txt3;
                valores[3][0]="Fecha: ";
                valores[3][1]=txt4;
                en.Datos(valores, writer);
                
                document.add(saltolinea);
                document.add(saltolinea);
                document.add(saltolinea);
                document.add(saltolinea);
                document.add(saltolinea);
                document.add(saltolinea);
                document.add(saltolinea);
                document.add(saltolinea);
                document.add(saltolinea);
                document.add(saltolinea);
                boolean color=true;
                PdfPTable tabpdf1=new PdfPTable(6);
                PdfPCell cell1= new PdfPCell(new Paragraph("Sesión:",FontFactory.getFont("arial",10,Font.BOLD, BaseColor.BLACK)));
                PdfPCell cell11= new PdfPCell(new Paragraph(tabla1[0][1],FontFactory.getFont("arial",10,Font.BOLD, BaseColor.BLACK)));
                cell1.setBackgroundColor(MiColor);
                tabpdf1.addCell(cell1);
                tabpdf1.addCell(cell11);
                PdfPCell cell2= new PdfPCell(new Paragraph("Fecha:",FontFactory.getFont("arial",10,Font.BOLD, BaseColor.BLACK)));
                PdfPCell cell22= new PdfPCell(new Paragraph(tabla1[0][3],FontFactory.getFont("arial",10,Font.BOLD, BaseColor.BLACK)));
                cell2.setBackgroundColor(MiColor);
                tabpdf1.addCell(cell2);
                tabpdf1.addCell(cell22);
                PdfPCell cell3= new PdfPCell(new Paragraph("Acuerdo:",FontFactory.getFont("arial",10,Font.BOLD, BaseColor.BLACK)));
                PdfPCell cell33= new PdfPCell(new Paragraph(txt5,FontFactory.getFont("arial",10,Font.BOLD, BaseColor.BLACK)));
                cell3.setBackgroundColor(MiColor);
                tabpdf1.addCell(cell3);
                tabpdf1.addCell(cell33);
                document.add(tab.DibujarTablaArre1(6, 6, tabla1, medidas1, color,tabpdf1,1,""));
                
                document.add(saltolinea);
                document.add(saltolinea);
                document.add(saltolinea);
                document.add(saltolinea);
                
                PdfPTable tabpdf2=new PdfPTable(7);
                PdfPCell cell1tab2 = new PdfPCell(new Phrase("ESTUDIO DE MERCADO",FontFactory.getFont("arial",10,Font.BOLD, BaseColor.BLACK)));
                cell1tab2.setBackgroundColor(MiColor);
                cell1tab2.setMinimumHeight(30);
                cell1tab2.setHorizontalAlignment(Element.ALIGN_CENTER);
                cell1tab2.setColspan(7);
                cell1tab2.setRowspan(1);
                cell1tab2.setVerticalAlignment(Element.ALIGN_MIDDLE);
                tabpdf2.addCell(cell1tab2);
                
                PdfPCell cell2tab2 = new PdfPCell(new Phrase("Datos de la empresa ",FontFactory.getFont("arial",10,Font.BOLD, BaseColor.BLACK)));
                cell2tab2.setBackgroundColor(MiColor);
                cell2tab2.setHorizontalAlignment(Element.ALIGN_CENTER);
                cell2tab2.setColspan(4);
                cell2tab2.setRowspan(1);
                cell2tab2.setVerticalAlignment(Element.ALIGN_MIDDLE);
                tabpdf2.addCell(cell2tab2);
                
                PdfPCell cell3tab2 = new PdfPCell(new Phrase("Datos de cotización ",FontFactory.getFont("arial",10,Font.BOLD, BaseColor.BLACK)));
                cell3tab2.setBackgroundColor(MiColor);
                cell3tab2.setHorizontalAlignment(Element.ALIGN_CENTER);
                cell3tab2.setColspan(3);
                cell3tab2.setRowspan(1);
                cell3tab2.setVerticalAlignment(Element.ALIGN_MIDDLE);
                tabpdf2.addCell(cell3tab2);
                
                PdfPCell cell4tab2= new PdfPCell(new Paragraph("Nombre, Denominación o Razón Social",FontFactory.getFont("arial",10,Font.BOLD, BaseColor.BLACK)));
                cell4tab2.setBackgroundColor(MiColor);
                cell4tab2.setHorizontalAlignment(Element.ALIGN_CENTER);
                tabpdf2.addCell(cell4tab2);
                PdfPCell cell5tab2= new PdfPCell(new Paragraph("RFC",FontFactory.getFont("arial",10,Font.BOLD, BaseColor.BLACK)));
                cell5tab2.setBackgroundColor(MiColor);
                cell5tab2.setHorizontalAlignment(Element.ALIGN_CENTER);
                tabpdf2.addCell(cell5tab2);
                PdfPCell cell6tab2= new PdfPCell(new Paragraph("Representante Legal",FontFactory.getFont("arial",10,Font.BOLD, BaseColor.BLACK)));
                cell6tab2.setBackgroundColor(MiColor);
                cell6tab2.setHorizontalAlignment(Element.ALIGN_CENTER);
                tabpdf2.addCell(cell6tab2);
                PdfPCell cell7tab2= new PdfPCell(new Paragraph("Domicilio Fiscal",FontFactory.getFont("arial",10,Font.BOLD, BaseColor.BLACK)));
                cell7tab2.setBackgroundColor(MiColor);
                cell7tab2.setHorizontalAlignment(Element.ALIGN_CENTER);
                tabpdf2.addCell(cell7tab2);
                PdfPCell cell8tab2= new PdfPCell(new Paragraph("Subtotal",FontFactory.getFont("arial",10,Font.BOLD, BaseColor.BLACK)));
                cell8tab2.setBackgroundColor(MiColor);
                cell8tab2.setHorizontalAlignment(Element.ALIGN_CENTER);
                tabpdf2.addCell(cell8tab2);
                PdfPCell cell9tab2= new PdfPCell(new Paragraph("IVA",FontFactory.getFont("arial",10,Font.BOLD, BaseColor.BLACK)));
                cell9tab2.setBackgroundColor(MiColor);
                cell9tab2.setHorizontalAlignment(Element.ALIGN_CENTER);
                tabpdf2.addCell(cell9tab2);
                PdfPCell cell10tab2= new PdfPCell(new Paragraph("TOTAL",FontFactory.getFont("arial",10,Font.BOLD, BaseColor.BLACK)));
                cell10tab2.setBackgroundColor(MiColor);
                cell10tab2.setHorizontalAlignment(Element.ALIGN_CENTER);
                tabpdf2.addCell(cell10tab2);
                
                document.add(tab.DibujarTabla(7, 5, tabla2, medidas2, tabpdf2));
                document.add(saltolinea);
                document.add(saltolinea);
                document.add(saltolinea);
                document.add(saltolinea);
                
                PdfPTable tabpdf3=new PdfPTable(2);
                PdfPCell cell1tab3 = new PdfPCell(new Phrase("Observaciones:",FontFactory.getFont("arial",10,Font.BOLD, BaseColor.BLACK)));
                cell1tab3.setBackgroundColor(MiColor);
                cell1tab3.setMinimumHeight(60);
                cell1tab3.setHorizontalAlignment(Element.ALIGN_CENTER);
                cell1tab3.setVerticalAlignment(Element.ALIGN_MIDDLE);
                tabpdf3.addCell(cell1tab3);
                
                PdfPCell cell2tab3 = new PdfPCell(new Phrase(txt6,FontFactory.getFont("arial",10,Font.BOLD, BaseColor.BLACK)));
                cell2tab3.setMinimumHeight(60);
                cell2tab3.setHorizontalAlignment(Element.ALIGN_CENTER);
                cell2tab3.setVerticalAlignment(Element.ALIGN_MIDDLE);
                tabpdf3.addCell(cell2tab3);
                tabpdf3.setWidths(medidas3);
                document.add(tabpdf3);
                
                document.close();
                JOptionPane.showMessageDialog(null,"El archivo se ha guardado","Exito",JOptionPane.INFORMATION_MESSAGE);
            
                File path = new File (f1+".pdf");
                Desktop.getDesktop().open(path);
            }
            catch (Exception e) {
                JOptionPane.showMessageDialog(null,"Error "+e,"Error",JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}
