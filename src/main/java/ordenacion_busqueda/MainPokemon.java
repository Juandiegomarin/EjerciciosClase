
package ordenacion_busqueda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;


public class MainPokemon {

    
    public static void main(String[] args) {
        
        List<Pokemon> pokedex= new ArrayList<>();
        
        Pokemon p1= new Pokemon("Bulbasour", 1, 0.7, 6.9);
        Pokemon p2= new Pokemon("Charmander",4,0.6,8.5);
        Pokemon p3= new Pokemon("Squirtle",7,0.5,9.0);
        Pokemon p4= new Pokemon("Mewtwo",150,2.0,122.00);
        
        
        pokedex.add(p4);
        pokedex.add(p1);
        pokedex.add(p2);
        pokedex.add(p3);
        
        pokedex.forEach(System.out::println);
        
        Collections.sort(pokedex);
        System.out.println("---------------------");
        pokedex.forEach(System.out::println);
        
        
        Comparator<Pokemon>ordenarNombre=(o1, o2) -> o1.getNombre().compareTo(o2.getNombre());
        Comparator<Pokemon>ordenarPeso=(o1, o2) -> Double.compare(o1.getPeso(), o2.getPeso());
        Comparator<Pokemon>ordenarAltura=(o1, o2) -> Double.compare(o1.getAltura(), o2.getAltura());
        
        Collections.sort(pokedex,ordenarNombre);
        System.out.println("---------------------");
        pokedex.forEach(System.out::println);
        
        
        Collections.sort(pokedex,ordenarPeso);
        System.out.println("---------------------");
        pokedex.forEach(System.out::println);
        
        Collections.sort(pokedex,ordenarAltura);
        System.out.println("---------------------");
        pokedex.forEach(System.out::println);
    }
    
}
