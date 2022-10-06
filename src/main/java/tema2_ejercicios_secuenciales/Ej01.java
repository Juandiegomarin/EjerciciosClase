
package tema2_ejercicios_secuenciales;

import java.util.Scanner;


public class Ej01 {

    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);
        
        double gradosCentigrados;
        double gradosFahrenheit;
        
        
        
        System.out.println("Introduce los grados en centigrados para pasarlo a fahrenheit");
        gradosCentigrados= entrada.nextDouble();
        
        gradosFahrenheit= ((gradosCentigrados *9)/5)+32;
        
        System.out.println("Los grados en Fahrenheit son: "+gradosFahrenheit);
        
    }
    
}
