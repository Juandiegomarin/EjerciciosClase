
package tema5_ejercicios_estructuras_almacenamiento;

import java.util.Scanner;


public class Avion {

    
    public static void main(String[] args) {
        
        String[][] avion= new String[25][4];
        
        rellenarMatriz(avion);
        imprimirMatriz(avion);
        System.out.println("----------------------------");
        ocuparAsiento(avion);
        System.out.println("----------------------------");
        imprimirMatriz(avion);
    }
    public static void rellenarMatriz(String[][] mat) {

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {

                mat[i][j] = "O";
            }
        }
    }
    
    public static void imprimirMatriz(String[][] mat) {

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
    
    public static void ocuparAsiento(String[][]mat){
        
        Scanner entrada = new Scanner(System.in);
        int fila=0;
        int columna=0;
        
        imprimirMatriz(mat);
        
        System.out.println("Introduce la fila y columna en la que sentarse");
        
        System.out.println("Fila");
        fila=entrada.nextInt();
        System.out.println("Columna");
        columna=entrada.nextInt();
        
        fila-=1;
        columna-=1;
        
        if(mat[fila][columna].equals("X")){
        
            System.out.println("Ese asiento esta ya ocupado");
        }else{
        mat[fila][columna]="X";
        }
        
        
    }
}
