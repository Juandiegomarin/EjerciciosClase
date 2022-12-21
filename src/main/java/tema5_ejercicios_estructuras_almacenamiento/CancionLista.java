package tema5_ejercicios_estructuras_almacenamiento;

import java.util.ArrayList;
import java.util.Collections;

public class CancionLista {

    private ArrayList<Cancion> canciones;

    public CancionLista(ArrayList<Cancion> canciones) {
        this.canciones = canciones;
    }

    public int numeroCanciones() {

        return this.canciones.size();

    }

    public boolean estaVacia() {

        return this.canciones.size() < 1;

    }

    public Cancion escucharCancion(int pos) {

        return this.canciones.get(pos);

    }

    public void cambiarCancion(int pos, Cancion c) {

        this.canciones.set(pos, c);

    }

    public void grabarCancion(Cancion c) {

        this.canciones.add(c);

    }

    public void eliminaCancion(int pos) {

        this.canciones.remove(pos);

    }

    public void eliminaCancion(Cancion c) {

        this.canciones.remove(c);

    }

    public void imprimirLista() {

        for (int i = 0; i < this.canciones.size(); i++) {

            System.out.println(this.canciones.get(i));

        }

    }

    public int buscarCancion(Cancion c) {

        return this.canciones.indexOf(c);

    }

    public void ordenarlistaNombre() {

        this.canciones.sort((Cancion c1, Cancion c2) -> c1.getNombre().compareTo(c2.getNombre()));

    }

    public void ordenarlistaCantante() {

        this.canciones.sort((Cancion c1, Cancion c2) -> c1.getCantante().compareTo(c2.getCantante()));

    }

}
