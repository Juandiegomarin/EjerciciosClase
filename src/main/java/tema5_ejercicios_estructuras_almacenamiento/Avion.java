package tema5_ejercicios_estructuras_almacenamiento;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Avion {

    public static void main(String[] args) {

        String[][] avion = new String[25][4];
        rellenarMatriz(avion);
        String menu = """
                    
                      
                    1-Ver Asientos
                      
                    2-Reservar Asiento
                      
                    3-Anular Asiento
                      
                    4-Salir
                    
                    Introduce una opcion
                    
                    """;

        int opcion = 0;

        do {

            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));

            } catch (NumberFormatException nfe) {
                opcion = 4;
            }

            switch (opcion) {
                case 1 -> {
                    
                    JOptionPane.showMessageDialog(null, imprimirMatriz(avion));
                }
                case 2 -> {
                }
                case 3 -> {
                }
                case 4 -> {
                    JOptionPane.showMessageDialog(null, "Saliendo");
                }
                default ->
                    JOptionPane.showMessageDialog(null, "Repita");
            }

        } while (opcion != 4);

    }

    public static void rellenarMatriz(String[][] mat) {

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {

                mat[i][j] = "O";
            }
        }
    }

    public static String imprimirMatriz(String[][] mat) {

        String asientos="";
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {

                if (j != mat[i].length - 1) {
                    asientos+="[" + mat[i][j] + "]" + "        ";
                } else {
                    asientos+="[" + mat[i][j] + "]";
                }
            }
            asientos+="\n";
        }
        return asientos;
    }

    public static void ocuparAsiento(String[][] mat) {

        Scanner entrada = new Scanner(System.in);
        int fila = 0;
        int columna = 0;

        imprimirMatriz(mat);

        System.out.println("Introduce la fila y columna en la que sentarse");

        System.out.println("Fila");
        fila = entrada.nextInt();
        System.out.println("Columna");
        columna = entrada.nextInt();

        fila -= 1;
        columna -= 1;

        if (mat[fila][columna].equals("X")) {

            System.out.println("Ese asiento esta ya ocupado");
        } else {
            mat[fila][columna] = "X";
        }

    }
}
