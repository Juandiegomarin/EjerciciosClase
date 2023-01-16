package ejercicio_5e;

public class MayorMenorFilaColumna {

    public static void main(String[] args) {

        int opcion;
        int[][] matriz;
        int dimension;
        Coordenada coordenada;

        String menu = """
                   
                   1-Opcion manual
                   2-Opcion automático 
                   
                   3-Salir
                   
                   """;
        do {
            System.out.println(menu);
            opcion = utilidades.Utilidades.filtrarNumeroEnteroSccaner("Introduce una opcion");

            switch (opcion) {
                case 1:

                    dimension = utilidades.Utilidades.filtrarNumeroEnteroSccanerRango(3, 6, "Introduce la dimension de la matriz");
                    matriz = new int[dimension][dimension];
                    rellenarManual(matriz);
                    coordenada = encontrarNumero(matriz);
                    imprimirMatriz(matriz);
                    System.out.println("EL numero se encuentra en la posicion " + coordenada.getFila() + "," + coordenada.getColumna());
                    break;
                case 2:

                    dimension = utilidades.Utilidades.filtrarNumeroEnteroSccanerRango(3, 6, "Introduce la dimension de la matriz");
                    matriz = new int[dimension][dimension];
                    rellenarAutomatico(matriz);
                    coordenada = encontrarNumero(matriz);
                    imprimirMatriz(matriz);
                    System.out.println("EL numero se encuentra en la posicion " + coordenada.getFila() + "," + coordenada.getColumna());
                    

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

        Coordenada c = new Coordenada(-1, -1);
        int numeroFila;

        for (int i = 0; i < mat.length; i++) {
            
           c= buscarNumeroMayorFila(i, mat);
           
           if(!comprobarSiEsMenor(c, mat)){
               if(i==mat.length-1){
               c.setFila(-1);
               c.setColumna(-1);
               }
           continue;
           }else{
           break;
           }
            
        }

        return c;

    }

    public static Coordenada buscarNumeroMayorFila(int fila, int[][] mat) {

        int numero = Integer.MIN_VALUE;
        Coordenada c= new  Coordenada(-1, -1);
        
        
        for (int i = 0; i < mat.length; i++) {

            if (mat[fila][i] > numero) {
                
                numero=mat[fila][i];
                c.setFila(fila);
                c.setColumna(i);
                
            }
        }

        return c;
    }
    
    public static boolean comprobarSiEsMenor(Coordenada c,int[][]mat){
        
        boolean b = true;
        int numero=mat[c.getFila()][c.getColumna()];
        for (int i = 0; i < mat[c.getFila()].length; i++) {
            
            if(mat[i][c.getColumna()]<numero){
            
            b=false;
            break;
            
            }
            
            
            
            
        }
    
    
        return b;
    
    
    
    }
    
    public static void rellenarAutomatico(int[][]mat){
    
    
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                
                mat[i][j]=utilidades.Utilidades.numeroEnteroRandom(0, 20);
            }
            
        }
    
    
    }

}
