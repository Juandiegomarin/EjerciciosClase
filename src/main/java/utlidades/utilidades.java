
package utlidades;

import java.util.InputMismatchException;
import java.util.Scanner;


public class utilidades {
    
    
    public static int filtrarNumeroEscaner(){
    
        Scanner entrada=new Scanner(System.in);
        
        int numero=0;
        boolean seguir=true;
        do {            
            
        System.out.println("Introduce el número");
        
            try {
                numero=entrada.nextInt();
                seguir=false;
            } catch (InputMismatchException ime) {
                System.out.println("Ha introducido un valor incorrecto, repita");
            }
    
            entrada.nextLine();
    } while (seguir);
    
    return numero;
    }
    
    
    
    
    
    
    
    
    
}
