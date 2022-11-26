
package bingo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class Prueba {

   
    public static void main(String[] args) {
        
        Carton c1=new Carton();
        
        c1.imprimirCarton();
        
        Collections.sort(c1.getCarton());
        System.out.println("");
        c1.imprimirCarton();
    }
    
}
