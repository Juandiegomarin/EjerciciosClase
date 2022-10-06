
package tema2_ejercicios_secuenciales;

import java.util.Scanner;


public class Ej03 {

    
    public static void main(String[] args) {
        
        
        Scanner entrada= new Scanner(System.in);
        
        float nota1;
        float nota2;
        float nota3;
        
        float notaMedia;
        
        System.out.println("Introduzca la primera nota");
        nota1= entrada.nextFloat();
        
         System.out.println("Introduzca la segunda nota");
        nota2= entrada.nextFloat();
        
         System.out.println("Introduzca la tercera nota");
        nota3= entrada.nextFloat();
        
        notaMedia= (nota1+nota2+nota3)/3;
        
        System.out.println("La nota media es: "+notaMedia);
        
    }
    
}
