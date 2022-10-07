
package tema2_ejercicios_secuenciales;

import java.util.Scanner;


public class Ej08 {

   
    public static void main(String[] args) {
        
         Scanner entrada = new Scanner (System.in);
        double presupuestoAnual;
        
        
        System.out.println("Da valor al presupuesto anual");
        
        presupuestoAnual= entrada.nextDouble();
        
        double cuarentaporciento= presupuestoAnual*0.4;
        
        System.out.println("El presupuesto de ginecología es: "+(cuarentaporciento)+" €");
        
        double treintaPorciento= presupuestoAnual*0.3;
        
        System.out.println("El presupuesto de traumatología es: "+(treintaPorciento)+" €");
        System.out.println("El presupuesto de pediatría es: "+(treintaPorciento)+" €");
    }
    
}
