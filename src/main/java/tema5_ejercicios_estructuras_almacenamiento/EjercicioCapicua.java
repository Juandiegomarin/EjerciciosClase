package tema5_ejercicios_estructuras_almacenamiento;

import java.util.Scanner;

public class EjercicioCapicua {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numero;

        System.out.println("Introduce un número para comprobar si es capicua");
        numero = entrada.nextInt();

        System.out.println("Es el numero " + numero + " capicua");
        System.out.println(comprobarCapicua(numero));

    }

    public static boolean comprobarCapicua(int n) {

        boolean resultado = true;
        String numeroString = String.valueOf(n);
        int contadorAtras = numeroString.length() - 1;

        for (int i = 0; i < numeroString.length(); i++) {

            if (numeroString.length() % 2 != 0) {

                if (numeroString.charAt(i) != numeroString.charAt(contadorAtras)) {

                    resultado = false;

                }

            } else {

                if (numeroString.indexOf(i) == numeroString.indexOf(contadorAtras)) {

                    break;

                }

                if (numeroString.charAt(i) != numeroString.charAt(contadorAtras)) {

                    resultado = false;

                }

            }

            contadorAtras--;
        }
        return resultado;
    }

}
