package ejercicio_7d;

import ejercicio_7d.Turismo;
import ejercicio_7d.Vehiculo;

import java.util.ArrayList;
import java.util.Comparator;


public class Main {
    public static void main(String[] args) {
        Escritura.crearCarpeta("copias");
        Escritura.copiarFicheros("Deportivos.csv", "copias/Deportivos.csv");
        Escritura.copiarFicheros("Furgonetas.csv", "copias/Furgonetas.csv");
        Escritura.copiarFicheros("Turismos.csv", "copias/Turismos.csv");

        Escritura.listarFicherosDirectorio("copias");

        ArrayList<Vehiculo> listVehiculos = new ArrayList<>();
        Escritura.rellenarArrayDatos(listVehiculos);
        System.out.println("----------------------------------------");
        System.out.println("-LISTA-");
        listVehiculos.forEach(System.out::println);

        Comparator<Vehiculo> criterioBastidor = (v1, v2) -> v1.getNumeroBastidor().compareToIgnoreCase(v2.getNumeroBastidor());
        listVehiculos.sort(criterioBastidor);
        System.out.println("----------------------------------------");
        System.out.println("\n-LISTA ORDENADA-");
        listVehiculos.forEach(System.out::println);

        System.out.println("----------------------------------------");
        Escritura.borrarFicheros("Deportivos.csv");
        Escritura.borrarFicheros("Furgonetas.csv");
        Escritura.borrarFicheros("Turismos.csv");


        Escritura.listarFicherosDirectorio("./");
        System.out.println("----------------------------------------");
        System.out.println("Matriculas ordenadas alfabeticamente de los coches de color gris");
        System.out.println("----------------------------------------");
        listVehiculos.stream().
                filter(v -> v instanceof Turismo)
                .filter(v -> ((Turismo) v).getColor().equalsIgnoreCase("gris"))
                .distinct()
                .forEach(v -> System.out.println(v.getMatricula()));
        System.out.println("----------------------------------------");

        System.out.println("Marcas de los vehiculos");
        System.out.println("----------------------------------------");
        listVehiculos.stream().
                map(Vehiculo::getMarca)
                .distinct()
                .forEach(System.out::println);
        System.out.println("----------------------------------------");
        System.out.println("Numero de vehiculos de la marca citroen");
        System.out.println("----------------------------------------");
        long numeroCitroen = listVehiculos.stream()
                .filter(v -> v.getMarca().equalsIgnoreCase("Citroen"))
                .count();
        System.out.println(numeroCitroen);
        System.out.println("----------------------------------------");
        System.out.println("¿Hay algun peugeot negro?");
        System.out.println("----------------------------------------");
        boolean peugotNegro = listVehiculos.stream()
                .filter(v -> v instanceof Turismo)
                .anyMatch(v -> v.getMarca().equalsIgnoreCase("peugeot") && ((Turismo) v).getColor().equalsIgnoreCase("Negro"));

        System.out.println(peugotNegro);


    }

}
