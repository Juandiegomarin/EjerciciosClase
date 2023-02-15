/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package repaso_matrices;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author juand
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[][] matriz = {
            {1, 10, 20, 30, 40},
            {2, 40, 30, 20, 10},
            {3, 20, 40, 10, 0},
            {4, 10, 30, 50, 15}};
        
        
        Map <Integer,Tren> trenes= crearMapTren(matriz);
        
         for (Integer key : trenes.keySet()) {
            System.out.printf("Clave %s -- Objeto %s %n", key, trenes.get(key));
        }
    }
    
    public static Map<Integer,Tren> crearMapTren(int[][] m){
    
        Map <Integer,Tren> t= new HashMap<>();
        int contador;
        int pasajeros;
        
        
        for (int i = 0; i < m.length; i++) {
            contador=0;
            pasajeros=0;
            for (int j = 0; j < m[i].length; j++) {
                
                if(j>0){
                
                pasajeros+=m[i][j];
                }
                if(m[i][j]!=0&&j>0){
                contador++;
                }
                
                
            }
            t.put(m[i][0], new Tren(m[i][0], contador, pasajeros));
        }
    
    
        return t;
    }
    
}
