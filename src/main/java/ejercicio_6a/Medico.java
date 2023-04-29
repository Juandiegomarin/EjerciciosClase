/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_6a;

/**
 *
 * @author Juan Diego
 */
public class Medico extends Empleado {
    
    
     private String especialidad;

    private static double IRPF_CIRUGIA = 25;
    private static double IRPF_OTROS = 23.5;

    public Medico(String nombre, String apellidos, NIF nif, String numeroSeguridadSocial, double salario, String especialidad) {
        super(nombre, apellidos, nif, numeroSeguridadSocial, salario);
        this.especialidad = especialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + "Medico{" +
                "especialidad='" + especialidad + '\'' +
                '}';
    }

    //Metodo para tratar a un paciente, hace un llamada al metodo del paciente
    public void tratar(Paciente paciente, String medicina) {
        System.out.println("El médico " + getNombre() + " trata a " + paciente.getNombre() + " " + paciente.getApellidos() + " con " + medicina);
        paciente.tomarMedicina(medicina);
    }

    //Metodo para calcular el irpf sobre su salario, devuelve el irpf calculado
    public double calcularIRPF() {
        double irpf = 0;
        if (especialidad.equalsIgnoreCase("cirugia")) {
            irpf = (getSalario() * IRPF_CIRUGIA) / 100;
        } else {
            irpf = (getSalario() * IRPF_OTROS) / 100;
        }

        return irpf;
    }
}
