package ejercicio_7d;


import ejercicio_7d.Turismo;
import ejercicio_7d.Vehiculo;
import ejercicio_7d.Deportivo;
import ejercicio_7d.Furgoneta;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.AccessDeniedException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;


public class Escritura {
    public static void crearCarpeta(String nombreCarpeta) {
        Path directorio = Paths.get(nombreCarpeta);

        try {
            if (!Files.exists(directorio)) {
                Files.createDirectory(directorio);
                System.out.println("Se ha creado el directorio");
            }

        } catch (AccessDeniedException ade) {
            System.out.println("No tienes permisos");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void copiarFicheros(String rutaOrigen, String rutaDestino) {
        Path origen = Paths.get(rutaOrigen);
        Path destino = Paths.get(rutaDestino);

        try {
            if (!Files.exists(destino)) {
                Files.copy(origen, destino);
                System.out.println("Se han copiado los archivos");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void listarFicherosDirectorio(String ruta) {
        Path directorio = Paths.get(ruta);

        try {
            Files.list(directorio).forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static ArrayList<String[]> lecturaFichero(String ruta) {
        ArrayList<String[]> datos = new ArrayList<>();

        try (Scanner sc = new Scanner(new File(ruta))) {
            while (sc.hasNextLine()) {
                String linea = sc.nextLine();
                datos.add(linea.split(";"));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return datos;
    }

    public static void rellenarArrayDatos(ArrayList<Vehiculo> vehiculos) {
        ArrayList<String[]> datosDeportivos = lecturaFichero("copias/Deportivos.csv");
        ArrayList<String[]> datosFurgonetas = lecturaFichero("copias/Furgonetas.csv");
        ArrayList<String[]> datosTurismos = lecturaFichero("copias/Turismos.csv");

        datosDeportivos.forEach(deport -> {
            Deportivo deportivo = new Deportivo(deport[0], Double.parseDouble(deport[1]), deport[2], deport[3], Integer.parseInt(deport[4]), Boolean.parseBoolean(deport[5]), deport[6]);
            vehiculos.add(deportivo);
        });

        datosFurgonetas.forEach(furgo -> {
            Furgoneta fugoneta = new Furgoneta(furgo[0], Double.parseDouble(furgo[1]), furgo[2], furgo[3], Integer.parseInt(furgo[4]), Boolean.parseBoolean(furgo[5]));
            vehiculos.add(fugoneta);
        });

        datosTurismos.forEach(turis -> {
            Turismo turismo = new Turismo(turis[0], Double.parseDouble(turis[1]), turis[2], turis[3], Integer.parseInt(turis[4]), Boolean.parseBoolean(turis[5]), turis[6]);
            vehiculos.add(turismo);
        });
    }

    public static void borrarFicheros(String ruta) {
        Path fichero = Paths.get(ruta);

        if (Files.exists(fichero)) {
            try {
                Files.delete(fichero);
                System.out.println("Se ha borrado" + ruta);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}