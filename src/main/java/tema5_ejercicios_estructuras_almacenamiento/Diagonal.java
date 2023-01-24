package tema5_ejercicios_estructuras_almacenamiento;

import java.util.Scanner;

public class Diagonal {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int[][] m;

        int dimension;

        System.out.println("Indica la dimension de la matriz");
        dimension = entrada.nextInt();
        m = new int[dimension][dimension];
        utilidades.Utilidades.rellenarMatrizEnteros(m, 0, 10);
        utilidades.Utilidades.imprimirMatrizEnteros(m);
        
        
        recorrerDiagonales(m);
    }
    public static void recorrerDiagonales(int[][]m){
    
    //Primera diagonal
        System.out.println("");
        System.out.println("Diagonal principal");
        for (int i = 0; i < m.length; i++) {
            
            System.out.print("["+m[i][i]+"]\n");
            
            
        }
        int variable=m[0].length-1;
        System.out.println("Diagonal secundaria");
        for (int i = 0; i < m.length; i++) {
            
            System.out.print("["+m[i][variable]+"]\n");
            variable--;
        }
        
        
        
    
    
    
    
    }
}
