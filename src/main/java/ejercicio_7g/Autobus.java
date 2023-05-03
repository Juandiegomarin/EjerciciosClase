/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_7g;

import java.time.LocalTime;

/**
 *
 * @author juandi
 */
public class Autobus {
    
    String linea;
    String origen;
    String destino;
    LocalTime[]horas;
    

    public Autobus() {
    }

    public Autobus(String linea, String origen, String destino, LocalTime[] horas) {
        this.linea = linea;
        this.origen = origen;
        this.destino = destino;
        this.horas = horas;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public LocalTime[] getHoras() {
        return horas;
    }

    public void setHoras(LocalTime[] horas) {
        this.horas = horas;
    }

    

    public String getLinea() {
        return linea;
    }

    public void setLinea(String linea) {
        this.linea = linea;
    }

    @Override
    public String toString() {
        return "Autobus{" + "linea=" + linea + ", origen=" + origen + ", destino=" + destino + ", horas={" + mostrarHoras() + '}';
    }

    
    private  String mostrarHoras(){
    
    String hora ="";
    
        for (int i = 0; i < horas.length; i++) {
            
            hora+=horas[i]+" ";
        }
    
    
    
    
    
    return hora;
    
    }
    

    
    
    
    
}
