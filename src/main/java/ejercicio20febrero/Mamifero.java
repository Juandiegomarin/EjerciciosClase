/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio20febrero;

import java.util.Objects;

/**
 *
 * @author juand
 */
public abstract class Mamifero {

    private String nombre;
    private double peso;
    private int altura;
    private Alimentacion tipoAlimentacion;

    public Mamifero(String nombre, double peso, int altura, Alimentacion tipoAlimentacion) {
        this.nombre = nombre;
        this.peso = peso;
        this.altura = altura;
        this.tipoAlimentacion = tipoAlimentacion;
    }

    public Mamifero() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public Alimentacion getTipoAlimentacion() {
        return tipoAlimentacion;
    }

    public void setTipoAlimentacion(Alimentacion tipoAlimentacion) {
        this.tipoAlimentacion = tipoAlimentacion;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.nombre);
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.peso) ^ (Double.doubleToLongBits(this.peso) >>> 32));
        hash = 37 * hash + this.altura;
        hash = 37 * hash + Objects.hashCode(this.tipoAlimentacion);
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
        final Mamifero other = (Mamifero) obj;
        if (Double.doubleToLongBits(this.peso) != Double.doubleToLongBits(other.peso)) {
            return false;
        }
        if (this.altura != other.altura) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return this.tipoAlimentacion == other.tipoAlimentacion;
    }

    @Override
    public String toString() {
        return "Mamifero{" + "nombre=" + nombre + ", peso=" + peso + ", altura=" + altura + ", tipoAlimentacion=" + tipoAlimentacion + ", ";
    }

    

    public abstract void comer();

}
