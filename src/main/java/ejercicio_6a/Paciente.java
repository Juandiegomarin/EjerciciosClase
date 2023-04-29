/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_6a;

import java.util.Random;

/**
 *
 * @author Juan Diego
 */
public class Paciente extends Persona {
    
     private String numeroHistoria;

    //Constructor
    public Paciente(String nombre, String apellidos, NIF nif, String numeroHistoria) {
        super(nombre, apellidos, nif);
        this.numeroHistoria = numeroHistoria;
    }

    public String getNumeroHistoria() {
        return numeroHistoria;
    }

    public void setNumeroHistoria(String numeroHistoria) {
        this.numeroHistoria = numeroHistoria;
    }

    //Metodo para tomar medicina, random indicando si se ha curado o no
    public void tomarMedicina(String medicina) {
        Random rd = new Random();
        System.out.println(getNombre() + " " + getApellidos() + ": Tomando " + medicina);
        System.out.println(rd.nextBoolean() ? "Sigo malo" : "Me he curado con " + medicina);
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + "Paciente{" +
                "numeroHistoria='" + numeroHistoria + '\'' +
                '}';
    }
}
