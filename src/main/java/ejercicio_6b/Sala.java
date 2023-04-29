/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_6b;

import java.util.ArrayList;

/**
 *
 * @author Juan Diego
 */
public abstract class Sala {
    
    private ArrayList<Obra> obras;
    private ArrayList<Sensor> sensores;

    public Sala(ArrayList<Obra> obras, ArrayList<Sensor> sensores) {
        this.obras = obras;
        this.sensores = sensores;
    }

    public Sala() {
    }

    public ArrayList<Obra> getObras() {
        return obras;
    }

    public void setObras(ArrayList<Obra> obras) {
        this.obras = obras;
    }

    public ArrayList<Sensor> getSensores() {
        return sensores;
    }

    public void setSensores(ArrayList<Sensor> sensores) {
        this.sensores = sensores;
    }

    @Override
    public String toString() {
        return "Sala{" + "obras=" + obras + ", sensores=" + sensores + '}';
    }
    
    
    
}
