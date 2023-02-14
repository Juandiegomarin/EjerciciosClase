package repaso_matrices;

public class MatrizAleatorios {

    public static void main(String[] args) {

        int dimension = 0;

        dimension = Utilidades.filtrarNumeroEnteroSccaner("Introduzca la dimension de la matriz");

        int[][] matriz = new int[dimension][dimension];
        
        rellenarMatriz(matriz);
        Utilidades.imprimirMatrizEnteros(matriz);

    }

    public static void rellenarMatriz(int[][] m) {

        int num = 0;

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {

                num = Utilidades.numeroEnteroRandom(1, 100);

                if (!comprobarNumero(m, num)) {
                    m[i][j] = (int) Math.pow(num, 2);
                } else {
                    j--;
                }

            }
        }

    }

    public static boolean comprobarNumero(int[][] m, int num) {

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {

                if (m[i][j] == Math.pow(num, 2)) {
                    return true;
                }
            }
        }

        return false;
    }

}
