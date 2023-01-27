package ejercicio_5f;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class Ejercito {

    private Set<Soldado> ejercito;

    public Ejercito() {
        this.ejercito = new HashSet<>();
    }

    public void setEjercito(Set<Soldado> ejercito) {
        this.ejercito = ejercito;
    }

    public Set<Soldado> getEjercito() {
        return ejercito;
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
