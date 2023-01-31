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

    private SortedMap<String, Double> lista;

    public ListaDePremios() {
        this.lista = new TreeMap<>();

        for (int i = 0; i < 10; i++) {

            lista.put(new Numero().getNumero(), new Premio().getPrecio());
        }

    }

    public SortedMap<String, Double> getLista() {
        return lista;
    }
    
    public double saberPremio(String key){
    
    
    
    
    
    return lista.get(key);
    }
    
    public void imprimirLista(){
    
        for (String key : lista.keySet()) {
            System.out.printf("Key %s -- Value %s %n",key , lista.get(key));
        }
    
    
    
    }
}
