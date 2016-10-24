

/*
 * Principal.java
 *
 * Created on 26/07/2014, 01:57:08 PM
 */
package javaaexcel;
import java.io.File;
import java.io.FileOutputStream;
import java.sql.*;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
/**
 *
 * @author Richy V
 */
public class Principal extends javax.swing.JFrame {


    public Principal() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Informatica = new javax.swing.JButton();
        Contaduria = new javax.swing.JButton();
        Administracion = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        dir = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Java a Excel");
        setResizable(false);

        Informatica.setText("Informatica");
        Informatica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InformaticaActionPerformed(evt);
            }
        });

        Contaduria.setText("Contaduria");
        Contaduria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContaduriaActionPerformed(evt);
            }
        });

        Administracion.setText("Administracion");
        Administracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdministracionActionPerformed(evt);
            }
        });

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Matricula", "Nombre", "Carrera", "Promedio"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabla);
        if (tabla.getColumnModel().getColumnCount() > 0) {
            tabla.getColumnModel().getColumn(0).setMinWidth(10);
        }

        jButton1.setText("Guardar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Ruta...");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        dir.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(dir, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Informatica, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Contaduria, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Administracion, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Administracion)
                    .addComponent(Contaduria)
                    .addComponent(Informatica))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(dir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void InformaticaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InformaticaActionPerformed
    Conectar con=new Conectar();
    Connection reg=con.conexion();
    String sql;
    ResultSet m=null;
    sql="SELECT matricula,nombre,carrera,prom FROM registros WHERE carrera='Informatica'";
    try{
        PreparedStatement pstc=reg.prepareStatement(sql);
        m=pstc.executeQuery();
        DefaultTableModel modelo=(DefaultTableModel)tabla.getModel();
        ResultSetMetaData rsmd = m.getMetaData();
        int numCols = rsmd.getColumnCount();
 
                modelo.setRowCount(0);
 
                Object []dato = new Object[numCols];
 
                while (m.next())
                {
                    for (int i=0;i<numCols;i++)
                    {
                            dato[i]=m.getObject(i+1);
                    }
 
                    modelo.addRow(dato);
                }
                tabla.setModel(modelo);
                m.close();
    }catch(Exception e){
        JOptionPane.showMessageDialog(null,"Error"+e);
    }
}//GEN-LAST:event_InformaticaActionPerformed

private void ContaduriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContaduriaActionPerformed
    Conectar con=new Conectar();
    Connection reg=con.conexion();
    String sql;
    ResultSet m=null;
    sql="SELECT matricula,nombre,carrera,prom FROM registros WHERE carrera='Contaduria'";
    try{
        PreparedStatement pstc=reg.prepareStatement(sql);
        m=pstc.executeQuery();
        DefaultTableModel modelo=(DefaultTableModel)tabla.getModel();
        ResultSetMetaData rsmd = m.getMetaData();
        int numCols = rsmd.getColumnCount();
 
                modelo.setRowCount(0);
 
                Object []dato = new Object[numCols];
 
                while (m.next())
                {
                    for (int i=0;i<numCols;i++)
                    {
                            dato[i]=m.getObject(i+1);
                    }
 
                    modelo.addRow(dato);
                }
                tabla.setModel(modelo);
                m.close();
    }catch(Exception e){
        JOptionPane.showMessageDialog(null,"Error"+e);
    }
}//GEN-LAST:event_ContaduriaActionPerformed

private void AdministracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdministracionActionPerformed
    Conectar con=new Conectar();
    Connection reg=con.conexion();
    String sql;
    ResultSet m=null;
    sql="SELECT matricula,nombre,carrera,prom FROM registros WHERE carrera='Administracion'";
    try{
        PreparedStatement pstc=reg.prepareStatement(sql);
        m=pstc.executeQuery();
        DefaultTableModel modelo=(DefaultTableModel)tabla.getModel();
        ResultSetMetaData rsmd = m.getMetaData();
        int numCols = rsmd.getColumnCount();
 
                modelo.setRowCount(0);
 
                Object []dato = new Object[numCols];
 
                while (m.next())
                {
                    for (int i=0;i<numCols;i++)
                    {
                            dato[i]=m.getObject(i+1);
                    }
 
                    modelo.addRow(dato);
                }
                tabla.setModel(modelo);
                m.close();
    }catch(Exception e){
        JOptionPane.showMessageDialog(null,"Error"+e);
    }
}//GEN-LAST:event_AdministracionActionPerformed

private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

    int numfilas=tabla.getRowCount();
    int numcolum=tabla.getColumnCount();
    String[][] array = new String[numfilas][numcolum];
    try{
    for (int i = 0; i < numfilas; i++) {
        for (int j = 0; j < numcolum; j++) {
            array[i][j] = String.valueOf(tabla.getValueAt(i, j));
        }
    }
    }catch(Exception e){
        System.out.print("Error"+e);
    }
    
    String ruta=dir.getText();
    File archivoXLS = new File(ruta+".xls");
    try{
    if(archivoXLS.exists()) archivoXLS.delete();
    archivoXLS.createNewFile();
    Workbook libro = new HSSFWorkbook();
    FileOutputStream archivo = new FileOutputStream(archivoXLS);
    Sheet hoja = libro.createSheet("Reporte");
    for(int f=0;f<numfilas;f++){
        Row fila = hoja.createRow(f);
        for(int c=0;c<numcolum;c++){
            Cell celda = fila.createCell(c);
            if(f==0){
                celda.setCellValue(array[f][c]);
            }else{
                celda.setCellValue(array[f][c]);
                }
        }
    }
    libro.write(archivo);
    archivo.close();
    System.out.print("Guardado");
    }catch(Exception e){
        System.out.print("Error"+e);
    }
}//GEN-LAST:event_jButton1ActionPerformed

private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
JFileChooser dlg= new JFileChooser();
    int option = dlg.showSaveDialog(this);

    if(option==JFileChooser.APPROVE_OPTION){
	File f=dlg.getSelectedFile();
	String f1=f.toString();

	dir.setText(f1);
        }
}//GEN-LAST:event_jButton2ActionPerformed

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Principal().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Administracion;
    private javax.swing.JButton Contaduria;
    private javax.swing.JButton Informatica;
    private javax.swing.JTextField dir;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables

    
}
