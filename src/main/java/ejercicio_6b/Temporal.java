/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_6b;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author Juan Diego
 */
public class Temporal extends Sala {
    
    private LocalDate fechaIni;
    private LocalDate fechaFin;

    public Temporal(LocalDate fechaIni, LocalDate fechaFin, ArrayList<Obra> obras, ArrayList<Sensor> sensores) {
        super(obras, sensores);
        this.fechaIni = fechaIni;
        this.fechaFin = fechaFin;
    }

    public Temporal() {
    }

    public LocalDate getFechaIni() {
        return fechaIni;
    }

    public void setFechaIni(LocalDate fechaIni) {
        this.fechaIni = fechaIni;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    @Override
    public String toString() {
        return "Temporal{" + "fechaIni=" + fechaIni + ", fechaFin=" + fechaFin + '}';
    }
    
    
    
}
