/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_6c;

import java.util.Objects;

/**
 *
 * @author juandi
 */
public abstract class Producto {
    
    private String codigo;
    private double precio;
    private double iva;
    private String descripcion;

    public Producto() {
    }

    public Producto(String codigo, double precio, double iva, String descripcion) {
        this.codigo = codigo;
        this.precio = precio;
        this.iva = iva;
        this.descripcion = descripcion;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.codigo);
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
        final Producto other = (Producto) obj;
        return Objects.equals(this.codigo, other.codigo);
    }
    
    

    @Override
    public String toString() {
        return "Producto{" + "codigo=" + codigo + ", precio=" + precio + ", iva=" + iva + ", descripcion=" + descripcion + '}';
    }

    
    
    
    
}
