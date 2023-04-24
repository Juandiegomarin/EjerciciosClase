package ejercicio_7e;

import java.io.BufferedWriter;
import java.util.ArrayList;
import java.util.List;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;
import java.util.Scanner;

public class GenerarFicheros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        List<Factura> facturas = new ArrayList<>();
        
        String tmp="";
        String linea="";

        for (int i = 0; i < 50; i++) {

            facturas.add(new Factura());

        }

        facturas.forEach(System.out::println);

        Path carpetaXml = Paths.get("./xml");
        try {
            Files.createDirectory(carpetaXml);
        } catch (IOException e) {
            System.out.println("Problema creando el directorio.");
            System.out.println(e.toString());
        }

        Path carpetaCsv = Paths.get("./csv");
        try {
            Files.createDirectory(carpetaCsv);
        } catch (IOException e) {
            System.out.println("Problema creando el directorio.");
            System.out.println(e.toString());
        }

        Path Csv = Paths.get("./csv/facturas.csv");
        try {
            // Este método no crea el archivo si ya existe
            Files.createFile(Csv);
        } catch (IOException e) {
            System.out.println("Problema creando el archivo.");
            System.out.println(e.toString());
        }

        Path Xml = Paths.get("./xml/facturas.xml");
        try {
            // Este método no crea el archivo si ya existe
            Files.createFile(Xml);
        } catch (IOException e) {
            System.out.println("Problema creando el archivo.");
            System.out.println(e.toString());
        }
        
        
        
        
        
        
         try (BufferedWriter flujo = new BufferedWriter(new FileWriter("./csv/facturas.csv"))) {
            
            for (Factura factura : facturas) {
                
                tmp=factura.toString();
                
                flujo.write(tmp);
                
                flujo.newLine();
                
            }
            // Metodo fluh() guarda cambios en disco 
            flujo.flush();
            System.out.println("Fichero " + Csv+ " creado correctamente.");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
         
         System.out.println("-----------------------------------------------");
         System.out.println("Lectura fichero");
         
         
         try (Scanner datosFichero = new Scanner(new File("./csv/facturas.csv"), "UTF-8")) {
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
         
         System.out.println("---------------------------------------------------");
         System.out.println("Fichero xml");
         
         try (BufferedWriter flujo = new BufferedWriter(new FileWriter("./xml/facturas.xml"))) {
            
            for (Factura factura : facturas) {
                
                tmp=factura.toString();
                
                flujo.write(tmp);
                
                flujo.newLine();
                
            }
            // Metodo fluh() guarda cambios en disco 
            flujo.flush();
            System.out.println("Fichero " + Csv+ " creado correctamente.");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
         
         System.out.println("-----------------------------------------------");
         System.out.println("Lectura fichero");
         
         
         try (Scanner datosFichero = new Scanner(new File("./xml/facturas.xml"), "UTF-8")) {
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
         
         
         
         
         
         
        Path carpetaFacturas = Paths.get("./facturascsv");
        try {
            Files.createDirectory(carpetaFacturas);
        } catch (IOException e) {
            System.out.println("Problema creando el directorio.");
            System.out.println(e.toString());
        }
        
        
        
        for (Factura f: facturas) {
            
            
            
            Path ficherito = Paths.get("./facturascsv/"+f.getCodigoUnico()+".csv");
        try {
            // Este método no crea el archivo si ya existe
            Files.createFile(ficherito);
        } catch (IOException e) {
            System.out.println("Problema creando el archivo.");
            System.out.println(e.toString());
        }
        
        try (BufferedWriter flujo = new BufferedWriter(new FileWriter("./facturascsv/"+f.getCodigoUnico()+".csv"))) {
            
            
                
                tmp=f.toString();
                
                flujo.write(tmp);
                
                flujo.newLine();
                
            
            // Metodo fluh() guarda cambios en disco 
            flujo.flush();
            System.out.println("Fichero " + f.getCodigoUnico()+ " creado correctamente.");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        
        
        
            
            
        }

    }

}
