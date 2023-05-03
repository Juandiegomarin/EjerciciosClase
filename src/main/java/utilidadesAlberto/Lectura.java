package utilidadesAlberto;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lectura {

    public static <T> List<T> leerCsv(String nombre, String separador) {
        List<T> datos = new ArrayList<>();

        try (Scanner sc = new Scanner(new File(nombre))) {
            while (sc.hasNextLine()) {
                String linea = sc.nextLine();
                linea = linea.replaceAll(" ", "");
                linea = linea.replaceAll("\"", "");

                String[] datosLinea = linea.split(separador);


            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        return datos;
    }

    public static <T> List<T> leerArchivoJSON1(String nombre, Class<T> clase) {
        List<T> datos = new ArrayList<>();
        ObjectMapper mapeador = new ObjectMapper();
        mapeador.registerModule(new JavaTimeModule());

        try {
            datos.addAll(mapeador.readValue(new File(nombre),
                    mapeador.getTypeFactory().constructCollectionType(ArrayList.class, clase)));

        } catch (IOException e) {
            e.printStackTrace();
        }

        return datos;
    }

    public static <T> T leerArchivoJSON2(String nombre, Class<T> clase) {
        T datos = null;
        ObjectMapper mapeador = new ObjectMapper();
        mapeador.registerModule(new JavaTimeModule());

        try {
            datos = mapeador.readValue(new File(nombre),
                    mapeador.getTypeFactory().constructType(clase));
        } catch (IOException e) {
            e.printStackTrace();
        }

        return datos;
    }
    //metodo para leer xml
    public static <T> List<T> leerArchivoXML(String nombre, Class<T> clase) {
        List<T> datos = new ArrayList<>();
        ObjectMapper mapeador = new ObjectMapper();
        mapeador.registerModule(new JavaTimeModule());

        try {
            datos.addAll(mapeador.readValue(new File(nombre),
                    mapeador.getTypeFactory().constructCollectionType(ArrayList.class, clase)));

        } catch (IOException e) {
            e.printStackTrace();
        }

        return datos;
    }
}
