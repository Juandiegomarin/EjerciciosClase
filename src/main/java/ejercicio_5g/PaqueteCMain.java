/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_5g;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 *
 * @author juandi
 */
public class PaqueteCMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        SortedMap<Integer, PaqueteCEjercito> ejercitoMap = new TreeMap<>();

        ejercitoMap.put(1, new PaqueteCEjercito("Ejercito 1"));
        ejercitoMap.put(2, new PaqueteCEjercito("Ejercito 2"));
        ejercitoMap.put(3, new PaqueteCEjercito("Ejercito 3"));
        ejercitoMap.put(4, new PaqueteCEjercito("Ejercito 4"));
        ejercitoMap.put(5, new PaqueteCEjercito("Ejercito 5"));

        System.out.println(obtenerEjercitoNombre(1, ejercitoMap));
        
        System.out.println(obtenerListaEjercito(ejercitoMap));

    }

    public static PaqueteCEjercito obtenerEjercitoNombre(int key, SortedMap<Integer, PaqueteCEjercito> map) {

        
        return map.get(key);
        
    }
    public static List obtenerListaEjercito( SortedMap<Integer, PaqueteCEjercito> map) {

        
        return new ArrayList(map.values());
        
    }

}
