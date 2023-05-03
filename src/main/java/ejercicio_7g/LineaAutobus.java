/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_7g;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author juandi
 */
public class LineaAutobus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        String linea = "";
        String[] tokens;
        List<Autobus> autobuses= new ArrayList<>();
        
        String []ciudades;
        
        try (Scanner datosFichero = new Scanner(new File("./autobuses.txt"), "UTF-8")) {
            // hasNextLine devuelve true mientras haya líneas por leer
            while (datosFichero.hasNextLine()) {
                // Guarda la línea completa en un String
                
                
                
                
                
                
                linea = datosFichero.nextLine();
                
                tokens=linea.split("\" ");
                
                for (int i = 0; i < tokens.length; i++) {
                    System.out.println(tokens[i].replaceAll("\"", ""));
                }
                
                ciudades=tokens[1].split("-");
                
                Autobus a= new Autobus();
                a.setLinea(tokens[0]);
                a.setOrigen(ciudades[0]);
                a.setDestino(ciudades[1]);
                
                String []horarios=tokens[2].split(" ");
                
                
                
                LocalTime[]fechas=new LocalTime[horarios.length];
                
                for (int i = 0; i < horarios.length; i++) {
                    fechas[i]=LocalTime.parse(horarios[i]);
                }
                
                a.setHoras(fechas);
                
                
                autobuses.add(a);
                
                System.out.println(linea);

            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        
        
        
        for (Autobus a : autobuses) {
            System.out.println(a);
        }
        
    }
    
}
