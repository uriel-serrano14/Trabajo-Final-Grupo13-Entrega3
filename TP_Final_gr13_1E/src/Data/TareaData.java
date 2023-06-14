package Data;

import Entidad.Comentarios;
import Entidad.EquipoMiembros;
import Entidad.Miembro;
import Entidad.Tarea;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class TareaData {

    private Connection con = null;

    public TareaData() {
        con = ConeccionData.getConexion();
    }

    public void guardarTarea(Tarea tarea) {

        String sql = "INSERT INTO tarea (idEquipoMiembros, nombre, fechaCreacion, fechaCierre,estado) VALUES (?, ?, ?, ?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, tarea.getEquipoMiembros().getIdEquipoMiembros());
            ps.setString(2, tarea.getNombr());
            ps.setDate(3, Date.valueOf(tarea.getFechaCreacion())); // pasar de localdate a date para sql
            ps.setDate(4, Date.valueOf(tarea.getFechaCierre())); 
            ps.setInt(5, 1);
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                tarea.setIdTarea(rs.getInt("idTarea"));
                JOptionPane.showMessageDialog(null, "Tarea cargada exitosamente.");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Tarea" + ex.getMessage());
        }

    }
    
    public void borrarTarea(int idTarea){
        String sql = "DELETE FROM `tarea` WHERE idTarea = ?";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, idTarea);   //Para setear el id donde esta el signo ?
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, " Tarea Borrada Exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "La Tarea no existe");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "La Tarea tiene miembros trabajando ");
        }
    }
    
    public Tarea busacarTareaId(int id){
        Tarea tarea = null;
        String sql = "SELECT * FROM tarea WHERE idTarea = ?";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1,id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                tarea =new Tarea();
                tarea.setIdTarea(rs.getInt("idTarea"));
                tarea.setNombr(rs.getString("nombre"));
                tarea.setFechaCreacion(rs.getDate("fechaCreacion").toLocalDate());//pasar datesql a localdate
                tarea.setFechaCierre(rs.getDate("fechaCierre").toLocalDate());
                tarea.setEstado(rs.getInt("estado"));
                EquipoMiembrosData emd = new EquipoMiembrosData();
                tarea.setEquipoMiembros(emd.buscarEquipoMiembroPorId(rs.getInt("IdEquipoMiembros")));
             
               
            } else {
             JOptionPane.showMessageDialog(null, "No existe la tarea", "Error!", JOptionPane.ERROR_MESSAGE);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla tarea "+ex.getMessage());
        }
        return tarea;
    }
    
        public void actualizarTarea(Tarea tarea) {

        String sql = "UPDATE tarea SET  nombre = ?, fechaCreacion = ? , fechaCierre = ? , estado = ? WHERE  idTarea = ?";
        PreparedStatement ps = null;

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, tarea.getNombr());
            ps.setDate(2, Date.valueOf(tarea.getFechaCreacion()));
            ps.setDate(3, Date.valueOf(tarea.getFechaCierre()));
            ps.setInt(4, tarea.getEstado());
            ps.setInt(5, tarea.getIdTarea());
            int exito = ps.executeUpdate();
            
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Tarea Modificado Exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "La tarea no existe");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Tarea "+ex.getMessage());
        }
        
    }
    public List<Tarea> traerTodos(){
        List<Tarea> tareas = new ArrayList();
        String sql = "SELECT * FROM tarea";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
            Tarea tarea =new Tarea();
                tarea.setIdTarea(rs.getInt("idTarea"));
                tarea.setNombr(rs.getString("nombre"));
                tarea.setFechaCreacion(rs.getDate("fechaCreacion").toLocalDate());//pasar datesql a localdate
                tarea.setFechaCierre(rs.getDate("fechaCierre").toLocalDate());
                tarea.setEstado(rs.getInt("estado"));
                EquipoMiembrosData emd = new EquipoMiembrosData();
                tarea.setEquipoMiembros(emd.buscarEquipoMiembroPorId(rs.getInt("IdEquipoMiembros")));
                           
             tareas.add(tarea);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla tarea " + ex.getMessage());
        }
        
        return tareas;
    }
    
    public void asignarMiembro(EquipoMiembros em, int id) {

        String sql = "UPDATE tarea SET   idEquipoMiembros = ? WHERE  idTarea = ?";
        PreparedStatement ps = null;

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, em.getIdEquipoMiembros());
            ps.setInt(2, id);
            int exito = ps.executeUpdate();
            
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Tarea Asignada Correctamente.");
            } else {
                JOptionPane.showMessageDialog(null, "La tarea no existe");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Tarea "+ex.getMessage());
        }
        
    }

    public List<Tarea> buscarTareasPorProyecto(int idProyecto){
        List<Tarea> tareas = new ArrayList();
        String sql = "SELECT T.* FROM tarea T JOIN equipomiembros EM ON(T.idEquipoMiembros=EM.idEquipoMiembros) JOIN equipo E ON(EM.idEquipo=E.idEquipo) JOIN proyecto P ON(E.idProyecto = P.idProyecto) WHERE P.idProyecto = ?";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, idProyecto);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
               Tarea t = new Tarea();
               
               t.setIdTarea(rs.getInt("idTarea"));
               t.setNombr(rs.getString("nombre"));
               t.setFechaCierre(rs.getDate("fechaCierre").toLocalDate());
               t.setFechaCreacion(rs.getDate("fechaCreacion").toLocalDate());
               t.setEstado(rs.getInt("estado"));
               EquipoMiembrosData emd = new EquipoMiembrosData();
               t.setEquipoMiembros(emd.buscarEquipoMiembroPorId(rs.getInt("idEquipoMiembros")));
            
                tareas.add(t);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Tarea" + ex.getMessage());
        }
        
        return tareas;
    }
}
