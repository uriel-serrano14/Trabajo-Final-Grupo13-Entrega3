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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jtxtNombre = new javax.swing.JTextField();
        jtxtDescripcion = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jbGuardar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jdcFechaInicio = new com.toedter.calendar.JDateChooser();
        jcbEstado = new javax.swing.JComboBox<>();

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("CREAR NUEVO PROYECTO");

        jLabel2.setText("Nombre:");

        jLabel3.setText("Descripcion:");

        jLabel4.setText("Fecha Inicio:");

        jtxtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtNombreActionPerformed(evt);
            }
        });

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

        jcbEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pendiente", "Progreso", "Finalizada" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(69, 69, 69)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jdcFechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jtxtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(58, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(145, 145, 145))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jbGuardar)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)
                        .addGap(63, 63, 63))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtxtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jdcFechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jcbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel4))
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jbGuardar))
                .addGap(16, 16, 16))
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
    private javax.swing.JButton jbGuardar;
    private javax.swing.JComboBox<String> jcbEstado;
    private com.toedter.calendar.JDateChooser jdcFechaInicio;
    private javax.swing.JTextField jtxtDescripcion;
    private javax.swing.JTextField jtxtNombre;
    // End of variables declaration//GEN-END:variables
}
