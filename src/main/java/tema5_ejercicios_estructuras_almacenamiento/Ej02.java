package tema5_ejercicios_estructuras_almacenamiento;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ej02 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int numeroPersonas;
        int[] alturaPersona;
        int contador = 0;
        int suma = 0;
        boolean seguir = true;
        System.out.println("Indica a cuantas personas vamos a medir");
        numeroPersonas = entrada.nextInt();

        alturaPersona = new int[numeroPersonas];

        for (int i = 0; i < alturaPersona.length; i++) {
            contador++;
            do {
                System.out.println("Introduce la altura de la persona " + contador);
                try {

                    alturaPersona[i] = Math.abs(entrada.nextInt());
                    if (alturaPersona[i] != 0) {
                        seguir = false;
                    } else {
                        System.out.println("La altura no puede ser 0");
                        seguir=true;
                    }

                } catch (InputMismatchException ime) {
                    System.out.println("No has puesto un número");
                }
                entrada.nextLine();
            } while (seguir);

            suma += alturaPersona[i];

        }

        double media = ((double) suma / alturaPersona.length);

        System.out.println("La media de alturas es: " + media + "cm");

        for (int i = 0; i < alturaPersona.length; i++) {

            if (alturaPersona[i] > media) {

                System.out.println("La persona " + (i + 1) + " con altura " + alturaPersona[i] + "cm tiene"
                        + " altura mayor a la media");
            } else if (alturaPersona[i] < media) {
                System.out.println("La persona " + (i + 1) + " con altura " + alturaPersona[i] + "cm tiene"
                        + " altura menor a la media");
            } else {
                System.out.println("La persona " + (i + 1) + " con altura " + alturaPersona[i] + "cm tiene"
                        + " altura justo en la media");
            }

        }

    }

}
