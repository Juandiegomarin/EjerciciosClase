
package empresaAlquiler;

import java.time.LocalDate;


public class Prueba {

    
    public static void main(String[] args) {
        

        Empresa e1= new Empresa("Empresa 1");
        

        Vehiculo v = e1.getVehiculos().buscarVehiculo("1");
        Cliente c = e1.getClientes().buscarCliente("1");
        
        
        Vehiculo v2 = e1.getVehiculos().buscarVehiculo("9");
        Cliente c2 = e1.getClientes().buscarCliente("9");
        System.out.println(e1);
        e1.registrarAlquiler(LocalDate.now(), 8, c, v);
        
        
        System.out.println(e1.getAlquileres());
        
        System.out.println("------------------");
        System.out.println(e1.getVehiculos());
        
        System.out.println("+++++++++++++++++");

        
        
        System.out.println(e1.buscarCliente("1"));
        System.out.println(e1.buscarVehiculo("1"));
        System.out.println("--------------------------------------");
        e1.registrarCliente();

        System.out.println(e1);
        System.out.println("////////////////////////////////////////");
        e1.registrarAlquiler(LocalDate.now(), 10, c2,v2);
        System.out.println(e1.getAlquileres());
        e1.recibirVehiculo(e1.getAlquileres().buscarAlquiler(1));
        System.out.println(e1.getVehiculos());
        
        
        
    }
    
}
