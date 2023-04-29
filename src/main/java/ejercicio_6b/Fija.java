
package ejercicio_6b;

import java.util.ArrayList;


public class Fija extends Sala {
    
    private boolean estado;

    public Fija(boolean estado, ArrayList<Obra> obras, ArrayList<Sensor> sensores) {
        super(obras, sensores);
        this.estado = estado;
    }

    public Fija() {
        
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Fija{" + "estado=" + estado + '}';
    }
    
    
    
    
    
}
