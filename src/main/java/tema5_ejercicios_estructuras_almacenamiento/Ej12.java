
package tema5_ejercicios_estructuras_almacenamiento;


public class Ej12 {

    
    public static void main(String[] args) {
       
        int [][]matriz=new int [2][3];
        
        rellenarMatriz(matriz);
        inmprimirMatriz(matriz);
        
        
    }
    public static void rellenarMatriz(int[][]mat){
    
    
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                
                mat[i][j]=utilidades.Utilidades.numeroEnteroRandom(1, 5);
            }
        }
    
    
    }
    
    public static void inmprimirMatriz(int[][]mat){
    
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                
                if(j!=mat[i].length-1){
                System.out.print("["+mat[i][j]+"]"+"-");
                }else{System.out.println("["+mat[i][j]+"]");}
            }
        }
    
    
    }
    
}
