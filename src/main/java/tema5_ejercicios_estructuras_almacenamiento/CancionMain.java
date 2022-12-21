
package tema5_ejercicios_estructuras_almacenamiento;

import java.util.ArrayList;


public class CancionMain {

    
    public static void main(String[] args) {
        
        
        ArrayList <Cancion> canciones= new ArrayList();
        
        Cancion c1= new Cancion("Volar", "Diego", "Pop", 0);
        Cancion c2= new Cancion("Soñar", "Pepe", "Pop", 0);
        Cancion c3= new Cancion("Comer", "Jesus", "Pop", 0);
        Cancion c4= new Cancion("Andar", "Zacarias", "Pop", 0);
        
        canciones.add(c1);
        canciones.add(c2);
        canciones.add(c3);
        canciones.add(c4);
        
        
        CancionLista lista= new CancionLista(canciones);
        
        lista.imprimirLista();
        lista.ordenarlistaNombre();
        System.out.println("");
        lista.imprimirLista();
        
        
    }
    
}
