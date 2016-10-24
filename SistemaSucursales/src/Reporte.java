import com.itextpdf.text.Document;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author RichyV
 */
public class Reporte extends javax.swing.JDialog {

    public Reporte(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        Direccion = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Sistema de sucursales-Reporte");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Calibri", 0, 12));
        jButton1.setText("Aceptar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Tabla.setFont(new java.awt.Font("Calibri", 0, 12));
        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id Sucursal", "Sucursal", "Ventas", "Zona"
            }
        ));
        jScrollPane1.setViewportView(Tabla);

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 12));
        jLabel1.setText("Direccion");

        Direccion.setFont(new java.awt.Font("Calibri", 0, 12));
        Direccion.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, 0, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(Direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(Direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
    Conectar con=new Conectar();
    Connection reg=con.conexion();
    String sql;
    ResultSet m=null;
    sql="SELECT IdSucursal,NomSucursal,Ventas,Zona FROM sucursales";
    try{
        PreparedStatement pst=(PreparedStatement) reg.prepareStatement(sql);
        m=pst.executeQuery();
        DefaultTableModel modelo=(DefaultTableModel)Tabla.getModel();
        ResultSetMetaData rsmd=m.getMetaData();
        int numCols=rsmd.getColumnCount();
        modelo.setRowCount(0);
        Object []dato = new Object[numCols];
        while (m.next()){
            for (int i=0;i<numCols;i++){
                dato[i]=m.getObject(i+1);
                }
            modelo.addRow(dato);
            }
        Tabla.setModel(modelo);
        m.close();
        }
    catch(Exception e){
        JOptionPane.showMessageDialog(null,"Error "+e);
        }
}//GEN-LAST:event_formWindowOpened

private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    String d=Direccion.getText();    
    try{
        int count=Tabla.getRowCount();
        Paragraph parrafo = new Paragraph();
        parrafo.setAlignment(Paragraph.ALIGN_LEFT);
        parrafo.add("Reporte Sucursales\n"+"Tabla de sucursales con sus ventas.\n"+"Grafico de sucursales y sus ventas\n\n");
        parrafo.setAlignment(Paragraph.ALIGN_CENTER);
        Document document=new Document();
        PdfWriter.getInstance(document,new FileOutputStream(d+".pdf"));
        document.open();
        document.add(parrafo);
        PdfPTable tab=new PdfPTable(4);
        tab.addCell("Id Sucursal");
        tab.addCell("Sucursal");
        tab.addCell("Ventas");
        tab.addCell("Zona");
        for(int i=0;i<count;i++){
            Object obj1 = GetData(Tabla, i, 0);
            Object obj2 = GetData(Tabla, i, 1);
            Object obj3 = GetData(Tabla, i, 2);
            Object obj4 = GetData(Tabla, i, 3);
            String value1=obj1.toString();
            String value2=obj2.toString();
            String value3=obj3.toString();
            String value4=obj4.toString();
            tab.addCell(value1);
            tab.addCell(value2);
            tab.addCell(value3);
            tab.addCell(value4);
            }
        document.add(tab);
        String url=getClass().getResource("Images/grafico.png").toString();
        int x=url.length();
        String dir=url.substring(6, x);
        Image g=Image.getInstance(dir);
        g.scaleToFit(350,350);
        g.setAlignment(Image.ALIGN_CENTER);
        document.add(g);
        document.close();
        JOptionPane.showMessageDialog(null,"El archivo se ha guardado","Error",JOptionPane.INFORMATION_MESSAGE);
        this.dispose();
        }
    catch(Exception e){
        JOptionPane.showMessageDialog(null,"Error "+e,"Error",JOptionPane.ERROR_MESSAGE);
        }
}//GEN-LAST:event_jButton1ActionPerformed

public Object GetData(JTable datos1, int row_index, int col_index){
    return datos1.getModel().getValueAt(row_index, col_index);
    }
    public static void main(String args[]) {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Reporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Reporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Reporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                Reporte dialog = new Reporte(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {

                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTextField Direccion;
    private javax.swing.JTable Tabla;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
