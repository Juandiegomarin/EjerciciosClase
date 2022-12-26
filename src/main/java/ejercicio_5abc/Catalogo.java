
package ejercicio_5abc;

import java.util.ArrayList;
import java.util.List;


public class Catalogo<T> {
    
    protected List <T> lista;
    
    //CONSTRUCTOR
    public Catalogo(int longitud) {

        longitud = Math.abs(longitud);

        this.lista = new ArrayList<>(longitud);

    }


    public int getNumeroElementos() {
        return this.lista.size();
    }

    public List<T> getLista() {
        return lista;
    }

    //MOSTRAR LOS VEHICULOS
    public void mostrarCatalogo() {
        for (T t : lista) {
            System.out.println(t);
        }

    }

    //BUSCAR UN VEHICULO DEL CATALOGO
    public int buscarElemento(T t) {        //PRIVADO PQ SOLO LO UTILIZO EN EL METODO DE ABAJO

        if (t != null) {
            for (int i = 0; i < lista.size(); i++) {
                //CAMBIOS PARA QUE NO COJA NULLS
                if (this.lista.get(i)!= null && t.equals(this.lista.get(i))) {
                    return i;
                }
            }
        }

        return -1;
    }

    

    //BORRAR VEHICULO
    public boolean borrarElemento(T t) {

        int pos = buscarElemento(t);

        if (pos >= 0) {
            this.lista.remove(pos);
            return true;
        }

        return false;
    }

    public void anadirElemento(T t) {
        this.lista.add(t);
    }

    //TO STRING
    public String toString() {
        String tmp = "";
        for (T t : this.lista) {
            tmp += t.toString() + "\n";
        }
        return tmp;
    }
    
}
