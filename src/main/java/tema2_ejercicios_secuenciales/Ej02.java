
package tema2_ejercicios_secuenciales;

import java.util.Scanner;


public class Ej02 {

    
    public static void main(String[] args) {
        
        
        int a=1;
        int b=2;
        int c=3;
        
        double d=4.5;
        double e=5.7;
        double f=6.9;
        
        
        System.out.println("Enteros: "+a+", "+b+", "+c);
        System.out.println("Decimales: "+d+", "+e+", "+f);
        
        b=c;
        c=a;
        a=b;
        
        System.out.println("Enteros: "+a+", "+b+", "+c);
    }
    
}
