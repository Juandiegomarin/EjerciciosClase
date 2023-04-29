/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_6b;

/**
 *
 * @author Juan Diego
 */
public class Humedad extends Sensor {

    public Humedad() {
    }

    public Humedad(int id) {
        super(id);
    }
    
    
    public void maximaHumedad(){}
    public void minimaHumedad(){}
    
    

    @Override
    public void alarma() {
        System.out.println("Hay humedad");
    }
    
}
