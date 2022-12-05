
package tema5_ejercicios_estructuras_almacenamiento;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class Ej13 {

    
    public static void main(String[] args) {
        
        int[]lista = new int[]{1,2,1,3,3,1,2,1,5,1}; 
        int[]numeros= new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        boolean[] esRepetido = new boolean[lista.length]; 

    for (int i = 0; i < lista.length; i++) { 

        // Skip this element if already processed 
        if (esRepetido[i] == true){ 
            continue; 
        }
        if(lista[i]==0){
            System.out.println("Programa terminado");
            break;
        }
        
        int contador = 1; 
        for (int j = i + 1; j < lista.length; j++) { 
            if (lista[i] == lista[j]) { 
                esRepetido[j] = true; 
                contador++; 

            } 
        } 
            System.out.print(lista[i] + " " ); 
             for (int k = 0; k < contador; k++) { 
                  System.out.print('*');

             }
                  System.out.println();
        
        
        
        
    }
    
    }
}
