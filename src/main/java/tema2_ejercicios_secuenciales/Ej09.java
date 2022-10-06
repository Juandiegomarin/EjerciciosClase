
package tema2_ejercicios_secuenciales;

import java.util.Scanner;


public class Ej09 {

    
    public static void main(String[] args) {
        
        Scanner entrada= new Scanner(System.in);
        
        final double IVA=0.21;
        double precio;
        double precioTotal;
        
        
        
        
        System.out.println("Introduzca el valor del precio del articulo para aplicarle el 21%");
        precio=entrada.nextDouble();
        
        precioTotal=precio-(precio*IVA);
        
        System.out.println("El precio con IVA incluido es: "+precioTotal);
        
        
        
    }
    
}
