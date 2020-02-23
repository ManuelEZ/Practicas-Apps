package GUI;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Dominio.*;
import java.awt.Color;
import java.awt.MouseInfo;
import java.awt.Point;

public class Paquetes extends javax.swing.JFrame {

    DefaultTableModel modelo;
    int abono = 0;
    int x, y;

    public Paquetes() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        this.getContentPane().setBackground(Color.DARK_GRAY);

        modelo = (DefaultTableModel) jTableDatos.getModel();
        txtPeliculas.setEnabled(false);
        txtDeportes.setEnabled(false);
       
    }

    public void sumaTotal() {
        int fila = 0;
        int total = 0;
        for (int i = 0; i < jTableDatos.getRowCount(); i++) {
            fila = Integer.parseInt(jTableDatos.getValueAt(i, 6).toString());
            total += fila;

        }
        lblTotalFacturacion.setText("Total Facturado: " + total);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        lblTitulo = new javax.swing.JLabel();
        lblSubtitulo = new javax.swing.JLabel();
        lblNAbonados = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblNFamiliares = new javax.swing.JLabel();
        txtNAbonado = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtNFamiliares = new javax.swing.JTextField();
        cboPaquetes = new javax.swing.JComboBox<>();
        lblPaquetes = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableDatos = new javax.swing.JTable();
        btnInsertar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnEliminarTodo = new javax.swing.JButton();
        btnInfoPaquetes = new javax.swing.JButton();
        Icono = new javax.swing.JLabel();
        lblPeliculas = new javax.swing.JLabel();
        lblDeportes = new javax.swing.JLabel();
        txtPeliculas = new javax.swing.JTextField();
        txtDeportes = new javax.swing.JTextField();
        btnTiposDeClientes = new javax.swing.JButton();
        btnPeliculasAlquiladas = new javax.swing.JButton();
        lblTotalFacturacion = new javax.swing.JLabel();
        lblMinimizar = new javax.swing.JLabel();
        lblSalir = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TV Trash");
        setUndecorated(true);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });

        lblTitulo.setFont(new java.awt.Font("Monotype Corsiva", 3, 24)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(51, 255, 255));
        lblTitulo.setText("¡TV TRASH!");

        lblSubtitulo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblSubtitulo.setForeground(new java.awt.Color(0, 255, 255));
        lblSubtitulo.setText("Ingreso de Datos");

        lblNAbonados.setForeground(new java.awt.Color(255, 255, 255));
        lblNAbonados.setText("N° Abonado:");

        lblNombre.setForeground(new java.awt.Color(255, 255, 255));
        lblNombre.setText("Nombre:");

        lblNFamiliares.setForeground(new java.awt.Color(255, 255, 255));
        lblNFamiliares.setText("N° Familiares:");

        txtNAbonado.setBackground(new java.awt.Color(204, 204, 204));
        txtNAbonado.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtNAbonado.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(154, 255, 255), 1, true));
        txtNAbonado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNAbonadoActionPerformed(evt);
            }
        });
        txtNAbonado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNAbonadoKeyTyped(evt);
            }
        });

        txtNombre.setBackground(new java.awt.Color(204, 204, 204));
        txtNombre.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtNombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(194, 255, 255)));
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });

        txtNFamiliares.setBackground(new java.awt.Color(204, 204, 204));
        txtNFamiliares.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtNFamiliares.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(194, 255, 255)));
        txtNFamiliares.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNFamiliaresKeyTyped(evt);
            }
        });

        cboPaquetes.setBackground(new java.awt.Color(51, 51, 51));
        cboPaquetes.setForeground(new java.awt.Color(0, 255, 255));
        cboPaquetes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Basico", "Pay Per View", "Full" }));
        cboPaquetes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(196, 255, 248)));
        cboPaquetes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboPaquetesActionPerformed(evt);
            }
        });

        lblPaquetes.setForeground(new java.awt.Color(255, 255, 255));
        lblPaquetes.setText("Paquete a Contratar:");

        jTableDatos.setBackground(new java.awt.Color(204, 204, 204));
        jTableDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "N° Abonado", "Nombre", "N° Familiares", "Paquete", "Alq. Deportes", "Alq. Peliculas", "Total a Pagar"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableDatos.setGridColor(new java.awt.Color(51, 51, 51));
        jScrollPane2.setViewportView(jTableDatos);

        btnInsertar.setBackground(new java.awt.Color(51, 51, 51));
        btnInsertar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnInsertar.setForeground(new java.awt.Color(0, 255, 255));
        btnInsertar.setText("Insertar");
        btnInsertar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(51, 51, 51));
        btnEliminar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(0, 255, 255));
        btnEliminar.setText("Eliminar");
        btnEliminar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnEliminarTodo.setBackground(new java.awt.Color(51, 51, 51));
        btnEliminarTodo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnEliminarTodo.setForeground(new java.awt.Color(0, 255, 255));
        btnEliminarTodo.setText("Eliminar Todo");
        btnEliminarTodo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnEliminarTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarTodoActionPerformed(evt);
            }
        });

        btnInfoPaquetes.setBackground(new java.awt.Color(102, 102, 102));
        btnInfoPaquetes.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnInfoPaquetes.setForeground(new java.awt.Color(255, 255, 255));
        btnInfoPaquetes.setText("Info Paquetes");
        btnInfoPaquetes.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnInfoPaquetes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInfoPaquetesActionPerformed(evt);
            }
        });

        Icono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/tvFondo.png"))); // NOI18N

        lblPeliculas.setForeground(new java.awt.Color(255, 255, 255));
        lblPeliculas.setText("N° Peliculas:");

        lblDeportes.setForeground(new java.awt.Color(255, 255, 255));
        lblDeportes.setText("N° Deportes:");

        txtPeliculas.setBackground(new java.awt.Color(204, 204, 204));
        txtPeliculas.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtPeliculas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(194, 255, 255)));
        txtPeliculas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPeliculasActionPerformed(evt);
            }
        });
        txtPeliculas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPeliculasKeyTyped(evt);
            }
        });

        txtDeportes.setBackground(new java.awt.Color(204, 204, 204));
        txtDeportes.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtDeportes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(194, 255, 255)));
        txtDeportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDeportesActionPerformed(evt);
            }
        });
        txtDeportes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDeportesKeyTyped(evt);
            }
        });

        btnTiposDeClientes.setBackground(new java.awt.Color(51, 51, 51));
        btnTiposDeClientes.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnTiposDeClientes.setForeground(new java.awt.Color(255, 153, 0));
        btnTiposDeClientes.setText("Clientes de c/Tipo");
        btnTiposDeClientes.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnTiposDeClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTiposDeClientesActionPerformed(evt);
            }
        });

        btnPeliculasAlquiladas.setBackground(new java.awt.Color(51, 51, 51));
        btnPeliculasAlquiladas.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnPeliculasAlquiladas.setForeground(new java.awt.Color(255, 153, 0));
        btnPeliculasAlquiladas.setText("Peliculas Alquiladas");
        btnPeliculasAlquiladas.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnPeliculasAlquiladas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPeliculasAlquiladasActionPerformed(evt);
            }
        });

        lblTotalFacturacion.setForeground(new java.awt.Color(0, 255, 255));

        lblMinimizar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblMinimizar.setForeground(new java.awt.Color(153, 153, 153));
        lblMinimizar.setText("-");
        lblMinimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMinimizarMouseClicked(evt);
            }
        });

        lblSalir.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblSalir.setForeground(new java.awt.Color(153, 153, 153));
        lblSalir.setText("x");
        lblSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSalirMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(279, 279, 279)
                                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblMinimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblSubtitulo)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(lblNAbonados)
                                                            .addComponent(lblNombre))
                                                        .addGap(22, 22, 22))
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                        .addComponent(lblNFamiliares)
                                                        .addGap(18, 18, 18)))
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txtNombre)
                                                    .addComponent(txtNAbonado)
                                                    .addComponent(txtNFamiliares)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(lblPaquetes)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(cboPaquetes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(lblPeliculas)
                                                    .addComponent(lblDeportes))
                                                .addGap(24, 24, 24)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txtDeportes)
                                                    .addComponent(txtPeliculas))))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnInfoPaquetes, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnTiposDeClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnPeliculasAlquiladas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(Icono))))
                        .addGap(20, 20, 20))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnInsertar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEliminarTodo, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTotalFacturacion, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTitulo)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblMinimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(Icono)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnTiposDeClientes, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                            .addComponent(btnPeliculasAlquiladas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(39, 39, 39))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(lblSubtitulo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNAbonados)
                            .addComponent(txtNAbonado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNombre)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNFamiliares)
                            .addComponent(txtNFamiliares, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPaquetes)
                            .addComponent(cboPaquetes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnInfoPaquetes, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPeliculas)
                            .addComponent(txtPeliculas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDeportes)
                            .addComponent(txtDeportes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnEliminarTodo)
                            .addComponent(btnEliminar)
                            .addComponent(btnInsertar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTotalFacturacion, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNAbonadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNAbonadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNAbonadoActionPerformed

    private void cboPaquetesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboPaquetesActionPerformed
        String valor = (String) cboPaquetes.getSelectedItem();
        switch (valor) {
            case "Seleccionar":
                txtPeliculas.setVisible(false);
                txtDeportes.setVisible(false);
                break;
            case "Basico":
                txtPeliculas.setVisible(false);
                txtDeportes.setVisible(false);
                break;
            default:
                txtPeliculas.setVisible(true);
                txtDeportes.setVisible(true);
                txtPeliculas.setEnabled(true);
                txtDeportes.setEnabled(true);
                break;
        }
    }//GEN-LAST:event_cboPaquetesActionPerformed

    private void btnInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarActionPerformed

        String valor = (String) cboPaquetes.getSelectedItem();
        if (valor.equals("Seleccionar")) {
            JOptionPane.showMessageDialog(null, "Por favor, seleccione un paquete");
        } else {

            switch (valor) {
                case "Basico": {
                    PaqueteBasico pb = new PaqueteBasico();
                    int monto = pb.calcularTotal();
                    abono = monto;
                    insertarYLimpiar();
                    break;
                }
                case "Pay Per View": {
                    PaquetePayPerView ppv = new PaquetePayPerView();
                    if (txtPeliculas.getText().isEmpty() || txtDeportes.getText().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Por favor no deje campos vacíos");
                    } else {
                        ppv.setPeliculas(Integer.parseInt(txtPeliculas.getText()));
                        ppv.setDeportes(Integer.parseInt(txtDeportes.getText()));
                        int monto = ppv.calcularTotal();
                        abono = monto;
                        insertarYLimpiar();
                    }
                    break;
                }
                case "Full": {
                    PaqueteFull pf = new PaqueteFull();
                    if (txtPeliculas.getText().isEmpty() || txtDeportes.getText().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Por favor no deje campos vacíos");
                    } else {
                        pf.setPeliculas(Integer.parseInt(txtPeliculas.getText()));
                        pf.setDeportes(Integer.parseInt(txtDeportes.getText()));
                        int monto = pf.calcularTotal();
                        abono = monto;
                        insertarYLimpiar();
                    }
                    break;
                }
                default:
                    break;
            }

        }
    }//GEN-LAST:event_btnInsertarActionPerformed

    private void insertarYLimpiar() {
        Object[] info = new Object[7];
        info[0] = txtNAbonado.getText();
        info[1] = txtNombre.getText();
        info[2] = txtNFamiliares.getText();
        info[3] = cboPaquetes.getSelectedItem();
        info[4] = txtPeliculas.getText();
        info[5] = txtDeportes.getText();
        info[6] = abono;

        modelo.addRow(info);

        txtNAbonado.setText("");
        txtNombre.setText("");
        txtNFamiliares.setText("");
        txtPeliculas.setText("");
        txtDeportes.setText("");

        txtPeliculas.setEnabled(false);
        txtDeportes.setEnabled(false);
        txtPeliculas.setVisible(true);
        txtDeportes.setVisible(true);
        sumaTotal();
    }

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int fila = jTableDatos.getSelectedRow();
        if (fila >= 0) {
            modelo.removeRow(fila);
        } else {
            JOptionPane.showMessageDialog(null, "Seleccionar fila");
        }

    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnEliminarTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarTodoActionPerformed
        int fila = jTableDatos.getRowCount();
        for (int i = fila - 1; i >= 0; i--) {
            modelo.removeRow(i);
        }
    }//GEN-LAST:event_btnEliminarTodoActionPerformed

    private void btnInfoPaquetesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfoPaquetesActionPerformed
        InfoPaquetes abrir = new InfoPaquetes();
        abrir.setVisible(true);
    }//GEN-LAST:event_btnInfoPaquetesActionPerformed

    private void txtPeliculasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPeliculasActionPerformed

    }//GEN-LAST:event_txtPeliculasActionPerformed

    private void txtDeportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDeportesActionPerformed

    }//GEN-LAST:event_txtDeportesActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed

    }//GEN-LAST:event_txtNombreActionPerformed

    private void btnTiposDeClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTiposDeClientesActionPerformed

        int basico = 0, ppv = 0, pf = 0;
        for (int i = 0; i < modelo.getRowCount(); i++) {
            switch (modelo.getValueAt(i, 3).toString()) {
                case "Basico":
                    basico++;
                    break;
                case "Pay Per View":
                    ppv++;
                    break;
                case "Full":
                    pf++;
                    break;
                default:
                    break;
            }
        }

        JOptionPane.showMessageDialog(null, "Hay " + basico + " clientes en el Paquete Básico"
                + "\nHay " + ppv + " clientes en el Paquete Pay Per View"
                + "\nHay " + pf + " clientes en el Paquete Full");
    }//GEN-LAST:event_btnTiposDeClientesActionPerformed

    private void txtNAbonadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNAbonadoKeyTyped
        // TODO add your handling code here:
        char validar = evt.getKeyChar();

        if (Character.isLetter(validar)) {
            getToolkit().beep();
            evt.consume();

            JOptionPane.showMessageDialog(rootPane, "Ingrese sólo números");

        }
    }//GEN-LAST:event_txtNAbonadoKeyTyped

    private void txtNFamiliaresKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNFamiliaresKeyTyped
        // TODO add your handling code here:
        char validar = evt.getKeyChar();

        if (Character.isLetter(validar)) {
            getToolkit().beep();
            evt.consume();

            JOptionPane.showMessageDialog(rootPane, "Ingrese sólo números");

        }
    }//GEN-LAST:event_txtNFamiliaresKeyTyped

    private void txtPeliculasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPeliculasKeyTyped
        // TODO add your handling code here:
        char validar = evt.getKeyChar();

        if (Character.isLetter(validar)) {
            getToolkit().beep();
            evt.consume();

            JOptionPane.showMessageDialog(rootPane, "Ingrese sólo números");

        }
    }//GEN-LAST:event_txtPeliculasKeyTyped

    private void txtDeportesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDeportesKeyTyped
        // TODO add your handling code here:
        char validar = evt.getKeyChar();

        if (Character.isLetter(validar)) {
            getToolkit().beep();
            evt.consume();

            JOptionPane.showMessageDialog(rootPane, "Ingrese sólo números");

        }
    }//GEN-LAST:event_txtDeportesKeyTyped

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped

        char validar = evt.getKeyChar();

        if (Character.isDigit(validar)) {
            getToolkit().beep();
            evt.consume();

            JOptionPane.showMessageDialog(rootPane, "Ingrese sólo letras");
        }
    }//GEN-LAST:event_txtNombreKeyTyped

    private void btnPeliculasAlquiladasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPeliculasAlquiladasActionPerformed

        int peliculasPPV = 0;
        int peliculasPF = 0;
        int totalPPV = 0;
        int totalPF = 0;
        int cantidadFamiliasPPV = 0;
        int totalFamiliaPPV = 0;

        for (int i = 0; i < modelo.getRowCount(); i++) {
            switch (modelo.getValueAt(i, 3).toString()) {
                case "Pay Per View": {
                    peliculasPPV = Integer.parseInt(modelo.getValueAt(i, 5).toString());
                    totalPPV += peliculasPPV;
                    if (Integer.parseInt(modelo.getValueAt(i, 2).toString()) >= 3) {
                        cantidadFamiliasPPV = Integer.parseInt(modelo.getValueAt(i, 5).toString());
                        totalFamiliaPPV += cantidadFamiliasPPV;
                    }                   
                    break;
                }
                case "Full": {
                    peliculasPF = Integer.parseInt(modelo.getValueAt(i, 5).toString());
                    totalPF += peliculasPF;
                    break;
                }
                default:
                    break;
            }
        }
        
        JOptionPane.showMessageDialog(null, "Se alquilaron " + totalPPV + " películas en Paquete Pay Per View"
                + "\nSe alquilaron " + totalPF + " películas en Paquete Full" + 
                "\n" + "\nLos clientes PPV con 3 o más familiares alquilaron " + totalFamiliaPPV + " películas en Total");

    }//GEN-LAST:event_btnPeliculasAlquiladasActionPerformed

    private void lblMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinimizarMouseClicked
        this.setState(Paquetes.ICONIFIED);
    }//GEN-LAST:event_lblMinimizarMouseClicked

    private void lblSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSalirMouseClicked
        int dialogBtn = JOptionPane.YES_NO_OPTION;
        int result = JOptionPane.showConfirmDialog(null, "Desea Salir?", "EXIT", dialogBtn);
        if (result == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_lblSalirMouseClicked

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        Point point = MouseInfo.getPointerInfo().getLocation();
        setLocation(point.x - x, point.y - y);
    }//GEN-LAST:event_formMouseDragged

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Paquetes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Icono;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnEliminarTodo;
    private javax.swing.JButton btnInfoPaquetes;
    private javax.swing.JButton btnInsertar;
    private javax.swing.JButton btnPeliculasAlquiladas;
    private javax.swing.JButton btnTiposDeClientes;
    private javax.swing.JComboBox<String> cboPaquetes;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTableDatos;
    private javax.swing.JLabel lblDeportes;
    private javax.swing.JLabel lblMinimizar;
    private javax.swing.JLabel lblNAbonados;
    private javax.swing.JLabel lblNFamiliares;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPaquetes;
    private javax.swing.JLabel lblPeliculas;
    private javax.swing.JLabel lblSalir;
    private javax.swing.JLabel lblSubtitulo;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTotalFacturacion;
    private javax.swing.JTextField txtDeportes;
    private javax.swing.JTextField txtNAbonado;
    private javax.swing.JTextField txtNFamiliares;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPeliculas;
    // End of variables declaration//GEN-END:variables
}
