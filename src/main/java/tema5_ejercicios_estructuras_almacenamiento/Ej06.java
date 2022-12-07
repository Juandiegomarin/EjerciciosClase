package tema5_ejercicios_estructuras_almacenamiento;

import java.util.Arrays;

public class Ej06 {

    public static void main(String[] args) {

        int[] lista1 = new int[]{1, 2, 3};
        int[] lista2 = new int[]{1, 2, 3};
        int[] lista3 = new int[]{1, 2, 3, 4};
        int[] lista4 = new int[]{1, 2, 3};
        int[] lista5 = new int[]{1, 2, 3};
        int[] lista6 = new int[]{1, 2, 2};

        System.out.println("¿Son las lista1 y lista2 iguales? " + Arrays.equals(lista1, lista2));
        System.out.println("¿Son las lista1 y lista3 iguales? " + Arrays.equals(lista1, lista3));
        System.out.println("¿Son las lista1 y lista6 iguales? " + Arrays.equals(lista1, lista6));
        
        System.out.println(compararArrays(lista1, lista2));
        System.out.println(compararArrays(lista1, lista3));
        System.out.println(compararArrays(lista1, lista6));

    }

    public static boolean compararArrays(int[] array1, int[] array2) {

        boolean resultado = true;
        int contador = 0;
        if (array1.length != array2.length) {

            resultado = false;
        } else if (array1.length == array2.length) {

            for (int i = 0; i < array1.length; i++) {

                if (array1[i] != array2[i]) {

                    resultado=false;
                    break;
                }

            }

        }
    
        return resultado;
    }
}
