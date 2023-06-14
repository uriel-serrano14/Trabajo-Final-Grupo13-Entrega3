
package Entidad;

import java.time.LocalDate;

/**
 *
 * @author Gabriel
 */
public class Proyecto {
   private int idProyecto;
   private String nombre;
   private String descripcion;
   private LocalDate fechaInicio;
   private int estado;

    public Proyecto() {
    }

    public Proyecto(String nombre, String descripcion, LocalDate fechaInicio, int estado) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fechaInicio = fechaInicio;
        this.estado = estado;
    }

    public Proyecto(int idProyecto, String nombre, String descripcion, LocalDate fechaInicio, int estado) {
        this.idProyecto = idProyecto;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fechaInicio = fechaInicio;
        this.estado = estado;
    }

    public int getIdProyecto() {
        return idProyecto;
    }

    public void setIdProyecto(int idProyecto) {
        this.idProyecto = idProyecto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return  idProyecto + " " + nombre;
    }
   
}
