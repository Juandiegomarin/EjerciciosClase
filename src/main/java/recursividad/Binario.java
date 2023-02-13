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
public class Binario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Numero");
        int numero = entrada.nextInt();

        String n = "";

        do {

            if (numero % 2 == 0) {

                n += "0";
                numero = numero / 2;
            } else {
                n += "1";
                numero = (numero - 1) / 2;
            }

        } while (numero >= 1);

        String nInvertida = "";

        for (int i = n.length() - 1; i >= 0; i--) {
            // Y vamos concatenando cada carácter a la nueva cadena
            nInvertida += n.charAt(i);
        }

        System.out.println(nInvertida);

    }

}
