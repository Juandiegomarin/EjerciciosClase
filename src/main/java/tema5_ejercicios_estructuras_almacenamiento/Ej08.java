/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema5_ejercicios_estructuras_almacenamiento;

public class Ej08 {

    public static void main(String[] args) {

        int[] listaNumeros = new int[utilidades.Utilidades.filtrarNumeroEnteroSccaner("Introduce el numero")];
        System.out.println("Estos son los valores del array");
        for (int i = 0; i < listaNumeros.length; i++) {
            listaNumeros[i] = utilidades.Utilidades.numeroEnteroRandom(1, 5);
            if (i < listaNumeros.length - 1) {

                System.out.print("[" + listaNumeros[i] + "]" + "-");
            } else {
                System.out.print("[" + listaNumeros[i] + "]");
            }
        }

        System.out.println("");

        for (int i = 0; i < listaNumeros.length; i++) {

            for (int j = 0; j < listaNumeros[i]; j++) {

                System.out.print("*");
            }
            System.out.println("");
        }

    }

}
