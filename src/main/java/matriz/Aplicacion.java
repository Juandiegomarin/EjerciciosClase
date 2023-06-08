
package matriz;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Aplicacion {

    
    public static void main(String[] args) {
        
       String ruta = "./matrizP.txt";
       int[][] matriz = leerTxtCrearMatriz(ruta);
       
        imprimirMatrizEnteros(matriz);
        
        
    }
    
    public static void imprimirMatrizEnteros(int[][]mat){
    
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
        String [] tokens;
        
        int contador=0;
        try ( Scanner datosFichero = new Scanner(new File(ruta), "UTF-8")) {

            while (datosFichero.hasNextLine()) {

                linea = datosFichero.nextLine();
                

                contador++;

            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        
        int[][]m= new int[contador][];
        
        int fila=0;
        
        try ( Scanner datosFichero = new Scanner(new File(ruta), "UTF-8")) {
            
            while (datosFichero.hasNextLine()) {

                
                linea = datosFichero.nextLine();
                tokens=linea.split(",");
                
                m[fila]= new int[tokens.length];
                for (int i = 0; i < tokens.length; i++) {
                    m[fila][i]=Integer.parseInt(tokens[i]);
                }
                fila++;

            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        
        
        
        return m;

    }
    
    
}
