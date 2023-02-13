/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema6_herencia_vehiculo;

import java.util.Objects;

/**
 *
 * @author juandi
 */
public abstract class Vehiculo {
    
    
    
    
    private String nombre;
    private String matricula;
    private String bastidor;
    private int cv;

    public Vehiculo() {
    }

    public Vehiculo(String nombre, String matricula, String bastidor, int cv) {
        this.nombre = nombre;
        this.matricula = matricula;
        this.bastidor = bastidor;
        this.cv = cv;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getBastidor() {
        return bastidor;
    }

    public void setBastidor(String bastidor) {
        this.bastidor = bastidor;
    }

    public int getCv() {
        return cv;
    }

    public void setCv(int cv) {
        this.cv = cv;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.bastidor);
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
        final Vehiculo other = (Vehiculo) obj;
        return Objects.equals(this.bastidor, other.bastidor);
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "nombre=" + nombre + ", matricula=" + matricula + ", bastidor=" + bastidor + ", cv=" + cv + '}';
    }
    
    
    
    
    
    
}
