                                                                                             package bingo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import javax.swing.JOptionPane;

public class Prueba {

    public static void main(String[] args) {

        Carton miCarton = new Carton();
        boolean variable=true;
        int indice=0;
        
        do {           
            miCarton.imprimirCarton();
            
            miCarton.comprobarNumero(sacarNumero());
            
            
            if(!miCarton.comprobarLinea()&&indice!=1){
            
            JOptionPane.showMessageDialog(null, "Lineaaa");
            indice=1;
            
            }else{
            
            miCarton.comprobarBingo();
            break;
            
            }
            
                
            } while (!miCarton.comprobarBingo().equalsIgnoreCase("Bingo"));
        
       
    }
    
    
    public static int sacarNumero(){
        
        
    
    int numero;
    
    
    numero=utilidades.Utilidades.numeroEnteroRandom(1, 90);
    
    
    
    return numero;
    
    
    }
    
    

}
