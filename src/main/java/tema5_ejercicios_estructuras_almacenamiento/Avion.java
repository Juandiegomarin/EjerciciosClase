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
                    ocuparAsiento(avion);
                }
                case 3 -> {
                    anularAsiento(avion);
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

        
        int fila = 0;
        int columna = 0;

        fila= utilidades.Utilidades.filtrarNumeroEnteroJOptionPaneRango(1, 25, "Introduce la fila del asiento");
        columna= utilidades.Utilidades.filtrarNumeroEnteroJOptionPaneRango(1, 4, "Introduce la columna del asiento");

        fila -= 1;
        columna -= 1;

        if (mat[fila][columna].equals("X")) {

            JOptionPane.showMessageDialog(null, "Ese asiento ya esta ocupado");
        } else {
            mat[fila][columna] = "X";
        }

    }
    
    public static void anularAsiento(String[][] mat){
    
     int fila = 0;
        int columna = 0;

        fila= utilidades.Utilidades.filtrarNumeroEnteroJOptionPaneRango(1, 25, "Introduce la fila del asiento");
        columna= utilidades.Utilidades.filtrarNumeroEnteroJOptionPaneRango(1, 4, "Introduce la columna del asiento");

        fila -= 1;
        columna -= 1;

        if (mat[fila][columna].equals("O")) {

            JOptionPane.showMessageDialog(null, "Ese asiento ya esta libre");
        } else {
            mat[fila][columna] = "O";
        }
    
    
    
    
    
    }
}
