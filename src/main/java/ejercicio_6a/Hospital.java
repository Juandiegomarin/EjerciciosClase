/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_6a;

import java.util.ArrayList;

/**
 *
 * @author Juan Diego
 */
public class Hospital {
    
    
    private String nombre;
    private String direccion;
    private int numeroCamas;
    private ArrayList<Empleado> empleados = new ArrayList<>();
    private ArrayList<Paciente> pacientes = new ArrayList<>();

    public Hospital(String nombre, String direccion, int numeroCamas) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.numeroCamas = numeroCamas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getNumeroCamas() {
        return numeroCamas;
    }

    public void setNumeroCamas(int numeroCamas) {
        this.numeroCamas = numeroCamas;
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public ArrayList<Paciente> getPacientes() {
        return pacientes;
    }

    //Añade un empleado a la lista
    public void contratarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    //Añade un paciente a la lista
    public void ingresarPaciente(Paciente paciente) {
        pacientes.add(paciente);
    }

    @Override
    public String toString() {
        return "Hospital{" +
                "nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", numeroCamas=" + numeroCamas +
                '}';
    }
    
}
