package tema5_ejercicios_estructuras_almacenamiento;

public class Ej14 {

    public static void main(String[] args) {

        int[][] mat = new int[3][3];
        rellenarMatriz(mat);

        System.out.println("La matriz es: ");
        inmprimirMatriz(mat);

        System.out.println("\nLa media es: " + String.format("%.2f", obtenerMediaValores(mat)));

        System.out.println("\nEl numero mas pequeño es " + obtenerNumueroMinimo(mat));
        System.out.println("\nEl numero mas grande es " + obtenerNumueroMaximo(mat));

    }

    public static void rellenarMatriz(int[][] mat) {

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {

                mat[i][j] = utilidades.Utilidades.numeroEnteroRandom(1, 100);
            }
        }
    }

    public static void inmprimirMatriz(int[][] mat) {

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {

                if (j != mat[i].length - 1) {
                    System.out.print("[" + mat[i][j] + "]" + "-");
                } else {
                    System.out.println("[" + mat[i][j] + "]");
                }
            }
        }

    }

    public static double obtenerMediaValores(int[][] mat) {

        double media = 0;

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {

                media += mat[i][j];
            }
        }
        media = media / 9;
        return media;
    }

    public static int obtenerNumueroMinimo(int[][] mat) {

        int numero = mat[0][0];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {

                if (mat[i][j] < numero) {
                    numero = mat[i][j];
                }
            }
        }

        return numero;
    }

    public static int obtenerNumueroMaximo(int[][] mat) {

        int numero = mat[0][0];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {

                if (mat[i][j] > numero) {
                    numero = mat[i][j];
                }
            }
        }

        return numero;
    }

}
