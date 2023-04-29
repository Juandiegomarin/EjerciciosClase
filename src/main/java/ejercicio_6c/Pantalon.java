
package ejercicio_6c;


public final class Pantalon extends Ropa {
    
    private String talla;

    public Pantalon() {
    }

    public Pantalon(String talla, String marca, String codigo, double precio, double iva, String descripcion) {
        super(marca, codigo, precio, iva, descripcion);
        this.talla = talla;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    @Override
    public String toString() {
        return super.toString()+ " talla=" + talla + '}';
    }

    @Override
    public void enviar(String direccion) {
        System.out.println("El pantalon (ROPA) se envia a la direccion "+direccion);
    }
    
    
    
}
