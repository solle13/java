import java.awt.event.KeyEvent;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.sql.*;
import javax.imageio.ImageIO;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author RichyV
 */
public class Administrador extends javax.swing.JDialog {
    
    public Administrador(java.awt.Frame parent, boolean modal) {
        
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        NombreSucursalText = new javax.swing.JTextField();
        IdSucursalText = new javax.swing.JTextField();
        GerenteText = new javax.swing.JTextField();
        IdGerenteText = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        ApellidosText = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        EdadText = new javax.swing.JTextField();
        PanelFotoCrear = new javax.swing.JPanel();
        LabelFoto = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        BuscarImg = new javax.swing.JButton();
        GenerarId = new javax.swing.JButton();
        Guardar = new javax.swing.JButton();
        Limpiar = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        Dir = new javax.swing.JTextField();
        ContraseñaText = new javax.swing.JPasswordField();
        NorteG = new javax.swing.JRadioButton();
        CentroG = new javax.swing.JRadioButton();
        SurG = new javax.swing.JRadioButton();
        jLabel28 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaModificar = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        NombreG = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        EdadG = new javax.swing.JTextField();
        ApellidoG = new javax.swing.JTextField();
        PanelFoto = new javax.swing.JPanel();
        LabelFotoModificar = new javax.swing.JLabel();
        BucarFoto = new javax.swing.JButton();
        Actualizar = new javax.swing.JButton();
        LimpiarActualizar = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        NombreSucursal = new javax.swing.JTextField();
        DirModificar = new javax.swing.JTextField();
        VerTabla = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        IDSucursalText = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        IdEliminar = new javax.swing.JTextField();
        EliminarButton = new javax.swing.JButton();
        NorteM = new javax.swing.JRadioButton();
        SurM = new javax.swing.JRadioButton();
        CentroM = new javax.swing.JRadioButton();
        jLabel26 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        LabelFotoConsulta = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        SucursalMostrar = new javax.swing.JLabel();
        VentasMostrar = new javax.swing.JLabel();
        IDGerenteMostrar = new javax.swing.JLabel();
        NombreGerenteMostrar = new javax.swing.JLabel();
        ApellidosMostrar = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaMostrarTodo = new javax.swing.JTable();
        jLabel31 = new javax.swing.JLabel();
        MostrarTodo = new javax.swing.JButton();
        LimpiarMostrar = new javax.swing.JButton();
        IdsucursalMostrar = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        EdadMostrar = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        ZonaLabel = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        TablaReportes = new javax.swing.JTable();
        PanelGrafico = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        DireccionBoton = new javax.swing.JButton();
        jLabel33 = new javax.swing.JLabel();
        Direccion = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        LimpiarReportes = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        DirGrafico = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        PassVieja = new javax.swing.JPasswordField();
        PassNueva = new javax.swing.JPasswordField();
        PassNuevaConfirmar = new javax.swing.JPasswordField();
        jButton4 = new javax.swing.JButton();
        jLabel38 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Sistema de sucursales-Administrador");

        jLabel1.setFont(new java.awt.Font("Calibri", 3, 14));
        jLabel1.setText("Administrador");

        jTabbedPane1.setFocusable(false);
        jTabbedPane1.setFont(new java.awt.Font("Calibri", 0, 12));

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setFont(new java.awt.Font("Calibri", 0, 12));
        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 12));
        jLabel2.setText("Nombre de Sucursal:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(250, 30, 112, 16);

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 12));
        jLabel3.setText("ID Sucursal:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(250, 80, 70, 16);

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 12));
        jLabel4.setText("Nombre gerente:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(40, 130, 100, 16);

        jLabel5.setFont(new java.awt.Font("Calibri", 0, 12));
        jLabel5.setText("ID Gerente:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(40, 30, 70, 16);

        NombreSucursalText.setFont(new java.awt.Font("Calibri", 0, 12));
        NombreSucursalText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                NombreSucursalTextKeyTyped(evt);
            }
        });
        jPanel1.add(NombreSucursalText);
        NombreSucursalText.setBounds(250, 50, 117, 24);

        IdSucursalText.setFont(new java.awt.Font("Calibri", 0, 12));
        IdSucursalText.setEnabled(false);
        jPanel1.add(IdSucursalText);
        IdSucursalText.setBounds(250, 110, 117, 22);

        GerenteText.setFont(new java.awt.Font("Calibri", 0, 12));
        GerenteText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                GerenteTextKeyTyped(evt);
            }
        });
        jPanel1.add(GerenteText);
        GerenteText.setBounds(40, 150, 110, 24);

        IdGerenteText.setFont(new java.awt.Font("Calibri", 0, 12));
        IdGerenteText.setEnabled(false);
        jPanel1.add(IdGerenteText);
        IdGerenteText.setBounds(40, 50, 110, 24);

        jLabel6.setFont(new java.awt.Font("Calibri", 0, 12));
        jLabel6.setText("Apellidos:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(40, 180, 60, 14);

        ApellidosText.setFont(new java.awt.Font("Calibri", 0, 12));
        ApellidosText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ApellidosTextKeyTyped(evt);
            }
        });
        jPanel1.add(ApellidosText);
        ApellidosText.setBounds(40, 200, 110, 24);

        jLabel7.setFont(new java.awt.Font("Calibri", 0, 12));
        jLabel7.setText("Edad:");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(40, 230, 40, 16);

        EdadText.setFont(new java.awt.Font("Calibri", 0, 12));
        EdadText.setMinimumSize(new java.awt.Dimension(15, 22));
        EdadText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                EdadTextKeyTyped(evt);
            }
        });
        jPanel1.add(EdadText);
        EdadText.setBounds(40, 252, 110, 22);

        PanelFotoCrear.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout PanelFotoCrearLayout = new javax.swing.GroupLayout(PanelFotoCrear);
        PanelFotoCrear.setLayout(PanelFotoCrearLayout);
        PanelFotoCrearLayout.setHorizontalGroup(
            PanelFotoCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LabelFoto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
        );
        PanelFotoCrearLayout.setVerticalGroup(
            PanelFotoCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LabelFoto, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
        );

        jPanel1.add(PanelFotoCrear);
        PanelFotoCrear.setBounds(470, 70, 140, 141);

        jLabel8.setFont(new java.awt.Font("Calibri", 0, 12));
        jLabel8.setText("Foto");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(520, 30, 40, 16);

        jLabel9.setFont(new java.awt.Font("Calibri", 0, 12));
        jLabel9.setText("Contraseña:");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(40, 80, 80, 16);

        BuscarImg.setFont(new java.awt.Font("Calibri", 0, 12));
        BuscarImg.setText("Buscar");
        BuscarImg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarImgActionPerformed(evt);
            }
        });
        jPanel1.add(BuscarImg);
        BuscarImg.setBounds(470, 260, 70, 25);

        GenerarId.setFont(new java.awt.Font("Calibri", 0, 12));
        GenerarId.setText("Generar ID's");
        GenerarId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenerarIdActionPerformed(evt);
            }
        });
        jPanel1.add(GenerarId);
        GenerarId.setBounds(280, 320, 100, 25);

        Guardar.setFont(new java.awt.Font("Calibri", 0, 12));
        Guardar.setText("Guardar");
        Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarActionPerformed(evt);
            }
        });
        jPanel1.add(Guardar);
        Guardar.setBounds(390, 320, 90, 25);

        Limpiar.setFont(new java.awt.Font("Calibri", 0, 12));
        Limpiar.setText("Limpiar");
        Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimpiarActionPerformed(evt);
            }
        });
        jPanel1.add(Limpiar);
        Limpiar.setBounds(180, 320, 90, 25);

        jButton6.setFont(new java.awt.Font("Calibri", 0, 12));
        jButton6.setText("Default");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6);
        jButton6.setBounds(540, 260, 73, 25);

        Dir.setFont(new java.awt.Font("Calibri", 0, 12));
        Dir.setEnabled(false);
        jPanel1.add(Dir);
        Dir.setBounds(470, 230, 140, 22);

        ContraseñaText.setFont(new java.awt.Font("Calibri", 0, 12));
        jPanel1.add(ContraseñaText);
        ContraseñaText.setBounds(40, 100, 110, 22);

        buttonGroup2.add(NorteG);
        NorteG.setFont(new java.awt.Font("Calibri", 0, 12));
        NorteG.setText("Norte");
        jPanel1.add(NorteG);
        NorteG.setBounds(260, 170, 55, 25);

        buttonGroup2.add(CentroG);
        CentroG.setFont(new java.awt.Font("Calibri", 0, 12));
        CentroG.setText("Centro");
        jPanel1.add(CentroG);
        CentroG.setBounds(260, 200, 61, 25);

        buttonGroup2.add(SurG);
        SurG.setFont(new java.awt.Font("Calibri", 0, 12));
        SurG.setText("Sur");
        jPanel1.add(SurG);
        SurG.setBounds(260, 230, 43, 25);

        jLabel28.setFont(new java.awt.Font("Calibri", 0, 12));
        jLabel28.setText("Zona:");
        jPanel1.add(jLabel28);
        jLabel28.setBounds(250, 150, 30, 16);

        jTabbedPane1.addTab("Crear sucursal", jPanel1);

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setFont(new java.awt.Font("Calibri", 0, 12));
        jPanel2.setLayout(null);

        TablaModificar.setFont(new java.awt.Font("Calibri", 0, 12));
        TablaModificar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id Sucursal", "Sucursal", "Id Gerente", "Nombre Gerente", "Apellidos", "Edad", "Zona"
            }
        ));
        TablaModificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaModificarMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TablaModificar);
        TablaModificar.getColumnModel().getColumn(5).setResizable(false);
        TablaModificar.getColumnModel().getColumn(5).setPreferredWidth(30);
        TablaModificar.getColumnModel().getColumn(6).setResizable(false);
        TablaModificar.getColumnModel().getColumn(6).setPreferredWidth(40);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(40, 240, 560, 110);

        jLabel11.setFont(new java.awt.Font("Calibri", 0, 12));
        jLabel11.setText("Nombre gerente:");
        jPanel2.add(jLabel11);
        jLabel11.setBounds(40, 26, 100, 16);

        NombreG.setMinimumSize(new java.awt.Dimension(15, 20));
        NombreG.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                NombreGKeyTyped(evt);
            }
        });
        jPanel2.add(NombreG);
        NombreG.setBounds(150, 20, 120, 26);

        jLabel12.setFont(new java.awt.Font("Calibri", 0, 12));
        jLabel12.setText("Edad:");
        jPanel2.add(jLabel12);
        jLabel12.setBounds(296, 23, 30, 16);

        jLabel13.setFont(new java.awt.Font("Calibri", 0, 12));
        jLabel13.setText("Apellido gerente:");
        jPanel2.add(jLabel13);
        jLabel13.setBounds(40, 57, 100, 16);

        EdadG.setMinimumSize(new java.awt.Dimension(12, 20));
        EdadG.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                EdadGKeyTyped(evt);
            }
        });
        jPanel2.add(EdadG);
        EdadG.setBounds(330, 20, 60, 30);

        ApellidoG.setMinimumSize(new java.awt.Dimension(15, 20));
        ApellidoG.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ApellidoGKeyTyped(evt);
            }
        });
        jPanel2.add(ApellidoG);
        ApellidoG.setBounds(150, 50, 120, 28);

        PanelFoto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout PanelFotoLayout = new javax.swing.GroupLayout(PanelFoto);
        PanelFoto.setLayout(PanelFotoLayout);
        PanelFotoLayout.setHorizontalGroup(
            PanelFotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LabelFotoModificar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
        );
        PanelFotoLayout.setVerticalGroup(
            PanelFotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LabelFotoModificar, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
        );

        jPanel2.add(PanelFoto);
        PanelFoto.setBounds(40, 90, 130, 120);

        BucarFoto.setFont(new java.awt.Font("Calibri", 0, 12));
        BucarFoto.setText("Cambiar");
        BucarFoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BucarFotoActionPerformed(evt);
            }
        });
        jPanel2.add(BucarFoto);
        BucarFoto.setBounds(180, 120, 90, 25);

        Actualizar.setFont(new java.awt.Font("Calibri", 0, 12));
        Actualizar.setText("Actualizar");
        Actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActualizarActionPerformed(evt);
            }
        });
        jPanel2.add(Actualizar);
        Actualizar.setBounds(180, 180, 90, 25);

        LimpiarActualizar.setFont(new java.awt.Font("Calibri", 0, 12));
        LimpiarActualizar.setText("Limpiar");
        LimpiarActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimpiarActualizarActionPerformed(evt);
            }
        });
        jPanel2.add(LimpiarActualizar);
        LimpiarActualizar.setBounds(420, 180, 80, 25);

        jLabel17.setText("Nombre sucursal:");
        jPanel2.add(jLabel17);
        jLabel17.setBounds(290, 54, 90, 14);

        NombreSucursal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                NombreSucursalKeyTyped(evt);
            }
        });
        jPanel2.add(NombreSucursal);
        NombreSucursal.setBounds(290, 74, 100, 30);

        DirModificar.setFont(new java.awt.Font("Calibri", 0, 12));
        DirModificar.setEnabled(false);
        jPanel2.add(DirModificar);
        DirModificar.setBounds(180, 150, 90, 22);

        VerTabla.setFont(new java.awt.Font("Calibri", 0, 12));
        VerTabla.setText("Ver Tabla");
        VerTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerTablaActionPerformed(evt);
            }
        });
        jPanel2.add(VerTabla);
        VerTabla.setBounds(510, 180, 90, 25);

        jButton7.setFont(new java.awt.Font("Calibri", 0, 12));
        jButton7.setText("Ver Foto");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton7);
        jButton7.setBounds(180, 90, 90, 25);

        jLabel10.setFont(new java.awt.Font("Calibri", 0, 12));
        jLabel10.setText("ID Sucursal");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(290, 110, 70, 16);

        IDSucursalText.setFont(new java.awt.Font("Calibri", 0, 12));
        IDSucursalText.setEnabled(false);
        jPanel2.add(IDSucursalText);
        IDSucursalText.setBounds(290, 130, 100, 30);

        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel15.setFont(new java.awt.Font("Calibri", 0, 12));
        jLabel15.setText("Eliminar sucursal:");

        jLabel16.setFont(new java.awt.Font("Calibri", 0, 12));
        jLabel16.setText("ID Sucursal:");

        IdEliminar.setFont(new java.awt.Font("Calibri", 0, 12));
        IdEliminar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                IdEliminarKeyTyped(evt);
            }
        });

        EliminarButton.setFont(new java.awt.Font("Calibri", 0, 12));
        EliminarButton.setText("Eliminar");
        EliminarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IdEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(58, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(88, Short.MAX_VALUE)
                .addComponent(EliminarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(IdEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(EliminarButton)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel8);
        jPanel8.setBounds(420, 20, 180, 150);

        buttonGroup1.add(NorteM);
        NorteM.setFont(new java.awt.Font("Calibri", 0, 12));
        NorteM.setText("Norte");
        jPanel2.add(NorteM);
        NorteM.setBounds(340, 165, 55, 20);

        buttonGroup1.add(SurM);
        SurM.setFont(new java.awt.Font("Calibri", 0, 12));
        SurM.setText("Sur");
        jPanel2.add(SurM);
        SurM.setBounds(340, 185, 50, 20);

        buttonGroup1.add(CentroM);
        CentroM.setFont(new java.awt.Font("Calibri", 0, 12));
        CentroM.setText("Centro");
        jPanel2.add(CentroM);
        CentroM.setBounds(340, 205, 60, 20);

        jLabel26.setFont(new java.awt.Font("Calibri", 0, 12));
        jLabel26.setText("Zona:");
        jPanel2.add(jLabel26);
        jLabel26.setBounds(300, 180, 30, 16);

        jTabbedPane1.addTab("Actualizar y borrar", jPanel2);

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.setFont(new java.awt.Font("Calibri", 0, 12));
        jPanel4.setLayout(null);

        jLabel18.setFont(new java.awt.Font("Calibri", 1, 12));
        jLabel18.setText("Consulta individual");
        jPanel4.add(jLabel18);
        jLabel18.setBounds(20, 10, 110, 16);

        jLabel19.setFont(new java.awt.Font("Calibri", 1, 12));
        jLabel19.setText("ID Sucursal:");
        jPanel4.add(jLabel19);
        jLabel19.setBounds(30, 50, 70, 16);

        jLabel20.setFont(new java.awt.Font("Calibri", 1, 12));
        jLabel20.setText("Nombre sucursal:");
        jPanel4.add(jLabel20);
        jLabel20.setBounds(30, 100, 100, 16);

        jLabel21.setFont(new java.awt.Font("Calibri", 1, 12));
        jLabel21.setText("Ventas:");
        jPanel4.add(jLabel21);
        jLabel21.setBounds(390, 50, 50, 16);

        jLabel22.setFont(new java.awt.Font("Calibri", 1, 12));
        jLabel22.setText("ID Gerente:");
        jPanel4.add(jLabel22);
        jLabel22.setBounds(150, 50, 70, 20);

        jLabel23.setFont(new java.awt.Font("Calibri", 1, 12));
        jLabel23.setText("Nombre gerente:");
        jPanel4.add(jLabel23);
        jLabel23.setBounds(150, 90, 100, 16);

        jLabel24.setFont(new java.awt.Font("Calibri", 1, 12));
        jLabel24.setText("Apellidos:");
        jPanel4.add(jLabel24);
        jLabel24.setBounds(150, 130, 60, 16);

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LabelFotoConsulta, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LabelFotoConsulta, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
        );

        jPanel4.add(jPanel3);
        jPanel3.setBounds(470, 50, 130, 130);

        jLabel25.setFont(new java.awt.Font("Calibri", 1, 12));
        jLabel25.setText("Foto");
        jPanel4.add(jLabel25);
        jLabel25.setBounds(515, 30, 40, 16);

        SucursalMostrar.setFont(new java.awt.Font("Calibri", 0, 12));
        SucursalMostrar.setAlignmentX(0.5F);
        jPanel4.add(SucursalMostrar);
        SucursalMostrar.setBounds(30, 120, 100, 20);

        VentasMostrar.setFont(new java.awt.Font("Calibri", 0, 12));
        VentasMostrar.setAlignmentX(0.5F);
        jPanel4.add(VentasMostrar);
        VentasMostrar.setBounds(410, 70, 40, 20);

        IDGerenteMostrar.setFont(new java.awt.Font("Calibri", 0, 12));
        IDGerenteMostrar.setAlignmentX(0.5F);
        jPanel4.add(IDGerenteMostrar);
        IDGerenteMostrar.setBounds(260, 50, 90, 20);

        NombreGerenteMostrar.setFont(new java.awt.Font("Calibri", 0, 12));
        NombreGerenteMostrar.setAlignmentX(0.5F);
        jPanel4.add(NombreGerenteMostrar);
        NombreGerenteMostrar.setBounds(260, 90, 90, 20);

        ApellidosMostrar.setFont(new java.awt.Font("Calibri", 0, 12));
        ApellidosMostrar.setAlignmentX(0.5F);
        jPanel4.add(ApellidosMostrar);
        ApellidosMostrar.setBounds(260, 130, 90, 20);

        TablaMostrarTodo.setFont(new java.awt.Font("Calibri", 0, 12));
        TablaMostrarTodo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Sucursal", "Sucursal", "ID Gerente", "Gerente", "Ventas $"
            }
        ));
        TablaMostrarTodo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaMostrarTodoMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(TablaMostrarTodo);

        jPanel4.add(jScrollPane2);
        jScrollPane2.setBounds(35, 203, 580, 107);

        jLabel31.setFont(new java.awt.Font("Calibri", 1, 12));
        jLabel31.setText("Consulta general");
        jPanel4.add(jLabel31);
        jLabel31.setBounds(35, 181, 82, 16);

        MostrarTodo.setFont(new java.awt.Font("Calibri", 0, 12));
        MostrarTodo.setText("Mostrar Todo");
        MostrarTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarTodoActionPerformed(evt);
            }
        });
        jPanel4.add(MostrarTodo);
        MostrarTodo.setBounds(188, 327, 105, 25);

        LimpiarMostrar.setFont(new java.awt.Font("Calibri", 0, 12));
        LimpiarMostrar.setText("Limpiar");
        LimpiarMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimpiarMostrarActionPerformed(evt);
            }
        });
        jPanel4.add(LimpiarMostrar);
        LimpiarMostrar.setBounds(401, 327, 89, 25);

        IdsucursalMostrar.setFont(new java.awt.Font("Calibri", 0, 12));
        IdsucursalMostrar.setAlignmentX(0.5F);
        jPanel4.add(IdsucursalMostrar);
        IdsucursalMostrar.setBounds(30, 70, 100, 20);

        jLabel40.setFont(new java.awt.Font("Calibri", 1, 12));
        jLabel40.setText("Edad:");
        jPanel4.add(jLabel40);
        jLabel40.setBounds(150, 160, 27, 16);

        EdadMostrar.setFont(new java.awt.Font("Calibri", 0, 12));
        EdadMostrar.setAlignmentX(0.5F);
        jPanel4.add(EdadMostrar);
        EdadMostrar.setBounds(260, 160, 90, 20);

        jLabel14.setFont(new java.awt.Font("Calibri", 1, 12));
        jLabel14.setText("Zona:");
        jPanel4.add(jLabel14);
        jLabel14.setBounds(390, 110, 27, 16);

        ZonaLabel.setFont(new java.awt.Font("Calibri", 0, 12));
        jPanel4.add(ZonaLabel);
        ZonaLabel.setBounds(420, 130, 40, 20);

        jTabbedPane1.addTab("Mostrar Sucursales", jPanel4);

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel5.setFont(new java.awt.Font("Calibri", 0, 12));
        jPanel5.setLayout(null);

        jLabel32.setFont(new java.awt.Font("Calibri", 0, 12));
        jLabel32.setText("Reportes");
        jPanel5.add(jLabel32);
        jLabel32.setBounds(27, 38, 49, 16);

        TablaReportes.setFont(new java.awt.Font("Calibri", 0, 12));
        TablaReportes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Sucursal", "Sucursal", "Ventas", "Zona"
            }
        ));
        jScrollPane3.setViewportView(TablaReportes);
        TablaReportes.getColumnModel().getColumn(2).setResizable(false);
        TablaReportes.getColumnModel().getColumn(2).setPreferredWidth(50);
        TablaReportes.getColumnModel().getColumn(3).setResizable(false);
        TablaReportes.getColumnModel().getColumn(3).setPreferredWidth(50);

        jPanel5.add(jScrollPane3);
        jScrollPane3.setBounds(27, 91, 310, 106);

        PanelGrafico.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout PanelGraficoLayout = new javax.swing.GroupLayout(PanelGrafico);
        PanelGrafico.setLayout(PanelGraficoLayout);
        PanelGraficoLayout.setHorizontalGroup(
            PanelGraficoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 258, Short.MAX_VALUE)
        );
        PanelGraficoLayout.setVerticalGroup(
            PanelGraficoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 268, Short.MAX_VALUE)
        );

        jPanel5.add(PanelGrafico);
        PanelGrafico.setBounds(359, 28, 260, 270);

        jButton2.setFont(new java.awt.Font("Calibri", 0, 12));
        jButton2.setText("Crear Tabla");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton2);
        jButton2.setBounds(60, 215, 95, 25);

        DireccionBoton.setFont(new java.awt.Font("Calibri", 0, 12));
        DireccionBoton.setText("Dirección");
        DireccionBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DireccionBotonActionPerformed(evt);
            }
        });
        jPanel5.add(DireccionBoton);
        DireccionBoton.setBounds(150, 310, 83, 25);

        jLabel33.setFont(new java.awt.Font("Calibri", 0, 12));
        jLabel33.setText("Guardar reporte");
        jPanel5.add(jLabel33);
        jLabel33.setBounds(30, 280, 87, 16);

        Direccion.setFont(new java.awt.Font("Calibri", 0, 12));
        Direccion.setEnabled(false);
        jPanel5.add(Direccion);
        Direccion.setBounds(30, 310, 112, 22);

        jButton3.setFont(new java.awt.Font("Calibri", 0, 12));
        jButton3.setText("Generar PDF");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton3);
        jButton3.setBounds(240, 310, 99, 25);

        LimpiarReportes.setFont(new java.awt.Font("Calibri", 0, 12));
        LimpiarReportes.setText("Limpiar");
        LimpiarReportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimpiarReportesActionPerformed(evt);
            }
        });
        jPanel5.add(LimpiarReportes);
        LimpiarReportes.setBounds(201, 215, 73, 25);

        jButton1.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jButton1.setText("Dir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton1);
        jButton1.setBounds(550, 310, 70, 25);

        jButton8.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jButton8.setText("Crear y guardar");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton8);
        jButton8.setBounds(450, 340, 120, 25);

        DirGrafico.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        DirGrafico.setEnabled(false);
        jPanel5.add(DirGrafico);
        DirGrafico.setBounds(360, 310, 180, 22);

        jTabbedPane1.addTab("Reportes", jPanel5);

        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel6.setFont(new java.awt.Font("Calibri", 0, 12));

        jLabel34.setFont(new java.awt.Font("Calibri", 0, 12));
        jLabel34.setText("Cambiar contraseña");

        jLabel35.setFont(new java.awt.Font("Calibri", 0, 12));
        jLabel35.setText("Contraseña anterior:");

        jLabel36.setFont(new java.awt.Font("Calibri", 0, 12));
        jLabel36.setText("Nueva contraseña:");

        jLabel37.setFont(new java.awt.Font("Calibri", 0, 12));
        jLabel37.setText("Confirma nueva contraseña:");

        jButton4.setFont(new java.awt.Font("Calibri", 0, 12));
        jButton4.setText("Cambiar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel38.setFont(new java.awt.Font("Calibri", 0, 12));
        jLabel38.setText("Salir del administrador");

        jButton5.setFont(new java.awt.Font("Calibri", 0, 12));
        jButton5.setText("Salir");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(164, 164, 164)
                .addComponent(jButton4)
                .addContainerGap(406, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel34)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 165, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel36)
                                .addGap(21, 21, 21)
                                .addComponent(PassNueva, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel35)
                                .addGap(10, 10, 10)
                                .addComponent(PassVieja, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE))
                            .addComponent(jLabel37, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PassNuevaConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(61, 61, 61)))
                .addGap(40, 40, 40)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel38)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(113, 113, 113))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel34)
                .addGap(16, 16, 16)
                .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel35)
                            .addComponent(PassVieja, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel36)
                            .addComponent(PassNueva, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addComponent(jLabel37)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PassNuevaConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jButton5)))
                .addContainerGap(78, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Opciones", jPanel6);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(315, 315, 315)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 654, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void GenerarIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenerarIdActionPerformed
    int aleatorio = (int) Math.round(Math.random()*100000);
    IdSucursalText.setText(Integer.toString(aleatorio));
    int aleatorio2 = (int) Math.round(Math.random()*1000);
    IdGerenteText.setText(Integer.toString(aleatorio2));
}//GEN-LAST:event_GenerarIdActionPerformed

private void BuscarImgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarImgActionPerformed
    JFileChooser jf = new JFileChooser();        
    jf.showOpenDialog(null);
    jf.setFileFilter(new FileNameExtensionFilter("Archivo de Imagen","jpg","jpeg","png"));
    int respuesta = jf.showOpenDialog(this);
    if (respuesta == JFileChooser.APPROVE_OPTION){
        String imc = jf.getSelectedFile().getAbsolutePath();
        ImageIcon archivo = new ImageIcon(imc);
        Image im= archivo.getImage().getScaledInstance(LabelFoto.getWidth(),LabelFoto.getHeight(),Image.SCALE_SMOOTH);
        Icon ics = new ImageIcon(im);
        LabelFoto.setIcon(ics);   
        Dir.setText(imc);
        }
}//GEN-LAST:event_BuscarImgActionPerformed

private void LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimpiarActionPerformed
    IdGerenteText.setText(""); 
    ContraseñaText.setText("");
    GerenteText.setText("");
    ApellidosText.setText("");
    EdadText.setText("");
    NombreSucursalText.setText("");
    IdSucursalText.setText("");
    Dir.setText("");
    buttonGroup2.clearSelection();
    LabelFoto.setIcon(null);
}//GEN-LAST:event_LimpiarActionPerformed

private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
    LabelFoto.setIcon(null);
    ImageIcon archivo = new ImageIcon(getClass().getResource("/Images/usuario.png"));
    Image im= archivo.getImage().getScaledInstance(LabelFoto.getWidth(),LabelFoto.getHeight(),Image.SCALE_SMOOTH);
    Icon ics = new ImageIcon(im);
    LabelFoto.setIcon(ics); 
    Grafico x=new Grafico();
    String url=getClass().getResource("/Images/usuario.png").toString();
    int y=url.length();
    String dir2=url.substring(10, y);
    String dir = dir2.substring(0, dir2.length()-41);
    dir=dir+"usuario.png";
    Dir.setText(dir);
    try{
            ImageIO.write(x.createImage(PanelFotoCrear), "png", new File(dir));//La direccion debe ser la misma que tenga la imagen "1213" para que se guarde en el paquete "Images" del proyecto, solo su nombre cambia y debe de ser "grafico.png" si no habra error.
            //JOptionPane.showMessageDialog(null,"Listo ","Grafico guardado",JOptionPane.INFORMATION_MESSAGE);
            }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error"+dir,"Error",JOptionPane.ERROR_MESSAGE);
            }
    
}//GEN-LAST:event_jButton6ActionPerformed

private void GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarActionPerformed
    String zone="";
    if(NorteG.isSelected()){
        zone="Norte";
        }
    if(SurG.isSelected()){
        zone="Sur";
        }
    if(CentroG.isSelected()){
        zone="Centro";
        }
    Conectar cerrar=new Conectar();
    Conectar con=new Conectar();
    Connection reg=con.conexion();
    String idg=IdGerenteText.getText(); 
    String pass=ContraseñaText.getText();
    String nombreg=GerenteText.getText();
    String apellg=ApellidosText.getText();
    String edad=EdadText.getText();
    String suc=NombreSucursalText.getText();
    String ids=IdSucursalText.getText();
    String dir=Dir.getText();
    String ventas="0";
    String sql,sql2,sql3;
    ResultSet m=null;
    if(idg.equals("") || pass.equals("") || nombreg.equals("") || apellg.equals("") || edad.equals("") || suc.equals("") || ids.equals("") || dir.equals("")){
        JOptionPane.showMessageDialog(null,"Los campos no deben de estar vacios","",JOptionPane.WARNING_MESSAGE);
        }
    else{
        try{
            sql="SELECT IdGerente, IdSucursal FROM sucursales WHERE IdGerente='"+idg+"' OR IdSucursal='"+ids+"'";
            PreparedStatement pst=reg.prepareStatement(sql);
            m=pst.executeQuery();
            if(m.next()){
                JOptionPane.showMessageDialog(null,"Eliga otros ID's","",JOptionPane.WARNING_MESSAGE);
                }
            else{
                File file=new File(dir);
                FileInputStream fis = new FileInputStream(file);
                sql2="INSERT INTO sucursales (IdSucursal,NomSucursal,IdGerente,NomGerente,ApellGerente,EdadGerente,FotoGerente,Ventas,Zona) VALUES (?,?,?,?,?,?,?,?,?)";
                PreparedStatement pst2=reg.prepareStatement(sql2);
                pst2.setString(1,ids);
                pst2.setString(2,suc);
                pst2.setString(3,idg);
                pst2.setString(4,nombreg);
                pst2.setString(5,apellg);
                pst2.setString(6,edad);
                pst2.setBinaryStream(7, fis, (int) file.length());
                pst2.setString(8,ventas);
                pst2.setString(9,zone);
                int x=pst2.executeUpdate();
                if(x>0){
                    JOptionPane.showMessageDialog(null,"Se ha guardado un nuevo registro","",JOptionPane.INFORMATION_MESSAGE);
                    IdGerenteText.setText(""); 
                    ContraseñaText.setText("");
                    GerenteText.setText("");
                    ApellidosText.setText("");
                    EdadText.setText("");
                    NombreSucursalText.setText("");
                    IdSucursalText.setText("");
                    Dir.setText("");
                    buttonGroup2.clearSelection();
                    LabelFoto.setIcon(null);
                    }
                sql3="INSERT INTO pass (Id,Password) VALUES (?,?)";
                PreparedStatement pst3=reg.prepareStatement(sql3);
                pst3.setString(1,idg);
                pst3.setString(2,pass);
                pst3.executeUpdate();
                cerrar.closeSQLNegotiator(pst2);
                cerrar.closeSQLNegotiator(pst3);
                }
            cerrar.closeSQLNegotiator(pst);
            }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error "+e,"Error",JOptionPane.ERROR_MESSAGE);
            }
        finally{
                cerrar.closeSQLNegotiator(reg);
                cerrar.closeSQLNegotiator(m);
                }
        }
}//GEN-LAST:event_GuardarActionPerformed

private void BucarFotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BucarFotoActionPerformed
    JFileChooser jf = new JFileChooser();        
    jf.showOpenDialog(null);
    jf.setFileFilter(new FileNameExtensionFilter("Archivo de Imagen","jpg","jpeg","png"));
    int respuesta = jf.showOpenDialog(this);
    if (respuesta == JFileChooser.APPROVE_OPTION){
        String imc = jf.getSelectedFile().getAbsolutePath();
        ImageIcon archivo = new ImageIcon(imc);
        Image im= archivo.getImage().getScaledInstance(LabelFotoModificar.getWidth(),LabelFotoModificar.getHeight(),Image.SCALE_SMOOTH);
        Icon ics = new ImageIcon(im);
        LabelFotoModificar.setIcon(ics);   
        DirModificar.setText(imc);
        }
}//GEN-LAST:event_BucarFotoActionPerformed

private void LimpiarActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimpiarActualizarActionPerformed
    NombreG.setText("");
    ApellidoG.setText("");
    EdadG.setText("");
    NombreSucursal.setText("");
    IdEliminar.setText("");
    DirModificar.setText("");
    IDSucursalText.setText("");
    buttonGroup1.clearSelection();
    LabelFotoModificar.setIcon(null);
    DefaultTableModel modelo = (DefaultTableModel) TablaModificar.getModel();
    while(modelo.getRowCount()>0)modelo.removeRow(0);
}//GEN-LAST:event_LimpiarActualizarActionPerformed

private void VerTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerTablaActionPerformed
    Conectar con=new Conectar();
    Conectar cerrar=new Conectar();
    Connection reg=con.conexion();
    String sql;
    ResultSet m=null;
    sql="SELECT IdSucursal,NomSucursal,IdGerente,NomGerente,ApellGerente,EdadGerente,Zona FROM sucursales";
    try{
        PreparedStatement pst=reg.prepareStatement(sql);
        m=pst.executeQuery();
        DefaultTableModel modelo=(DefaultTableModel)TablaModificar.getModel();
        ResultSetMetaData rsmd = m.getMetaData();
        int numCols = rsmd.getColumnCount();
        modelo.setRowCount(0);
        Object []dato = new Object[numCols];
        while (m.next()){
            for (int i=0;i<numCols;i++){
                dato[i]=m.getObject(i+1);
                }
            modelo.addRow(dato);
            }
        TablaModificar.setModel(modelo);
        cerrar.closeSQLNegotiator(pst);
        }
    catch(Exception e){
        JOptionPane.showMessageDialog(null,"Error "+e,"Error",JOptionPane.ERROR_MESSAGE);
        }
    finally{
        cerrar.closeSQLNegotiator(reg);
        cerrar.closeSQLNegotiator(m);
        }
}//GEN-LAST:event_VerTablaActionPerformed

private void TablaModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaModificarMouseClicked
    int fila=TablaModificar.getSelectedRow();
    NombreG.setText(TablaModificar.getValueAt(fila,3).toString());
    ApellidoG.setText(TablaModificar.getValueAt(fila,4).toString());
    EdadG.setText(TablaModificar.getValueAt(fila,5).toString());
    NombreSucursal.setText(TablaModificar.getValueAt(fila,1).toString());
    IDSucursalText.setText(TablaModificar.getValueAt(fila,0).toString());
    LabelFotoModificar.setIcon(null);
    String x="";
    x=TablaModificar.getValueAt(fila,6).toString();
    if(x.equals("Centro")){
        CentroM.setSelected(true);
        }
    if(x.equals("Norte")){
        NorteM.setSelected(true);
        }
    if(x.equals("Sur")){
        SurM.setSelected(true);
        }
}//GEN-LAST:event_TablaModificarMouseClicked

private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
    String x=IDSucursalText.getText();
    if(x.equals("")){
        JOptionPane.showMessageDialog(null,"El id debe tener un valor","",JOptionPane.WARNING_MESSAGE);
        }
    else{
        Conectar con=new Conectar();
        Connection reg=con.conexion();
        String sql;
        ResultSet m=null;
        sql="SELECT FotoGerente From sucursales WHERE IdSucursal='"+x+"'";
        InputStream y=null;
        try{
            PreparedStatement pst=reg.prepareStatement(sql);
            m=pst.executeQuery();
            if(m.next()){
                y=m.getBinaryStream(1);
                BufferedImage n=ImageIO.read(y);
                ImageIcon icono=new ImageIcon(n);
                Image im= icono.getImage().getScaledInstance(LabelFotoModificar.getWidth(),LabelFotoModificar.getHeight(),Image.SCALE_SMOOTH);
                Icon ics = new ImageIcon(im);
                LabelFotoModificar.setIcon(ics);
                }
            }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error "+e,"Error",JOptionPane.ERROR_MESSAGE);
            }
        }
}//GEN-LAST:event_jButton7ActionPerformed

private void ActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActualizarActionPerformed
    String zone="";
    if(NorteM.isSelected()){
        zone="Norte";
        }
    if(SurM.isSelected()){
        zone="Sur";
        }
    if(CentroM.isSelected()){
        zone="Centro";
        }
    Conectar con=new Conectar();
    Conectar cerrar=new Conectar();
    Connection reg=con.conexion();
    String nom=NombreG.getText();
    String apellido=ApellidoG.getText();
    String edad=EdadG.getText();
    String sucursal=NombreSucursal.getText();
    String IDS=IDSucursalText.getText();
    String direccion=DirModificar.getText();
    if(nom.equals("") || apellido.equals("") || edad.equals("") || sucursal.equals("")){
        JOptionPane.showMessageDialog(null,"No debe haber campos vacios","",JOptionPane.WARNING_MESSAGE);
        }
    else{
        String sql;
        int n=0;
        sql="UPDATE sucursales SET NomGerente=?,ApellGerente=?,EdadGerente=?,NomSucursal=?,Zona=? WHERE IdSucursal='"+IDS+"'";
        try{
            PreparedStatement pst=reg.prepareStatement(sql);
            pst.setString(1,nom);
            pst.setString(2,apellido);
            pst.setString(3,edad);
            pst.setString(4,sucursal);
            pst.setString(5,zone);
            n=pst.executeUpdate();
            if(direccion.equals("")){    
                }
            else{
                File file=new File(direccion);
                FileInputStream fis = new FileInputStream(file);
                String sqlfoto="UPDATE sucursales SET FotoGerente=? WHERE IdSucursal='"+IDS+"'";
                PreparedStatement pst2=reg.prepareStatement(sqlfoto);
                pst2.setBinaryStream(1,fis,(int)file.length());
                pst2.executeUpdate();
                cerrar.closeSQLNegotiator(pst2);
                }
            if(n>0){
                JOptionPane.showMessageDialog(null,"Registro modificado","",JOptionPane.INFORMATION_MESSAGE);
                NombreG.setText("");
                ApellidoG.setText("");
                EdadG.setText("");
                NombreSucursal.setText("");
                IdEliminar.setText("");
                DirModificar.setText("");
                IDSucursalText.setText("");
                buttonGroup1.clearSelection();
                LabelFotoModificar.setIcon(null);
                DefaultTableModel modelo = (DefaultTableModel) TablaModificar.getModel();
                while(modelo.getRowCount()>0)modelo.removeRow(0);
                cerrar.closeSQLNegotiator(pst);
                }
            else{
                JOptionPane.showMessageDialog(null,"No existe ese registro","Error",JOptionPane.WARNING_MESSAGE);
                }
            }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error "+e,"Error",JOptionPane.ERROR_MESSAGE);
            }
        finally{
            cerrar.closeSQLNegotiator(reg);
            }
        }       
}//GEN-LAST:event_ActualizarActionPerformed

private void EliminarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarButtonActionPerformed
    Conectar con=new Conectar();
    Conectar cerrar=new Conectar();
    Connection reg=con.conexion();
    String x=IdEliminar.getText();
    String sql,sql2,sql3;
    String idg;
    ResultSet m=null;
    if(x.equals("")){
        JOptionPane.showMessageDialog(null,"El campo eliminar no debe de estar vacio","",JOptionPane.WARNING_MESSAGE);
        }
    else{
        sql="SELECT IdSucursal,IdGerente FROM sucursales WHERE IdSucursal='"+x+"'";
        sql2="DELETE FROM sucursales WHERE IdSucursal='"+IdEliminar.getText()+"'";
        try{
            PreparedStatement pst=reg.prepareStatement(sql);
            m=pst.executeQuery();
            if(m.next()){
                idg=m.getString("IdGerente");
                sql3="DELETE FROM pass WHERE Id='"+idg+"'";
                PreparedStatement pst2=reg.prepareStatement(sql2);
                pst2.executeUpdate();
                PreparedStatement pst3=reg.prepareStatement(sql3);
                pst3.executeUpdate();
                NombreG.setText("");
                ApellidoG.setText("");
                EdadG.setText("");
                NombreSucursal.setText("");
                IdEliminar.setText("");
                DirModificar.setText("");
                IDSucursalText.setText("");
                buttonGroup1.clearSelection();
                LabelFotoModificar.setIcon(null);
                DefaultTableModel modelo = (DefaultTableModel) TablaModificar.getModel();
                while(modelo.getRowCount()>0)modelo.removeRow(0);
                JOptionPane.showMessageDialog(null,"La sucursal se ha eliminado","",JOptionPane.INFORMATION_MESSAGE);
                cerrar.closeSQLNegotiator(pst2);
                cerrar.closeSQLNegotiator(pst3);
                }
                else{
                    JOptionPane.showMessageDialog(null,"No existe una sucursal con ese ID","Error",JOptionPane.ERROR_MESSAGE);
                    }
            cerrar.closeSQLNegotiator(pst);
            }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error "+e,"Error",JOptionPane.ERROR_MESSAGE);
            }
        finally{
            cerrar.closeSQLNegotiator(reg);
            cerrar.closeSQLNegotiator(m);
            }
        }
}//GEN-LAST:event_EliminarButtonActionPerformed

private void MostrarTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarTodoActionPerformed
    Conectar con=new Conectar();
    Conectar cerrar=new Conectar();
    Connection reg=con.conexion();
    String sql;
    ResultSet m=null;
    sql="SELECT IdSucursal,NomSucursal,IdGerente,NomGerente,Ventas FROM sucursales";
    try{
        PreparedStatement pst=reg.prepareStatement(sql);
        m=pst.executeQuery();
        DefaultTableModel modelo=(DefaultTableModel)TablaMostrarTodo.getModel();
        ResultSetMetaData rsmd = m.getMetaData();
        int numCols=rsmd.getColumnCount();
        modelo.setRowCount(0);
        Object []dato = new Object[numCols];
        while (m.next()){
            for (int i=0;i<numCols;i++){
                dato[i]=m.getObject(i+1);
                }
            modelo.addRow(dato);
            }
        TablaMostrarTodo.setModel(modelo);
        cerrar.closeSQLNegotiator(pst);
        }
    catch(Exception e){
        JOptionPane.showMessageDialog(null,"Error "+e,"Error",JOptionPane.ERROR_MESSAGE);
        }
    finally{
        cerrar.closeSQLNegotiator(reg);
        cerrar.closeSQLNegotiator(m);
        }
}//GEN-LAST:event_MostrarTodoActionPerformed

private void TablaMostrarTodoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaMostrarTodoMouseClicked
    int fila=TablaMostrarTodo.getSelectedRow();
    IdsucursalMostrar.setText(TablaMostrarTodo.getValueAt(fila,0).toString());
    String x=IdsucursalMostrar.getText();
    Conectar con=new Conectar();
    Conectar cerrar=new Conectar();
    Connection reg=con.conexion();
    String sql;
    ResultSet m=null;
    InputStream y=null;
    sql="SELECT NomSucursal,IdGerente,NomGerente,ApellGerente,EdadGerente,FotoGerente,Ventas,Zona FROM sucursales WHERE IdSucursal='"+x+"'";
    try{
        PreparedStatement pstc=reg.prepareStatement(sql);
        m=pstc.executeQuery();
        if(m.next()){
            SucursalMostrar.setText(m.getString("NomSucursal"));
            IDGerenteMostrar.setText(m.getString("IdGerente"));
            NombreGerenteMostrar.setText(m.getString("NomGerente"));
            ApellidosMostrar.setText(m.getString("ApellGerente"));
            EdadMostrar.setText(m.getString("EdadGerente"));
            VentasMostrar.setText(m.getString("Ventas"));
            ZonaLabel.setText(m.getString("Zona"));
            y=m.getBinaryStream(6);
            BufferedImage n=ImageIO.read(y);
            ImageIcon icono=new ImageIcon(n);
            Image im= icono.getImage().getScaledInstance(LabelFotoConsulta.getWidth(),LabelFotoConsulta.getHeight(),Image.SCALE_SMOOTH);
            Icon ics = new ImageIcon(im);
            LabelFotoConsulta.setIcon(ics);
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
}//GEN-LAST:event_TablaMostrarTodoMouseClicked

private void LimpiarMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimpiarMostrarActionPerformed
    IdsucursalMostrar.setText("");
    SucursalMostrar.setText("");
    IDGerenteMostrar.setText("");
    NombreGerenteMostrar.setText("");
    ApellidosMostrar.setText("");
    EdadMostrar.setText("");
    VentasMostrar.setText("");
    ZonaLabel.setText("");
    LabelFotoConsulta.setIcon(null);
    DefaultTableModel modelo = (DefaultTableModel) TablaMostrarTodo.getModel();
    while(modelo.getRowCount()>0)modelo.removeRow(0);
}//GEN-LAST:event_LimpiarMostrarActionPerformed

private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    Conectar con=new Conectar();
    Conectar cerrar=new Conectar();
    Connection reg=con.conexion();
    String sql;
    ResultSet m=null;
    sql="SELECT IdSucursal,NomSucursal,Ventas,Zona FROM sucursales";
    try{
        PreparedStatement pst=reg.prepareStatement(sql);
        m=pst.executeQuery();
        DefaultTableModel modelo=(DefaultTableModel)TablaReportes.getModel();
        ResultSetMetaData rsmd = m.getMetaData();
        int numCols=rsmd.getColumnCount();
        modelo.setRowCount(0);
        Object []dato = new Object[numCols];
        while (m.next()){
            for (int i=0;i<numCols;i++){
                dato[i]=m.getObject(i+1);
                }
            modelo.addRow(dato);
            }
        TablaReportes.setModel(modelo);
        cerrar.closeSQLNegotiator(pst);
        }
    catch(Exception e){
        JOptionPane.showMessageDialog(null,"Error "+e,"Error",JOptionPane.ERROR_MESSAGE);
        }
    finally{
        cerrar.closeSQLNegotiator(reg);
        cerrar.closeSQLNegotiator(m);
        }
}//GEN-LAST:event_jButton2ActionPerformed

private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
    this.dispose();
}//GEN-LAST:event_jButton5ActionPerformed

private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
    Conectar con=new Conectar();
    Conectar cerrar=new Conectar();
    Connection reg=con.conexion();
    String passV=PassVieja.getText();
    String passN=PassNueva.getText();
    String passNC=PassNuevaConfirmar.getText();
    String sql,sql2,id="12345";
    ResultSet m=null;
    sql="SELECT Password FROM pass WHERE Id="+id;
    sql2="UPDATE pass SET Password=? WHERE Id='12345'";
    if(passV.equals("") || passN.equals("")|| passNC.equals("")){
        JOptionPane.showMessageDialog(null,"Los campos no deben de estar vacios","",JOptionPane.WARNING_MESSAGE);
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
                        PassVieja.setText("");
                        PassNueva.setText("");
                        PassNuevaConfirmar.setText("");
                        cerrar.closeSQLNegotiator(pst);
                        JOptionPane.showMessageDialog(null,"La contraseña ha sido modificada","",JOptionPane.INFORMATION_MESSAGE);
                        }
                    else{
                        JOptionPane.showMessageDialog(null,"Las contraseñas no coinciden","",JOptionPane.WARNING_MESSAGE);
                        }
                    }
                else{
                    JOptionPane.showMessageDialog(null,"Contraseñaincorrecta","",JOptionPane.WARNING_MESSAGE); 
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
}//GEN-LAST:event_jButton4ActionPerformed

private void LimpiarReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimpiarReportesActionPerformed
    Direccion.setText("");
    DirGrafico.setText("");
    PanelGrafico.removeAll(); 
    PanelGrafico.repaint();
    DefaultTableModel modelo = (DefaultTableModel) TablaReportes.getModel();
    while(modelo.getRowCount()>0)modelo.removeRow(0);
}//GEN-LAST:event_LimpiarReportesActionPerformed

private void GerenteTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_GerenteTextKeyTyped
    Validacion x=new Validacion();
    x.letras(evt);
}//GEN-LAST:event_GerenteTextKeyTyped

private void ApellidosTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ApellidosTextKeyTyped
    Validacion x=new Validacion();
    x.letras(evt);
}//GEN-LAST:event_ApellidosTextKeyTyped

private void NombreSucursalTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NombreSucursalTextKeyTyped
    Validacion x=new Validacion();
    x.letras(evt);
}//GEN-LAST:event_NombreSucursalTextKeyTyped

private void NombreGKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NombreGKeyTyped
    Validacion x=new Validacion();
    x.letras(evt);
}//GEN-LAST:event_NombreGKeyTyped

private void ApellidoGKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ApellidoGKeyTyped
    Validacion x=new Validacion();
    x.letras(evt);
}//GEN-LAST:event_ApellidoGKeyTyped

private void NombreSucursalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NombreSucursalKeyTyped
    Validacion x=new Validacion();
    x.letras(evt);
}//GEN-LAST:event_NombreSucursalKeyTyped

private void EdadGKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EdadGKeyTyped
    Validacion x=new Validacion();
    x.numeros(evt);
}//GEN-LAST:event_EdadGKeyTyped

private void IdEliminarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_IdEliminarKeyTyped
    Validacion x=new Validacion();
    x.numeros(evt);
}//GEN-LAST:event_IdEliminarKeyTyped

private void EdadTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EdadTextKeyTyped
    Validacion x=new Validacion();
    x.numeros(evt);
}//GEN-LAST:event_EdadTextKeyTyped

private void DireccionBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DireccionBotonActionPerformed
    JFileChooser dlg= new JFileChooser();
    int option = dlg.showSaveDialog(this);
    if(option==JFileChooser.APPROVE_OPTION){
	File f=dlg.getSelectedFile();
	String f1=f.toString();
	Direccion.setText(f1);
        }
}//GEN-LAST:event_DireccionBotonActionPerformed

private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    String x=Direccion.getText();
    String y=DirGrafico.getText();
    if(x.equals("") || y.equals("")){
        JOptionPane.showMessageDialog(null,"Las direcciones no deben de estar vacias","",JOptionPane.WARNING_MESSAGE);
        }
    else{    
        Reporte g =new Reporte(new Entrar(),true);
        Reporte.Direccion.setText(Direccion.getText());
        Reporte.DireccionGrafico.setText(DirGrafico.getText());
        g.setLocationRelativeTo(null);
        g.setVisible(true);
        }
}//GEN-LAST:event_jButton3ActionPerformed

private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    JFileChooser dlg= new JFileChooser();
    int option = dlg.showSaveDialog(this);
    if(option==JFileChooser.APPROVE_OPTION){
	File f=dlg.getSelectedFile();
	String f1=f.toString();
	DirGrafico.setText(f1);
        }
}//GEN-LAST:event_jButton1ActionPerformed

private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
    Conectar con=new Conectar();
    Conectar cerrar=new Conectar();
    Connection reg1=con.conexion();
    Connection reg2=con.conexion();
    Connection reg3=con.conexion();
    String sql1,sql2,sql3;
    ResultSet a=null,b=null,c=null;
    int y1=0,y2=0,y3=0;
    sql1="SELECT Ventas FROM sucursales WHERE Zona='Norte'";
    sql2="SELECT Ventas FROM sucursales WHERE Zona='Centro'";
    sql3="SELECT Ventas From sucursales WHERE Zona='Sur'";
    if(DirGrafico.getText().equals("")){
        JOptionPane.showMessageDialog(null,"Debe de especificar una direccion donde guardar el gráfico","",JOptionPane.WARNING_MESSAGE);
        }
    else{
        try{
            PreparedStatement x=reg1.prepareStatement(sql1);
            a=x.executeQuery();
            while(a.next()){
                String valor=a.getString("Ventas");
                int valorint1=Integer.parseInt(valor);
                y1=y1+valorint1;
                }
            PreparedStatement y=reg2.prepareStatement(sql2);
            b=y.executeQuery();
            while(b.next()){
                String valor=b.getString("Ventas");
                int valorint2=Integer.parseInt(valor);
                y2=y2+valorint2;
                }
            PreparedStatement z=reg3.prepareStatement(sql3);
            c=z.executeQuery();
            while(c.next()){
                String valor=c.getString("Ventas");
                int valorint3=Integer.parseInt(valor);
                y3=y3+valorint3;
                }
            cerrar.closeSQLNegotiator(x);
            cerrar.closeSQLNegotiator(y);
            cerrar.closeSQLNegotiator(z);
            }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error"+e,"Error",JOptionPane.ERROR_MESSAGE);
            }
        finally{
            cerrar.closeSQLNegotiator(a);
            cerrar.closeSQLNegotiator(b);
            cerrar.closeSQLNegotiator(c);
            cerrar.closeSQLNegotiator(reg1);
            cerrar.closeSQLNegotiator(reg2);
            cerrar.closeSQLNegotiator(reg3);
            }
        String znorte,zcentro,zsur;
        znorte=Integer.toString(y1);
        zcentro=Integer.toString(y2);
        zsur=Integer.toString(y3);
        Grafico migrafico=new Grafico();
        Dimension d = PanelGrafico.getSize();
        int[] valores = {y1,y2,y3};
        String[] arg1 = {znorte,zcentro,zsur};
        String[] arg2 = {"Norte", "Centro","Sur"};
        String[] data = {"","","Sucursales"};
        migrafico.crear_grafico_de_barras(d, valores, arg2, arg1, data);
        JLabel j = new JLabel();
        j.setBounds(0, 0, d.width, d.height);
        migrafico.cargar_grafico(j);
        PanelGrafico.add(j);
        this.repaint();
        BufferedImage imagen = new BufferedImage(j.getWidth(), j.getHeight(), BufferedImage.TYPE_INT_ARGB);
        j.paint(imagen.getGraphics());
        try{
            String dir=DirGrafico.getText()+".png";
            ImageIO.write(imagen, "png", new File(dir));//La direccion debe ser la misma que tenga la imagen "1213" para que se guarde en el paquete "Images" del proyecto, solo su nombre cambia y debe de ser "grafico.png" si no habra error.
            JOptionPane.showMessageDialog(null,"Listo","Grafico guardado",JOptionPane.INFORMATION_MESSAGE);
            }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error"+e,"Error",JOptionPane.ERROR_MESSAGE);
            }
        }
}//GEN-LAST:event_jButton8ActionPerformed

    
    
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
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

     
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                Administrador dialog = new Administrador(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton Actualizar;
    private javax.swing.JTextField ApellidoG;
    private javax.swing.JLabel ApellidosMostrar;
    private javax.swing.JTextField ApellidosText;
    private javax.swing.JButton BucarFoto;
    private javax.swing.JButton BuscarImg;
    private javax.swing.JRadioButton CentroG;
    private javax.swing.JRadioButton CentroM;
    private javax.swing.JPasswordField ContraseñaText;
    private javax.swing.JTextField Dir;
    private javax.swing.JTextField DirGrafico;
    private javax.swing.JTextField DirModificar;
    private javax.swing.JTextField Direccion;
    private javax.swing.JButton DireccionBoton;
    private javax.swing.JTextField EdadG;
    private javax.swing.JLabel EdadMostrar;
    private javax.swing.JTextField EdadText;
    private javax.swing.JButton EliminarButton;
    private javax.swing.JButton GenerarId;
    private javax.swing.JTextField GerenteText;
    private javax.swing.JButton Guardar;
    private javax.swing.JLabel IDGerenteMostrar;
    private javax.swing.JTextField IDSucursalText;
    private javax.swing.JTextField IdEliminar;
    private javax.swing.JTextField IdGerenteText;
    private javax.swing.JTextField IdSucursalText;
    private javax.swing.JLabel IdsucursalMostrar;
    private javax.swing.JLabel LabelFoto;
    private javax.swing.JLabel LabelFotoConsulta;
    private javax.swing.JLabel LabelFotoModificar;
    private javax.swing.JButton Limpiar;
    private javax.swing.JButton LimpiarActualizar;
    private javax.swing.JButton LimpiarMostrar;
    private javax.swing.JButton LimpiarReportes;
    private javax.swing.JButton MostrarTodo;
    private javax.swing.JTextField NombreG;
    private javax.swing.JLabel NombreGerenteMostrar;
    private javax.swing.JTextField NombreSucursal;
    private javax.swing.JTextField NombreSucursalText;
    private javax.swing.JRadioButton NorteG;
    private javax.swing.JRadioButton NorteM;
    private javax.swing.JPanel PanelFoto;
    private javax.swing.JPanel PanelFotoCrear;
    private javax.swing.JPanel PanelGrafico;
    private javax.swing.JPasswordField PassNueva;
    private javax.swing.JPasswordField PassNuevaConfirmar;
    private javax.swing.JPasswordField PassVieja;
    private javax.swing.JLabel SucursalMostrar;
    private javax.swing.JRadioButton SurG;
    private javax.swing.JRadioButton SurM;
    private javax.swing.JTable TablaModificar;
    private javax.swing.JTable TablaMostrarTodo;
    private javax.swing.JTable TablaReportes;
    private javax.swing.JLabel VentasMostrar;
    private javax.swing.JButton VerTabla;
    private javax.swing.JLabel ZonaLabel;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
