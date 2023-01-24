package tema5_ejercicios_estructuras_almacenamiento;

import java.util.Scanner;

public class Vecinas {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int[][] matriz;

        int dimension;

        int fila;
        int columna;

        System.out.println("Indica la dimension de la matriz");
        dimension = entrada.nextInt();
        matriz = new int[dimension][dimension];

        utilidades.Utilidades.rellenarMatrizEnteros(matriz, 0, 10);
        utilidades.Utilidades.imprimirMatrizEnteros(matriz);

        System.out.println("Indica las coordenadas de la casilla de las que quieras buscar las vecinas");
        System.out.println("Fila");
        fila = entrada.nextInt();
        System.out.println("Columna");
        columna = entrada.nextInt();

        Coordenada c = new Coordenada(fila, columna);

        mostrarVecinas(c, matriz);

        System.out.println("-------------------------------");
        mostrarVecinasRecorrer(matriz, c);
    }

    public static void mostrarVecinas(Coordenada c, int[][] matriz) {

        System.out.println("En la fila de arriba");
        if (c.fila() - 1 < 0) {
            System.out.println("No tiene vecionos en la fila superior\n");
        } else {
            System.out.println("Arriba izquierda");
            if (c.columna() - 1 < 0 || c.fila() - 1 < 0) {
                System.out.println("No tiene vecina ahi" + "\n");
            } else {
                System.out.println(matriz[c.fila() - 1][c.columna() - 1] + "\n");
            }

            System.out.println("Arriba");
            if (c.fila() - 1 < 0) {
                System.out.println("No tiene vecina ahi" + "\n");
            } else {
                System.out.println(matriz[c.fila() - 1][c.columna()] + "\n");
            }

            System.out.println("Arriba derecha");
            if (c.columna() + 1 > matriz[c.columna()].length - 1 || c.fila() - 1 < 0) {
                System.out.println("No tiene vecina ahi" + "\n");
            } else {
                System.out.println(matriz[c.fila() - 1][c.columna() + 1] + "\n");
            }
        }
        System.out.println("En la misma fila");
        System.out.println("Izquierda");
        if (c.columna() - 1 < 0) {
            System.out.println("No tiene vecina ahi" + "\n");
        } else {
            System.out.println(matriz[c.fila()][c.columna() - 1] + "\n");
        }
        System.out.println("Derecha");
        if (c.columna() + 1 > matriz[c.columna()].length - 1) {
            System.out.println("No tiene vecina ahi" + "\n");
        } else {
            System.out.println(matriz[c.fila()][c.columna() + 1] + "\n");
        }

        System.out.println("En la fila de abajo");

        if (c.fila() + 1 > matriz.length - 1) {
            System.out.println("No tiene vecionos en la fila inferior\n");
        } else {
            System.out.println("Abajo izquierda");
            if (c.columna() - 1 < 0 || c.fila() + 1 > matriz.length - 1) {
                System.out.println("No tiene vecina ahi" + "\n");
            } else {
                System.out.println(matriz[c.fila() + 1][c.columna() - 1] + "\n");
            }

            System.out.println("Abajo");
            if (c.fila() + 1 > matriz.length - 1) {
                System.out.println("No tiene vecina ahi" + "\n");
            } else {
                System.out.println(matriz[c.fila() + 1][c.columna()] + "\n");
            }

            System.out.println("Abajo derecha");
            if (c.columna() + 1 > matriz[c.columna()].length - 1 || c.fila() + 1 > matriz.length - 1) {
                System.out.println("No tiene vecina ahi" + "\n");
            } else {
                System.out.println(matriz[c.fila() + 1][c.columna() + 1] + "\n");
            }
        }
    }

    public static void mostrarVecinasRecorrer(int[][] m, Coordenada c) {

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {

                if (i == c.fila() && j == c.columna()) {
                    System.out.print("[N]");

                }
                if (i == c.fila() - 1 && j == c.columna() - 1) {
                    System.out.print("[" + m[i][j] + "]");
                }

                if (i == c.fila() - 1 && j == c.columna()) {
                    System.out.print("[" + m[i][j] + "]");
                }

                if (i == c.fila() - 1 && j == c.columna() + 1) {
                    System.out.print("[" + m[i][j] + "]");
                }
                //--------------------------------------
                if (i == c.fila() && j == c.columna() - 1) {
                    System.out.print("[" + m[i][j] + "]");
                }

                if (i == c.fila() && j == c.columna() + 1) {
                    System.out.print("[" + m[i][j] + "]");
                }
                //--------------------------------------- 
                if (i == c.fila() + 1 && j == c.columna() - 1) {
                    System.out.print("[" + m[i][j] + "]");
                }

                if (i == c.fila() + 1 && j == c.columna()) {
                    System.out.print("[" + m[i][j] + "]");
                }

                if (i == c.fila() + 1 && j == c.columna() + 1) {
                    System.out.print("[" + m[i][j] + "]");
                }
            }
            System.out.println("");
        }
    }

}
