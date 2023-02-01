/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_5g;

import java.util.SortedMap;
import java.util.TreeMap;

/**
 *
 * @author juand
 */
public class PaqueteBListaDePremios {

    private SortedMap<String, Double> lista;

    public PaqueteBListaDePremios() {
        this.lista = new TreeMap<>();

        for (int i = 0; i < 1000; i++) {

            lista.put(new PaqueteBNumero().getNumero(), new PaqueteBPremio().getPrecio());
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
