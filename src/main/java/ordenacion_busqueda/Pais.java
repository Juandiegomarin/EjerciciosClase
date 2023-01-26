/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ordenacion_busqueda;

import java.util.Objects;

/**
 *
 * @author juandi
 */
public class Pais implements Comparable<Pais>{
    
    private String nombre;
    private long poblacion;
    private long superficie;
    private String moneda;

    public Pais(String nombre, long poblacion, long superficie, String moneda) {
        this.nombre = nombre;
        this.poblacion = poblacion;
        this.superficie = superficie;
        this.moneda = moneda;
    }

    public Pais() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(long poblacion) {
        this.poblacion = poblacion;
    }

    public long getSuperficie() {
        return superficie;
    }

    public void setSuperficie(long superficie) {
        this.superficie = superficie;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + Objects.hashCode(this.nombre);
        
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
        final Pais other = (Pais) obj;
        
        return Objects.equals(this.nombre, other.nombre);
    }

    @Override
    public String toString() {
        return "Pais{" + "nombre=" + nombre + ", poblacion=" + poblacion + ", superficie=" + superficie + ", moneda=" + moneda + '}';
    }

    @Override
    public int compareTo(Pais p) {
       return this.nombre.compareToIgnoreCase(p.nombre);    
    }
    
    
    
}
