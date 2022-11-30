
package ejercicio_4e;


public class Prueba {

   
    public static void main(String[] args) {
        
        
        Persona p1= new Persona("Juan Diego", 20);
        
        Cafetera miCafetera= new Cafetera(2000.00, 500.00);
        Cafetera cafeteraPersona= new Cafetera(1500.00);
        
        System.out.println("Cafetera estado inicial");
        System.out.println(miCafetera);
        System.out.println("");
        System.out.println("");
        
        System.out.println("Añadiendo cantidad posible");
        miCafetera.rellenarCafetera(700.00);
        System.out.println(miCafetera);
        System.out.println("");
        System.out.println("");
        
        System.out.println("Añadiendo cantidad que supera la a capacidadMaxima");
        miCafetera.rellenarCafetera(1000.00);
        System.out.println(miCafetera);
        System.out.println("");
        System.out.println("");
        
        System.out.println("Sirviendo taza con cantidad aceptable");
        miCafetera.servirTaza(500.00);
        System.out.println(miCafetera);
        System.out.println("");
        System.out.println("");
        
        System.out.println("Sirviendo taza con cantidad superando la capacidadMinima");
        miCafetera.servirTaza(1600.00);
        System.out.println(miCafetera);
        System.out.println("");
        System.out.println("");
        
        System.out.println("Llenando la cafetera");
        miCafetera.llenarCafetera();
        System.out.println(miCafetera);
        System.out.println("");
        System.out.println("");
        
        System.out.println("Pruebas con los metodos de persona y otra cafetera");
        System.out.println("La cafetera de la persona en estado inicial");
        System.out.println(cafeteraPersona);
        System.out.println("");
        
        System.out.println("Bebiendo capacidad aceptable");
        p1.beberCafe(cafeteraPersona, 1000.00);
        System.out.println(cafeteraPersona);
        System.out.println("");
        
        System.out.println("Bebiendo mas de la capacidad minima");
        p1.beberCafe(cafeteraPersona, 600.00);
        System.out.println(cafeteraPersona);
        System.out.println("");
        System.out.println("");
        
        System.out.println("Haciendo cafe");
        p1.hacerCafe(cafeteraPersona);
        System.out.println(cafeteraPersona);
        
        
    }
    
}
