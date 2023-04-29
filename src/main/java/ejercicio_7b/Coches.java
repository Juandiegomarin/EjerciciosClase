package ejercicio_7b;

import java.util.ArrayList;
import java.util.Random;

public class Coches {
    private ArrayList<Vehiculo> vehiculos = new ArrayList<>();

    public Coches() {
        for (int i = 0; i <= 30; i++) {
            Random rd = new Random();
            String[] marcas = {"Renault", "Seat", "Opel", "Mercedes", "Citroen"};
            Vehiculo vehiculo = null;
            if (i <=10) {
                vehiculo = new Turismo("1231a", 123.4, "21312", marcas[rd.nextInt(marcas.length)], 4, false, "Blanco");
            } else if (i <= 20 && i > 10) {
               vehiculo = new Deportivo("1231a", 123.4, "21312", marcas[rd.nextInt(marcas.length)], 4, 500);
            } else if (i>20) {
                vehiculo = new Furgoneta("1231a", 123.4, "21312", marcas[rd.nextInt(marcas.length)], 400, 5);
            }
            vehiculos.add(vehiculo);

        }
    }

    public ArrayList<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    @Override
    public String toString() {
        return "Coches{" +
                "ejercicio04.vehiculos=" + vehiculos +
                '}';
    }

    public static void main(String[] args) {
        Coches coches = new Coches();

        coches.getVehiculos().forEach(System.out::println);
        System.out.println(coches);

    }

}
