/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquetea;

import java.util.ArrayList;

/**
 *
 * @author juandi
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Traductor palabras= new Traductor();
        
        PalabraInglesa pi1= new PalabraInglesa("Door");
        PalabraEspaniola pe1= new PalabraEspaniola("Puerta");
        
        PalabraInglesa pi2= new PalabraInglesa("Dog");
        PalabraEspaniola pe2= new PalabraEspaniola("Perro");
        
        PalabraInglesa pi3= new PalabraInglesa("Cat");
        PalabraEspaniola pe3= new PalabraEspaniola("Gato");
        
        PalabraInglesa pi4= new PalabraInglesa("Window");
        PalabraEspaniola pe4= new PalabraEspaniola("Ventana");
        
        PalabraInglesa pi5= new PalabraInglesa("Shoe");
        PalabraEspaniola pe5= new PalabraEspaniola("Zapato");
        
        
        
        palabras.anadirPalabra(pi1.getTexto(), pe1.getTexto());
        palabras.anadirPalabra(pi2.getTexto(), pe2.getTexto());
        palabras.anadirPalabra(pi3.getTexto(), pe3.getTexto());
        palabras.anadirPalabra(pi4.getTexto(), pe4.getTexto());
        palabras.anadirPalabra(pi5.getTexto(), pe5.getTexto());
        
        palabras.imprimirPalabras();
        
        System.out.println("---------------------------");
        
        ArrayList<String> espaniolas= palabras.palabrasEspaniolas();
        ArrayList<String> inglesas= palabras.palabrasInglesas();
        
        System.out.println("Españolas\n");
        for (String s : espaniolas) {
            System.out.println(s);
        }
        System.out.println("---------------------------");
        System.out.println("Inglesas\n");
        for (String s : inglesas) {
            System.out.println(s);
        }
        
        
        System.out.println("----------------------------\n");
        System.out.println("Borrado de palabras");
        System.out.println("Borramos la palabra cat\n");
        
        palabras.borrarPalabra("Cat");
        
        palabras.imprimirPalabras();
        
    }
    
}
