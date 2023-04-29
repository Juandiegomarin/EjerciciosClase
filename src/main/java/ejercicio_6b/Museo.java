package ejercicio_6b;

import java.util.ArrayList;
import java.util.Objects;

public class Museo {
    
    private String nombre;
    private String direccion;
    private ArrayList<Empleado> empleados;
    private ArrayList<Sala> salas;
    
    public Museo(String nombre, String direccion, ArrayList<Empleado> empleados, ArrayList<Sala> salas) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.empleados = empleados;
        this.salas = salas;
    }
    
    public Museo() {
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getDireccion() {
        return direccion;
    }
    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }
    
    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }
    
    public ArrayList<Sala> getSalas() {
        return salas;
    }
    
    public void setSalas(ArrayList<Sala> salas) {
        this.salas = salas;
    }
    
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 43 * hash + Objects.hashCode(this.nombre);
        hash = 43 * hash + Objects.hashCode(this.direccion);
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
        final Museo other = (Museo) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return Objects.equals(this.direccion, other.direccion);
    }
    
    
    @Override
    public String toString() {
        return "Museo{" + "nombre=" + nombre + ", direccion=" + direccion + ", empleados=" + empleados + ", obras=" + salas + '}';
    }
    
    public void contratarEmpleado(Empleado e) {
        
        this.empleados.add(e);
        
    }
    
    public void despedirEmpleado(Empleado e) {
        
        this.empleados.remove(e);
        
    }
    
    public void anadirSala(Sala s) {
        
         this.salas.add(s);
    }
    
    public void quitarSala(Sala s) {
        
           this.salas.remove(s);
    }   
    
}
