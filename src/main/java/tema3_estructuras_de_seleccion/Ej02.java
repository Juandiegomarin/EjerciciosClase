
package tema3_estructuras_de_seleccion;

import java.util.Scanner;


public class Ej02 {

    
    public static void main(String[] args) {
        
        Scanner entrada= new Scanner(System.in);
        
        int numero=135;
        int x;
        int entero;
        
        System.out.println("Introduce el numero a valorar");
        x= entrada.nextInt();
        
        String apartadoA=(x < numero) ? "X es menor que 135": "X es mayor que 135";

        String apartadoB=(x <=0) ? "X es menor que 0": "X es mayor que 0";
        
        
        
        System.out.println(apartadoA);
        System.out.println(apartadoB);
        
        System.out.println("Introduce u numero entero para calcular su valor absoluto");
        entero=entrada.nextInt();
        
        if (entero<0) {
            
            entero=entero*(-1);
            
            System.out.println("EL valor absoluto del numero es: "+entero);
        }
        
    }
    
}
