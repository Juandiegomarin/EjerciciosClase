
package ejercicio_3d;

import java.util.Scanner;


public class InversorPalabras {

    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        String palabra;
        String palabraInvertida="";
        
        System.out.println("Programa que invierte palabras");
        
        do {      
            
            System.out.println("Introduce una palabra");
            
            palabra=entrada.nextLine();
            
            
           
            
            for (int i = palabra.length()-1; i >= 0; i--) {
                
                
                
                palabraInvertida=palabraInvertida+palabra.charAt(i);
            }
            
            System.out.println("La palabra "+palabra+" invertida es "+palabraInvertida);
            
        } while (!palabra.equalsIgnoreCase("salir"));
        
    }
    
}
