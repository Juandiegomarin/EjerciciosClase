/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_6c;

/**
 *
 * @author juandi
 */
public abstract class Ropa extends Producto implements SeEnvia{
    
    private String marca;

    public Ropa() {
    }

    public Ropa(String marca, String codigo, double precio, double iva, String descripcion) {
        super(codigo, precio, iva, descripcion);
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return super.toString() + " marca=" + marca + '}';
    }

    @Override
    public abstract void enviar(String direccion);
    
    
    
    
}
