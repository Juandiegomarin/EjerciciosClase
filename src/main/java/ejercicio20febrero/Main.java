
package ejercicio20febrero;

import java.util.ArrayList;
import java.util.List;


public class Main {

    
    public static void main(String[] args) {
        
        List<Mamifero> animales= new ArrayList<>();
        
        MamiferoVolador m1= new MamiferoVolador(0, "Murcielago", 0, 0, Alimentacion.INSECTIVORO);
        MamiferoMarino m2= new MamiferoMarino(0, "Ballena", 0, 0, Alimentacion.OMNIVORO);
        MamiferoMarino m3= new MamiferoMarino(0, "Delfin", 0, 0, Alimentacion.OMNIVORO);
    
        animales.add(m1);
        animales.add(m2);
        animales.add(m3);
        
        for (Mamifero mamifero : animales) {
            
            //Conversion implicita ejecuta el metodo comer
            //dependiendo de la isntancia del objeto en ese momento
            //en estecaso tiene el mismo codigo para ambas subclases
            mamifero.comer();
            
            
            if(mamifero instanceof MamiferoVolador){
            ((MamiferoVolador) mamifero).volar();
            //Conversion explícita para ejecutar el metodo de la clase en la que se encuentra
            }
            
            if(mamifero instanceof MamiferoMarino){
            ((MamiferoMarino) mamifero).nadar();
            
            }
            System.out.println("");
        }
        
        
        for (Mamifero animal : animales) {
            System.out.println(animal);
        }
        System.out.println("--------------------------------");
        
        animales.sort((o1, o2) -> o1.getNombre().compareTo(o2.getNombre()));
        
        
        for (Mamifero animal : animales) {
            System.out.println(animal);
        }
    }
    
}
