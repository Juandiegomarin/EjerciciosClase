package tema5_ejercicios_estructuras_almacenamiento;

import java.util.ArrayList;
import java.util.Objects;

public class Pila<T> {

    private ArrayList<T> pila;
    private int tamanio;

    public Pila(int tamanio) {
        this.pila = new ArrayList<>(tamanio);
        this.tamanio = tamanio;
    }

    public ArrayList<T> getPila() {
        return pila;
    }

    public void setPila(ArrayList<T> pila) {
        this.pila = pila;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 13 * hash + Objects.hashCode(this.pila);
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
        final Pila other = (Pila) obj;
        return Objects.equals(this.pila, other.pila);
    }

    @Override
    public String toString() {
        return "Pila{" + "lista=" + pila + '}';
    }

    public void apilarElemento(T t) {

        pila.add(t);

        if (pila.size() > tamanio) {
            pila.remove(t);
        }

    }

    public void desapilarElemento() {
        if(!estaVacia()){
        for (int i = pila.size()-1; i >0; i--) {
            
            
            
                pila.remove(i);
                break;
            
        }
        }
    }

    public boolean estaVacia() {

        return pila.isEmpty();

    }

    public boolean estaLlena() {

        

        return pila.size()==tamanio;
    }

    public int numElementosPila() {

        int contador = 0;

        for (int i = 0; i < pila.size(); i++) {

            if (pila.get(i) != null) {
                contador++;
            }

        }

        return contador;

    }

    public void imprimirElementosPila() {

        for (int i = 0; i < pila.size(); i++) {

            if (pila.get(i) != null) {
                System.out.println(pila.get(i));

            }

        }

    }

    public void rellenarPila(T[] lista) {

        pila.clear();

        this.tamanio = lista.length;

        for (int i = 0; i < tamanio; i++) {

            pila.add(lista[i]);

        }

    }

    public T[] sacarElementos() {

        T[] array = (T[]) this.pila.toArray();
        pila.clear();

        return array;

    }

}
