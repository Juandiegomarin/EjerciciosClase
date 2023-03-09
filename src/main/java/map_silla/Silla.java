
package map_silla;


public record Silla(double peso,String nombre) implements Comparable<Silla>{

    @Override
    public int compareTo(Silla o) {
        return this.nombre.compareTo(o.nombre);
    }
    
    
    
    
}
