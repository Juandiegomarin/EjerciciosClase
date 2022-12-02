package tema5_ejercicios_estructuras_almacenamiento;

import java.util.Scanner;

public class Ej07 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int longitud;

        System.out.println("Introduce la longitud de las listas");
        longitud = entrada.nextInt();

        int[] lista1 = new int[longitud];
        int[] lista2 = new int[longitud];
        int[] lista3;

        for (int i = 0; i < lista1.length; i++) {

            lista1[i] = utilidades.Utilidades.numeroEnteroRandom(1, 100);
        }

        System.out.println("Lista 1");
        imprimirLista(lista1);
        System.out.println("");

        for (int i = 0; i < lista2.length; i++) {

            lista2[i] = utilidades.Utilidades.numeroEnteroRandom(1, 100);
        }

        System.out.println("Lista 2");
        imprimirLista(lista2);
        System.out.println("");

        lista3 = crearListaMultiplicados(lista1, lista2);
        System.out.println("Lista 3");
        imprimirLista(lista3);

    }

    public static int[] crearListaMultiplicados(int[] list, int[] list2) {

        int[] listaMulti = new int[list.length];

        for (int i = 0; i < listaMulti.length; i++) {

            listaMulti[i] = list[i] * list2[i];

        }

        return listaMulti;

    }

    public static void imprimirLista(int[] list) {

        for (int i = 0; i < list.length; i++) {

            if (i != list.length - 1) {
                System.out.print(list[i] + ",");
            } else {
                System.out.print(list[i]);
            }
        }

        System.out.println("");

    }

}
