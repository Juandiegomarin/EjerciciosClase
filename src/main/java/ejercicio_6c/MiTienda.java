package ejercicio_6c;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class MiTienda {

    public static void main(String[] args) {

        ArrayList<Producto> productos = new ArrayList<>();
        ArrayList<Libro> libros = new ArrayList<>();

        Pantalon pt1 = new Pantalon("M", "Nike", "1", 10.00, 0.21, "Bonito pantalon");
        Pantalon pt2 = new Pantalon("M", "Adidas", "2", 10.00, 0.21, "Bonito pantalon");

        Libro l1 = new LibroDigital(2, "1234", "3", 5.00, 0.01, "Libro Digital");
        Libro l2 = new LibroPapel(100, "1234", "4", 5.00, 0.01, "Libro de papel");

        Musica m1 = new Musica("Beatles", "5", 12.00, 0.5, "Disco");
        Musica m2 = new Musica("El barrio", "6", 33.00, 0.21, "Mar de leva");

        productos.add(pt1);
        productos.add(pt2);
        productos.add(l1);
        productos.add(l2);
        productos.add(m1);
        productos.add(m2);

        System.out.println("--------------------------------");
        System.out.println("Lista de productos");
        productos.forEach(System.out::println);
        System.out.println("--------------------------------");

        System.out.println("Ordenada por precios");
        productos.sort((p1, p2) -> Double.compare(p1.getPrecio(), p2.getPrecio()));
        productos.forEach(System.out::println);

        System.out.println("--------------------------------");

        System.out.println("Ordenada por codigo");
        productos.sort((p1, p2) -> p1.getCodigo().compareTo(p2.getCodigo()));
        productos.forEach(System.out::println);

        System.out.println("--------------------------------");

        System.out.println("El producto con codigo 1 esta en la posicion " + Collections.binarySearch(productos, pt1, (p1, p2) -> p1.getCodigo().compareTo(p2.getCodigo())));

        System.out.println("---------------------------------");

        System.out.println("Guardar libros");

        for (Producto producto : productos) {

            if (producto instanceof Libro) {
                libros.add((Libro) producto);
            }

        }
        

        
        for (Iterator<Libro> iterator = libros.iterator(); iterator.hasNext();) {
            
            System.out.println(iterator.next());
            
        }
        
        System.out.println("------------------------------------");
        System.out.println("Ordenar isbn");
        Collections.sort(libros);
        
        libros.forEach(System.out::println);
        
        System.out.println("-------------------------------------");
        System.out.println("Ejecutar interfaz segun libro");
        
        for (Libro libro : libros) {
            
            if(libro instanceof LibroDigital){
                ((LibroDigital) libro).descargar();
                //Explicita
            }
            
             if(libro instanceof LibroPapel){
                ((LibroPapel) libro).enviar("Ies Mar de Alboran");
                //Explicita
            }
            
        }
        System.out.println("--------------------------------------");
        
        System.out.println("Contiene la lista de libros el libro l1");
        System.out.println(libros.contains(l1));
        
        System.out.println("----------------------------------------");
        
        System.out.println("Lista de productos enviables");
        
        ArrayList<SeEnvia> enviables= new ArrayList<>();
        
        for (Producto p : productos) {
            
            if(p instanceof SeEnvia){
                enviables.add((SeEnvia)p);
            }
            
        }
        
        enviables.forEach(System.out::println);
        
        System.out.println("------------------------------");
        
        System.out.println("Enviar productos");
        
        for (SeEnvia e : enviables) {
            e.enviar("Ies Mar de Alboran");
        }
        
        System.out.println("--------------------------------");
        
        System.out.println("Metodo nuevo abstracto");
        
        for (Libro l : libros) {
            l.dejarDeLeer();
        }
        
    }

}
