/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vistas;

import Data.ProyectoData;
import Entidad.Proyecto;
import java.time.LocalDate;
import javax.swing.JOptionPane;


/**
 *
 * @author LEO
 */
public class ViewCrearProyecto extends javax.swing.JInternalFrame {

    /**
     * Creates new form ViewProyecto
     */
    public ViewCrearProyecto() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jtxtNombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtxtDescripcion = new javax.swing.JTextField();
        jcbEstado = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jdcFechaInicio = new com.toedter.calendar.JDateChooser();
        jbGuardar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(51, 51, 255));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("CREAR NUEVO PROYECTO");

        jtxtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtNombreActionPerformed(evt);
            }
        });

        jLabel4.setText("Fecha Inicio:");

        jLabel2.setText("Nombre:");

        jcbEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pendiente", "Progreso", "Finalizada" }));

        jLabel3.setText("Descripcion:");

        jLabel5.setText("Estado:");

        jbGuardar.setText("GUARDAR");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });

        jButton2.setText("Salir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(156, 156, 156))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jcbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jdcFechaInicio, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
                                .addComponent(jtxtDescripcion)
                                .addComponent(jtxtNombre))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jbGuardar)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2)))
                        .addGap(177, 177, 177))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jdcFechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbGuardar)
                    .addComponent(jButton2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(173, 173, 173))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtxtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtNombreActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
        if (jtxtNombre.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "CAMPO Nombre -> VACIO!!", "Advertencia!", JOptionPane.WARNING_MESSAGE);
            jtxtNombre.requestFocus();
        } else if (!validarLetrasYNumeros(jtxtNombre.getText().trim())) {
            JOptionPane.showMessageDialog(this, "Dato Nombre incorrecto >> Intente nuevamente...", "Error!", JOptionPane.ERROR_MESSAGE);
            jtxtNombre.requestFocus();
            jtxtNombre.setText("");
        } else if (jtxtDescripcion.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "CAMPO Descripción -> VACIO!!", "Advertencia!", JOptionPane.WARNING_MESSAGE);
            jtxtDescripcion.requestFocus();
        } else if (!validarLetrasYNumeros(jtxtDescripcion.getText().trim())) {
            JOptionPane.showMessageDialog(this, "Dato Descripción incorrecto >> Intente nuevamente...", "Error!", JOptionPane.ERROR_MESSAGE);
            jtxtDescripcion.requestFocus();
            jtxtDescripcion.setText("");
        } else if (jdcFechaInicio.getDate() == null) {
            JOptionPane.showMessageDialog(this, "CAMPO Fecha -> VACIO!!", "Advertencia!", JOptionPane.WARNING_MESSAGE);
            jdcFechaInicio.requestFocus();
        } else {
            try {
                ProyectoData proyectoData = new ProyectoData();
                Proyecto proyecto = new Proyecto();
                proyecto.setNombre(jtxtNombre.getText());
                proyecto.setDescripcion(jtxtDescripcion.getText());
                java.util.Date fechaSeleccionada = jdcFechaInicio.getDate();
                java.sql.Date fechaSQL = new java.sql.Date(fechaSeleccionada.getTime());
                // Convertir a LocalDate
                LocalDate fechaLocal = fechaSQL.toLocalDate();
                proyecto.setFechaInicio(fechaLocal);

                String estadoSeleccionadoString = (String) jcbEstado.getSelectedItem();
                int estadoSeleccionado = 1;
                switch (estadoSeleccionadoString) {
                    case "Pendiente":
                        estadoSeleccionado = 1;
                        break;
                    case "Progreso":
                        estadoSeleccionado = 2;
                        break;
                    case "Finalizado":
                        estadoSeleccionado = 3;
                        break;
                }

                proyecto.setEstado(estadoSeleccionado);
                proyectoData.guardarProyecto(proyecto);
                limpiar();
                jcbEstado.addItem("Pendiente");
                jcbEstado.addItem("Progreso");
                jcbEstado.addItem("Finalizado");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "El proyecto no pudo ser agregado!", "Error!", JOptionPane.ERROR_MESSAGE);
                limpiar();
            }
        }

    }//GEN-LAST:event_jbGuardarActionPerformed
    public void limpiar() {
        jtxtNombre.setText("");
        jtxtDescripcion.setText("");
        jcbEstado.removeAllItems();
        jdcFechaInicio.setDate(null);

    }

    public static boolean validarLetrasYNumeros(String letrasNumeros) {
        return letrasNumeros.matches("^[a-zA-Z0-9 ]*$");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JComboBox<String> jcbEstado;
    private com.toedter.calendar.JDateChooser jdcFechaInicio;
    private javax.swing.JTextField jtxtDescripcion;
    private javax.swing.JTextField jtxtNombre;
    // End of variables declaration//GEN-END:variables
}
