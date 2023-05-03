/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_7f;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
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
    public static void main(String[] args) throws IOException {

        List<Empleado> empleados = new ArrayList<>();

        String ruta = "./RelPerCen.csv";
        String code = "ISO-8859-1";

        empleados = leerCsvCrearLista(ruta, code);

        System.out.println("--------------------------------------------------");

        System.out.println("Lista de empleados");
        empleados.forEach(System.out::println);

        System.out.println("--------------------------------------------------");

        List<Empleado> empleadosFecha = crearListaBetweenAnios(10, 15, empleados);

        ObjectMapper mapeador = new ObjectMapper();

        String fJason = "empleados.json";
        escribirJson(fJason, empleadosFecha, mapeador);
        
        
        
        System.out.println("Leyendo json");
        leerJson(fJason, mapeador);

        System.out.println("--------------------------------------------------");
        System.out.println("--------------------APARTADO A--------------------");

        System.out.println("Cuantos profes hay de tecno");
        contarProfesAsigCoor(empleados, "Tecnología");
        System.out.println("");
        

        System.out.println("Saber si algún profesor/a de Informática es también coordinador");
        hayProfeAsig(empleados, "Informatica");
        System.out.println("");
        
        
        System.out.println("Obtener una lista ordenada alfabéticamente con todos los apellidos de los empleados cuyo NIF contenga la letra J.");
        System.out.println("--------------------------------------------------");
        listaApellidos(empleados);
        System.out.println("--------------------------------------------------");
        System.out.println("");
        

        System.out.println("Hay algun Jonh");
        buscarNombre(empleados, "Jonh");
        System.out.println("");
        

        System.out.println("--------------------------------------------------");
        System.out.println("--------------------APARTADO B--------------------");

        System.out.println("Cuantos profes hay de tecno");
        contarProfesAsigStream(empleados, "Tecnologia");
        System.out.println("");
        

        System.out.println(" Saber si algún profesor/a de Informática es también coordinador");
        hayProfeAsigCoorStream(empleados, "Informatica");
        
        
        System.out.println("Obtener una lista ordenada alfabéticamente con todos los apellidos de los empleados cuyo NIF contenga la letra J.");
        System.out.println("--------------------------------------------------");
        listaApellidosStream(empleados);
        System.out.println("--------------------------------------------------");
        System.out.println("");
        
        
        System.out.println("Hay algun Jonh");
        buscarNombreStream(empleados, "John");
        

    }

    public static List<Empleado> leerCsvCrearLista(String ruta, String codificacion) {

        int fila = 0;
        String tmp;

        String[] tokens;
        String linea;

        List<Empleado> l = new ArrayList<>();

        try (Scanner datosFichero = new Scanner(new File(ruta), codificacion)) {
            // hasNextLine devuelve true mientras haya líneas por leer
            while (datosFichero.hasNextLine()) {

                // Guarda la línea completa en un String
                linea = datosFichero.nextLine();
                // Se guarda en el array de String cada elemento de la
                // línea en función del carácter separador de campos del fichero CSV
                if (fila != 0) {

                    tokens = linea.split(",");

                    

                    for (int i = 0; i < tokens.length; i++) {
                        
                        tokens[i] = tokens[i].replaceAll("\"", "");

                    }

                    Empleado e = new Empleado();
                    e.setApellidos(tokens[0]);
                    e.setNombre(tokens[1]);
                    e.setDni(tokens[2]);
                    e.setPuesto(tokens[3]);
                    if (tokens[4].equals("")) {

                        e.setFechaIni(null);
                    } else {

                        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                        LocalDate fecha = LocalDate.parse(tokens[4], formatter);

                        e.setFechaIni(fecha);
                    }
                    if (tokens[5].equals("")) {

                        e.setFechaCese(null);
                    } else {

                        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                        LocalDate fecha = LocalDate.parse(tokens[5], formatter);

                        e.setFechaIni(fecha);

                    }
                    e.setTelefono(tokens[6]);
                    e.setEvaluador(tokens[7]);
                    e.setCoordinador(tokens[8]);

                    l.add(e);
                }
                fila++;
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

        return l;
    }

    public static List<Empleado> crearListaBetweenAnios(int anioMin, int anioMax, List<Empleado> l) {

        List<Empleado> aux = new ArrayList<>();

        for (Empleado empleado : l) {

            if (empleado.getFechaIni().isBefore(LocalDate.now().minusYears(anioMin)) && (empleado.getFechaIni().isAfter(LocalDate.now().minusYears(anioMax)))) {

                aux.add(empleado);
            }

        }

        return aux;
    }

    public static void escribirJson(String ruta, List<Empleado> l, ObjectMapper mapeador) throws IOException {

        // Permite a mapeador usar fechas según java time
        mapeador.registerModule(new JavaTimeModule());

        // Formato JSON bien formateado. Si se comenta, el fichero queda minificado
        mapeador.configure(SerializationFeature.INDENT_OUTPUT, true);

        // Escribe en un fichero JSON el catálogo de muebles
        mapeador.writeValue(new File(ruta), l);

    }

    public static void leerJson(String ruta, ObjectMapper mapeador) throws IOException {

        List<Empleado> listaJason = mapeador.readValue(new File(ruta), mapeador.getTypeFactory().constructCollectionType(ArrayList.class, Empleado.class));

        listaJason.forEach(System.out::println);

    }

    public static void contarProfesAsigCoor(List<Empleado> l, String asig) {

        int contador = 0;

        // apartado A
        for (Empleado e : l) {
            if (e.getPuesto().contains(asig)) {

                contador++;

            }

        }

        System.out.println("El número de profesores de Tecnología es: " + contador);

    }

    public static void hayProfeAsig(List<Empleado> l, String asig) {

        boolean hay = false;

        for (Empleado e : l) {
            if (e.getPuesto().contains(asig) && e.getCoordinador().equalsIgnoreCase("si")) {

                hay = true;

            }
        }
        System.out.println("Hay algun profesor de" + asig + " coordinador: " + hay);

    }

    public static void listaApellidos(List<Empleado> l) {

        List<String> listaApellidos = new ArrayList<>();

        for (Empleado e : l) {
            if (e.getDni().contains("J")) {

                listaApellidos.add(e.getApellidos());
            }

        }
        listaApellidos.sort((a1, a2) -> a1.compareToIgnoreCase(a2));

        listaApellidos.forEach(System.out::println);

    }

    public static void buscarNombre(List<Empleado> l, String nombre) {

        boolean hay = false;
        for (Empleado e : l) {
            if (e.getNombre().contains("Jonh")) {
                hay = true;
            }
        }

        System.out.println("Contiene la lista de empleados algún/a " + nombre + ": " + hay);

    }

    public static void contarProfesAsigStream(List<Empleado> l, String asig) {

        int contador = 0;

        contador = (int) l.stream()
                .filter(a -> a.getPuesto().contains(asig))
                .count();

        System.out.println("En la lista de empleados hay:  " + contador + " de " + asig);

    }

    public static void hayProfeAsigCoorStream(List<Empleado> l, String asig) {

        int contador = (int) l.stream()
                .filter(a -> a.getPuesto().contains(asig))
                .filter(p -> p.getDni().contains("j"))
                .count();

        if (contador > 0) {
            System.out.println("Si los hay");
        } else {

            System.out.println("No lo hay");
        }

    }

    public static void listaApellidosStream(List<Empleado> l) {

        List<String> aux = new ArrayList<>();

        aux = l.stream()
                .sorted((a1, a2) -> a1.getApellidos().compareToIgnoreCase(a2.getApellidos()))
                .filter(a -> a.getDni().contains("J"))
                .map(a -> a.getApellidos())
                .toList();

        aux.forEach(System.out::println);

    }
    
    public static void buscarNombreStream(List<Empleado> l, String nombre) {
        
        boolean hay = true;

        hay = l.stream()
                .allMatch(n -> n.getNombre().contains(nombre));

        System.out.println("Hay algú/a "+nombre+" en la lista de empleados: " + hay);
        

    }

}
