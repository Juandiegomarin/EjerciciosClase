/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_6c;


public final class LibroDigital extends Libro implements SeDescarga{
    
    private double numKBytes;

    public LibroDigital() {
    }

    public LibroDigital(double numKBytes, String isbn, String codigo, double precio, double iva, String descripcion) {
        super(isbn, codigo, precio, iva, descripcion);
        this.numKBytes = numKBytes;
    }

    public double getNumKBytes() {
        return numKBytes;
    }

    public void setNumKBytes(double numKBytes) {
        this.numKBytes = numKBytes;
    }

    @Override
    public String toString() {
        return super.toString() + "numKBytes=" + numKBytes + '}';
    }

    @Override
    public void descargar() {
        System.out.println("http://JuanDiegoMarin.daw/"+this.hashCode());
    }

    @Override
    public void dejarDeLeer() {
        System.out.println("Se ha cerrado la aplicacion donde se encuentra el libro");
    }
    
    
}
