
package tema2_ejercicios_secuenciales;

import java.util.Scanner;


public class Ej07 {

    
    public static void main(String[] args) {
        
        
        
        Scanner entrada = new Scanner (System.in);
        
        double euros;
        double dolares;
        
        System.out.println("Introduce el valor en euros");
        euros=entrada.nextDouble();
        
        
        dolares=euros*0.987434; 
        System.out.println("El valor en dolares es: "+dolares+"$");
        
        
    }
    
}
