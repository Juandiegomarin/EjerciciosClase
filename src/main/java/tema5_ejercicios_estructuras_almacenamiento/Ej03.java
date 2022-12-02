
package tema5_ejercicios_estructuras_almacenamiento;
import java.util.Arrays;

public class Ej03 {

    
    public static void main(String[] args) {
        
        double[] lista1= new double[20];
        
        for (int i = 0; i < lista1.length; i++) {
            
            lista1[i]=7.5;
            
        }
        
        double []lista2= new double[20];
        
        for (int i = 0; i < lista2.length; i++) {
            
            lista2[i]=lista1[i];
            
        }
         
        System.out.println("Lista 1");
        
        for (int i = 0; i < lista1.length; i++) {
            
            System.out.print(lista1[i]+"  ");
        }
        System.out.println("\n");
        
         System.out.println("Lista 2");
        
        for (int i = 0; i < lista2.length; i++) {
            
            System.out.print(lista2 [i]+"  ");
        }
        System.out.println("");
        if(Arrays.equals(lista1, lista2)){
            System.out.println("Son iguales");
        }else{System.out.println("No son iguales");}
        
        
        lista2[10]=6.5;
        
        System.out.println("Lista 1");
        
        for (int i = 0; i < lista1.length; i++) {
            
            System.out.print(lista1[i]+"  ");
        }
        System.out.println("\n");
        
         System.out.println("Lista 2");
        
        for (int i = 0; i < lista2.length; i++) {
            
            System.out.print(lista2 [i]+"  ");
        }
        System.out.println("");
        if(Arrays.equals(lista1, lista2)){
            System.out.println("Son iguales");
        }else{System.out.println("No son iguales");}
        
    }
    
}
