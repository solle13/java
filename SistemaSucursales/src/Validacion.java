
import java.awt.event.KeyEvent;


/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Richy V
 */
public class Validacion {
    
    public void numeros(KeyEvent e){//Metodo donde solo se acepten numeros en cajas de texto
        int k=(int)e.getKeyChar();
        if (k > 0 && k < 8 || k>9 && k<48 || k>57 && k<256){
            e.setKeyChar((char)KeyEvent.VK_CLEAR);
            }
    }
    public void letras(KeyEvent e){//Metodo donde solo se acepten letras en cajas de texto
        int k=(int)e.getKeyChar();
        if (k > 0 && k < 8 || k>8 && k<32 || k>32 && k<65 || k>90 && k<97|| k>122 && k<239|| k>239 && k<256){
            e.setKeyChar((char)KeyEvent.VK_CLEAR);
            }
    }
    
}
