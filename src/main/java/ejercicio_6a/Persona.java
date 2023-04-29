/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_6a;

import java.time.LocalDate;

/**
 *
 * @author Juan Diego
 */
public abstract class Persona {
    
    
     private String nombre;
    private String apellidos;
    private NIF nif;

    //Constructor
    public Persona(String nombre, String apellidos, NIF nif) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.nif = nif;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public NIF getNif() {
        return nif;
    }

    public void setNif(NIF nif) {
        this.nif = nif;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", nif=" + nif +
                '}';
    }

    //Metodo para renovar el nif
    public void renovarNIF(LocalDate fechaSolicitud) {
        this.nif.renovarNif(fechaSolicitud);

    }
}
