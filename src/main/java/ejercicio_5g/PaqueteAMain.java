/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_5g;

import java.util.ArrayList;

/**
 *
 * @author juandi
 */
public class PaqueteAMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        PaqueteATraductor palabras= new PaqueteATraductor();
        
        PaqueteAPalabraInglesa pi1= new PaqueteAPalabraInglesa("Door");
        PaqueteAPalabraEspaniola pe1= new PaqueteAPalabraEspaniola("Puerta");
        
        PaqueteAPalabraInglesa pi2= new PaqueteAPalabraInglesa("Dog");
        PaqueteAPalabraEspaniola pe2= new PaqueteAPalabraEspaniola("Perro");
        
        PaqueteAPalabraInglesa pi3= new PaqueteAPalabraInglesa("Cat");
        PaqueteAPalabraEspaniola pe3= new PaqueteAPalabraEspaniola("Gato");
        
        PaqueteAPalabraInglesa pi4= new PaqueteAPalabraInglesa("Window");
        PaqueteAPalabraEspaniola pe4= new PaqueteAPalabraEspaniola("Ventana");
        
        PaqueteAPalabraInglesa pi5= new PaqueteAPalabraInglesa("Shoe");
        PaqueteAPalabraEspaniola pe5= new PaqueteAPalabraEspaniola("Zapato");
        
        
        
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
        
        
        System.out.println("------------------------");
        System.out.println("Traduccion de la palabra door");
        System.out.println( palabras.traduccion("Door"));
        
        System.out.println("");
        palabras.modificarPalabra("Shoe", "Maria");
        System.out.println("");
        palabras.imprimirPalabras();
        
    }
    
}
