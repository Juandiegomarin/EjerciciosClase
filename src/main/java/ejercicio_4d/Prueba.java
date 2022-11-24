
package ejercicio_4d;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;


public class Prueba {

    
    public static void main(String[] args) {
        
        
        Animal a1= new Animal(LocalDate.of(2002, Month.NOVEMBER, 21), "Bob", Tipo.GATO, 1000, Estado.DURMIENDO);
        Animal a2= new Animal();
        
        Persona p1= new Persona("Juan Diego",20);
        Persona p2= new Persona("Alberto", 21);
        
        
               System.out.println(a1);
               System.out.println(a2);
               
               Animal a3=Animal.clonarAnimal(a2);
               
               p1.llamar(a1);
               p1.llamar(a2);
               p1.llamar(a3);
               
               p2.jugar(a2, 120);
               
               p1.alimetar(a1, 1000);
               System.out.println(a1);
               p1.jugar(a1, 200);
               System.out.println(a1);
    }
    
}
