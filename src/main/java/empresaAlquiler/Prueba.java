
package empresaAlquiler;

import java.time.LocalDate;


public class Prueba {

    
    public static void main(String[] args) {
        

        Empresa e1= new Empresa("Empresa 1");
        
        System.out.println(e1);
        
        System.out.println(e1.buscarCliente("1"));
        System.out.println("--------------------------------------");
        e1.registrarCliente();
        System.out.println(e1);
    }
    
}
