package ejercicio_5g;

import java.util.ArrayList;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class PaqueteATraductor{

    private SortedMap<String,String> palabras;

    public PaqueteATraductor() {
        this.palabras = new TreeMap<>();
    }

    public SortedMap<String, String> getPalabras() {
        return palabras;
    }

    public void setPalabras(SortedMap<String, String> palabras) {
        this.palabras = palabras;
    }

    @Override
    public String toString() {
        return "Traductor{" + "palabras=" + palabras + '}';
    }

    public void anadirPalabra(String key,String value){
    
    
    
    palabras.put(key, value);
    
    
    }
    
    public void imprimirPalabras(){
    
        for (String key : palabras.keySet()) {
            System.out.printf("Key %s -- Value %s %n", key, palabras.get(key));
        }
    
    
    
    }
    
    public ArrayList<String> palabrasEspaniolas(){
    
         ArrayList espaniolas= new ArrayList<>();
         
         for (String key : palabras.keySet()) {
            espaniolas.add(palabras.get(key));
        }
         
         return espaniolas;
    }
    
    public ArrayList<String> palabrasInglesas(){
    
         ArrayList inglesas= new ArrayList<>();
         
         for (String key : palabras.keySet()) {
            inglesas.add(key);
        }
         
         return inglesas;
    }
    
    public void borrarPalabra(String key){
    
    
    palabras.remove(key);
    
    }
    
    public void modificarPalabra(String key,String modificacion){
    
    
        
        palabras.put(key, modificacion);
    
    
    }
    
    public String traduccion(String key){
    
        
    
    
    return palabras.get(key);
    
    
    }

}
