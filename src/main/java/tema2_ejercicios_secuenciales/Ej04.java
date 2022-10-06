
package tema2_ejercicios_secuenciales;

import java.util.Scanner;


public class Ej04 {

    
    public static void main(String[] args) {
        
        
        Scanner entrada = new Scanner(System.in);
        
        
        final double PRECIOMINIMOPORSERVICIO=1.25;
        
        
        double precioPorKilometro=0.08;
        double kilometros;
        double presupuesto;
        
        System.out.println("Introduzca los kilometros a recorrer");
        kilometros= entrada.nextDouble();
        
        presupuesto=(kilometros*precioPorKilometro)+PRECIOMINIMOPORSERVICIO;
        
        System.out.println("El total a pagar es igual a "+presupuesto+" €");
        
        
        
    }
    
}
