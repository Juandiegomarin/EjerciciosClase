/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package recursividad;

import java.util.Scanner;

public class Fibonacci_Iterativo {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numero = 0;

        int aux0 = 0;
        int aux1 = 1;
        int resultado = 0;

        System.out.println("Numero");
        numero = entrada.nextInt();

        for (int i = 0; i < numero; i++) {

            if (numero == 0) {

                resultado = 0;
                break;
            } else {
                resultado = aux0 + aux1;
                aux1 = aux0;
                aux0 = resultado;
            }

        }

        System.out.println(resultado);
    }

}
