/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema6_herencia_vehiculo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author juandi
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Vehiculo v1 = new Turismo(5, "Hola", "1234", "aaaaa", 80);
        Vehiculo v2= new Deportivo(true, "Audi", "0000","bbbb", 95);
        Vehiculo v3 = new Furgoneta(300, "Mercedes","4321", "cccc", 120);
        
        List<Vehiculo> catalogo= new ArrayList<>();
        
        catalogo.add(v1);
        catalogo.add(v2);
        catalogo.add(v3);
        
        for (Vehiculo vehiculo : catalogo) {
            
            if (vehiculo instanceof Turismo) {
                System.out.println(((Turismo)vehiculo).getAsientos());
                
            }
            if (vehiculo instanceof Deportivo) {
                System.out.println(((Deportivo) vehiculo).isDescapotado());
                
            }
            if (vehiculo instanceof Furgoneta) {
                System.out.println(((Furgoneta) vehiculo).getAltura());
                
            }
            
        }
        
    }
    
}
