package ejercicio_5f;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Ejercito {

    private Set<Soldado> ejercito;

    public Ejercito() {
        this.ejercito = new HashSet<>();
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

        Collections.sort((List) ejercito);

        int posicion = Collections.binarySearch((List) ejercito, nif);
        if (posicion < 0) {
            return false;
        } else {
            return true;
        }
    }

}
