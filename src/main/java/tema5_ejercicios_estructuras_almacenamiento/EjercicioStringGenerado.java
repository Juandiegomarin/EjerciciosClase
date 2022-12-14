package tema5_ejercicios_estructuras_almacenamiento;

import java.util.Scanner;

public class EjercicioStringGenerado {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        char[] mayusculas = new char[27];
        int longitudCadena;

        rellenarArrayMayusculas(mayusculas);
        imprimirArray(mayusculas);

        System.out.println("La cadena generada es " + generarString(mayusculas));

        System.out.println("Vamos a crear un array de cadenas,¿Cuantas cadenas quieres?");
        longitudCadena = entrada.nextInt();
        crearArrayCadenas(longitudCadena, mayusculas);

    }

    public static void rellenarArrayMayusculas(char[] list) {

        char primeraLetra = 65;

        for (int i = 0; i < list.length; i++) {

            list[i] = primeraLetra;

            if (primeraLetra == 78) {
                list[i] = primeraLetra;
                list[i + 1] = 'Ñ';
                i++;
            }
            primeraLetra++;

        }

    }

    public static void imprimirArray(char[] list) {

        for (int i = 0; i < list.length; i++) {

            if (i < list.length - 1) {
                System.out.print("[" + list[i] + "]-");
            } else {
                System.out.println("[" + list[i] + "]");
            }
        }

    }

    public static String generarString(char[] list) {

        String cadena = "";

        int iteraciones = utilidades.Utilidades.numeroEnteroRandom(15, 25);
        char letra;

        for (int i = 0; i < iteraciones; i++) {

            int numero = utilidades.Utilidades.numeroEnteroRandom(0, list.length - 1);
            letra = list[numero];
            cadena = cadena + letra;

        }

        return cadena;

    }

    public static void crearArrayCadenas(int numero, char[] list) {

        String[] listaCadenas = new String[numero];

        for (int i = 0; i < listaCadenas.length; i++) {

            listaCadenas[i] = generarString(list);
            System.out.println(listaCadenas[i]);

        }

    }

}
