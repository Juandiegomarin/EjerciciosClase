
package ejercicio_7a;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;



public class Main {

    
    public static void main(String[] args) {
        
        
        List<String> puntosCardinales= new ArrayList<>();
                
        String fichero= "localizaciones.txt";
        
        puntosCardinales= ServiciosFicheros.anadirCardinalLista(fichero);
        
        
        
        
        System.out.println("-----------------------------------------");
        System.out.println("Puntos Cardinales en la lista");
        puntosCardinales.forEach(System.out::println);
        System.out.println("-----------------------------------------");
        
        
        Map<String,Integer> mapPuntosCardinales= ServiciosFicheros.mapAPartirLista(puntosCardinales);
        
        
        
        
        System.out.println("----------------------------------------------------");
        System.out.println("Recorrer Map");
        for (Map.Entry<String, Integer> entry : mapPuntosCardinales.entrySet()) {
            System.out.println("Localizacion: "+ entry.getKey()+" Repeticiones: "+entry.getValue());
            
            
        }
        
         System.out.println("----------------------------------------------------");
        
        
        String nuevoTexto="MapCardinales.txt";
        
       ServiciosFicheros.leerTextoAPartirMap(mapPuntosCardinales, nuevoTexto);
       
        
    }
    
    
   
}
