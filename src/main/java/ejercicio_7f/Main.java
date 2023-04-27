/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_7f;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author juandi
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        List<Empleado> personas= new ArrayList<>();
        
        String tmp;
        
        String[] tokens;
        String linea;
    
    try (Scanner datosFichero = new Scanner(new File("./RelPerCen.csv"), "ISO-8859-1")) {
            // hasNextLine devuelve true mientras haya líneas por leer
            while (datosFichero.hasNextLine()) {
                
                int contador=0;
                // Guarda la línea completa en un String
                linea = datosFichero.nextLine();
                // Se guarda en el array de String cada elemento de la
                // línea en función del carácter separador de campos del fichero CSV
                
                System.out.println(linea);
                
                tokens=linea.split(",");
                
                for (int i = 0; i < linea.length(); i++) {
                    
                    if(String.valueOf(linea.charAt(i)).equals(",")){
                    contador++;
                    }
                    
                }
                System.out.println("-------------------------");
                
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        
        
        
    }
    
}
