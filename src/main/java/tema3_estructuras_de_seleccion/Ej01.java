
package tema3_estructuras_de_seleccion;

import java.util.Scanner;


public class Ej01 {

    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

                System.out.print("Introduce tu edad:");

                int edad = entrada.nextInt();

                if (edad >= 18) {
                        System.out.println("Es mayor de edad");
                } else {
                        System.out.println("No es mayor de edad");
                }

                System.out.print("Mostrar la edad: ");
                System.out.println(edad);

        
        
        
        
        
        
        
    }
    
}
