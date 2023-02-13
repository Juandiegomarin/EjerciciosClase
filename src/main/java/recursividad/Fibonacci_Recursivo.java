/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package recursividad;

import java.util.Scanner;

public class Fibonacci_Recursivo {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int n = entrada.nextInt();
        System.out.println("Numero");
        System.out.println(fibonacci(n));

    }

    public static int fibonacci(int numero) {

        if (numero < 2) {

            return numero;
        }  else {

            return fibonacci(numero - 1) + fibonacci(numero - 2);

        }

    }

}
