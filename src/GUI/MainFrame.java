/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import java.sql.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;



/**
 *
 * @author Matt
 */
public class MainFrame extends javax.swing.JFrame {
    Conexion con = new Conexion();
    private DefaultTableModel dtm = new DefaultTableModel();
    Redimensionador r = new Redimensionador();
    GestorClientes gc = new GestorClientes();
    Validador v = new Validador();
    String cliente[] = new String[7];
    Object producto[] = new Object[3];
    Object detalle_producto [] = new Object[4];
    String vendedores[] = new String[4];
    float acum = 0;
    
    public MainFrame() {
        initComponents();
        
        r.resizeImageIcon(jButtonImprimir, "src/imgs/invoice.png");
        r.resizeImageIcon(jButtonSalir, "src/imgs/cerrar.png");
        r.resizeImageIcon(jButtonClientes, "src/imgs/user.png");
        r.resizeImageIcon(jButtonBuscarCliente, "src/imgs/searching.png");
        r.resizeImageIcon(jbtnEliminar, "src/imgs/cart.png");
        r.resizeImageIcon(jbtnCancelarFactura, "src/imgs/order.png");
        r.resizeImageIcon(jbtnCerrarFactura, "src/imgs/pay.png");
        deshabilitarCampos();
        fechaFacturas();
        cargarVendedores();
        bgLabel();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jlblCliente = new javax.swing.JLabel();
        jlblP = new javax.swing.JLabel();
        jlblF = new javax.swing.JLabel();
        jlblVendedor = new javax.swing.JLabel();
        jcbxVendedores = new javax.swing.JComboBox<>();
        jlblp = new javax.swing.JLabel();
        jcbxPago = new javax.swing.JComboBox<>();
        jtxtCedulaCliente = new javax.swing.JTextField();
        jButtonBuscarCliente = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jlblDatosCliente = new javax.swing.JLabel();
        jlblFecha = new javax.swing.JLabel();
        jtxtProducto = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jButtonImprimir = new javax.swing.JButton();
        jButtonSalir = new javax.swing.JButton();
        jButtonClientes = new javax.swing.JButton();
        jPanelDetalleProductos = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtblDatos = new javax.swing.JTable();
        jbtnEliminar = new javax.swing.JButton();
        jlblUltimoProducto = new javax.swing.JLabel();
        jPanelDatosPieFactura = new javax.swing.JPanel();
        jlblCantidadPro = new javax.swing.JLabel();
        jlblEVenta = new javax.swing.JLabel();
        jlblPCon = new javax.swing.JLabel();
        jlblCambio = new javax.swing.JLabel();
        jlblPcon = new javax.swing.JLabel();
        jlblSubtotal = new javax.swing.JLabel();
        jlblTotal = new javax.swing.JLabel();
        jlblCantidadProducto = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jbtnCancelarFactura = new javax.swing.JButton();
        jbtnCerrarFactura = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(71, 63, 87));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jlblCliente.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jlblCliente.setForeground(new java.awt.Color(255, 255, 255));
        jlblCliente.setText("C.I. CLIENTE");

        jlblP.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jlblP.setForeground(new java.awt.Color(255, 255, 255));
        jlblP.setText("PRODUCTO");

        jlblF.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jlblF.setForeground(new java.awt.Color(255, 255, 255));
        jlblF.setText("FECHA");

        jlblVendedor.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jlblVendedor.setForeground(new java.awt.Color(255, 255, 255));
        jlblVendedor.setText("VENDEDOR");

        jcbxVendedores.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N

        jlblp.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jlblp.setForeground(new java.awt.Color(255, 255, 255));
        jlblp.setText("MÉTODO DE PAGO");

        jcbxPago.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jcbxPago.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONE UNA OPCIÓN", "EFECTIVO", "TAR. CREDITO", "TAR. DEBITO", "TRANSFERENCIA", "DIGITALES", " " }));

        jtxtCedulaCliente.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jtxtCedulaCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtCedulaClienteKeyTyped(evt);
            }
        });

        jButtonBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarClienteActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("DATOS CLIENTE");

        jlblDatosCliente.setBackground(new java.awt.Color(255, 255, 255));
        jlblDatosCliente.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        jlblDatosCliente.setForeground(new java.awt.Color(0, 0, 0));
        jlblDatosCliente.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jlblFecha.setBackground(new java.awt.Color(255, 255, 255));
        jlblFecha.setFont(new java.awt.Font("Roboto Black", 1, 16)); // NOI18N
        jlblFecha.setForeground(new java.awt.Color(0, 0, 0));
        jlblFecha.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jtxtProducto.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jtxtProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtxtProductoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtProductoKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jlblCliente)
                        .addGap(26, 26, 26)
                        .addComponent(jtxtCedulaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jlblP))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jlblDatosCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jtxtProducto, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE))))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlblF)
                        .addGap(60, 60, 60))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addComponent(jlblVendedor))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(jlblp)))
                        .addGap(25, 25, 25)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jcbxPago, 0, 274, Short.MAX_VALUE)
                    .addComponent(jcbxVendedores, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlblFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jcbxVendedores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlblVendedor))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jcbxPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlblp))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlblF)
                            .addComponent(jlblFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jlblCliente)
                                    .addComponent(jtxtCedulaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jButtonBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jlblDatosCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlblP)
                            .addComponent(jtxtProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(71, 63, 87));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButtonImprimir.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonImprimir.setFocusable(false);
        jButtonImprimir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonImprimir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonImprimirActionPerformed(evt);
            }
        });

        jButtonSalir.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });

        jButtonClientes.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClientesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(jButtonClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jButtonImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jButtonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonSalir, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(jButtonClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonImprimir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelDetalleProductos.setBackground(new java.awt.Color(71, 63, 87));
        jPanelDetalleProductos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jtblDatos.setBackground(new java.awt.Color(255, 255, 255));
        jtblDatos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jtblDatos.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jtblDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jtblDatos);

        jbtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnEliminarActionPerformed(evt);
            }
        });

        jlblUltimoProducto.setFont(new java.awt.Font("Roboto Light", 3, 18)); // NOI18N
        jlblUltimoProducto.setForeground(new java.awt.Color(255, 255, 0));

        javax.swing.GroupLayout jPanelDetalleProductosLayout = new javax.swing.GroupLayout(jPanelDetalleProductos);
        jPanelDetalleProductos.setLayout(jPanelDetalleProductosLayout);
        jPanelDetalleProductosLayout.setHorizontalGroup(
            jPanelDetalleProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDetalleProductosLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanelDetalleProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelDetalleProductosLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jlblUltimoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 623, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(jbtnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49))
                    .addGroup(jPanelDetalleProductosLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 792, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(25, Short.MAX_VALUE))))
        );
        jPanelDetalleProductosLayout.setVerticalGroup(
            jPanelDetalleProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDetalleProductosLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDetalleProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlblUltimoProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbtnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanelDatosPieFactura.setBackground(new java.awt.Color(71, 63, 87));
        jPanelDatosPieFactura.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jlblCantidadPro.setBackground(new java.awt.Color(71, 63, 87));
        jlblCantidadPro.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jlblCantidadPro.setForeground(new java.awt.Color(255, 255, 255));
        jlblCantidadPro.setText("PRODUCTOS");

        jlblEVenta.setBackground(new java.awt.Color(71, 63, 87));
        jlblEVenta.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jlblEVenta.setForeground(new java.awt.Color(255, 255, 255));
        jlblEVenta.setText("SUBTOTAL");

        jlblPCon.setBackground(new java.awt.Color(71, 63, 87));
        jlblPCon.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jlblPCon.setForeground(new java.awt.Color(255, 255, 255));
        jlblPCon.setText("PAGO CON");

        jlblCambio.setBackground(new java.awt.Color(71, 63, 87));
        jlblCambio.setFont(new java.awt.Font("Roboto", 3, 14)); // NOI18N
        jlblCambio.setForeground(new java.awt.Color(252, 255, 0));
        jlblCambio.setText("TOTAL");

        jlblPcon.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        jlblPcon.setForeground(new java.awt.Color(0, 0, 0));
        jlblPcon.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jlblSubtotal.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        jlblSubtotal.setForeground(new java.awt.Color(0, 0, 0));
        jlblSubtotal.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jlblTotal.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        jlblTotal.setForeground(new java.awt.Color(0, 0, 0));
        jlblTotal.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jlblCantidadProducto.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        jlblCantidadProducto.setForeground(new java.awt.Color(0, 0, 0));
        jlblCantidadProducto.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanelDatosPieFacturaLayout = new javax.swing.GroupLayout(jPanelDatosPieFactura);
        jPanelDatosPieFactura.setLayout(jPanelDatosPieFacturaLayout);
        jPanelDatosPieFacturaLayout.setHorizontalGroup(
            jPanelDatosPieFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelDatosPieFacturaLayout.createSequentialGroup()
                .addGroup(jPanelDatosPieFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelDatosPieFacturaLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jlblCantidadProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37))
                    .addGroup(jPanelDatosPieFacturaLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jlblCantidadPro)))
                .addGap(1, 1, 1)
                .addGroup(jPanelDatosPieFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelDatosPieFacturaLayout.createSequentialGroup()
                        .addComponent(jlblPCon, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(89, 89, 89)
                        .addComponent(jlblEVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(101, 101, 101)
                        .addComponent(jlblCambio)
                        .addGap(65, 65, 65))
                    .addGroup(jPanelDatosPieFacturaLayout.createSequentialGroup()
                        .addComponent(jlblPcon, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(jlblSubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(jlblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))))
        );
        jPanelDatosPieFacturaLayout.setVerticalGroup(
            jPanelDatosPieFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelDatosPieFacturaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelDatosPieFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelDatosPieFacturaLayout.createSequentialGroup()
                        .addComponent(jlblCantidadPro)
                        .addGap(18, 18, 18)
                        .addComponent(jlblCantidadProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelDatosPieFacturaLayout.createSequentialGroup()
                        .addGroup(jPanelDatosPieFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlblEVenta, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jlblPCon, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jlblCambio, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelDatosPieFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jlblPcon, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlblSubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(29, 29, 29))
        );

        jPanel4.setBackground(new java.awt.Color(71, 63, 87));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jbtnCancelarFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCancelarFacturaActionPerformed(evt);
            }
        });

        jbtnCerrarFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCerrarFacturaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtnCerrarFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnCancelarFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbtnCancelarFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbtnCerrarFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 45, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanelDetalleProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanelDatosPieFactura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(28, 28, 28)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(39, 39, 39))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(309, 309, 309))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanelDetalleProductos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanelDatosPieFactura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
        
    }//GEN-LAST:event_jButtonSalirActionPerformed

    private void jButtonImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonImprimirActionPerformed
        // TODO add your handling code here:
        Facturas f = new Facturas();
        f.setParentFrame(MainFrame.this);
        f.setVisible(true);
        this.setEnabled(false);
    }//GEN-LAST:event_jButtonImprimirActionPerformed

    private void jButtonClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClientesActionPerformed
        // TODO add your handling code here:
        GestorClientes gc = new GestorClientes();
        gc.setParentFrame(MainFrame.this);
        gc.setVisible(true);
        this.setEnabled(false);
        
    }//GEN-LAST:event_jButtonClientesActionPerformed

    private void jButtonBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarClienteActionPerformed
        // TODO add your handling code here:
        buscarCliente();
    }//GEN-LAST:event_jButtonBuscarClienteActionPerformed

    private void jtxtCedulaClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtCedulaClienteKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();

        if (c < '0' || c > '9') {
            evt.consume();
        }
        if (jtxtCedulaCliente.getText().trim().length() >= 10){
            evt.consume();
        }
    }//GEN-LAST:event_jtxtCedulaClienteKeyTyped

    private void jtxtProductoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtProductoKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            buscarProducto();
        }
        
    }//GEN-LAST:event_jtxtProductoKeyPressed

    private void jtxtProductoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtProductoKeyTyped
        // TODO add your handling code here:
        if (evt.getKeyChar() < '0' || evt.getKeyChar() > '9') {
            evt.consume();
        }
        if (jtxtProducto.getText().trim().length() >= 13) {
            evt.consume();
        }
    }//GEN-LAST:event_jtxtProductoKeyTyped

    private void jbtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnEliminarActionPerformed
        // TODO add your handling code here:
        eliminarProductoDetalle();
    }//GEN-LAST:event_jbtnEliminarActionPerformed

    private void jbtnCancelarFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCancelarFacturaActionPerformed
        // TODO add your handling code here:
        reiniciarFactura();
    }//GEN-LAST:event_jbtnCancelarFacturaActionPerformed

    private void jbtnCerrarFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCerrarFacturaActionPerformed
        // TODO add your handling code here:
        cerrarFactura();
    }//GEN-LAST:event_jbtnCerrarFacturaActionPerformed
    
    public void reiniciarFactura(){
        this.dispose();
        MainFrame mf = new MainFrame();
        mf.setVisible(true);
    }
    
    public void cerrarFactura(){
        try {
            if (jcbxPago.getSelectedIndex() != 0 && jcbxVendedores.getSelectedIndex() != 0) {
                Connection c = con.ConexionBD();
                String sql_maestro = "INSERT INTO heroku_aba338fe797a93b.maestro_facturas (FEC_HOR_FAC, CED_CLI, ID_VEN, MET_PAG, CANT_PRO, SUBTOTAL, TOTAL) VALUES (?,?,?,?,?,?,?)";
                String sql_detalle = "INSERT INTO heroku_aba338fe797a93b.detalle_productos (CANT,COD_PRO, NOM_PRO, PRE_UNI , NUM_FAC) VALUES  (?,?,?,?,?)";
                PreparedStatement ps = c.prepareStatement(sql_maestro, PreparedStatement.RETURN_GENERATED_KEYS);
                ps.setString(1, jlblFecha.getText());
                ps.setString(2, cliente[0]);
                ps.setString(3, jcbxVendedores.getSelectedItem().toString().substring(0, 6));
                ps.setString(4, jcbxPago.getSelectedItem().toString());
                ps.setInt(5, Integer.parseInt(jlblCantidadProducto.getText()));
                ps.setFloat(6, Float.parseFloat(jlblSubtotal.getText()));
                ps.setFloat(7, Float.parseFloat(jlblTotal.getText()));

                if (ps.executeUpdate() > 0) {
                    ResultSet keys = ps.getGeneratedKeys();
                    int numero_factura = -1;
                    if (keys.next()) {
                        numero_factura = keys.getInt(1);
                        PreparedStatement ps1 = c.prepareStatement(sql_detalle);

                        for (int i = 0; i < jtblDatos.getRowCount(); i++) {
                            int cantidad = Integer.parseInt(jtblDatos.getValueAt(i, 0).toString());
                            String nombre_pro = jtblDatos.getValueAt(i, 2).toString();
                            String codigo = jtblDatos.getValueAt(i, 1).toString();
                            float unitario = Float.parseFloat(jtblDatos.getValueAt(i, 3).toString());
                            
                            ps1.setInt(1, cantidad);
                            ps1.setString(2, codigo);
                            ps1.setString(3, nombre_pro);
                            ps1.setFloat(4, unitario);
                            ps1.setInt(5, numero_factura);
                            ps1.executeUpdate();
                        }

                        JOptionPane.showMessageDialog(this, "Factura Nro: +" + numero_factura + " Cerrada.", "SUCCESFULL", JOptionPane.PLAIN_MESSAGE);
                        reiniciarFactura();

                    }

                } else {
                    JOptionPane.showMessageDialog(this, "Error al cerrar el maestro", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Seleccionar vendedor o método de pago", "WARNING", JOptionPane.WARNING_MESSAGE);
                jtxtProducto.requestFocus();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "ERROR: " + e, "RUNTIME EXCEPTION", JOptionPane.ERROR_MESSAGE);
        }

    }

    public void bgLabel() {
        jlblDatosCliente.setOpaque(true);
        jlblFecha.setOpaque(true);
        jlblCantidadProducto.setOpaque(true);
        jlblPcon.setOpaque(true);
        jlblSubtotal.setOpaque(true);
        jlblTotal.setOpaque(true);
    }

    public void eliminarProductoDetalle() {
        dtm = (DefaultTableModel) jtblDatos.getModel();

        if (dtm.getRowCount() > 1) {
            if (jtblDatos.getSelectedRow() != -1) {

                int cant = Integer.parseInt(dtm.getValueAt(jtblDatos.getSelectedRow(), 0).toString());
                float pre_uni = Float.parseFloat(dtm.getValueAt(jtblDatos.getSelectedRow(), 3).toString());
                jlblCantidadProducto.setText(String.valueOf(Integer.parseInt(jlblCantidadProducto.getText()) - cant));
                jlblSubtotal.setText(String.valueOf(Float.parseFloat(jlblSubtotal.getText()) - pre_uni));
                jlblTotal.setText(String.valueOf((Float.parseFloat(jlblSubtotal.getText()) * 0.12) + Float.parseFloat(jlblSubtotal.getText())));
                dtm.removeRow(jtblDatos.getSelectedRow());
                jtblDatos.setModel(dtm);
                jtxtProducto.requestFocus();
                acum = Float.parseFloat(jlblSubtotal.getText());
            } else {
                JOptionPane.showMessageDialog(this, "Para elminar un producto, seleccione uno del detalle", "NO SELECTED ROW", JOptionPane.INFORMATION_MESSAGE);
            }
        }

    }

    public void buscarProducto() {
        try {
            if (!jtxtProducto.getText().trim().isEmpty()) {
                if (existProduct(jtxtProducto.getText().trim())) {
                    obtenerProducto(producto, jtxtProducto.getText().trim());
                    habilitarCampos();
                    detalle_producto[0] = 1;
                    detalle_producto[1] = producto[0];
                    detalle_producto[2] = producto[1];
                    detalle_producto[3] = producto[2];
                    agregarDetalle(detalle_producto);
                    acum = acum + Float.parseFloat(detalle_producto[3].toString());
                    jtxtProducto.setText("");
                    jtxtProducto.requestFocus();
                    float total = (float) (acum * 0.12);
                    jlblTotal.setText(String.valueOf(acum + total));
                    jlblSubtotal.setText(String.valueOf(acum));
                    jlblCantidadProducto.setText(String.valueOf(jtblDatos.getRowCount()));
                    jlblUltimoProducto.setText("Producto agregado --> Cod: "+producto[0].toString()+" - Nombre: "+producto[1].toString());
                    jbtnCerrarFactura.setEnabled(true);
                    
                } else {
                    JOptionPane.showMessageDialog(this, "Producto NO existente", "WARNING", JOptionPane.WARNING_MESSAGE);
                    jtxtProducto.setText("");
                }

            } else {
                JOptionPane.showMessageDialog(this, "Codigo de producto NO válido", "WARNING", JOptionPane.WARNING_MESSAGE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "ERROR: " + e, "RUNTIME EXCEPTION", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void buscarCliente() {
        try {
            String cedula = jtxtCedulaCliente.getText().trim();

            if (!cedula.isEmpty()) {

                if (v.validarCedula(cedula) && v.verificarCedula(cedula)) {
                    if (gc.existCustomer(cedula)) {
                        habilitarCampos();
                        obtenerCliente(cliente, cedula);
                        System.out.println("Nombre: " + cliente[1] + "\nApellido: " + cliente[2]); // <----- para prueba
                        jlblDatosCliente.setText(cliente[1] + " " + cliente[2]);
                        jtxtProducto.requestFocus();
                    } else {
                        int n = JOptionPane.showConfirmDialog(this, "Cliente no existente, desea continuar como Consumidor Final?", "Cliente no encontrado", JOptionPane.YES_NO_OPTION);
                        if (n == 0) {

                            limpiarCampos();
                            consumidorFinal();
                            jtxtProducto.requestFocus();

                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Cédula NO válida", "ERROR", JOptionPane.ERROR_MESSAGE);
                    jtxtCedulaCliente.setText("");
                }
            } else {

                JOptionPane.showMessageDialog(this, "Para asignar una factura, ingrese la cédula", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "ERROR: " + e, "RUNTIME EXCEPTION", JOptionPane.ERROR_MESSAGE);
        }

    }

    public void deshabilitarCampos() {
        jcbxVendedores.setEnabled(false);
        jcbxPago.setEnabled(false);
        jtxtProducto.setEnabled(false);
        jtblDatos.setEnabled(false);
        jlblCantidadProducto.setEnabled(false);
        jlblSubtotal.setEnabled(false);
        jlblTotal.setEnabled(false);
        jbtnCancelarFactura.setEnabled(false);
        jbtnCerrarFactura.setEnabled(false);
        jbtnEliminar.setEnabled(false);
    }
    
    public void habilitarCampos(){
        jcbxVendedores.setEnabled(true);
        jcbxPago.setEnabled(true);
        jtxtProducto.setEnabled(true);
        jlblCantidadProducto.setEnabled(true);
        jlblSubtotal.setEnabled(true);
        jlblTotal.setEnabled(true);
        jtblDatos.setEnabled(true);
        jbtnCancelarFactura.setEnabled(true);
        jbtnEliminar.setEnabled(true);
    }
    
    
    
    public void limpiarCampos(){
        jlblDatosCliente.setText("");
        jtxtCedulaCliente.setText("");
    }
    
    public void consumidorFinal(){
        jlblDatosCliente.setText("##CFINAL##");
        cliente[0] = "##CFINAL##";
        habilitarCampos();
    }
    
    public void obtenerCliente(String cliente[], String cedula){
        try {
            String sql = "SELECT * FROM heroku_aba338fe797a93b.clientes WHERE CED_CLI = '"+cedula+"';";
            Connection c = con.ConexionBD();
            Statement s = c.createStatement();
            ResultSet rs = s.executeQuery(sql);
            
            while (rs.next()) {
                cliente[0] = rs.getString("CED_CLI");
                cliente[1] = rs.getString("NOM_CLI");
                cliente[2] = rs.getString("APE_CLI");
                cliente[3] = rs.getString("DIR_CLI");
                cliente[4] = rs.getString("FEC_NAC_CLI");
                cliente[5] = rs.getString("TEL_CLI");
                cliente[6] = rs.getString("COR_CLI");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "ERROR: " +e, "RUNTIME EXCEPTION", JOptionPane.ERROR_MESSAGE);
        }
    } 
    
    public void agregarDetalle(Object rowData[]){
        dtm = (DefaultTableModel) jtblDatos.getModel();
        Object encabezado[] = {"CANTIDAD","CODIGO", "NOMBRE PRODUCTO","PRECIO UNITARIO"};
        dtm.setColumnIdentifiers(encabezado);
        dtm.addRow(rowData);
        jtblDatos.setModel(dtm);
    }
    
    public void fechaFacturas(){
        LocalDate ld = LocalDate.now();
        jlblFecha.setText(ld.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
    }
    
    public void obtenerProducto(Object producto[],String codigo){
        try {
            String sql = "SELECT * FROM heroku_aba338fe797a93b.productos WHERE ID_PRO = '" + codigo + "';";
            Connection c = con.ConexionBD();
            Statement s = c.createStatement();
            ResultSet rs = s.executeQuery(sql);
            
            while (rs.next()) {
                producto[0] = rs.getString("ID_PRO");
                producto[1] = rs.getString("NOM_PRO");
                producto[2] = rs.getFloat("PRE_PRO");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "ERROR: " +e, "RUNTIME EXCEPTION", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    
    public boolean existProduct(String codigo){
        try {
            String sql = "SELECT COUNT(*) FROM heroku_aba338fe797a93b.productos WHERE ID_PRO = ?;";
            Connection c = con.ConexionBD();
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setString(1, codigo);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                int count = rs.getInt(1);
                if (count > 0) {
                    return true;
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "ERROR: " + e, "RUNTIME EXCEPTION", JOptionPane.ERROR_MESSAGE);
        }
        return false;
    }
    
    public void cargarVendedores(){
        try {
            DefaultComboBoxModel dcb = (DefaultComboBoxModel) jcbxVendedores.getModel();
            dcb.addElement("SELECCIONE UN VENDEDOR");
            String sql = "SELECT * FROM heroku_aba338fe797a93b.vendedores";
            Connection c = con.ConexionBD();
            Statement s = c.createStatement();
            ResultSet rs = s.executeQuery(sql);
            
            while (rs.next()) {
                vendedores[0] = rs.getString("ID_VEN");
                vendedores[1] = rs.getString("CED_VEN");
                vendedores[2] = rs.getString("NOM_VEN");
                vendedores[3] = rs.getString("APE_VEN");
                dcb.addElement(vendedores[0] +"-"+ vendedores[2] +" "+ vendedores[3]);
            }
            
            jcbxVendedores.setModel(dcb);
            
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "ERROR: " + e, "RUNTIME EXCEPTION", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBuscarCliente;
    private javax.swing.JButton jButtonClientes;
    private javax.swing.JButton jButtonImprimir;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanelDatosPieFactura;
    private javax.swing.JPanel jPanelDetalleProductos;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtnCancelarFactura;
    private javax.swing.JButton jbtnCerrarFactura;
    private javax.swing.JButton jbtnEliminar;
    private javax.swing.JComboBox<String> jcbxPago;
    private javax.swing.JComboBox<String> jcbxVendedores;
    private javax.swing.JLabel jlblCambio;
    private javax.swing.JLabel jlblCantidadPro;
    private javax.swing.JLabel jlblCantidadProducto;
    private javax.swing.JLabel jlblCliente;
    private javax.swing.JLabel jlblDatosCliente;
    private javax.swing.JLabel jlblEVenta;
    private javax.swing.JLabel jlblF;
    private javax.swing.JLabel jlblFecha;
    private javax.swing.JLabel jlblP;
    private javax.swing.JLabel jlblPCon;
    private javax.swing.JLabel jlblPcon;
    private javax.swing.JLabel jlblSubtotal;
    private javax.swing.JLabel jlblTotal;
    private javax.swing.JLabel jlblUltimoProducto;
    private javax.swing.JLabel jlblVendedor;
    private javax.swing.JLabel jlblp;
    private javax.swing.JTable jtblDatos;
    private javax.swing.JTextField jtxtCedulaCliente;
    private javax.swing.JTextField jtxtProducto;
    // End of variables declaration//GEN-END:variables
}
