/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ordenacion_busqueda;

/**
 *
 * @author juandi
 */
public class Pokemon implements Comparable<Pokemon> {
    
    
    private String nombre;
    private int numPokedex;
    private double altura;
    private double peso;

    public Pokemon() {
    }

    public Pokemon(String nombre, int numPokedex, double altura, double peso) {
        this.nombre = nombre;
        this.numPokedex = numPokedex;
        this.altura = altura;
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumPokedex() {
        return numPokedex;
    }

    public void setNumPokedex(int numPokedex) {
        this.numPokedex = numPokedex;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + this.numPokedex;
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
        final Pokemon other = (Pokemon) obj;
        return this.numPokedex == other.numPokedex;
    }

    @Override
    public String toString() {
        return "Pokemon{" + "nombre=" + nombre + ", numPokedex=" + numPokedex + ", altura=" + altura + ", peso=" + peso + '}';
    }

    @Override
    public int compareTo(Pokemon p) {
        return this.numPokedex-p.getNumPokedex();
    }
    
    
    
    
}
