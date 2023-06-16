/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Data.EquipoData;
import Data.EquipoMiembrosData;
import Data.TareaData;
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
public class ViewMiembros extends javax.swing.JInternalFrame {
    private EquipoData ed = new EquipoData();
    private EquipoMiembrosData emd = new EquipoMiembrosData();
    private DefaultTableModel modelo=new DefaultTableModel();
    private TareaData td = new TareaData();
    /**
     * Creates new form ViewMiembros
     */
    public ViewMiembros() {
        initComponents();
        cargaEquipos();
        armarCabeceraMiembros();
        borrarFilasMiembros();
    }
    private void armarCabeceraMiembros() {
        ArrayList titulos=new ArrayList();
     //   titulos.add("ID");
        titulos.add("Nombre");
        titulos.add("Apellido");
        titulos.add("DNI");
        titulos.add("Estado");
        titulos.add("Tarea");
        for(Object titulo:titulos){
            modelo.addColumn(titulo);
        }
        jtMiembros.setModel(modelo);
    }
    private void cargaEquipos() {
        List<Equipo> equipos = ed.traerTodos();
        for (Equipo e : equipos) {
            jcbEquipos.addItem(e);
        }
    }
    private void llenarTablaMiembros(){
            
            Equipo equipo = (Equipo) jcbEquipos.getSelectedItem();
            List<Miembro> miembros = emd.buscarMiembrosPorEquipo(equipo.getIdEquipo());       
            for (Miembro m : miembros) {
                Tarea t = emd.buscarTareaPorMiembro(m.getIdMiembro());
                if(t!=null){
                    modelo.addRow(new Object[]{m.getNombre(),m.getApellido(),m.getDni(),m.getEstado(),t.getNombr()});
                }else{
                    modelo.addRow(new Object[]{m.getNombre(),m.getApellido(),m.getDni(),m.getEstado(),"Sin Asignar"});
                }
        }
    }
    
    private void borrarFilasMiembros(){
        int filas=modelo.getRowCount()-1;
        for(int i=filas;i>=0;i--){
            modelo.removeRow(i);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jcbEquipos = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtMiembros = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("MIEMBROS");

        jcbEquipos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbEquiposActionPerformed(evt);
            }
        });

        jLabel2.setText("EQUIPOS:");

        jtMiembros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Apellido", "DNI", "Estado", "Tarea"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Boolean.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtMiembros);
        if (jtMiembros.getColumnModel().getColumnCount() > 0) {
            jtMiembros.getColumnModel().getColumn(0).setMinWidth(15);
            jtMiembros.getColumnModel().getColumn(0).setMaxWidth(25);
        }

        jButton1.setText("SALIR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(82, 82, 82)
                .addComponent(jcbEquipos, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(173, 173, 173))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(291, 291, 291)
                            .addComponent(jLabel1))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(24, 24, 24)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 675, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbEquipos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jButton1))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcbEquiposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbEquiposActionPerformed
        borrarFilasMiembros();
        llenarTablaMiembros();
    }//GEN-LAST:event_jcbEquiposActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<Equipo> jcbEquipos;
    private javax.swing.JTable jtMiembros;
    // End of variables declaration//GEN-END:variables
}
