package ejercicio_7b;



import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;


public class EscribirFicheros {

    public static void EscribirFicheros(ArrayList<Vehiculo> vehiculos){
        
        
        String turismo= "Turismos.txt";
        String furgoneta="Furgonetas.txt";
        String deportivo ="Deportivos..txt";
        
        ArrayList<Vehiculo> turismos = new ArrayList<>();
        ArrayList<Vehiculo> furgonetas = new ArrayList<>();
        ArrayList<Vehiculo> deportivos = new ArrayList<>();

        vehiculos.forEach(vehiculo -> {
            if(vehiculo instanceof Turismo){
                turismos.add((Turismo) vehiculo);
            } else if (vehiculo instanceof Deportivo) {
                deportivos.add((Deportivo) vehiculo);
            }else if(vehiculo instanceof  Furgoneta){
                furgonetas.add((Furgoneta) vehiculo);
            }
        });

        escribirFile(turismos,turismo);
        escribirFile(furgonetas,furgoneta);
        escribirFile(deportivos,deportivo);
        
        System.out.println("Turismos");
        leerFichero(turismo);
        System.out.println("-------------------------------------------");
        
        
        System.out.println("Furgonetas");
        leerFichero(furgoneta);
        System.out.println("-------------------------------------------");
        
        
        System.out.println("Deportivos");
        leerFichero(deportivo);
        System.out.println("-------------------------------------------");
        
    }

    private static void escribirFile (ArrayList<Vehiculo> vehiculos, String nombre){
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(nombre))) {
            for (Vehiculo vehiculo: vehiculos) {
                bw.write(vehiculo.toString());
                bw.newLine();
            }
            bw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    
    
    public static void leerFichero(String n){
    
    String linea;
    
    try (Scanner datosFichero = new Scanner(new File(n), "UTF-8")) {
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
