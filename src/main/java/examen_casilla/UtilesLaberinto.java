package examen_casilla;

public class UtilesLaberinto {

    public static char[][] generadorLaberinto(int n) {

        if (n < 3 || n > 10) {
            throw new IllegalArgumentException("El numero " + n + " no está permitido");
        }
        char[][] m = new char[n][n];
        rellenarMatriz(m);
        return m;
    }

    public static Casilla[][] generadorLaberintoCasillas(char[][] aux) {

        Casilla[][] m = new Casilla[aux.length][aux.length];

        for (int i = 0; i < aux.length; i++) {
            for (int j = 0; j < aux[i].length; j++) {

                if (aux[i][j] == 'b') {

                    m[i][j] = new Casilla(i, j, TipoCasilla.BOSQUE);
                } else {
                    m[i][j] = new Casilla(i, j, TipoCasilla.CAMINO);
                }

            }
        }

        return m;
    }

    private static void rellenarMatriz(char[][] m) {
        int numero = 0;

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {

                numero = utilidades.Utilidades.numeroEnteroRandom(0, 1);

                if (numero == 0) {

                    m[i][j] = 'b';
                } else {
                    m[i][j] = 'c';
                }

            }
        }

    }

    public static void imprimirMatrizCasilla(Casilla[][] mat) {

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
}
