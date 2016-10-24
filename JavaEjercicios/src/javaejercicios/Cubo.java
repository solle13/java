/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaejercicios;

import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Rikardo
 */
public class Cubo extends JPanel{
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawLine(40, 40, 40, 120);
        g.drawLine(40,40,120,40);
        g.drawLine(120,40,120,120);
        g.drawLine(40,120,120,120);
        
        g.drawLine(80,80,80,160);
        g.drawLine(80,80,160,80);
        g.drawLine(160,80,160,160);
        g.drawLine(80,160,160,160);
        
        g.drawLine(40,40,80,80);
        g.drawLine(40,120,80,160);
        g.drawLine(120,40,160,80);
        g.drawLine(120,120,160,160);
        }
    public static void main(String[] args) {
        Cubo panel = new Cubo();
        JFrame app = new JFrame();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.add(panel);
        app.setSize(250, 250);
        app.setVisible(true);
        }
}
