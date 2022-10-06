
package tema2_ejercicios_secuenciales;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class Ej10 {

    
    public static void main(String[] args) {
        
        
        double a;
        double b;
        double c;
        double area;
        
        String aTeclado;
        String bTeclado;
        String cTeclado;
        
        JOptionPane.showMessageDialog(null, "Introduce los valores de los lados");
        
        
        aTeclado=JOptionPane.showInputDialog("Valor de A");
        a= Double.parseDouble(aTeclado);
                
         bTeclado=JOptionPane.showInputDialog("Valor de B");
         b= Double.parseDouble(bTeclado);
        
         cTeclado=JOptionPane.showInputDialog("Valor de C");
         c= Double.parseDouble(cTeclado);
               
         area=((a+c)*b)/2;
         
         System.out.println("El area es: "+area+" u²");
                
    }
    
}
