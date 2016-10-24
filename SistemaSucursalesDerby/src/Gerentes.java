import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.InputStream;
import java.sql.*;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
/**
 *
 * @author RichyV
 */
public class Gerentes extends javax.swing.JDialog {

    public Gerentes(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        FotoPanel = new javax.swing.JPanel();
        FotoGerente = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        Id = new javax.swing.JTextField();
        Nombre = new javax.swing.JTextField();
        Apellidos = new javax.swing.JTextField();
        Edad = new javax.swing.JTextField();
        Sucursal = new javax.swing.JTextField();
        Ventas = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        Zona = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        VentasText = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        AceptarVentas = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        PassText = new javax.swing.JPasswordField();
        PassNueva = new javax.swing.JPasswordField();
        PassNueva2 = new javax.swing.JPasswordField();
        CambiarPass = new javax.swing.JButton();
        Salir = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        IdGerentePass = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Sistema de sucursales-Gerente");
        setName("Gerente"); // NOI18N

        jTabbedPane1.setFont(new java.awt.Font("Calibri", 0, 12));

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setLayout(null);

        FotoPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout FotoPanelLayout = new javax.swing.GroupLayout(FotoPanel);
        FotoPanel.setLayout(FotoPanelLayout);
        FotoPanelLayout.setHorizontalGroup(
            FotoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FotoGerente, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        FotoPanelLayout.setVerticalGroup(
            FotoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FotoGerente, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        jPanel3.add(FotoPanel);
        FotoPanel.setBounds(50, 60, 102, 102);

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 12));
        jLabel2.setText("ID:");
        jPanel3.add(jLabel2);
        jLabel2.setBounds(230, 30, 15, 16);

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 12));
        jLabel3.setText("Nombre:");
        jPanel3.add(jLabel3);
        jLabel3.setBounds(200, 60, 46, 16);

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 12));
        jLabel4.setText("Apellidos:");
        jPanel3.add(jLabel4);
        jLabel4.setBounds(190, 90, 60, 16);

        jLabel5.setFont(new java.awt.Font("Calibri", 0, 12));
        jLabel5.setText("Edad:");
        jPanel3.add(jLabel5);
        jLabel5.setBounds(220, 120, 30, 16);

        jLabel6.setFont(new java.awt.Font("Calibri", 0, 12));
        jLabel6.setText("Ventas Total:");
        jPanel3.add(jLabel6);
        jLabel6.setBounds(180, 180, 72, 16);

        jLabel7.setFont(new java.awt.Font("Calibri", 0, 12));
        jLabel7.setText("Sucursal:");
        jPanel3.add(jLabel7);
        jLabel7.setBounds(200, 150, 49, 16);

        jLabel8.setFont(new java.awt.Font("Calibri", 0, 12));
        jLabel8.setText("Datos:");
        jPanel3.add(jLabel8);
        jLabel8.setBounds(50, 30, 35, 16);

        jButton1.setFont(new java.awt.Font("Calibri", 0, 12));
        jButton1.setText("Ver");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1);
        jButton1.setBounds(70, 180, 70, 25);

        Id.setEnabled(false);
        jPanel3.add(Id);
        Id.setBounds(280, 20, 100, 30);

        Nombre.setEnabled(false);
        jPanel3.add(Nombre);
        Nombre.setBounds(280, 50, 100, 30);

        Apellidos.setEnabled(false);
        jPanel3.add(Apellidos);
        Apellidos.setBounds(280, 80, 100, 30);

        Edad.setEnabled(false);
        jPanel3.add(Edad);
        Edad.setBounds(280, 110, 100, 30);

        Sucursal.setEnabled(false);
        jPanel3.add(Sucursal);
        Sucursal.setBounds(280, 140, 100, 30);

        Ventas.setEnabled(false);
        jPanel3.add(Ventas);
        Ventas.setBounds(280, 170, 100, 30);

        jLabel10.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel10.setText("Zona:");
        jPanel3.add(jLabel10);
        jLabel10.setBounds(220, 210, 30, 16);

        Zona.setEnabled(false);
        jPanel3.add(Zona);
        Zona.setBounds(280, 200, 100, 30);

        jTabbedPane1.addTab("Info. Gerente", jPanel3);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel15.setFont(new java.awt.Font("Calibri", 0, 12));
        jLabel15.setText("Cantidad: $");

        VentasText.setFont(new java.awt.Font("Calibri", 0, 12));
        VentasText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                VentasTextKeyTyped(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Calibri", 0, 12));
        jLabel16.setText("Cambiar contraseña");

        AceptarVentas.setFont(new java.awt.Font("Calibri", 0, 12));
        AceptarVentas.setText("Aceptar");
        AceptarVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AceptarVentasActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Calibri", 0, 12));
        jLabel17.setText("Ventas");

        jLabel18.setFont(new java.awt.Font("Calibri", 0, 12));
        jLabel18.setText("Contraseña:");

        jLabel19.setFont(new java.awt.Font("Calibri", 0, 12));
        jLabel19.setText("Nueva contraseña:");

        jLabel20.setFont(new java.awt.Font("Calibri", 0, 12));
        jLabel20.setText("Confirma contraseña:");

        PassText.setFont(new java.awt.Font("Calibri", 0, 12));

        PassNueva.setFont(new java.awt.Font("Calibri", 0, 12));

        PassNueva2.setFont(new java.awt.Font("Calibri", 0, 12));

        CambiarPass.setFont(new java.awt.Font("Calibri", 0, 12));
        CambiarPass.setText("Cambiar");
        CambiarPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CambiarPassActionPerformed(evt);
            }
        });

        Salir.setFont(new java.awt.Font("Calibri", 0, 12));
        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });

        jLabel9.setText("Id:");

        IdGerentePass.setFont(new java.awt.Font("Calibri", 0, 12));
        IdGerentePass.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel16)
                .addGap(151, 151, 151)
                .addComponent(jLabel17))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(89, 89, 89)
                .addComponent(IdGerentePass, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jLabel15)
                .addGap(4, 4, 4)
                .addComponent(VentasText, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel18)
                .addGap(54, 54, 54)
                .addComponent(PassText, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(102, 102, 102)
                .addComponent(AceptarVentas))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel19)
                .addGap(18, 18, 18)
                .addComponent(PassNueva, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel20)
                .addGap(4, 4, 4)
                .addComponent(PassNueva2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addComponent(CambiarPass)
                .addGap(155, 155, 155)
                .addComponent(Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel9))
                    .addComponent(IdGerentePass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel15))
                    .addComponent(VentasText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel18))
                    .addComponent(PassText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(AceptarVentas)))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel19))
                    .addComponent(PassNueva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel20))
                    .addComponent(PassNueva2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CambiarPass)
                    .addComponent(Salir)))
        );

        jTabbedPane1.addTab("Opciones", jPanel1);

        jLabel1.setFont(new java.awt.Font("Calibri", 3, 14));
        jLabel1.setText("Gerente");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(214, 214, 214)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    Conectar con=new Conectar();
    Conectar cerrar=new Conectar();
    Connection reg=con.conexion();
    String usuario=Id.getText();
    InputStream y=null;
    String sql="";
    ResultSet m=null;
    sql="SELECT NomGerente,ApellGerente,EdadGerente,FotoGerente,NomSucursal,Ventas,Zona FROM sucursales WHERE IdGerente='"+usuario+"'";
    try{
        PreparedStatement pstc=reg.prepareStatement(sql);
        m=pstc.executeQuery();
        while(m.next()){
            Nombre.setText(m.getString("NomGerente"));
            Apellidos.setText(m.getString("ApellGerente"));
            Edad.setText(m.getString("EdadGerente"));
            Sucursal.setText(m.getString("NomSucursal"));
            Ventas.setText(m.getString("Ventas"));
            Zona.setText(m.getString("Zona"));
            y=m.getBinaryStream(4);
            BufferedImage n=ImageIO.read(y);
            ImageIcon icono=new ImageIcon(n);
            Image im= icono.getImage().getScaledInstance(FotoGerente.getWidth(),FotoGerente.getHeight(),Image.SCALE_SMOOTH);
            Icon ics = new ImageIcon(im);
            FotoGerente.setIcon(ics);
            }
        cerrar.closeSQLNegotiator(pstc);
        }
     catch(Exception e){
         JOptionPane.showMessageDialog(null,"Error "+e,"Error",JOptionPane.ERROR_MESSAGE);
        }
     finally{
        cerrar.closeSQLNegotiator(reg);
        cerrar.closeSQLNegotiator(m);
        }
}//GEN-LAST:event_jButton1ActionPerformed

private void CambiarPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CambiarPassActionPerformed
    Conectar con=new Conectar();
    Conectar cerrar=new Conectar();
    Connection reg=con.conexion();
    String passV=PassText.getText();
    String passN=PassNueva.getText();
    String passNC=PassNueva2.getText();
    String sql,sql2;
    String id=IdGerentePass.getText();
    ResultSet m=null;
    sql="SELECT Password FROM pass WHERE Id="+id;
    sql2="UPDATE pass SET Password=? WHERE Id="+id;
    if(passV.equals("") || passN.equals("") || passNC.equals("")){
        JOptionPane.showMessageDialog(null,"No debe haber campos vacios","",JOptionPane.WARNING_MESSAGE);
        }
    else{
        try{
            PreparedStatement x=reg.prepareStatement(sql);
            m=x.executeQuery();
            if(m.next()){
                String pass=m.getString("Password");
                if(pass.equals(passV)){
                    if(passN.equals(passNC)){
                        PreparedStatement pst=reg.prepareStatement(sql2);
                        pst.setString(1,passN);
                        pst.executeUpdate();
                        JOptionPane.showMessageDialog(null,"La contraseña ha sido modificada","",JOptionPane.INFORMATION_MESSAGE);
                        PassText.setText("");
                        PassNueva.setText("");
                        PassNueva2.setText("");
                        cerrar.closeSQLNegotiator(pst);
                        }
                    else{
                        JOptionPane.showMessageDialog(null,"Las contraseñas no coinciden","Error",JOptionPane.ERROR_MESSAGE);
                        }
                    }
                else{
                    JOptionPane.showMessageDialog(null,"Contraseñaincorrecta","Error",JOptionPane.ERROR_MESSAGE); 
                    }
                }
            cerrar.closeSQLNegotiator(x);
            }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error "+e,"Error",JOptionPane.ERROR_MESSAGE);
            }
        finally{
            cerrar.closeSQLNegotiator(reg);
            cerrar.closeSQLNegotiator(m);
            }
        }
}//GEN-LAST:event_CambiarPassActionPerformed

private void AceptarVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AceptarVentasActionPerformed
    Conectar con=new Conectar();
    Connection reg=con.conexion();
    ResultSet m=null;
    String sql,sql2,venta,ventafinal;
    String x=VentasText.getText();
    String id=IdGerentePass.getText();
    int ventadb=0,ventanueva=0,suma=0,n=0;
    sql="SELECT Ventas FROM sucursales WHERE IdGerente='"+id+"'";
    sql2="UPDATE sucursales SET Ventas=? WHERE IdGerente='"+id+"'";
    if(x.equals("")){
        JOptionPane.showMessageDialog(null,"El campo no debe de estar vacio","",JOptionPane.WARNING_MESSAGE);
        }
        else{
            try{
                ventanueva=Integer.parseInt(x);
                System.out.println("Entra");
                PreparedStatement pst=reg.prepareStatement(sql);
                m=pst.executeQuery();
                if(m.next()){
                    System.out.println("Entra");
                    venta=m.getString("Ventas"); 
                    ventadb=Integer.parseInt(venta);
                    suma=ventadb+ventanueva;
                    ventafinal=Integer.toString(suma);
                    PreparedStatement pst2=reg.prepareStatement(sql2);
                    pst2.setString(1,ventafinal);
                    n=pst2.executeUpdate();
                    if(n>0){
                        System.out.println("Entra");
                        JOptionPane.showMessageDialog(null,"Venta introducida","",JOptionPane.INFORMATION_MESSAGE);
                        VentasText.setText("");
                        }   
                    }
                }
            catch(Exception e){
                JOptionPane.showMessageDialog(null,"Error "+e,"Error",JOptionPane.ERROR_MESSAGE);
                }
            }
}//GEN-LAST:event_AceptarVentasActionPerformed

private void VentasTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_VentasTextKeyTyped
    Validacion x=new Validacion();
    x.numeros(evt);
}//GEN-LAST:event_VentasTextKeyTyped

private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
    this.dispose();
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
            java.util.logging.Logger.getLogger(Gerentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Gerentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Gerentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Gerentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                Gerentes dialog = new Gerentes(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton AceptarVentas;
    private javax.swing.JTextField Apellidos;
    private javax.swing.JButton CambiarPass;
    private javax.swing.JTextField Edad;
    private javax.swing.JLabel FotoGerente;
    private javax.swing.JPanel FotoPanel;
    public static javax.swing.JTextField Id;
    public static javax.swing.JTextField IdGerentePass;
    private javax.swing.JTextField Nombre;
    private javax.swing.JPasswordField PassNueva;
    private javax.swing.JPasswordField PassNueva2;
    private javax.swing.JPasswordField PassText;
    private javax.swing.JButton Salir;
    private javax.swing.JTextField Sucursal;
    private javax.swing.JTextField Ventas;
    private javax.swing.JTextField VentasText;
    private javax.swing.JTextField Zona;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
