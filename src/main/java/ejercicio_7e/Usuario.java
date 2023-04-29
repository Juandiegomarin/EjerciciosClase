
package ejercicio_7e;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Juan Diego
 */
public class Usuario {

    public static void main(String[] args) {
        
        Scanner entrada= new Scanner(System.in);
        
        String ruta = "./facturascsv";
        String rutaFactura;
        
        int numFichero;
        
        mostrarFichero(ruta);
        
        
      
        
        System.out.println("Que factura quieres ver");
        numFichero=entrada.nextInt();
        rutaFactura=ruta+"/"+numFichero+".csv";
        
        System.out.println("-------------------------------------------------");
        System.out.println("Factura pedida");
        mostrarFacturaUnica(rutaFactura);
        System.out.println("Borrar factura del fichero");
        
        borrarFacturaElegida(rutaFactura);
        
        System.out.println("Mostramos de nuevo el contenido del directorio");
         mostrarFichero(ruta);
        

    }

    public static void mostrarFichero(String ruta) {
        
        File f = new File(ruta);
        String[] facturas=f.list();
        
        for (int i = 0; i < facturas.length; i++) {
            
            
            
        String linea = "";
        try (Scanner datosFichero = new Scanner(new File(ruta+"/"+(i+1)+".csv"), "UTF-8")) {
            // hasNextLine devuelve true mientras haya lÃ­neas por leer
            while (datosFichero.hasNextLine()) {
                // Guarda la lÃ­nea completa en un String
                linea = datosFichero.nextLine();
                // Se guarda en el array de String cada elemento de la
                // lÃ­nea en funciÃ³n del carÃ¡cter separador de campos del fichero CSV

                System.out.println(linea);

            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        }
    }
    
    public static void mostrarFacturaUnica(String ruta){
        
        String linea = "";
        try (Scanner datosFichero = new Scanner(new File(ruta), "UTF-8")) {
            // hasNextLine devuelve true mientras haya lÃ­neas por leer
            while (datosFichero.hasNextLine()) {
                // Guarda la lÃ­nea completa en un String
                linea = datosFichero.nextLine();
                // Se guarda en el array de String cada elemento de la
                // lÃ­nea en funciÃ³n del carÃ¡cter separador de campos del fichero CSV

                System.out.println(linea);

            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    
    }
    
    public static void borrarFacturaElegida(String ruta){
    
    Path factura = Paths.get(ruta);
		try {
			Files.delete(factura);
		} catch (IOException e) {
			System.out.println("Problema borrando el archivo.");
			System.out.println(e.toString());
		}

    
    }

}
