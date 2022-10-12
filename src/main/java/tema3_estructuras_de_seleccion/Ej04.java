
package tema3_estructuras_de_seleccion;

import java.util.Scanner;


public class Ej04 {

    
    public static void main(String[] args) {
        
         Scanner entrada = new Scanner(System.in);

                System.out.print("Introduce tu edad:");

                int edad = entrada.nextInt();

                String resultado=(edad<18)?"Es menor de edad":"Es mayor de edad";
                System.out.println(resultado);

                System.out.print("Mostrar la edad: ");
                System.out.println(edad);

    }
    
}
