/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_6b;

/**
 *
 * @author Juan Diego
 */
public class Temperatura extends Sensor {

    public Temperatura() {
    }

    public Temperatura(int id) {
        super(id);
    }

    
    
    public void maximaTemperatura(){}
    public void minimaTemperatura(){}
    
    
    @Override
    public void alarma() {
        System.out.println("Muucha temperatura");
    }
    
}
