
package ejercicio_5g;


public class PaqueteBPremio {
    
    private int precio;

    public PaqueteBPremio() {
        this.precio =utilidades.Utilidades.numeroEnteroRandom(0, 1000);
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.precio) ^ (Double.doubleToLongBits(this.precio) >>> 32));
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
        final PaqueteBPremio other = (PaqueteBPremio) obj;
        return Double.doubleToLongBits(this.precio) == Double.doubleToLongBits(other.precio);
    }

    @Override
    public String toString() {
        return "Premio{" + "precio=" + precio + '}';
    }
    
    
    
    
    
    
    
}
