/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_7g;

import ejercicio_7e.Factura;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author juandi
 */
public class JoptionFrases {

    
    public static void main(String[] args) {
        
        
        String frase="";
        String fichero="Frases.txt";
        
        List<String> palabras= new ArrayList<>();
        
        Path element = Paths.get("./"+fichero);
		try {
			Files.delete(element);
		} catch (IOException e) {
			System.out.println("Problema borrando el archivo.");
			System.out.println(e.toString());
		}
        
        
        try {
            
            Path f= Paths.get("./"+fichero);
            // Este método no crea el archivo si ya existe
            Files.createFile(f);
        } catch (IOException e) {
            System.out.println("Problema creando el archivo.");
            System.out.println(e.toString());
        }
        
        
        
        do {
            
            frase=JOptionPane.showInputDialog("Introduce una frase");
            
            if(frase.equalsIgnoreCase("Terminar")){
            
            break;
            }
            else{
                
                
                palabras.add(frase);
            
            
            
            }
            
            
            
            
            
        } while (!frase.equalsIgnoreCase("Terminar"));
        
        String tmp = "";
              
        
            
        
        try (BufferedWriter flujo = new BufferedWriter(new FileWriter("./"+fichero))) {

            for (int i = 0; i < palabras.size(); i++) {

                tmp = palabras.get(i);

                flujo.write(tmp);

                flujo.newLine();

            
            // Metodo fluh() guarda cambios en disco 
            flujo.flush();
        }
            System.out.println("Fichero " + fichero + " creado correctamente.");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        
        
        String linea = "";
        try (Scanner datosFichero = new Scanner(new File("./"+fichero), "UTF-8")) {
            // hasNextLine devuelve true mientras haya líneas por leer
            while (datosFichero.hasNextLine()) {
                // Guarda la línea completa en un String
                linea = datosFichero.nextLine();
                // Se guarda en el array de String cada elemento de la
                // línea en función del carácter separador de campos del fichero CSV

                System.out.println(linea);

            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        
        
        
        
        
    }
    
}
