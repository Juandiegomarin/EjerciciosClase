
package ejercicio_7f;

import java.time.LocalDate;
import java.util.Objects;


public class Empleado {
    
    
    private String nombre;
    private String apellidos;
    private String dni;
    private String puesto;
    private LocalDate fechaIni;
    private LocalDate fechaCese;
    private String telefono;
    private String evaluador;
    private String coordinador;

    public Empleado() {
        
    }

    public Empleado(String nombre, String apellidos, String dni, String puesto, LocalDate fechaIni, LocalDate fechaCese, String telefono, String evaluador, String coordinador) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.puesto = puesto;
        this.fechaIni = fechaIni;
        this.fechaCese = fechaCese;
        this.telefono = telefono;
        this.evaluador = evaluador;
        this.coordinador = coordinador;
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    
    

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public LocalDate getFechaIni() {
        return fechaIni;
    }

    public void setFechaIni(LocalDate fechaIni) {
        this.fechaIni = fechaIni;
    }

    public LocalDate getFechaCese() {
        return fechaCese;
    }

    public void setFechaCese(LocalDate fechaCese) {
        this.fechaCese = fechaCese;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEvaluador() {
        return evaluador;
    }

    public void setEvaluador(String evaluador) {
        this.evaluador = evaluador;
    }

    public String getCoordinador() {
        return coordinador;
    }

    public void setCoordinador(String coordinador) {
        this.coordinador = coordinador;
    }

    

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + Objects.hashCode(this.dni);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Empleado other = (Empleado) obj;
        return Objects.equals(this.dni, other.dni);
    }

    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", dni=" + dni + ", puesto=" + puesto + ", fechaIni=" + fechaIni + ", fechaCese=" + fechaCese + ", telefono=" + telefono + ", evaluador=" + evaluador + ", coordinador=" + coordinador + '}';
    }
    
    
    
    
}
