/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rikardo
 */
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;

import javax.swing.JLabel;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;

import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.*;
import org.jfree.data.category.DefaultCategoryDataset;


public class Grafico {
    private BufferedImage _image ;
    private JFreeChart grafico ;
    private Dimension d;
   
    public Grafico (){    }
    
    public void crear_grafico_de_barras(Dimension d, int[] v, String[] arg1, String arg2[],String[] data){
        this.d= d;          
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        
        for(int i=0; i<=v.length-1;i++){
            dataset.setValue(v[i], arg1[i], arg2[i]);
        }      
        
        grafico = ChartFactory.createBarChart3D(data[0], data[1], data[2], dataset, PlotOrientation.HORIZONTAL, true, false, true);
        
        _image = grafico.createBufferedImage(this.d.width,this.d.height);
        System.out.println("grafico creado");    
    }
   
    
    public void cargar_grafico(JLabel lb){
        ImageIcon imagenFondo = new ImageIcon(_image);  
        lb.setIcon(imagenFondo);
        lb.repaint();
    }
    public BufferedImage createImage(JPanel panel) {

    int w = panel.getWidth();
    int h = panel.getHeight();
    BufferedImage bi = new BufferedImage(w, h, BufferedImage.TYPE_INT_RGB);
    Graphics2D g = bi.createGraphics();
    panel.paint(g);
    return bi;
    }
}
