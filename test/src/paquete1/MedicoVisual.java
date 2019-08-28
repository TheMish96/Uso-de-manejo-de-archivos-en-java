
package paquete1;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import java.io.*;

import java.util.*;

import javax.swing.JOptionPane;

/**
 *
 * @author luis
 */
public class MedicoVisual extends javax.swing.JInternalFrame {

    /**
     * Creates new form MedicoVisual
     */
    public MedicoVisual() {
        initComponents();
        modificar.setEnabled(false);
        eliminar.setEnabled(false);
        listar.setEnabled(true);
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbsalario = new javax.swing.JLabel();
        txtContraseña = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtCodigopostal = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jlNumero = new javax.swing.JLabel();
        txtColonia = new javax.swing.JTextField();
        agregar = new javax.swing.JButton();
        txtNombre = new javax.swing.JTextField();
        buscar = new javax.swing.JButton();
        txtApellido1 = new javax.swing.JTextField();
        modificar = new javax.swing.JButton();
        txtApeliido2 = new javax.swing.JTextField();
        listar = new javax.swing.JButton();
        txtSalario = new javax.swing.JTextField();
        eliminar = new javax.swing.JButton();
        txtSexo = new javax.swing.JTextField();
        txtEstado = new javax.swing.JTextField();
        txtHomo = new javax.swing.JTextField();
        txtCalleNumero = new javax.swing.JTextField();
        txtNumero = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txtTitulo = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        txtEspecialidad = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Ciudad = new javax.swing.JLabel();
        txtCiudad = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtRFC = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtDiaIngreso = new javax.swing.JTextField();
        txtMesIngreso = new javax.swing.JTextField();
        txtAnioIngreso = new javax.swing.JTextField();
        jLFechaNacimiento = new javax.swing.JLabel();
        txtDiaNacimiento = new javax.swing.JTextField();
        txtMesNacimiento = new javax.swing.JTextField();
        txtAnioNacimiento = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        lbsalario.setText("salario");

        jLabel14.setText("Sexo");

        jLabel23.setText("Codigo Postal");

        jLabel15.setText("Estado");

        txtCodigopostal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodigopostalKeyTyped(evt);
            }
        });

        jLabel16.setText("Homoclave");

        jLabel25.setText("Colonia");

        jLabel17.setText("Calle");

        jlNumero.setText("Numero");

        txtColonia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtColoniaKeyTyped(evt);
            }
        });

        agregar.setText("Agregar");
        agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarActionPerformed(evt);
            }
        });

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

        buscar.setText("Buscar");
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });

        txtApellido1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellido1ActionPerformed(evt);
            }
        });
        txtApellido1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellido1KeyTyped(evt);
            }
        });

        modificar.setText("Modificar");
        modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarActionPerformed(evt);
            }
        });

        txtApeliido2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApeliido2KeyTyped(evt);
            }
        });

        listar.setText("Listar");
        listar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listarActionPerformed(evt);
            }
        });

        txtSalario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSalarioKeyTyped(evt);
            }
        });

        eliminar.setText("Eliminar");
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });

        txtSexo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSexoKeyTyped(evt);
            }
        });

        txtEstado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEstadoKeyTyped(evt);
            }
        });

        txtHomo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtHomoKeyTyped(evt);
            }
        });

        txtNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroActionPerformed(evt);
            }
        });
        txtNumero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumeroKeyTyped(evt);
            }
        });

        jLabel19.setText("Titulo");

        txtTitulo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTituloKeyTyped(evt);
            }
        });

        jLabel20.setText("Especialida");

        txtEspecialidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEspecialidadKeyTyped(evt);
            }
        });

        jLabel10.setText("Nombre");

        jLabel21.setText("Usuario");

        jLabel11.setText("Apellido Paterno");

        jLabel12.setText("Apellido Materno");

        jLabel22.setText("Contraseña");

        Ciudad.setText("Ciudad");

        txtCiudad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCiudadKeyTyped(evt);
            }
        });

        jLabel2.setText("RFC");

        txtRFC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRFCKeyTyped(evt);
            }
        });

        jLabel3.setText("fecha ingreso");

        txtDiaIngreso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDiaIngresoKeyTyped(evt);
            }
        });

        txtMesIngreso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMesIngresoKeyTyped(evt);
            }
        });

        txtAnioIngreso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAnioIngresoKeyTyped(evt);
            }
        });

        jLFechaNacimiento.setText("fecha nacimiento");

        txtDiaNacimiento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDiaNacimientoKeyTyped(evt);
            }
        });

        txtMesNacimiento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMesNacimientoKeyTyped(evt);
            }
        });

        txtAnioNacimiento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAnioNacimientoKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbsalario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Ciudad, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCalleNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtHomo, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtApellido1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtApeliido2, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel20)
                                            .addComponent(jLabel21))
                                        .addGap(8, 8, 8)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel19)
                                        .addGap(116, 116, 116)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(txtMesNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(txtAnioNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(txtMesIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(txtAnioIngreso))))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(88, 88, 88)
                                .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtRFC, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(jLabel25)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtColonia, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(jLabel23)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(txtCodigopostal, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(33, 33, 33)
                                        .addComponent(txtDiaIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(172, 172, 172)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLFechaNacimiento)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtDiaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addGap(436, 436, 436))))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(156, 156, 156)
                    .addComponent(agregar)
                    .addGap(43, 43, 43)
                    .addComponent(buscar)
                    .addGap(35, 35, 35)
                    .addComponent(modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(23, 23, 23)
                    .addComponent(listar)
                    .addGap(33, 33, 33)
                    .addComponent(eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(423, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19)
                    .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtApellido1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20)
                    .addComponent(txtEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtApeliido2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbsalario)
                    .addComponent(txtSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22)
                    .addComponent(txtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23)
                    .addComponent(txtCodigopostal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtColonia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel16)
                                .addComponent(txtHomo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtRFC, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(227, 227, 227))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlNumero)
                        .addGap(17, 17, 17)
                        .addComponent(Ciudad, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(188, 188, 188))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(txtCalleNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtDiaIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMesIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAnioIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(188, 188, 188))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLFechaNacimiento)
                                    .addComponent(txtDiaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtMesNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtAnioNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(212, 212, 212))))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap(505, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(listar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(agregar)
                        .addComponent(buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(75, 75, 75)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtApellido1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellido1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellido1ActionPerformed

    private void agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarActionPerformed
        // TODO add your handling code here:
        //AGREGAR!!!!!!!!!!!!!!!!!!
       double Salario= Double.parseDouble(txtSalario.getText());
       Integer Numero= Integer.parseInt(txtNumero.getText());
       Integer RFC= Integer.parseInt(txtRFC.getText());
       int diaIngreso,MesIngreso,AnioIngreso,diaNacimiento,mesNacimiento,anioNacimiento;
       diaIngreso=Integer.parseInt(txtDiaIngreso.getText());


       MesIngreso=Integer.parseInt(txtMesIngreso.getText());
       
       
       AnioIngreso=Integer.parseInt(txtAnioIngreso.getText());
       
       Calendar fechaIngreso= new GregorianCalendar(AnioIngreso,MesIngreso,diaIngreso);
       
       diaNacimiento=Integer.parseInt(txtDiaNacimiento.getText());
       mesNacimiento=Integer.parseInt(txtMesNacimiento.getText());
      
      
       anioNacimiento=Integer.parseInt(txtAnioNacimiento.getText());
       Calendar fechaNacimiento= new GregorianCalendar(anioNacimiento,mesNacimiento,diaNacimiento);
       
       
       String estado1=String.valueOf(txtEstado.getText().toUpperCase());
       Estado estado= Enum.valueOf(Estado.class,estado1);
       Domicilio domicilio = new Domicilio(txtCalleNumero.getText(), txtColonia.getText(), txtCodigopostal.getText(), txtCiudad.getText());
       
        Medico medico = new Medico(txtTitulo.getText(), txtEspecialidad.getText(), txtUsuario.getText(), txtContraseña.getText(),RFC,Salario,Numero,fechaIngreso,txtNombre.getText(),txtApellido1.getText(),txtApeliido2.getText(),txtSexo.getText(), estado, txtHomo.getText(), domicilio, fechaNacimiento);
        medico.curp(txtApellido1.getText(), txtApeliido2.getText(), txtNombre.getText(), txtSexo.getText(),estado.getEstados());
        medico.calcularAntiguedad();
        medico.CalcularEdad();
        listaMedicos.add(medico);
         
        try {
      FileOutputStream fileOut = new FileOutputStream("medicos.ser");
      ObjectOutputStream out = new ObjectOutputStream(fileOut);
      out.writeObject(listaMedicos);
      out.close();
      fileOut.close();
    } catch (IOException i) {
      i.printStackTrace();
    }
      modificar.setEnabled(true);
      eliminar.setEnabled(true);
      listar.setEnabled(true);
    }//GEN-LAST:event_agregarActionPerformed

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        // TODO add your handling code here:
        String Buqueda=JOptionPane.showInputDialog("introduce la curp del medico");
           Medico M=new Medico();
            M.setCurpg(Buqueda);
          if  (listaMedicos.contains(M)){
              int posicion=listaMedicos.indexOf(M);              
              medico=listaMedicos.get(posicion);
              //llenar todos los espacios
              txtNombre.setText(medico.getNombre());
              txtApellido1.setText(medico.getApellido1());
              txtApeliido2.setText(medico.getApellido2());
              txtEstado.setText(medico.estado1.getEstados());
              txtSexo.setText(medico.getGenero());
              txtTitulo.setText(medico.getTitulo());
              txtEspecialidad.setText(medico.getEspecialidad());
               txtUsuario.setText(medico.getUsuario());
              txtContraseña.setText(medico.getContrasenia());
              txtRFC.setText(String.valueOf(medico.getRfc()));
              txtSalario.setText(String.valueOf(medico.getSalario()));
              txtNumero.setText(String.valueOf(medico.getNumero()));
             
              
           
              txtDiaIngreso.setText(String.valueOf(medico.ingreso.get(Calendar.DAY_OF_MONTH)));
      
        txtMesIngreso.setText(String.valueOf(medico.ingreso.get(Calendar.MONTH)));
           
           txtAnioIngreso.setText(String.valueOf(medico.ingreso.get(Calendar.YEAR)));
           
              //Calendar  fechaNacimiento= new GregorianCalendar();
              txtDiaNacimiento.setText(String.valueOf(medico.nacimiento.get(Calendar.DAY_OF_MONTH)));
              txtMesNacimiento.setText(String.valueOf(medico.nacimiento.get(Calendar.MONTH)));
              txtAnioNacimiento.setText(String.valueOf(medico.nacimiento.get(Calendar.YEAR)));
            
              txtCalleNumero.setText(medico.domicilio.getCalleNum());
              txtColonia.setText(medico.domicilio.getColonia());
              txtCodigopostal.setText(medico.domicilio.getCodigoPostal());
              txtCiudad.setText(medico.domicilio.getCiudad());
              
              //AQUI TAMBIEN FALTA  METER EL DOMICILIO  LAS DOS FECHAS (INGRESO Y NACIMIENTO
              //Y TRANSFORMAR LOS STRING AL TIPO DE DARO EJEMPLO RFC, ESTADO,SALARIO NUEMERO
              
              modificar.setEnabled(true);
              eliminar.setEnabled(true);
              listar.setEnabled(true);
          }else{
              JOptionPane.showMessageDialog(null, "No se encuentra el medico ");
          }
        
    }//GEN-LAST:event_buscarActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
        // TODO add your handling code here:
        String Buqueda=JOptionPane.showInputDialog("introduce la curp del medico");
           Medico M=new Medico();
            M.setCurpg(Buqueda);
          if  (listaMedicos.contains(M)){
              int posicion=listaMedicos.indexOf(M);              
              medico=listaMedicos.get(posicion);
        if( listaMedicos.remove(medico)){
                       JOptionPane.showMessageDialog(null,"datos removidos");
                       
                   }
                   else{
                       JOptionPane.showMessageDialog(null,"no se pudo remover");
                       
                   }}else{
              JOptionPane.showMessageDialog(null,"No se encuentra el medico");
          }
        
        
    }//GEN-LAST:event_eliminarActionPerformed

    private void modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarActionPerformed
        // TODO add your handling code here:
          String Buqueda=JOptionPane.showInputDialog("introduce la curp del medico");
           Medico M=new Medico();
            M.setCurpg(Buqueda);
          if  (listaMedicos.contains(M)){
              int posicion=listaMedicos.indexOf(M);              
              medico=listaMedicos.get(posicion);
        
        
               medico.setNombre(txtNombre.getText());
                medico.setApellido1(txtApellido1.getText());
                medico.setApellido2(txtApeliido2.getText());
                medico.setEspecialidad(txtEspecialidad.getText());
                medico.setTitulo(txtTitulo.getText());
                medico.setUsuario(txtUsuario.getText());
                medico.setContrasenia(txtContraseña.getText());
              
                int rfc=Integer.parseInt(txtRFC.getText());
                medico.setRfc(rfc);
               
                double salario=Double.parseDouble(txtSalario.getText());
               medico.setSalario(salario);
               
               Integer numero=Integer.parseInt(txtNumero.getText());
               medico.setNumero(numero);
              
               int diaIngreso,mesIngreso,anioIngreso,diaNacimiento,mesNacimiento,anioNacimiento;
              diaIngreso=Integer.parseInt(txtDiaIngreso.getText());
              mesIngreso=Integer.parseInt(txtMesIngreso.getText());
              
              anioIngreso=Integer.parseInt(txtAnioIngreso.getText());
              
               Calendar fechaIngreso= new GregorianCalendar(anioIngreso,mesIngreso,diaIngreso);
               medico.setIngreso(fechaIngreso);
               medico.setGenero(txtSexo.getText());
              
               String estado1=String.valueOf(txtEstado.getText().toUpperCase());
       Estado estado= Enum.valueOf(Estado.class,estado1);
               medico.setEstado(estado);
               
               medico.setHomoclave(txtHomo.getText());
               
               Domicilio domicilio= new Domicilio();
               medico.domicilio.setCalleNum(txtCalleNumero.getText());
               medico.domicilio.setCiudad(txtCiudad.getText());
               medico.domicilio.setCodigoPostal(txtCodigopostal.getText());
               medico.domicilio.setColonia(txtColonia.getText());
               
               anioNacimiento=Integer.parseInt(txtAnioNacimiento.getText());
               mesNacimiento=Integer.parseInt(txtMesNacimiento.getText());
               
               diaNacimiento=Integer.parseInt(txtDiaNacimiento.getText());
               Calendar fechaNacimiento=new GregorianCalendar(anioNacimiento,mesNacimiento,diaNacimiento);
               medico.setNacimiento(fechaNacimiento);
               medico.curp(txtApellido1.getText(), txtApeliido2.getText(), txtNombre.getText(), txtSexo.getText(),estado.getEstados());
               listaMedicos.add(medico);
               
          }else{
              JOptionPane.showMessageDialog(null,"no se puede modificar ya que ese medico no existe");
          }
    }//GEN-LAST:event_modificarActionPerformed

    private void listarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listarActionPerformed
        // TODO add your handling code here:
        System.out.println(listaMedicos);
    }//GEN-LAST:event_listarActionPerformed

    private void txtDiaIngresoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDiaIngresoKeyTyped
        // TODO add your handling code here:
  char c=evt.getKeyChar(); 
             
         
          if(Character.isLetter(c)) { 
              getToolkit().beep(); 
               
              evt.consume(); 
               
             
               
          } 
         
    }//GEN-LAST:event_txtDiaIngresoKeyTyped

    private void txtMesIngresoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMesIngresoKeyTyped
        // TODO add your handling code here:
 char c=evt.getKeyChar(); 
             
         
          if(Character.isLetter(c)) { 
              getToolkit().beep(); 
               
              evt.consume(); 
               
             
               
          }
    }//GEN-LAST:event_txtMesIngresoKeyTyped

    private void txtAnioIngresoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAnioIngresoKeyTyped
        // TODO add your handling code here:
 char c=evt.getKeyChar(); 
             
         
          if(Character.isLetter(c)) { 
              getToolkit().beep(); 
               
              evt.consume(); 
               
             
               
          }
    }//GEN-LAST:event_txtAnioIngresoKeyTyped

    private void txtDiaNacimientoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDiaNacimientoKeyTyped
        // TODO add your handling code here:
 char c=evt.getKeyChar(); 
             
         
          if(Character.isLetter(c)) { 
              getToolkit().beep(); 
               
              evt.consume(); 
               
             
               
          }
    }//GEN-LAST:event_txtDiaNacimientoKeyTyped

    private void txtMesNacimientoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMesNacimientoKeyTyped
        // TODO add your handling code here:
char c=evt.getKeyChar(); 
             
         
          if(Character.isLetter(c)) { 
              getToolkit().beep(); 
               
              evt.consume(); 
               
             
               
          }
    }//GEN-LAST:event_txtMesNacimientoKeyTyped

    private void txtAnioNacimientoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAnioNacimientoKeyTyped
        // TODO add your handling code here:
 char c=evt.getKeyChar(); 
             
         
          if(Character.isLetter(c)) { 
              getToolkit().beep(); 
               
              evt.consume(); 
               
             
               
          }
    }//GEN-LAST:event_txtAnioNacimientoKeyTyped

    private void txtSalarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSalarioKeyTyped
        // TODO add your handling code here:
   
char c=evt.getKeyChar(); 
             
         
          if(Character.isLetter(c)) { 
              getToolkit().beep(); 
               
              evt.consume(); 
               
             
               
          }
    }//GEN-LAST:event_txtSalarioKeyTyped

    private void txtNumeroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumeroKeyTyped
        // TODO add your handling code here:
 char c=evt.getKeyChar(); 
             
         
          if(Character.isLetter(c)) { 
              getToolkit().beep(); 
               
              evt.consume(); 
               
             
               
          }
    }//GEN-LAST:event_txtNumeroKeyTyped

    private void txtRFCKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRFCKeyTyped
        // TODO add your handling code here:
char c=evt.getKeyChar(); 
             
         
          if(Character.isLetter(c)) { 
              getToolkit().beep(); 
               
              evt.consume(); 
               
             
               
          }
    }//GEN-LAST:event_txtRFCKeyTyped

    private void txtCodigopostalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigopostalKeyTyped
        // TODO add your handling code here:
char c=evt.getKeyChar(); 
             
         
          if(Character.isLetter(c)) { 
              getToolkit().beep(); 
               
              evt.consume(); 
               
             
               
          }
    }//GEN-LAST:event_txtCodigopostalKeyTyped

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar(); 
             
         
          if(Character.isDigit(c)) { 
              getToolkit().beep(); 
               
              evt.consume(); 
               
             
               
          } 
        
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtApellido1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellido1KeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar(); 
             
         
          if(Character.isDigit(c)) { 
              getToolkit().beep(); 
               
              evt.consume(); 
               
             
               
          }
    }//GEN-LAST:event_txtApellido1KeyTyped

    private void txtApeliido2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApeliido2KeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar(); 
             
         
          if(Character.isDigit(c)) { 
              getToolkit().beep(); 
               
              evt.consume(); 
               
             
               
          }
    }//GEN-LAST:event_txtApeliido2KeyTyped

    private void txtSexoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSexoKeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar(); 
             
         
          if(Character.isDigit(c)) { 
              getToolkit().beep(); 
               
              evt.consume(); 
               
             
               
          }
    }//GEN-LAST:event_txtSexoKeyTyped

    private void txtEstadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEstadoKeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar(); 
             
         
          if(Character.isDigit(c)) { 
              getToolkit().beep(); 
               
              evt.consume(); 
               
             
               
          }
    }//GEN-LAST:event_txtEstadoKeyTyped

    private void txtHomoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHomoKeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar(); 
             
         
          if(Character.isDigit(c)) { 
              getToolkit().beep(); 
               
              evt.consume(); 
               
             
               
          }
    }//GEN-LAST:event_txtHomoKeyTyped

    private void txtNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumeroActionPerformed

    private void txtTituloKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTituloKeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar(); 
             
         
          if(Character.isDigit(c)) { 
              getToolkit().beep(); 
               
              evt.consume(); 
               
             
               
          }
    }//GEN-LAST:event_txtTituloKeyTyped

    private void txtEspecialidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEspecialidadKeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar(); 
             
         
          if(Character.isDigit(c)) { 
              getToolkit().beep(); 
               
              evt.consume(); 
               
             
               
          }
    }//GEN-LAST:event_txtEspecialidadKeyTyped

    private void txtColoniaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtColoniaKeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar(); 
             
         
          if(Character.isDigit(c)) { 
              getToolkit().beep(); 
               
              evt.consume(); 
               
             
               
          }
    }//GEN-LAST:event_txtColoniaKeyTyped

    private void txtCiudadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCiudadKeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar(); 
             
         
          if(Character.isDigit(c)) { 
              getToolkit().beep(); 
               
              evt.consume(); 
               
             
               
          }
    }//GEN-LAST:event_txtCiudadKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Ciudad;
    private javax.swing.JButton agregar;
    private javax.swing.JButton buscar;
    private javax.swing.JButton eliminar;
    private javax.swing.JLabel jLFechaNacimiento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jlNumero;
    private javax.swing.JLabel lbsalario;
    private javax.swing.JButton listar;
    private javax.swing.JButton modificar;
    private javax.swing.JTextField txtAnioIngreso;
    private javax.swing.JTextField txtAnioNacimiento;
    private javax.swing.JTextField txtApeliido2;
    private javax.swing.JTextField txtApellido1;
    private javax.swing.JTextField txtCalleNumero;
    private javax.swing.JTextField txtCiudad;
    private javax.swing.JTextField txtCodigopostal;
    private javax.swing.JTextField txtColonia;
    private javax.swing.JTextField txtContraseña;
    private javax.swing.JTextField txtDiaIngreso;
    private javax.swing.JTextField txtDiaNacimiento;
    private javax.swing.JTextField txtEspecialidad;
    private javax.swing.JTextField txtEstado;
    private javax.swing.JTextField txtHomo;
    private javax.swing.JTextField txtMesIngreso;
    private javax.swing.JTextField txtMesNacimiento;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtRFC;
    private javax.swing.JTextField txtSalario;
    private javax.swing.JTextField txtSexo;
    private javax.swing.JTextField txtTitulo;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
public static LinkedList<Medico> listaMedicos =new LinkedList<>();
private Medico medico;
}
