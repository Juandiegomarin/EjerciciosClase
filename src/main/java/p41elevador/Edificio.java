
package p41elevador;

import java.time.LocalDate;


public class Edificio {

    
    public static void main(String[] args) {
        
        
        
        Elevador e1= new Elevador("Juan Diego", 8, 500.00);
        Elevador e2= new Elevador("Juan Diego", -1, -300.00);
        
        
        System.out.println("¿Se mueve e1 con estos parámetros?");
        System.out.println(e1.mover(5, 400.00, 10));
        System.out.println(e1);
        
        System.out.println("--------------------------------------------------");
        
        System.out.println("¿Se mueve e1 con estos parámetros?");
        System.out.println(e1.mover(5, 400.00, 5));
        System.out.println(e1);
        
        System.out.println("--------------------------------------------------");
        
        System.out.println("¿Se mueve e2 con estos parámetros?");
        System.out.println(e2.mover(2, 100, 5));
        System.out.println(e2);
        
        System.out.println("--------------------------------------------------");
        
        System.out.println("¿Se mueve e1 con estos parámetros?");
        System.out.println(e1.mover(7, 499.99, 1));
        System.out.println(e1);
        
        System.out.println("--------------------------------------------------");
        
        System.out.println("El ultimo movimiento del elevador e1 fue: "+e1.getEstado().getEstado());
        
        System.out.println("La proxima fecha de revision de el elevador e1 será: "+Edificio.obtenerProximaRevision(e1));
        
        System.out.println("--------------------------------------------------");

        System.out.println("La proxima fecha de revision de el elevador e2 será: "+Edificio.obtenerProximaRevision(e2));
        
    }
    public static LocalDate obtenerProximaRevision(Elevador elevador){
    
    
    return elevador.getFechaUltimaRevision().plusMonths(6);
    }
}
