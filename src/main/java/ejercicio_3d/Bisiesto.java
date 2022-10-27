package ejercicio_3d;

import java.util.Scanner;

public class Bisiesto {

    public static void main(String[] args) {

        //Bucle hasta que el usuario introduzca 0
        //Si introduce un año negativo se convierte en positivo
        //Condiciones , para que sea bisiesto , divisible entre 4 
        //y no divisible entre 100 o divisible entre 400
        Scanner entrada = new Scanner(System.in);

        int anio;

        System.out.println("Programa que calcula si un año es bisiesto");
        do {

            System.out.println("Introduce un año");
            anio = entrada.nextInt();

            if (anio == 0) {
                System.out.println("Programa terminado");
            } else {
                if (anio < 0) {
                    anio = Math.abs(anio);
                }

                if (anio % 4 == 0 && (anio % 100 != 0 || anio % 400 == 0)) {
                    System.out.println("El año " + anio + " es bisiesto");
                } else {
                    System.out.println("No es bisiesto");
                }
            }
        } while (anio != 0);

    }

}
