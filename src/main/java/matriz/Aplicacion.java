package matriz;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Aplicacion {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        String respuesta = "";

        while (!respuesta.equalsIgnoreCase("si")) {

            String ruta = "./matrizP.txt";
            int[][] matriz = leerTxtCrearMatriz(ruta);

            imprimirMatrizEnteros(matriz);

            matriz = invertirMatriz(matriz);
            System.out.println("--------------------------------------------------");
            System.out.println("Matriz invertida");
            imprimirMatrizEnteros(matriz);

            System.out.println("Escriba el nombre del fichero donde vamos a escribir la matriz invertida");
            String rutaInvertida = "./" + entrada.nextLine() + ".txt";
            escribirMatrizInvertida(matriz, rutaInvertida);

            System.out.println("--------------------------------------------------");
            System.out.println("Matriz ordenada");
            matriz = leerMatrizInvertidaOrdenarDesc(rutaInvertida);
            imprimirMatrizEnteros(matriz);
            
            System.out.println("¿Quiere salir del programa?");
            System.out.println("Escriba si para salir");
            respuesta=entrada.nextLine();
        }

    }

    public static int[][] leerMatrizInvertidaOrdenarDesc(String ruta) {

        String linea = "";
        String[] tokens;

        int contador = 0;
        try (Scanner datosFichero = new Scanner(new File(ruta), "UTF-8")) {

            while (datosFichero.hasNextLine()) {

                linea = datosFichero.nextLine();

                contador++;

            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        int[][] aux = new int[contador][];

        int fila = 0;

        try (Scanner datosFichero = new Scanner(new File(ruta), "UTF-8")) {

            while (datosFichero.hasNextLine()) {

                linea = datosFichero.nextLine();
                tokens = linea.split(",");

                aux[fila] = new int[tokens.length];
                for (int i = 0; i < tokens.length; i++) {
                    aux[fila][i] = Integer.parseInt(tokens[i]);
                }
                fila++;

            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

        for (int i = 0; i < aux.length; i++) {

            Integer[] inv = new Integer[aux[i].length];

            for (int j = 0; j < aux[i].length; j++) {

                inv[j] = aux[i][j];
            }

            Arrays.sort(inv, Collections.reverseOrder());

            for (int j = 0; j < aux[i].length; j++) {

                aux[i][j] = inv[j];
            }
        }

        return aux;

    }

    public static int[][] invertirMatriz(int[][] m) {

        int[][] aux = new int[m.length][];

        int contador = 0;
        for (int i = m.length - 1; i >= 0; i--) {

            aux[contador] = new int[m[i].length];
            for (int j = 0; j < m[i].length; j++) {

                aux[contador][j] = m[i][j];

            }
            contador++;
        }

        return aux;
    }

    public static void escribirMatrizInvertida(int[][] m, String ruta) {

        try (BufferedWriter flujo = new BufferedWriter(new FileWriter(ruta))) {

            for (int i = 0; i < m.length; i++) {
                String tmp = "";
                for (int j = 0; j < m[i].length; j++) {
                    if (j < m[i].length - 1) {
                        tmp += m[i][j] + ",";
                    } else {
                        tmp += m[i][j] + "";
                    }
                }

                flujo.write(tmp);
                flujo.newLine();
            }

            // Metodo fluh() guarda cambios en disco 
            flujo.flush();
            System.out.println("Fichero " + ruta + " creado correctamente.");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

    public static void imprimirMatrizEnteros(int[][] mat) {

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (j < mat[i].length - 1) {
                    System.out.print("[" + mat[i][j] + "]" + "-");
                } else {
                    System.out.print("[" + mat[i][j] + "]");
                }

            }
            System.out.println("");
        }
    }

    public static int[][] leerTxtCrearMatriz(String ruta) {

        String linea = "";
        String[] tokens;

        int contador = 0;
        try (Scanner datosFichero = new Scanner(new File(ruta), "UTF-8")) {

            while (datosFichero.hasNextLine()) {

                linea = datosFichero.nextLine();

                contador++;

            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

        int[][] m = new int[contador][];

        int fila = 0;

        try (Scanner datosFichero = new Scanner(new File(ruta), "UTF-8")) {

            while (datosFichero.hasNextLine()) {

                linea = datosFichero.nextLine();
                tokens = linea.split(",");

                m[fila] = new int[tokens.length];
                for (int i = 0; i < tokens.length; i++) {
                    m[fila][i] = Integer.parseInt(tokens[i]);
                }
                fila++;

            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

        return m;

    }

}
