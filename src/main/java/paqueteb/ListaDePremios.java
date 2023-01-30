/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paqueteb;

import java.util.SortedMap;
import java.util.TreeMap;

/**
 *
 * @author juand
 */
public class ListaDePremios {

    private SortedMap<Numero, Premio> lista;

    public ListaDePremios() {
        this.lista = new TreeMap<>();

        for (int i = 0; i < 10; i++) {

            lista.put(new Numero(), new Premio());
        }

    }

    public SortedMap<Numero, Premio> getLista() {
        return lista;
    }
    
    public double saberPremio(String key){
    
    
    
    
    
    return lista.get(key).getPrecio();
    }
    
    public void imprimirLista(){
    
        for (Numero key : lista.keySet()) {
            System.out.printf("Key %s -- Value %s %n",key.getNumero() , lista.get(key).getPrecio());
        }
    
    
    
    }
}
