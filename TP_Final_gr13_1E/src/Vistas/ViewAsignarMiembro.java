/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vistas;

import Data.EquipoData;
import Data.EquipoMiembrosData;
import Data.MiembroData;
import Data.TareaData;
import Entidad.Comentarios;
import Entidad.Equipo;
import Entidad.EquipoMiembros;
import Entidad.Miembro;
import Entidad.Tarea;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Leonardo
 */
public class ViewAsignarMiembro extends javax.swing.JInternalFrame {

    private EquipoData ed = new EquipoData();
    private EquipoMiembrosData emd = new EquipoMiembrosData();
    private DefaultTableModel modelo = new DefaultTableModel();
    private TareaData td = new TareaData();
    private MiembroData md = new MiembroData();

    /**
     * Creates new form ViewAsignarMiembro
     */
    public ViewAsignarMiembro() {
        initComponents();
        armarCabeceraMiembros();
        cargaEquipos();
        borrarFila();

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
        jScrollPane1 = new javax.swing.JScrollPane();
        jtMimebros = new javax.swing.JTable();
        jbAsignar = new javax.swing.JButton();
        jcbEquipos = new javax.swing.JComboBox<>();
        jrbAsignados = new javax.swing.JRadioButton();
        jrbNoAsignados = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jbSalir = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("ASIGNAR MIEMBROS POR EQUIPO");

        jtMimebros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Apellido", "DNI"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtMimebros);

        jbAsignar.setText("ASIGNAR");
        jbAsignar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAsignarActionPerformed(evt);
            }
        });

        jrbAsignados.setText("ASIGNADOS");
        jrbAsignados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbAsignadosActionPerformed(evt);
            }
        });

        jrbNoAsignados.setText("NO ASIGNADOS");
        jrbNoAsignados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbNoAsignadosActionPerformed(evt);
            }
        });

        jLabel2.setText("Equipo:");

        jbSalir.setText("SALIR");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 669, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(173, 173, 173)
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jcbEquipos, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(45, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbAsignar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbSalir)
                        .addGap(27, 27, 27))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jrbAsignados)
                        .addGap(107, 107, 107)
                        .addComponent(jrbNoAsignados, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1))
                .addGap(215, 215, 215))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbEquipos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrbNoAsignados, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jrbAsignados))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbAsignar)
                    .addComponent(jbSalir))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
       private void borrarFila() {
        int filas = modelo.getRowCount() - 1;
        for (int i = filas; i >= 0; i--) {
            modelo.removeRow(i);
        }
    }
    private void jrbNoAsignadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbNoAsignadosActionPerformed

        if (jrbNoAsignados.isSelected()) {
            borrarFila();
            jrbAsignados.setSelected(false);
            llenarTablaNoAsignados();
        }

    }//GEN-LAST:event_jrbNoAsignadosActionPerformed

    private void jrbAsignadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbAsignadosActionPerformed
        if (jrbAsignados.isSelected()) {
            borrarFila();
            jrbNoAsignados.setSelected(false);
            llenarTablaAsignados();
        }

    }//GEN-LAST:event_jrbAsignadosActionPerformed

    private void jbAsignarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAsignarActionPerformed
        try {
//  Equipo eq = (Equipo) jcbEquipos.getSelectedItem();
            if (JOptionPane.showConfirmDialog(this, "¿Quiere agregar el miembro "
                    + ((String) (jtMimebros.getValueAt(jtMimebros.getSelectedRow(), 0))) + " al equipo?") == 0) {

                Equipo e = (Equipo) jcbEquipos.getSelectedItem();
                int dni = (Integer) (jtMimebros.getValueAt(jtMimebros.getSelectedRow(), 2));
                Miembro m = md.buscarMiembroPorDni(dni);
                EquipoMiembros em = new EquipoMiembros(e, m, LocalDate.now());
                emd.guardarEquipoMiembro(em);
                borrarFila();
                llenarTablaNoAsignados();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Seleccione un miembro");
        }
    }//GEN-LAST:event_jbAsignarActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jbSalirActionPerformed

    private void llenarTablaAsignados() {

        Equipo t = (Equipo) jcbEquipos.getSelectedItem();
        List<Miembro> miembros = emd.buscarMiembrosPorEquipo(t.getIdEquipo());
        for (Miembro m : miembros) {
            modelo.addRow(new Object[]{m.getNombre(), m.getApellido(), m.getDni()});
        }
    }

    private void llenarTablaNoAsignados() {

        Equipo t = (Equipo) jcbEquipos.getSelectedItem();
        List<Miembro> miembros = emd.buscarMiembrosSinEquipo();
        for (Miembro m : miembros) {
            modelo.addRow(new Object[]{m.getNombre(), m.getApellido(), m.getDni()});
        }
    }

    private void armarCabeceraMiembros() {
        ArrayList titulos = new ArrayList();
        titulos.add("Nombre");
        titulos.add("Apellido");
        titulos.add("DNI");
        for (Object titulo : titulos) {
            modelo.addColumn(titulo);
        }
        jtMimebros.setModel(modelo);
    }

    private void cargaEquipos() {
        List<Equipo> equipos = ed.traerTodos();
        for (Equipo e : equipos) {
            jcbEquipos.addItem(e);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbAsignar;
    private javax.swing.JButton jbSalir;
    private javax.swing.JComboBox<Equipo> jcbEquipos;
    private javax.swing.JRadioButton jrbAsignados;
    private javax.swing.JRadioButton jrbNoAsignados;
    private javax.swing.JTable jtMimebros;
    // End of variables declaration//GEN-END:variables
}
