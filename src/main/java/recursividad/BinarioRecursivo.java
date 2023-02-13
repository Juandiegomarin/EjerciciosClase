/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package recursividad;

import java.util.Scanner;

/**
 *
 * @author juandi
 */
public class BinarioRecursivo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Numero");
        int numero = entrada.nextInt();

        

        binario(numero);

    }

    public static void binario(int n) {
        if (n >= 2) { // Ciclo activo
            binario(n / 2);
            System.out.print(n % 2);
        } else {		// Caso base
            System.out.print(n);
        }
    }

}
