package repaso_matrices;


public class MatrizBinaria {

    public static void main(String[] args) {

        int dimension = 0;

        dimension = Utilidades.filtrarNumeroEnteroSccaner("Introduzca la dimension de la matriz");

        int[][] matriz = new int[dimension][dimension];

        rellenarMatriz(matriz);
        Utilidades.imprimirMatrizEnteros(matriz);

        System.out.println(encontrarCoordenada(matriz));

    }

    public static void rellenarMatriz(int[][] m) {

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {

                m[i][j] = Utilidades.numeroEnteroRandom(0, 1);

            }
        }

    }

    public static Coordenada encontrarCoordenada(int[][] m) {

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {

                if (m[i][j] == 0) {

                    if (comprobarCoordenada(m, new Coordenada(i, j))) {
                        return new Coordenada(i, j);
                    } 

                }

            }
        }

        return new Coordenada(-1, -1);

    }

    public static boolean comprobarCoordenada(int[][] m, Coordenada c) {

        if (c.fila() - 1 >= 0) {

            if (m[c.fila() - 1][c.columna() - 1] == 1
                    || m[c.fila() - 1][c.columna()] == 1
                    || m[c.fila() - 1][c.columna() + 1] == 1) {

                return true;

            }
        } else if (c.columna() - 1 >= 0) {
            if (m[c.fila()][c.columna() - 1] == 1) {
                return true;
            }
        } else if (c.columna() + 1 <= m[c.columna()].length - 1) {
            if (m[c.fila()][c.columna() + 1] == 1) {
                return true;
            }
        } else if (c.fila() + 1 <= m.length - 1) {

            if (m[c.fila() + 1][c.columna() - 1] == 1
                    || m[c.fila() + 1][c.columna()] == 1
                    || m[c.fila() + 1][c.columna() + 1] == 1) {
                return true;
            }

        }
        return false;
    }

}
