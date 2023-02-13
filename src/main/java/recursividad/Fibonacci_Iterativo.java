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
        
        int[]fibo=new int[numero+1];
        fibo[0]=0;
        for (int i = 1; i < numero+1; i++) {

            if (numero == 0) {

                resultado = 0;
                
                break;
            } else {
                
                resultado = aux0 + aux1;
                fibo[i]=resultado;
                aux1 = aux0;
                aux0 = resultado;
            }

        }

        for (int i = 0; i < fibo.length; i++) {
            System.out.println(fibo[i]);
            
        }
    }

}
