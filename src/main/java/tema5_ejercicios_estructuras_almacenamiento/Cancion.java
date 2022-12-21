
package tema5_ejercicios_estructuras_almacenamiento;

import java.util.Objects;


public class Cancion {
    
    
    private String nombre;
    private String cantante;
    private String genero;
    private double tiempoCancion;

    public Cancion(String nombre, String cantante, String genero, double tiempoCancion) {
        this.nombre = nombre;
        this.cantante = cantante;
        this.genero = genero;
        this.tiempoCancion = tiempoCancion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCantante() {
        return cantante;
    }

    public void setCantante(String cantante) {
        this.cantante = cantante;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public double getTiempoCancion() {
        return tiempoCancion;
    }

    public void setTiempoCancion(double tiempoCancion) {
        this.tiempoCancion = tiempoCancion;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + Objects.hashCode(this.nombre);
        hash = 59 * hash + Objects.hashCode(this.cantante);
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
        final Cancion other = (Cancion) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return Objects.equals(this.cantante, other.cantante);
    }

    @Override
    public String toString() {
        return "Cancion{" + "nombre=" + nombre + ", cantante=" + cantante + ", genero=" + genero + ", tiempoCancion=" + tiempoCancion + '}';
    }
    
    
    
    
}
