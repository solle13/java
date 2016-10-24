import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.sql.*;
/**
 *
 * @author RichyV
 */
class Imagen extends javax.swing.JPanel {
        
        public Imagen() {
            this.setSize(100, 100);
            }
        public void paint(Graphics grafico) {
            Dimension height = getSize();
            ImageIcon Img = new ImageIcon(getClass().getResource("/Images/1213.png")); 
            grafico.drawImage(Img.getImage(), 0, 0, height.width, height.height, null);
            setOpaque(false);
            super.paintComponent(grafico);
            }
    }

public class Entrar extends javax.swing.JFrame {

    
    public Entrar() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Aceptar = new javax.swing.JButton();
        Salir = new javax.swing.JButton();
        IdText = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        PanelImg = new javax.swing.JPanel();
        PassText = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de sucursales");
        setBackground(new java.awt.Color(47, 47, 218));
        setName("Sistema de sucursales"); // NOI18N
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 12));
        jLabel1.setText("Id:");

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 12));
        jLabel2.setText("Contraseña:");

        Aceptar.setFont(new java.awt.Font("Calibri", 0, 12));
        Aceptar.setText("Aceptar");
        Aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AceptarActionPerformed(evt);
            }
        });

        Salir.setFont(new java.awt.Font("Calibri", 0, 12));
        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });

        IdText.setFont(new java.awt.Font("Calibri", 0, 12));
        IdText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                IdTextKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Calibri", 3, 14));
        jLabel3.setText("Sistema de sucursales");

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 12));
        jLabel4.setText("Ingrese su id y contraseña para acceder.");

        javax.swing.GroupLayout PanelImgLayout = new javax.swing.GroupLayout(PanelImg);
        PanelImg.setLayout(PanelImgLayout);
        PanelImgLayout.setHorizontalGroup(
            PanelImgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 96, Short.MAX_VALUE)
        );
        PanelImgLayout.setVerticalGroup(
            PanelImgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 102, Short.MAX_VALUE)
        );

        PassText.setFont(new java.awt.Font("Calibri", 0, 12));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(PanelImg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PassText, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel1))
                            .addComponent(IdText, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(80, Short.MAX_VALUE)
                .addComponent(Aceptar)
                .addGap(18, 18, 18)
                .addComponent(Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(jLabel3)
                .addContainerGap(96, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel1)
                        .addGap(11, 11, 11)
                        .addComponent(IdText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(PassText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(PanelImg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Aceptar)
                            .addComponent(Salir))))
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void AceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AceptarActionPerformed
    String id=IdText.getText();
    String pass=PassText.getText();
    Conectar cerrar=new Conectar();
    Conectar co= new Conectar();
    Connection reg=co.conexion();
    String sql,sqlp,usuario="";
    ResultSet m=null,n=null;
    sql="SELECT Id FROM pass WHERE Id='"+id+"'";
    sqlp="SELECT Password FROM pass WHERE Id='"+id+"'";
    if(id.equals("")||pass.equals("")){
        JOptionPane.showMessageDialog(null,"Los campos no deben de estar vacios","Error",JOptionPane.WARNING_MESSAGE);
        }
        else{
            try{
                PreparedStatement pstc=reg.prepareStatement(sql);
                m=pstc.executeQuery();
                if(m.next()){
                    usuario=m.getString("Id");
                    PreparedStatement pstp=reg.prepareStatement(sqlp);
                    n=pstp.executeQuery();
                    if(n.next()){
                        String x=n.getString("Password");
                        if(x.equals(pass)){
                            if(usuario.equals("12345")){
                                Administrador a =new Administrador(new Entrar(),true);
                                a.setLocationRelativeTo(null);
                                a.setVisible(true);
                                IdText.setText("");
                                PassText.setText("");
                                }
                            else{
                                Gerentes g =new Gerentes(new Entrar(),true);
                                Gerentes.Id.setText(IdText.getText());
                                Gerentes.IdGerentePass.setText(IdText.getText());
                                g.setLocationRelativeTo(null);
                                g.setVisible(true);
                                IdText.setText("");
                                PassText.setText("");
                                }
                            }
                        else{
                            JOptionPane.showMessageDialog(null,"La contraseña es incorrecta","Error",JOptionPane.WARNING_MESSAGE);
                            }
                        }
                    cerrar.closeSQLNegotiator(pstp);
                    }
                else{
                    JOptionPane.showMessageDialog(null,"El id no existe en la base de datos","Error",JOptionPane.WARNING_MESSAGE);
                    }
                cerrar.closeSQLNegotiator(pstc);
                }
            catch(Exception e){
                JOptionPane.showMessageDialog(null,"Error "+e,"Error",JOptionPane.ERROR_MESSAGE);
                }
            finally{
                cerrar.closeSQLNegotiator(reg);
                cerrar.closeSQLNegotiator(m);
                cerrar.closeSQLNegotiator(n);
                }
            }
}//GEN-LAST:event_AceptarActionPerformed

private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
    Imagen Imagen = new Imagen();
    PanelImg.add(Imagen);
    PanelImg.repaint();
    Conectar co=new Conectar();
    int x=co.conexion2();
    if(x==0){
        Conectar crear=new Conectar();
        crear.CrearDB();
        }
    co.closeSQLNegotiator(co);
}//GEN-LAST:event_formWindowOpened

private void IdTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_IdTextKeyTyped
    Validacion x=new Validacion();
    x.numeros(evt);
}//GEN-LAST:event_IdTextKeyTyped

private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
    System.exit(0);
}//GEN-LAST:event_SalirActionPerformed

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
            java.util.logging.Logger.getLogger(Entrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Entrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Entrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Entrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Entrar().setVisible(true);
                
            }
            
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Aceptar;
    private javax.swing.JTextField IdText;
    private javax.swing.JPanel PanelImg;
    private javax.swing.JPasswordField PassText;
    private javax.swing.JButton Salir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
