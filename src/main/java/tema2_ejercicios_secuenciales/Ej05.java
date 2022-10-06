
package tema2_ejercicios_secuenciales;

import java.util.Scanner;


public class Ej05 {

   
    public static void main(String[] args) {
        
        
        Scanner entrada= new Scanner(System.in);
        
        
        
        final int HORASTOTALES=30;
        int numeroDeProfesores;
        double horasQueImparteCadaProfesor;
        
        
        System.out.println("Introduce el numero de profesores que hay en la escuela");
        numeroDeProfesores= entrada.nextInt();
        
        horasQueImparteCadaProfesor= Math.ceil(HORASTOTALES/(double)numeroDeProfesores);
        
        System.out.println("Cada profesor imparte "+horasQueImparteCadaProfesor+" horas");
        
      
        
        
        
        
        
        
    }
    
}
