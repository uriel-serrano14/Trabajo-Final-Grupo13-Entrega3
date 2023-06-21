/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Data.ComentariosData;
import Data.TareaData;
import Entidad.Comentarios;
import Entidad.Equipo;
import Entidad.Miembro;
import Entidad.Tarea;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author EQUIPO
 */
public class ViewComentarios extends javax.swing.JInternalFrame {
    TareaData td = new TareaData();
    ComentariosData cd = new ComentariosData();
    private DefaultTableModel modelo=new DefaultTableModel();
    /**
     * Creates new form ViewComentarios
     */
    public ViewComentarios() {
        initComponents();
        cargaTareas();
        estadoTarea();
        armarCabeceraMiembros();
        borrarFila();
       
        
    }

    private void cargaTareas() {
        List<Tarea> tareas = td.traerTodos();
        for (Tarea t : tareas) {
            jcbTareas.addItem(t);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jcbTareas = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtTareas = new javax.swing.JTable();
        jbActualizar = new javax.swing.JButton();
        jcbEstado = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jbComentar = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        escritorio2 = new javax.swing.JDesktopPane();

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("TAREA");

        jcbTareas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbTareasActionPerformed(evt);
            }
        });

        jtTareas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Comentario", "Fecha de Avance"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtTareas);
        if (jtTareas.getColumnModel().getColumnCount() > 0) {
            jtTareas.getColumnModel().getColumn(0).setMinWidth(20);
            jtTareas.getColumnModel().getColumn(0).setMaxWidth(30);
        }

        jbActualizar.setText("Actualizar");
        jbActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbActualizarActionPerformed(evt);
            }
        });

        jcbEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pendiente", "Proceso", "Finalizada" }));

        jLabel2.setText("Agregar Comentario:");

        jbComentar.setText("Comentar");
        jbComentar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbComentarActionPerformed(evt);
            }
        });

        jButton3.setText("Salir");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel3.setText("Tareas:");

        jLabel4.setText("Estado:");

        javax.swing.GroupLayout escritorio2Layout = new javax.swing.GroupLayout(escritorio2);
        escritorio2.setLayout(escritorio2Layout);
        escritorio2Layout.setHorizontalGroup(
            escritorio2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        escritorio2Layout.setVerticalGroup(
            escritorio2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 249, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 56, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(23, 23, 23)
                                .addComponent(jbComentar))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(237, 237, 237)
                                .addComponent(jLabel1)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(escritorio2)
                            .addComponent(jButton3)
                            .addComponent(jScrollPane1)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jcbTareas, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(66, 66, 66)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jcbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jbActualizar))
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(25, 25, 25))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(60, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbTareas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbActualizar)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbComentar)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(escritorio2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jcbTareasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbTareasActionPerformed
        // COMENTARIOSSS
        estadoTarea();
        escritorio2.removeAll();
        escritorio2.repaint();
        borrarFila();
        llenarTabla();   
       
    }//GEN-LAST:event_jcbTareasActionPerformed

    private void estadoTarea(){
        Tarea t = (Tarea) jcbTareas.getSelectedItem();
        int estado = t.getEstado();
        switch (estado) {
            case 1:
                jcbEstado.setSelectedItem("Pendiente");
                break;
            case 2:
                jcbEstado.setSelectedItem("Proceso");
                break; 
            case 3:
                jcbEstado.setSelectedItem("Finalizada");
                break;  
        }
    }
    private void armarCabeceraMiembros() {
        ArrayList titulos=new ArrayList();
        titulos.add("Comentario");
        titulos.add("Fecha De Avance");
        for(Object titulo:titulos){
            modelo.addColumn(titulo);
        }
        jtTareas.setModel(modelo);
    }
    private void jbComentarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbComentarActionPerformed
        // AGREGAR COMENTARIO
        Tarea t = (Tarea) jcbTareas.getSelectedItem();
        escritorio2.removeAll();
        escritorio2.repaint();
        ViewCrearComentario vcm = new ViewCrearComentario(t.getIdTarea());
        vcm.setVisible(true);
        escritorio2.add(vcm);
        escritorio2.moveToFront(vcm);
        
    }//GEN-LAST:event_jbComentarActionPerformed

    private void jbActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbActualizarActionPerformed
        // ACTUALIZAR ESTADO DE TAREA
        String estado = (String) jcbEstado.getSelectedItem();
        Tarea t = (Tarea) jcbTareas.getSelectedItem();
        switch (estado) {
            case "Pendiente":
                t.setEstado(1);
                td.actualizarTarea(t);
                break;
            case "Proceso":
                t.setEstado(2);
                td.actualizarTarea(t);
                break;
            case "Finalizada":
                t.setEstado(3);
                td.actualizarTarea(t);
                break;
        }
    }//GEN-LAST:event_jbActualizarActionPerformed

    private void borrarFila(){
        int filas=modelo.getRowCount()-1;
        for(int i=filas;i>=0;i--){
            modelo.removeRow(i);
        }
    }
    
    private void llenarTabla(){
            
            Tarea t = (Tarea) jcbTareas.getSelectedItem();
            List<Comentarios> comentarios = cd.obtenerComentarioPorTarea(t.getIdTarea()) ;       
            for (Comentarios m : comentarios) {
                modelo.addRow(new Object[]{m.getComentario(),m.getFechaAvance()});
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritorio2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbActualizar;
    private javax.swing.JButton jbComentar;
    private javax.swing.JComboBox<String> jcbEstado;
    private javax.swing.JComboBox<Tarea> jcbTareas;
    private javax.swing.JTable jtTareas;
    // End of variables declaration//GEN-END:variables
}
