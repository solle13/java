/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FormatoPDF.ClasesDiseño;

import com.itextpdf.text.BadElementException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Image;
import java.awt.Dimension;
import java.awt.Graphics;
import java.io.IOException;
import javax.swing.ImageIcon;

/**
 *
 * 
 */
public class ImagenHome extends javax.swing.JPanel {

    public ImagenHome() {
        this.setSize(270, 75); 
    }
    public void paint(Graphics grafico) {
        Dimension height = getSize();
        ImageIcon Img = new ImageIcon(getClass().getResource("/Images/logo.png")); 
        grafico.drawImage(Img.getImage(), 0, 0, height.width, height.height, null);
        setOpaque(false);
        super.paintComponent(grafico);
        }
    
    public Image CrearImg() throws BadElementException, IOException{
        Image imagen;
        imagen = Image.getInstance(getClass().getResource("/Images/logo.png"));
        imagen.setAlignment(Element.ALIGN_LEFT);
        imagen.setAbsolutePosition(50, 720f);
        imagen.scaleAbsolute(270, 75);
        return imagen;   
    }
    }   

