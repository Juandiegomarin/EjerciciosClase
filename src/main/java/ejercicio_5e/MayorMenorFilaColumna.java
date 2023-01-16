package ejercicio_5e;

public class MayorMenorFilaColumna {
    
    public static void main(String[] args) {
        
        int opcion;
        int[][] matriz;
        int dimension;
        
        String menu = """
                   
                   1-Opcion manual
                   2-Opcion automático 
                   
                   3-Salir
                   
                   """;
        do {
            opcion = utilidades.Utilidades.filtrarNumeroEnteroSccanerRango(3, 6, "Introduce una opcion");
            
            switch (opcion) {
                case 1:
                    
                    dimension = utilidades.Utilidades.filtrarNumeroEnteroSccaner("Introduce la dimension de la matriz");
                    matriz = new int[dimension][dimension];
                    rellenarManual(matriz);
                    
                    break;
                case 2:
                    
                    dimension = utilidades.Utilidades.filtrarNumeroEnteroSccanerRango(3, 6, "Introduce la dimension de la matriz");
                    matriz = new int[dimension][dimension];
                    rellenarManual(matriz);
                    imprimirMatriz(matriz);
                    
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Opcion no valida");
                    ;
            }
            
        } while (opcion != 3);
        
    }
    
    public static void rellenarManual(int[][] mat) {
        
        for (int i = 0; i < mat.length; i++) {
            
            for (int j = 0; j < mat[i].length; j++) {
                
                mat[i][j] = utilidades.Utilidades.filtrarNumeroEnteroSccaner("Introduce un numero en la posicion [" + i + "] [" + j + "]");
                
            }
            
        }
        
    }
    
    public static void imprimirMatriz(int[][] mat) {
        
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
    
    public static Coordenada encontrarNumero(int[][] mat) {
        
        int numeroFila;
        int minimo=Integer.MIN_VALUE;
        int maximo=Integer.MAX_VALUE;
        
        
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                
                
                
                
            }
        }
        
        return new Coordenada(1, 2);
        
    }
    
}
