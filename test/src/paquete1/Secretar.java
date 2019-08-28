/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.LinkedList;
import javax.swing.JOptionPane;
import static paquete1.MedicoVisual.listaMedicos;

/**
 *
 * @author luis
 */
public class Secretar extends javax.swing.JInternalFrame {

    /**
     * Creates new form Secretar
     */
    public Secretar() {
        initComponents();
        Modificar.setEnabled(false);
        Eliminar.setEnabled(false);
        Listar.setEnabled(true);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtUsuario = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        txtContraseña = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        txtCodigoPostal = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        txtColonia = new javax.swing.JTextField();
        txtApellido1 = new javax.swing.JTextField();
        txtApellido2 = new javax.swing.JTextField();
        txtGrado = new javax.swing.JTextField();
        txtSexo = new javax.swing.JTextField();
        txtEstado = new javax.swing.JTextField();
        txtHomo = new javax.swing.JTextField();
        txtCalleNum = new javax.swing.JTextField();
        txtNumero = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtSalario = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtRFC = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtCiudad = new javax.swing.JTextField();
        Agregar = new javax.swing.JButton();
        Buscar = new javax.swing.JButton();
        Modificar = new javax.swing.JButton();
        Listar = new javax.swing.JButton();
        Eliminar = new javax.swing.JButton();
        jlfechaIngreso = new javax.swing.JLabel();
        txtDiaIngreso = new javax.swing.JTextField();
        txtMesIngreso = new javax.swing.JTextField();
        txtAnioIngreso = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtDiaNacimiento = new javax.swing.JTextField();
        txtMesNacimiento = new javax.swing.JTextField();
        txtAnioNacimiento = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jLabel10.setText("Nombre");

        jLabel11.setText("Apellido Paterno");

        jLabel12.setText("Apellido Materno");

        jLabel21.setText("Usuario");

        jLabel13.setText("Grado");

        jLabel14.setText("Sexo");

        jLabel15.setText("Estado");

        jLabel16.setText("Homoclave");

        jLabel17.setText("Calle");

        jLabel18.setText("Numero");

        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });

        jLabel22.setText("Contraseña");

        jLabel23.setText("Codigo Postal");

        txtCodigoPostal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodigoPostalKeyTyped(evt);
            }
        });

        jLabel25.setText("Colonia");

        txtColonia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtColoniaKeyTyped(evt);
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

        txtApellido2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtApellido2KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellido2KeyTyped(evt);
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

        jLabel1.setText("Salario");

        txtSalario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSalarioActionPerformed(evt);
            }
        });
        txtSalario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSalarioKeyTyped(evt);
            }
        });

        jLabel2.setText("RFC");

        txtRFC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRFCActionPerformed(evt);
            }
        });
        txtRFC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRFCKeyTyped(evt);
            }
        });

        jLabel3.setText("Cuidad");

        txtCiudad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCiudadKeyTyped(evt);
            }
        });

        Agregar.setText("Agregar");
        Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarActionPerformed(evt);
            }
        });

        Buscar.setText("Buscar");
        Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarActionPerformed(evt);
            }
        });

        Modificar.setText("Modificar");
        Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarActionPerformed(evt);
            }
        });

        Listar.setText("Listar");
        Listar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListarActionPerformed(evt);
            }
        });

        Eliminar.setText("Eliminar");
        Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarActionPerformed(evt);
            }
        });

        jlfechaIngreso.setText("fecha Ingreso");

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

        txtAnioIngreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAnioIngresoActionPerformed(evt);
            }
        });
        txtAnioIngreso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAnioIngresoKeyTyped(evt);
            }
        });

        jLabel4.setText("fecha nacimiento");

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

        txtAnioNacimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAnioNacimientoActionPerformed(evt);
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtApellido1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtApellido2, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtGrado, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(26, 26, 26)))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(37, 37, 37)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(23, 23, 23)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCalleNum, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtHomo)
                                        .addComponent(txtEstado, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtSexo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel23)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtCodigoPostal, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel25)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel3))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(txtSalario, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                                                    .addComponent(txtRFC)
                                                    .addComponent(txtCiudad)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(12, 12, 12)
                                                .addComponent(txtColonia, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel21))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(67, 67, 67)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jlfechaIngreso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtDiaIngreso, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                                    .addComponent(txtDiaNacimiento))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtMesIngreso, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                                    .addComponent(txtMesNacimiento))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtAnioIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtAnioNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(Agregar)
                        .addGap(42, 42, 42)
                        .addComponent(Buscar)
                        .addGap(30, 30, 30)
                        .addComponent(Modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(Listar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(Eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(480, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtApellido1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22)
                    .addComponent(txtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtApellido2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23)
                    .addComponent(txtCodigoPostal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtGrado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25)
                    .addComponent(txtColonia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(txtSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(txtHomo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txtRFC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(txtCalleNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlfechaIngreso)
                    .addComponent(txtDiaIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMesIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAnioIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel18)
                        .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtDiaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtMesNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtAnioNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Listar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Agregar)
                    .addComponent(Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(91, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtApellido1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellido1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellido1ActionPerformed

    private void txtNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumeroActionPerformed

    private void txtRFCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRFCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRFCActionPerformed

    private void txtSalarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSalarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSalarioActionPerformed

    private void AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarActionPerformed
        // TODO add your handling code here:
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
       Domicilio domicilio = new Domicilio(txtCalleNum.getText(), txtColonia.getText(), txtCodigoPostal.getText(), txtCiudad.getText());
        
       Secretaria secretaria= new Secretaria(txtGrado.getText(), txtUsuario.getText(),txtContraseña.getText(), RFC, Salario, Numero, fechaIngreso,txtNombre.getText(),txtApellido1.getText(),txtApellido2.getText(),txtSexo.getText(), estado,txtHomo.getText(), domicilio, fechaNacimiento);
       secretaria.curp(txtApellido1.getText(), txtApellido2.getText(), txtNombre.getText(), txtSexo.getText(), estado.getEstados());
       secretaria.calcularAntiguedad();
       secretaria.CalcularEdad();
       listaSecretaria.add(secretaria);
      
       
           try {
      FileOutputStream fileOut = new FileOutputStream("secretaria.ser");
      ObjectOutputStream out = new ObjectOutputStream(fileOut);
      out.writeObject(listaSecretaria);
      out.close();
      fileOut.close();
    } catch (IOException i) {
      i.printStackTrace();
    }
         Modificar.setEnabled(true);
         Eliminar.setEnabled(true);
         Listar.setEnabled(true);
    }//GEN-LAST:event_AgregarActionPerformed

    private void txtAnioIngresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAnioIngresoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAnioIngresoActionPerformed

    private void txtAnioNacimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAnioNacimientoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAnioNacimientoActionPerformed

    private void BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarActionPerformed
        // TODO add your handling code here:
         String Buqueda=JOptionPane.showInputDialog("introduce la curp de la secretaria");
           Secretaria M=new Secretaria();
            M.setCurpg(Buqueda);
          if  (listaSecretaria.contains(M)){
              int posicion=listaSecretaria.indexOf(M);              
              secretaria=listaSecretaria.get(posicion);
              //llenar todos los espacios 
              txtNombre.setText(secretaria.getNombre());
              txtApellido1.setText(secretaria.getApellido1());
              txtApellido2.setText(secretaria.getApellido2());
              txtEstado.setText(secretaria.estado1.getEstados());
              txtSexo.setText(secretaria.getGenero());
              txtGrado.setText(secretaria.getGrado());
              txtUsuario.setText(secretaria.getUsuario());
              txtContraseña.setText(secretaria.getContrasenia());
              txtRFC.setText(String.valueOf(secretaria.getRfc()));
              txtSalario.setText(String.valueOf(secretaria.getSalario()));
              txtNumero.setText(String.valueOf(secretaria.getNumero()));
              
              txtDiaIngreso.setText(String.valueOf(secretaria.ingreso.get(Calendar.DAY_OF_MONTH)));
              txtMesIngreso.setText(String.valueOf(secretaria.ingreso.get(Calendar.MONTH)));
              txtAnioIngreso.setText(String.valueOf(secretaria.ingreso.get(Calendar.YEAR)));
              
              txtDiaNacimiento.setText(String.valueOf(secretaria.nacimiento.get(Calendar.DAY_OF_MONTH)));
              txtMesNacimiento.setText(String.valueOf(secretaria.nacimiento.get(Calendar.MONTH)));
              txtAnioNacimiento.setText(String.valueOf(secretaria.nacimiento.get(Calendar.YEAR)));
              
              txtCalleNum.setText(secretaria.domicilio.getCalleNum());
              txtCodigoPostal.setText(secretaria.domicilio.getCodigoPostal());
              txtCiudad.setText(secretaria.domicilio.getCiudad());
             txtColonia.setText(secretaria.domicilio.getColonia());
                     
              txtHomo.setText(secretaria.getHomoclave());
              
         Modificar.setEnabled(true);
         Eliminar.setEnabled(true);
         Listar.setEnabled(true);
              
          //AQUI HACE FALTA PONER LA FECHA DE INGRESO ;NACIMIENTO  ;DOMICILIO Y ESOS ERRORES QUE SALEN SON 
                      //POR QUE NO SON STRING Y DEBEMOS CONVERTIRLOS A LO QUE SON
              
          }else{
              JOptionPane.showMessageDialog(null, "No se encuentra la secretaria ");
          }
    }//GEN-LAST:event_BuscarActionPerformed

    private void ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarActionPerformed
        // TODO add your handling code here:
         String Buqueda=JOptionPane.showInputDialog("introduce la curp de la secretaria");
           Secretaria M=new Secretaria();
            M.setCurpg(Buqueda);
            if  (listaSecretaria.contains(M)){
            int posicion=listaSecretaria.indexOf(M);              
              secretaria=listaSecretaria.get(posicion);
        secretaria.setNombre(txtNombre.getText());
         secretaria.setApellido1(txtApellido1.getText());
         secretaria.setApellido2(txtApellido2.getText());
         secretaria.setUsuario(txtUsuario.getText());
         secretaria.setContrasenia(txtContraseña.getText());
            
          int rfc=Integer.parseInt(txtRFC.getText());
                secretaria.setRfc(rfc);
               
                double salario=Double.parseDouble(txtSalario.getText());
               secretaria.setSalario(salario);
               
               Integer numero=Integer.parseInt(txtNumero.getText());
               secretaria.setNumero(numero);
              
               int diaIngreso,mesIngreso,anioIngreso,diaNacimiento,mesNacimiento,anioNacimiento;
              diaIngreso=Integer.parseInt(txtDiaIngreso.getText());
              mesIngreso=Integer.parseInt(txtMesIngreso.getText());
              
              anioIngreso=Integer.parseInt(txtAnioIngreso.getText());
              
               Calendar fechaIngreso= new GregorianCalendar(anioIngreso,mesIngreso,diaIngreso);
               secretaria.setIngreso(fechaIngreso);
               secretaria.setGenero(txtSexo.getText());
              
               String estado1=String.valueOf(txtEstado.getText().toUpperCase());
       Estado estado= Enum.valueOf(Estado.class,estado1);
               secretaria.setEstado(estado);
               
               secretaria.setHomoclave(txtHomo.getText());
               
              Domicilio domicilio= new Domicilio();
              secretaria.domicilio.setCalleNum(txtCalleNum.getText());
               secretaria.domicilio.setCiudad(txtCiudad.getText());
               secretaria.domicilio.setCodigoPostal(txtCodigoPostal.getText());
               secretaria.domicilio.setColonia(txtColonia.getText());
               
               anioNacimiento=Integer.parseInt(txtAnioNacimiento.getText());
               mesNacimiento=Integer.parseInt(txtMesNacimiento.getText());
               
               diaNacimiento=Integer.parseInt(txtDiaNacimiento.getText());
               Calendar fechaNacimiento=new GregorianCalendar(anioNacimiento,mesNacimiento,diaNacimiento);
               secretaria.setNacimiento(fechaNacimiento);
               secretaria.curp(txtApellido1.getText(), txtApellido2.getText(), txtNombre.getText(), txtSexo.getText(),estado.getEstados());
               listaSecretaria.add(secretaria);
            }else{
                JOptionPane.showMessageDialog(null,"no se encuentrala secretaria" );
            
            }
    }//GEN-LAST:event_ModificarActionPerformed

    private void ListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListarActionPerformed
        // TODO add your handling code here:
        System.out.println(listaSecretaria);
    }//GEN-LAST:event_ListarActionPerformed

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
        // TODO add your handling code here:
        String Buqueda=JOptionPane.showInputDialog("introduce la curp de la secretaria");
           Secretaria M=new Secretaria();
            M.setCurpg(Buqueda);
            if  (listaSecretaria.contains(M)){
            int posicion=listaSecretaria.indexOf(M);              
              secretaria=listaSecretaria.get(posicion);
        if( listaSecretaria.remove(secretaria)){
                       JOptionPane.showMessageDialog(null,"datos removidos");
                       
                   }
                   else{
                       JOptionPane.showMessageDialog(null,"no se pudo remover");
                       
                   }}else{
                JOptionPane.showMessageDialog(null,"La secretaria no se encuentra");
            }
    }//GEN-LAST:event_EliminarActionPerformed

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

    private void txtCodigoPostalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoPostalKeyTyped
        // TODO add your handling code here:

char c=evt.getKeyChar(); 
             
         
          if(Character.isLetter(c)) { 
              getToolkit().beep(); 
               
              evt.consume(); 
               
             
               
          }
    }//GEN-LAST:event_txtCodigoPostalKeyTyped

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

    private void txtApellido2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellido2KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellido2KeyReleased

    private void txtApellido2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellido2KeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar(); 
             
         
          if(Character.isDigit(c)) { 
              getToolkit().beep(); 
               
              evt.consume(); 
               
              
               
          } 
    }//GEN-LAST:event_txtApellido2KeyTyped

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
    private javax.swing.JButton Agregar;
    private javax.swing.JButton Buscar;
    private javax.swing.JButton Eliminar;
    private javax.swing.JButton Listar;
    private javax.swing.JButton Modificar;
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel jlfechaIngreso;
    private javax.swing.JTextField txtAnioIngreso;
    private javax.swing.JTextField txtAnioNacimiento;
    private javax.swing.JTextField txtApellido1;
    private javax.swing.JTextField txtApellido2;
    private javax.swing.JTextField txtCalleNum;
    private javax.swing.JTextField txtCiudad;
    private javax.swing.JTextField txtCodigoPostal;
    private javax.swing.JTextField txtColonia;
    private javax.swing.JTextField txtContraseña;
    private javax.swing.JTextField txtDiaIngreso;
    private javax.swing.JTextField txtDiaNacimiento;
    private javax.swing.JTextField txtEstado;
    private javax.swing.JTextField txtGrado;
    private javax.swing.JTextField txtHomo;
    private javax.swing.JTextField txtMesIngreso;
    private javax.swing.JTextField txtMesNacimiento;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtRFC;
    private javax.swing.JTextField txtSalario;
    private javax.swing.JTextField txtSexo;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
public static LinkedList<Secretaria> listaSecretaria =new LinkedList<>();
private Secretaria secretaria;

}
