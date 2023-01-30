
package ejercicio_5f;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 *
 * @author juand
 */
public class EjercitoOrdenado {
    
    private SortedSet<Soldado> ejercito;

    public EjercitoOrdenado() {
        this.ejercito = new TreeSet<>();
    }

    public Set<Soldado> getEjercito() {
        return ejercito;
    }

    public void setEjercito(SortedSet<Soldado> ejercito) {
        this.ejercito = ejercito;
    }
    
    public int miembrosEjercito() {

        return ejercito.size();

    }

    public void alistarSoldado(Soldado s) {

        ejercito.add(s);

    }
    
    public boolean estaVacio() {

        return ejercito.size() == 0;
    }

    public boolean estaSoldado(int nif) {

     Soldado aux= new Soldado();
     aux.setNif(nif);
     return   ejercito.contains(aux);
        
        
    }
    
    public ArrayList<Soldado> guardarArrayList(){
    
        ArrayList<Soldado> soldados= new ArrayList<>();
    
        for (Soldado soldado : ejercito) {
            soldados.add(soldado);
        }
        Collections.sort(soldados);
        return soldados;
    }
    
    public void desalistarSoldado(int nif){
        
        
        Soldado aux= new Soldado();
        aux.setNif(nif);
        
        ejercito.remove(aux);
        
    }
    
    
}
