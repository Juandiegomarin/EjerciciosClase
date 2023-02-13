
package tema6_herencia_vehiculo;


public class Turismo extends Vehiculo {
    
    
    private int asientos;

    public Turismo(int asientos) {
        this.asientos = asientos;
    }

    public Turismo(int asientos, String nombre, String matricula, String bastidor, int cv) {
        super(nombre, matricula, bastidor, cv);
        this.asientos = asientos;
    }

    public int getAsientos() {
        return asientos;
    }

    public void setAsientos(int asientos) {
        this.asientos = asientos;
    }

    @Override
    public String toString() {
        return "Turismo{" + "asientos=" + asientos + '}';
    }
    
    
    
}
