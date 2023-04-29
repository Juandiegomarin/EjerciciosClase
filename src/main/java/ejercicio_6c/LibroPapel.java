/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_6c;

/**
 *
 * @author juandi
 */
public final class LibroPapel extends Libro implements SeEnvia{
    
    private int numPaginas;

    public LibroPapel() {
    }

    public LibroPapel(int numPaginas, String isbn, String codigo, double precio, double iva, String descripcion) {
        super(isbn, codigo, precio, iva, descripcion);
        this.numPaginas = numPaginas;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    @Override
    public String toString() {
        return super.toString()+ "numPaginas=" + numPaginas + '}';
    }

    @Override
    public void enviar(String direccion) {
        System.out.println("El libro de papel (LIBRO) se envia a la direccion "+direccion);
    }

    @Override
    public void dejarDeLeer() {
        System.out.println("Se ha cerrado el libro");
    }
    
    
    
}
