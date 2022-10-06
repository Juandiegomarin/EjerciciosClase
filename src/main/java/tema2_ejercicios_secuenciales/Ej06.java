
package tema2_ejercicios_secuenciales;

import java.util.Scanner;


public class Ej06 {

    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);
        
        double inversion1;
        double inversion2;
        double inversion3;
        double totalInversion;
        
        double porcentaje1;
        double porcentaje2;
        double porcentaje3;
        
        
        System.out.println("Indica el valor del primer inversor");
        inversion1= entrada.nextDouble();
        
        System.out.println("Indica el valor del segundo inversor");
        inversion2= entrada.nextDouble();
        
        System.out.println("Indica el valor del tercer inversor");
        inversion3= entrada.nextDouble();
        
        
        totalInversion= inversion1+inversion2+inversion3;
        
        porcentaje1=(inversion1*100)/totalInversion;
        porcentaje2=(inversion2*100)/totalInversion;
        porcentaje3=(inversion3*100)/totalInversion;
        
        
        System.out.println("El primero corresponde al "+porcentaje1+"%");
        System.out.println("El segundo corresponde al "+porcentaje2+"%");
        System.out.println("El tercero corresponde al "+porcentaje3+"%");
        
        
        
    }
    
}
