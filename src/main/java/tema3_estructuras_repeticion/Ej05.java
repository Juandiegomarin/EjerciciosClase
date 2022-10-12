
package tema3_estructuras_repeticion;

import java.util.Scanner;


public class Ej05 {

    
    public static void main(String[] args) {
        
        Scanner teclado=new Scanner(System.in);
        int n,x;
        System.out.print("Ingrese el valor final:");
        n=teclado.nextInt();
        x=1;
         do{
            System.out.print(x);
            System.out.print(" - ");
            x = x + 1;
        }while (x<=n);
    }
    
}
