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
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class GenerarFicheros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws JAXBException {

        List<Factura> facturas = new ArrayList<>();

        rellenarListaFactura(facturas);

        imprimirListaFacturas(facturas);

        String rutaXml = "./xml";
        Path carpetaXml = Paths.get(rutaXml);

        crearCarpeta(carpetaXml);

        String rutaCsv = "./csv";
        Path carpetaCsv = Paths.get(rutaCsv);

        crearCarpeta(carpetaCsv);

        String rutaArchivoXml = "./xml/facturas.xml";
        Path XML = Paths.get(rutaArchivoXml);

        crearFichero(XML);

        String rutaArchivoCsv = "./csv/facturas.csv";
        Path CSV = Paths.get(rutaArchivoCsv);

        crearFichero(CSV);
        
        System.out.println("--------------------------------------------------");
        System.out.println("Fichero xml");
        escribirFicheroXML(facturas,XML);
        
        
        System.out.println("--------------------------------------------------");
        System.out.println("Fichero csv");
        escribirFichero(CSV, facturas);
        System.out.println("---------------------------------------------------");
        System.out.println("Lectura fichero");
        System.out.println("---------------------------------------------------");
        leerFichero(CSV);
        System.out.println("-----------------------------------------------");
       

        

        
      

        

        

        
        String rutaCarpetaFacturas="./facturascsv";
        Path carpetaFacturas = Paths.get(rutaCarpetaFacturas);
        
        
        crearCarpeta(carpetaFacturas);
        crearFicherosPorNumero(facturas, carpetaFacturas);

        

    }

    public static void rellenarListaFactura(List<Factura> l) {

        for (int i = 0; i < 50; i++) {

            l.add(new Factura());

        }

    }

    public static void imprimirListaFacturas(List<Factura> l) {

        l.forEach(System.out::println);

    }

    public static void crearCarpeta(Path nombreCarpeta) {

        try {
            Files.createDirectory(nombreCarpeta);
        } catch (IOException e) {
            System.out.println("Problema creando el directorio.");
            System.out.println(e.toString());
        }

    }

    public static void crearFichero(Path nombreFichero) {

        try {
            // Este método no crea el archivo si ya existe
            Files.createFile(nombreFichero);
        } catch (IOException e) {
            System.out.println("Problema creando el archivo.");
            System.out.println(e.toString());
        }
    }

    public static void escribirFichero(Path p, List<Factura> facturas) {

        String tmp = "";
        String linea = "";
        try (BufferedWriter flujo = new BufferedWriter(new FileWriter(p.toFile()))) {

            for (Factura factura : facturas) {

                tmp = factura.toString();

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

    public static void leerFichero(Path p) {
        
        
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
    
    public static void crearFicherosPorNumero(List<Factura> facturas,Path p){
        
        String tmp="";
        
        for (Factura f : facturas) {

            Path ficherito = Paths.get(p.getRoot()+"/"+ f.getCodigoUnico() + ".csv");
            try {
                // Este método no crea el archivo si ya existe
                Files.createFile(ficherito);
            } catch (IOException e) {
                System.out.println("Problema creando el archivo.");
                System.out.println(e.toString());
            }

            try (BufferedWriter flujo = new BufferedWriter(new FileWriter("./facturascsv/" + f.getCodigoUnico() + ".csv"))) {

                tmp = f.toString();

                flujo.write(tmp);

                flujo.newLine();

                // Metodo fluh() guarda cambios en disco 
                flujo.flush();
                System.out.println("Fichero " + f.getCodigoUnico() + " creado correctamente.");
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }

        }
    
    
    
    }
    
    public static void escribirFicheroXML(List<Factura> f,Path p) throws JAXBException{
    
        ListaFacturas lista = new ListaFacturas();
        lista.setLista( f);
        lista.setDescripcion("Mis facturas");
       
        // Crea el contexto JAXB. Se encarga de definir los objetos 
        // que vamos a guardar. En nuestro caso sólo el tipo CatalogoMuebles
        JAXBContext contexto = JAXBContext.newInstance(ListaFacturas.class);
        
        // El contexto JAXB permite crear un objeto Marshaller, que sirve para
        // generar la estructura del fichero XML 
        // El proceso de pasar objetos Java (CatalogoMuebles) a ficheros XML 
        // se conoce como "marshalling" o "serialización"
        Marshaller serializador = contexto.createMarshaller();
        
        // Especificamos que la propiedad del formato de salida
        // del serializador sea true, lo que implica que el formato se 
        // realiza con indentación y saltos de línea
        serializador.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

        // Llamando al método de serialización marshal (sobrecargado) se pueden
        // serializar objetos java en formato XML y volcarlos donde necesitemos:
        // consola, ficheros. El proceso consiste en que el contexto es el 
        // encargo de leer los objetos java, pasarlos al serializador y éste 
        // crear la salida de serialización
        
        // Serialización y salida por consola
        serializador.marshal(lista, System.out);

        // Volcado al fichero xml
        serializador.marshal(lista, new File(p.toString()));
    
    
    
    
    
    }

}
