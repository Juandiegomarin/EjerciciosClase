
package examen_casilla;

import java.util.Scanner;


public class Main {

    
    public static void main(String[] args) {
        
        final int DIMENSION=6;  //Dimension que se piede en el ejercicio
        
        char[][]matrizChar=new char[0][0];//Creamos una ,atriz inicializada para luego machacar
                                          //Su valor por el que devuelve el método generadorLaberinto
        
        Casilla[][]matrizLaberinto;       //Matriz que guarda el valor que devuelve el método
                                          // generadroLaberintoCasilla
        
           
        boolean seguir=true; //Varisble para controlar la salida del bucle a continuación
        
        
        do {//Bucle para controlar la excepcion en caso de que la dimension no sea la que queremos
            
            try {
                 matrizChar=UtilesLaberinto.generadorLaberinto(DIMENSION);
                 seguir=false;
            } catch (IllegalArgumentException iae) {
                
                System.out.println("Repita la dimension por favor");
            }
       
            
            
        } while (seguir);
        
        
        utilidades.Utilidades.imprimirMatrizChar(matrizChar);  //Imprimimos la matriz de char('b' - 'c')
        
        matrizLaberinto=UtilesLaberinto.generadorLaberintoCasillas(matrizChar); //Creamos una matriz de Casillas a partir
                                                                                    // de la matriz de char
        
        System.out.println("---------------------------------------------------");
        
        UtilesLaberinto.imprimirMatrizCasilla(matrizLaberinto);//Imprimimos la matriz de Casillas('BOSQUE' - 'CASILLA')
    }
    
}
