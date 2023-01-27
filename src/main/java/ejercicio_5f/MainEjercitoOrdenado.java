/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_5f;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author juand
 */
public class MainEjercitoOrdenado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        EjercitoOrdenado ejercito= new EjercitoOrdenado();
        ArrayList<Soldado> soldados= new ArrayList<>();
        Soldado s1= new Soldado("A", "A", "A", 0);
        Soldado s2= new Soldado("B", "B", "B", 0);
        Soldado s3= new Soldado("C", "C", "C", 0);
        Soldado s4= new Soldado("D", "D", "D", 0);
        Soldado s5= new Soldado("E", "E", "E", 0);
        Soldado s6= new Soldado("F", "F", "F", 0);
        Soldado s7= new Soldado("G", "G", "G", 0);
        Soldado s8= new Soldado("H", "H", "H", 0);
        Soldado s9= new Soldado("I", "I", "I", 0);
        Soldado s10= new Soldado("J", "J", "J", 0);
        
        ejercito.alistarSoldado(s1);
        ejercito.alistarSoldado(s2);
        ejercito.alistarSoldado(s3);
        ejercito.alistarSoldado(s4);
        ejercito.alistarSoldado(s5);
        ejercito.alistarSoldado(s6);
        ejercito.alistarSoldado(s7);
        ejercito.alistarSoldado(s8);
        ejercito.alistarSoldado(s9);
        ejercito.alistarSoldado(s10);
        
        
        
        System.out.println("Miembros:");
        System.out.println(ejercito.miembrosEjercito());
        
        System.out.println("------------------");
        
        System.out.println("¿Esta vacio?");
        System.out.println(ejercito.estaVacio());
        
        System.out.println("¿Esta en el ejercito el soldado con nif 1?");
        System.out.println(ejercito.estaSoldado(1));
        
        System.out.println("¿Esta en el ejercito el soldado con nif 12?");
        System.out.println(ejercito.estaSoldado(12));
        
        soldados= ejercito.guardarArrayList();
        
        for (Soldado soldado : soldados) {
            System.out.println(soldado);
        }
        System.out.println("---------------------------");
        ejercito.desalistarSoldado(8);
        
        
        for (Soldado s : ejercito.getEjercito()) {
            System.out.println(s);
        }
    }
    
}
