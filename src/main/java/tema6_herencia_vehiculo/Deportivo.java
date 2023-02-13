
package tema6_herencia_vehiculo;


public class Deportivo extends Vehiculo{
    
    private boolean descapotado;

    public Deportivo(boolean descapotado) {
        this.descapotado = descapotado;
    }

    public Deportivo(boolean descapotado, String nombre, String matricula, String bastidor, int cv) {
        super(nombre, matricula, bastidor, cv);
        this.descapotado = descapotado;
    }

    public boolean isDescapotado() {
        return descapotado;
    }

    public void setDescapotado(boolean descapotado) {
        this.descapotado = descapotado;
    }

    @Override
    public String toString() {
        return "Deportivo{" + "descapotado=" + descapotado + '}';
    }
    
    
    
}
