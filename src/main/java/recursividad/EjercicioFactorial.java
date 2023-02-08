/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package recursividad;

import java.util.Scanner;

public class EjercicioFactorial {

    public static void main(String[] args) {

//        Scanner entrada = new Scanner(System.in);
//        System.out.println("Introduzca numero");
//        int numero = entrada.nextInt();
//
//        System.out.println("El factorial de el numero " + numero + " es: ");
//
//        if (numero == 0 || numero == 1) {
//            numero = 1;
//            System.out.println(numero);
//
//        } else {
//            for (int i = numero - 1; i > 0; i--) {
//
//                numero = numero * i;
//            }
//            System.out.println(numero);
//
//        }

        System.out.println(recursivo(4));

    }

    public static int recursivo(int n) {

        int numero = Math.abs(n);

        if (n==0||n==1) {
           return 1;
        }else{
        return n*recursivo(n - 1);
        }
        
        
    }
;

}
