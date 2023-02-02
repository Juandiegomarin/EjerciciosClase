
package tema5_ejercicios_estructuras_almacenamiento;


public class PilaMain {

    
    public static void main(String[] args) {
        
        
        Pila p = new Pila(5);
        
        p.apilarElemento(1);
        p.apilarElemento(2);
        p.apilarElemento(3);
        p.apilarElemento(4);
        p.apilarElemento(5);
        
        
        System.out.println("-------------------------------------");
        p.imprimirElementosPila();
        System.out.println("-------------------------------------");
        System.out.println("¿Esta vacía?: "+p.estaVacia());
        System.out.println("-------------------------------------");
        System.out.println("¿Esta llena?: "+p.estaLlena());
        System.out.println("-------------------------------------");
        System.out.println("Quitamos elemento");
        p.desapilarElemento();
        p.imprimirElementosPila();
        System.out.println("-------------------------------------");
        System.out.println("¿Esta llena?: "+p.estaLlena());
         System.out.println("-------------------------------------");
        System.out.println("Quitamos elemento");
        p.desapilarElemento();
        p.imprimirElementosPila();
        System.out.println("-------------------------------------");
        System.out.println("Añadimos tres elementos");
        p.apilarElemento(4);
        p.apilarElemento(5);
        p.apilarElemento(6);
        p.imprimirElementosPila();
        System.out.println("-------------------------------------");
        System.out.println("¿Esta llena?: "+p.estaLlena());
    }
    
}
