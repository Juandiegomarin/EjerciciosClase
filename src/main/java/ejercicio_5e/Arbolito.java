package ejercicio_5e;

import javax.swing.JOptionPane;

public class Arbolito {

    public static void main(String[] args) {

        int altura;
        
        String [][]arbol;
        
        
        altura = utilidades.Utilidades.filtrarNumeroEnteroJOptionPaneRango(2, 10, "Indica la altura del arbol");

        arbol=crearMatrizArbol(altura);
        rellenarArbol(arbol);
        System.out.println(imprimirArbol(arbol));
    }

    public static void rellenarArbol(String[][] arbol) {

        int numero = arbol[0].length/2;
        int aux;
        for (int i = 0; i < arbol.length; i++) {
            
            
            aux = numero - i;
            
            for (int j = 0; j < arbol[i].length; j++) {
                
                
                if (aux >= 0) {
                    arbol[i][aux + j] = "1";
                }
                
                if (j + aux == arbol[i].length - 1 - aux) {
                    break;
                }

            }
            
            if (i == arbol.length - 2 || i == arbol.length - 1) {

                arbol[i][(arbol[i].length / 2)] = "1";

            }

        }

    }

    public static String imprimirArbol(String[][] arbol) {

        String tree = "";

        for (int i = 0; i < arbol.length; i++) {
            for (int j = 0; j < arbol[i].length; j++) {
                if (arbol[i][j] == null) {
                    tree += " ";
                } else {
                    tree += arbol[i][j];
                }
            }
            tree += "\n";
        }

        return tree;

    }
    
    public static String[][] crearMatrizArbol(int alturaArbol){
    
   
        final int ALTURA_MINIMA = 2;
        final int ALTURA_MAXIMA = 10;
        final int ANCHURA_MINIMA = 3;
        final int TRONCO = 2;
    String [][] aux;
    
    aux = new String[alturaArbol + TRONCO][ANCHURA_MINIMA + ((alturaArbol - ALTURA_MINIMA) * 2)];
    
    
    return aux;
    
    }

}
