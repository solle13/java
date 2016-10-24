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
public class PDF2 {
    public void CrearPDF2(String[][]tabla,String txt1, String txt2, String txt3, String txt4,String txt5,String txt6, String txt7,JTable tabla2,String txt8, String txt9,JTable tabla3,String txt10){
        String [][]tabla1=tabla;
        float[]medidas1={8.5f, 9.0f, 7.5f, 3.5f, 4.5f, 4.0f};
        float []medidas2={6.5f, 4.5f,6.0f,5.5f,5.5f,5.5f,3.0f,3.0f};
        float []medidas3={6.5f, 3.5f,3.5f,3.5f,2.5f,3.5f,6.0f,4.0f,4.0f};
        float []medidas4={6.5f,20.5f};
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
                document.add(tab.DibujarTablaArre1(6, 6, tabla1, medidas1, color,tabpdf1,2,txt6));
                
                document.add(saltolinea);
                document.add(saltolinea);
                document.add(saltolinea);
                
                PdfPTable tabpdf2=new PdfPTable(8);
                tabpdf2.setWidths(medidas2);
                PdfPCell cell1tab2 = new PdfPCell(new Phrase("Datos de la empresa ",FontFactory.getFont("arial",8,Font.BOLD, BaseColor.BLACK)));
                cell1tab2.setBackgroundColor(MiColor);
                cell1tab2.setHorizontalAlignment(Element.ALIGN_CENTER);
                cell1tab2.setColspan(4);
                cell1tab2.setRowspan(2);
                cell1tab2.setVerticalAlignment(Element.ALIGN_MIDDLE);
                tabpdf2.addCell(cell1tab2);
                
                PdfPCell cell2tab2 = new PdfPCell(new Phrase("",FontFactory.getFont("arial",8,Font.BOLD, BaseColor.BLACK)));
                cell2tab2.setBackgroundColor(MiColor);
                cell2tab2.setHorizontalAlignment(Element.ALIGN_CENTER);
                cell2tab2.setColspan(2);
                cell2tab2.setRowspan(1);
                cell2tab2.setVerticalAlignment(Element.ALIGN_MIDDLE);
                tabpdf2.addCell(cell2tab2);
               
                PdfPCell cell3tab2 = new PdfPCell(new Phrase("Junta de Aclaraciones",FontFactory.getFont("arial",8,Font.BOLD, BaseColor.BLACK)));
                cell3tab2.setBackgroundColor(MiColor);
                cell3tab2.setHorizontalAlignment(Element.ALIGN_CENTER);
                cell3tab2.setColspan(2);
                cell3tab2.setRowspan(1);
                cell3tab2.setVerticalAlignment(Element.ALIGN_MIDDLE);
                tabpdf2.addCell(cell3tab2);
                
                PdfPCell cell4tab2 = new PdfPCell(new Phrase("Fecha:",FontFactory.getFont("arial",8,Font.BOLD, BaseColor.BLACK)));
                cell4tab2.setHorizontalAlignment(Element.ALIGN_CENTER);
                cell4tab2.setBackgroundColor(MiColor);
                cell4tab2.setColspan(1);
                cell4tab2.setRowspan(1);
                cell4tab2.setVerticalAlignment(Element.ALIGN_MIDDLE);
                tabpdf2.addCell(cell4tab2);
                
                PdfPCell cell5tab2 = new PdfPCell(new Phrase(txt7,FontFactory.getFont("arial",8,Font.BOLD, BaseColor.BLACK)));
                cell5tab2.setHorizontalAlignment(Element.ALIGN_CENTER);
                cell5tab2.setColspan(1);
                cell5tab2.setRowspan(1);
                cell5tab2.setVerticalAlignment(Element.ALIGN_MIDDLE);
                tabpdf2.addCell(cell5tab2);///////////
                
                PdfPTable tabpdf3=new PdfPTable(8);
                document.add(tabpdf2);
                
                PdfPCell cell1tab3 = new PdfPCell(new Phrase("Nombre, Denominación o Razón Social",FontFactory.getFont("arial",8,Font.BOLD, BaseColor.BLACK)));
                cell1tab3.setBackgroundColor(MiColor);
                cell1tab3.setHorizontalAlignment(Element.ALIGN_CENTER);
                cell1tab3.setVerticalAlignment(Element.ALIGN_MIDDLE);
                tabpdf3.addCell(cell1tab3);
                
                PdfPCell cell2tab3 = new PdfPCell(new Phrase("RFC",FontFactory.getFont("arial",8,Font.BOLD, BaseColor.BLACK)));
                cell2tab3.setBackgroundColor(MiColor);
                cell2tab3.setHorizontalAlignment(Element.ALIGN_CENTER);
                cell2tab3.setVerticalAlignment(Element.ALIGN_MIDDLE);
                tabpdf3.addCell(cell2tab3);
                
                PdfPCell cell3tab3 = new PdfPCell(new Phrase("Representante Legal",FontFactory.getFont("arial",8,Font.BOLD, BaseColor.BLACK)));
                cell3tab3.setBackgroundColor(MiColor);
                cell3tab3.setHorizontalAlignment(Element.ALIGN_CENTER);
                cell3tab3.setVerticalAlignment(Element.ALIGN_MIDDLE);
                tabpdf3.addCell(cell3tab3);
                
                PdfPCell cell4tab3 = new PdfPCell(new Phrase("Domicilio Fiscal",FontFactory.getFont("arial",8,Font.BOLD, BaseColor.BLACK)));
                cell4tab3.setBackgroundColor(MiColor);
                cell4tab3.setHorizontalAlignment(Element.ALIGN_CENTER);
                cell4tab3.setVerticalAlignment(Element.ALIGN_MIDDLE);
                tabpdf3.addCell(cell4tab3);
                
                PdfPCell cell5tab3 = new PdfPCell(new Phrase("Proveedores sancionados",FontFactory.getFont("arial",8,Font.BOLD, BaseColor.BLACK)));
                cell5tab3.setBackgroundColor(MiColor);
                cell5tab3.setHorizontalAlignment(Element.ALIGN_CENTER);
                cell5tab3.setVerticalAlignment(Element.ALIGN_MIDDLE);
                tabpdf3.addCell(cell5tab3);
                
                PdfPCell cell6tab3 = new PdfPCell(new Phrase("Página web",FontFactory.getFont("arial",8,Font.BOLD, BaseColor.BLACK)));
                cell6tab3.setBackgroundColor(MiColor);
                cell6tab3.setHorizontalAlignment(Element.ALIGN_CENTER);
                cell6tab3.setVerticalAlignment(Element.ALIGN_MIDDLE);
                tabpdf3.addCell(cell6tab3);
                
                PdfPCell cell7tab3 = new PdfPCell(new Phrase("Asistió",FontFactory.getFont("arial",8,Font.BOLD, BaseColor.BLACK)));
                cell7tab3.setBackgroundColor(MiColor);
                cell7tab3.setHorizontalAlignment(Element.ALIGN_CENTER);
                cell7tab3.setVerticalAlignment(Element.ALIGN_MIDDLE);
                tabpdf3.addCell(cell7tab3);
                
                PdfPCell cell8tab3 = new PdfPCell(new Phrase("No asistió",FontFactory.getFont("arial",8,Font.BOLD, BaseColor.BLACK)));
                cell8tab3.setBackgroundColor(MiColor);
                cell8tab3.setHorizontalAlignment(Element.ALIGN_CENTER);
                cell8tab3.setVerticalAlignment(Element.ALIGN_MIDDLE);
                tabpdf3.addCell(cell8tab3);
                
                document.add(tab.DibujarTabla(8, 4, tabla2, medidas2, tabpdf3));
                document.add(saltolinea);
                document.add(saltolinea);
                document.add(saltolinea);
                ///////////////////////
                PdfPTable tabpdf4=new PdfPTable(9);
                PdfPCell cell1tab4 = new PdfPCell(new Phrase("Nombre, Denominación o Razón Social",FontFactory.getFont("arial",8,Font.BOLD, BaseColor.BLACK)));
                cell1tab4.setBackgroundColor(MiColor);
                cell1tab4.setHorizontalAlignment(Element.ALIGN_CENTER);
                cell1tab4.setColspan(1);
                cell1tab4.setRowspan(4);
                cell1tab4.setVerticalAlignment(Element.ALIGN_MIDDLE);
                tabpdf4.addCell(cell1tab4);
                
                PdfPCell cell2tab4 = new PdfPCell(new Phrase("Apertura de Propuestas",FontFactory.getFont("arial",8,Font.BOLD, BaseColor.BLACK)));
                cell2tab4.setBackgroundColor(MiColor);
                cell2tab4.setHorizontalAlignment(Element.ALIGN_CENTER);
                cell2tab4.setColspan(5);
                cell2tab4.setRowspan(1);
                cell2tab4.setVerticalAlignment(Element.ALIGN_MIDDLE);
                tabpdf4.addCell(cell2tab4);
               
                PdfPCell cell3tab4 = new PdfPCell(new Phrase("Notificación y Lectura de Fallo",FontFactory.getFont("arial",8,Font.BOLD, BaseColor.BLACK)));
                cell3tab4.setBackgroundColor(MiColor);
                cell3tab4.setHorizontalAlignment(Element.ALIGN_CENTER);
                cell3tab4.setColspan(3);
                cell3tab4.setRowspan(1);
                cell3tab4.setVerticalAlignment(Element.ALIGN_MIDDLE);
                tabpdf4.addCell(cell3tab4);
                
                PdfPCell cell4tab4 = new PdfPCell(new Phrase("Fecha:",FontFactory.getFont("arial",8,Font.BOLD, BaseColor.BLACK)));
                cell4tab4.setHorizontalAlignment(Element.ALIGN_CENTER);
                cell4tab4.setBackgroundColor(MiColor);
                cell4tab4.setColspan(2);
                cell4tab4.setRowspan(1);
                cell4tab4.setVerticalAlignment(Element.ALIGN_MIDDLE);
                tabpdf4.addCell(cell4tab4);
                
                PdfPCell cell5tab4 = new PdfPCell(new Phrase(txt8,FontFactory.getFont("arial",8,Font.BOLD, BaseColor.BLACK)));
                cell5tab4.setHorizontalAlignment(Element.ALIGN_CENTER);
                cell5tab4.setColspan(3);
                cell5tab4.setRowspan(1);
                cell5tab4.setVerticalAlignment(Element.ALIGN_MIDDLE);
                tabpdf4.addCell(cell5tab4);
                
                PdfPCell cell6tab4 = new PdfPCell(new Phrase("Fecha:",FontFactory.getFont("arial",8,Font.BOLD, BaseColor.BLACK)));
                cell6tab4.setHorizontalAlignment(Element.ALIGN_CENTER);
                cell6tab4.setBackgroundColor(MiColor);
                cell6tab4.setColspan(1);
                cell6tab4.setRowspan(1);
                cell6tab4.setVerticalAlignment(Element.ALIGN_MIDDLE);
                tabpdf4.addCell(cell6tab4);
                
                PdfPCell cell7tab4 = new PdfPCell(new Phrase(txt9,FontFactory.getFont("arial",8,Font.BOLD, BaseColor.BLACK)));
                cell7tab4.setHorizontalAlignment(Element.ALIGN_CENTER);
                cell7tab4.setColspan(2);
                cell7tab4.setRowspan(1);
                cell7tab4.setVerticalAlignment(Element.ALIGN_MIDDLE);
                tabpdf4.addCell(cell7tab4);
                
                PdfPCell cell8tab4 = new PdfPCell(new Phrase("Técnica",FontFactory.getFont("arial",8,Font.BOLD, BaseColor.BLACK)));
                cell8tab4.setHorizontalAlignment(Element.ALIGN_CENTER);
                cell8tab4.setBackgroundColor(MiColor);
                cell8tab4.setColspan(2);
                cell8tab4.setRowspan(1);
                cell8tab4.setVerticalAlignment(Element.ALIGN_MIDDLE);
                tabpdf4.addCell(cell8tab4);
                
                PdfPCell cell9tab4 = new PdfPCell(new Phrase("Económica ",FontFactory.getFont("arial",8,Font.BOLD, BaseColor.BLACK)));
                cell9tab4.setHorizontalAlignment(Element.ALIGN_CENTER);
                cell9tab4.setBackgroundColor(MiColor);
                cell9tab4.setColspan(3);
                cell9tab4.setRowspan(1);
                cell9tab4.setVerticalAlignment(Element.ALIGN_MIDDLE);
                tabpdf4.addCell(cell9tab4);
                
                PdfPCell cell10tab4 = new PdfPCell(new Phrase("Motivo de desechamiento",FontFactory.getFont("arial",8,Font.BOLD, BaseColor.BLACK)));
                cell10tab4.setHorizontalAlignment(Element.ALIGN_CENTER);
                cell10tab4.setBackgroundColor(MiColor);
                cell10tab4.setColspan(1);
                cell10tab4.setRowspan(2);
                cell10tab4.setVerticalAlignment(Element.ALIGN_MIDDLE);
                tabpdf4.addCell(cell10tab4);
                
                PdfPCell cell11tab4 = new PdfPCell(new Phrase("Empresa Adjudicada",FontFactory.getFont("arial",8,Font.BOLD, BaseColor.BLACK)));
                cell11tab4.setHorizontalAlignment(Element.ALIGN_CENTER);
                cell11tab4.setBackgroundColor(MiColor);
                cell11tab4.setColspan(1);
                cell11tab4.setRowspan(2);
                cell11tab4.setVerticalAlignment(Element.ALIGN_MIDDLE);
                tabpdf4.addCell(cell11tab4);
                
                PdfPCell cell12tab4 = new PdfPCell(new Phrase("Monto Adjudicado",FontFactory.getFont("arial",8,Font.BOLD, BaseColor.BLACK)));
                cell12tab4.setHorizontalAlignment(Element.ALIGN_CENTER);
                cell12tab4.setBackgroundColor(MiColor);
                cell12tab4.setColspan(1);
                cell12tab4.setRowspan(2);
                cell12tab4.setVerticalAlignment(Element.ALIGN_MIDDLE);
                tabpdf4.addCell(cell12tab4);
                
                PdfPCell cell13tab4 = new PdfPCell(new Phrase("Presenta",FontFactory.getFont("arial",8,Font.BOLD, BaseColor.BLACK)));
                cell13tab4.setBackgroundColor(MiColor);
                cell13tab4.setHorizontalAlignment(Element.ALIGN_CENTER);
                cell13tab4.setVerticalAlignment(Element.ALIGN_MIDDLE);
                tabpdf4.addCell(cell13tab4);
                
                PdfPCell cell14tab4 = new PdfPCell(new Phrase("No presenta",FontFactory.getFont("arial",8,Font.BOLD, BaseColor.BLACK)));
                cell14tab4.setBackgroundColor(MiColor);
                cell14tab4.setHorizontalAlignment(Element.ALIGN_CENTER);
                cell14tab4.setVerticalAlignment(Element.ALIGN_MIDDLE);
                tabpdf4.addCell(cell14tab4);
                
                PdfPCell cell15tab4 = new PdfPCell(new Phrase("Subtotal ",FontFactory.getFont("arial",8,Font.BOLD, BaseColor.BLACK)));
                cell15tab4.setBackgroundColor(MiColor);
                cell15tab4.setHorizontalAlignment(Element.ALIGN_CENTER);
                cell15tab4.setVerticalAlignment(Element.ALIGN_MIDDLE);
                tabpdf4.addCell(cell15tab4);
                
                PdfPCell cell16tab4 = new PdfPCell(new Phrase("IVA",FontFactory.getFont("arial",8,Font.BOLD, BaseColor.BLACK)));
                cell16tab4.setBackgroundColor(MiColor);
                cell16tab4.setHorizontalAlignment(Element.ALIGN_CENTER);
                cell16tab4.setVerticalAlignment(Element.ALIGN_MIDDLE);
                tabpdf4.addCell(cell16tab4);
                
                PdfPCell cell17tab4 = new PdfPCell(new Phrase("Total",FontFactory.getFont("arial",8,Font.BOLD, BaseColor.BLACK)));
                cell17tab4.setBackgroundColor(MiColor);
                cell17tab4.setHorizontalAlignment(Element.ALIGN_CENTER);
                cell17tab4.setVerticalAlignment(Element.ALIGN_MIDDLE);
                tabpdf4.addCell(cell17tab4);
                
                document.add(tab.DibujarTabla(9, 4, tabla3, medidas3, tabpdf4));
                document.add(saltolinea);
                document.add(saltolinea);
                document.add(saltolinea);
                document.add(saltolinea);
                
                PdfPTable tabpdf5=new PdfPTable(2);
                PdfPCell cell1tab5 = new PdfPCell(new Phrase("Observaciones:",FontFactory.getFont("arial",10,Font.BOLD, BaseColor.BLACK)));
                cell1tab5.setBackgroundColor(MiColor);
                cell1tab5.setMinimumHeight(60);
                cell1tab5.setHorizontalAlignment(Element.ALIGN_CENTER);
                cell1tab5.setVerticalAlignment(Element.ALIGN_MIDDLE);
                tabpdf5.addCell(cell1tab5);
                
                PdfPCell cell2tab5 = new PdfPCell(new Phrase(txt10,FontFactory.getFont("arial",10,Font.BOLD, BaseColor.BLACK)));
                cell2tab5.setMinimumHeight(60);
                cell2tab5.setHorizontalAlignment(Element.ALIGN_CENTER);
                cell2tab5.setVerticalAlignment(Element.ALIGN_MIDDLE);
                tabpdf5.addCell(cell2tab5);
                tabpdf5.setWidths(medidas4);
                document.add(tabpdf5);
                
                document.close();
                JOptionPane.showMessageDialog(null,"El archivo se ha guardado","Exito",JOptionPane.INFORMATION_MESSAGE);
            
                File path = new File (f1+".pdf");
                Desktop.getDesktop().open(path);
            }catch(Exception e){
                JOptionPane.showMessageDialog(null,"Error "+e,"Error",JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}
