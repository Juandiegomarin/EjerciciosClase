package utilidadesAlberto;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.AccessDeniedException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Escritura {
    public static <T> void escribirCsv(String nombre, List<T> datos) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(nombre))) {

            for (T dato : datos) {
                bw.write(dato.toString());
                bw.newLine();
            }
            bw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static <T> void escribirCsv(String nombre, T fichero) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(nombre))) {

            bw.write(fichero.toString());
            bw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static <T> void escribirJSON(String nombre, List<T> datos) {
        ObjectMapper mappeador = new ObjectMapper();

        mappeador.registerModule(new JavaTimeModule());

        mappeador.configure(SerializationFeature.INDENT_OUTPUT, true);

        try {
            mappeador.writeValue(new File(nombre), datos);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void crearCarpetas(String nombreCarpeta) {
        Path directorio = Paths.get(nombreCarpeta);

        try {
            if (!Files.exists(directorio)) {
                Files.createDirectories(directorio);
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

        Path directorios = destino.subpath(0, destino.getNameCount() - 1);

        try {
            if (!Files.exists(destino)) {
                crearCarpetas(directorios.toString());
                Files.copy(origen, destino);
                System.out.println("Se han copiado los archivos");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void borrarFichero(String ruta) {
        Path fichero = Paths.get(ruta);
        try {
            Files.delete(fichero);
            System.out.println("Se ha borrado el fichero");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void crearFicheroxml(String ruta) {
        Path fichero = Paths.get(ruta);
        try {
            Files.createFile(fichero);
            System.out.println("Se ha creado el fichero");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
