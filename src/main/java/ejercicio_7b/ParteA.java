package ejercicio_7b;



import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ParteA {

    public static void main(String[] args) {
        String route = "vehiculos.txt";

        try(BufferedWriter bw = new BufferedWriter(new FileWriter(route))) {
            Coches coches = new Coches();
            for(Vehiculo vehiculo : coches.getVehiculos()){
                String numero = "";
                if(vehiculo instanceof Turismo){
                    numero="0";
                }else if(vehiculo instanceof Deportivo){
                    numero ="1";
                } else if(vehiculo instanceof Furgoneta){
                    numero="2";
                }

                bw.write(numero+"-"+vehiculo.toString());
                bw.newLine();
            }
            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        String linea;
        try (Scanner datosFichero = new Scanner(new File(route), "UTF-8")) {
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
