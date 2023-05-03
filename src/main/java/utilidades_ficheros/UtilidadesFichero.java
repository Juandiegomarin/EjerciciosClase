/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utilidades_ficheros;

import ejercicio_7e.Factura;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Juan Diego
 */
public class UtilidadesFichero {
    
   
    
     //Path element = Paths.get(ruta);
    
    public static void crearFichero(Path nombreFichero) {

        try {
            // Este método no crea el archivo si ya existe
            Files.createFile(nombreFichero);
        } catch (IOException e) {
            System.out.println("Problema creando el archivo.");
            System.out.println(e.toString());
        }
    }
    
     public static void crearCarpeta(Path nombreCarpeta) {
         
        try {
            Files.createDirectory(nombreCarpeta);
        } catch (IOException e) {
            System.out.println("Problema creando el directorio.");
            System.out.println(e.toString());
        }

    }
     
    public static void borrar(Path nombreFichero){
    
                try {
			Files.delete(nombreFichero);
		} catch (IOException e) {
			System.out.println("Problema borrando el archivo.");
			System.out.println(e.toString());
		}
    
    } 
    
    public static void leerFichero(Path p){
    
    
    String linea = "";
        try (Scanner datosFichero = new Scanner(new File(p.toFile().toString()), "UTF-8")) {
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
    //Modificar independiendo objeto de la lista
    
    public static void escribirFicheroLista(Path p,List<Object>l){
    
    String tmp = "";
        String linea = "";
        try (BufferedWriter flujo = new BufferedWriter(new FileWriter(p.toFile()))) {

            for (Object o : l) {

                tmp = l.toString();

                flujo.write(tmp);

                flujo.newLine();

            }
            // Metodo fluh() guarda cambios en disco 
            flujo.flush();
            System.out.println("Fichero " + p + " creado correctamente.");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    
    
        
    
    }
    
    //para examen implementar pom proyecto ejercicios
    
    /*
    ApiStream
    
    
    
    */
    
    
}
