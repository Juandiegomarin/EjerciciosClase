/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_6b;

import java.util.Objects;

/**
 *
 * @author Juan Diego
 */
public abstract class Empleado implements Comparable<Empleado> {

    private String nif;
    private String nombre;

    public Empleado() {
    }

    public Empleado(String nif, String nombre) {
        this.nif = nif;
        this.nombre = nombre;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + Objects.hashCode(this.nif);
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
        return Objects.equals(this.nif, other.nif);
    }

    @Override
    public String toString() {
        return "Empleado{" + "nif=" + nif + ", nombre=" + nombre + '}';
    }

    @Override
    public int compareTo(Empleado o) {

        return this.nif.compareTo(o.nif);
    }

}
