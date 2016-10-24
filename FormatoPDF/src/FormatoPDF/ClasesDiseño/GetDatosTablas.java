/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FormatoPDF.ClasesDiseño;

import javax.swing.JTable;

/**
 *
 * 
 */
public class GetDatosTablas {
    public static Object GetData(JTable datos1, int row_index, int col_index){
    return datos1.getModel().getValueAt(row_index, col_index);
    }
}
