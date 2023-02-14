
package repaso_matrices;

/**
 *
 * @author juand
 */
public class Tren {
    
    private int id;
    private int numeroVagones;
    private int pasajerosPorVagon;

    public Tren() {
    }
    
    

    public Tren(int id, int numeroVagones, int pasajerosPorVagon) {
        this.id = id;
        this.numeroVagones = numeroVagones;
        this.pasajerosPorVagon = pasajerosPorVagon;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumeroVagones() {
        return numeroVagones;
    }

    public void setNumeroVagones(int numeroVagones) {
        this.numeroVagones = numeroVagones;
    }

    public int getPasajerosPorVagon() {
        return pasajerosPorVagon;
    }

    public void setPasajerosPorVagon(int pasajerosPorVagon) {
        this.pasajerosPorVagon = pasajerosPorVagon;
    }

    @Override
    public String toString() {
        return "Tren{" + "id=" + id + ", numeroVagones=" + numeroVagones + ", pasajerosPorVagon=" + pasajerosPorVagon + '}';
    }
    
    
    
    
}
