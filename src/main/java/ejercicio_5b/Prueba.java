package ejercicio_5b;

import java.time.LocalDate;
import java.time.Year;
import java.util.InputMismatchException;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Prueba {

    public static void main(String[] args) {

        //En este programa he decidido agregar clientes y vehiculos manualmente
        // a la lista de clientes y de vehiculos.
        //Se puede sustituir la opcion 1 y 2 registrando ya clientes y vehiculos
        //generados automaticamente
        
        //Principal mente la empresa se crea con una lista de clientes y una de vehiculos
        //Los alquileres a 0 , vamos añadiendo segun el transcurra el programa
        
        //Inmprimo los datos de la empresa antes y despues para ver los cambios
        int opcion = 0;
        Empresa e = new Empresa("Empresa clase");

        System.out.println(e);
        
        do {
            opcion = filtrarOpcion();

            switch (opcion) {
                case 1 -> {
                    e.registrarClientePedidaDatos(crearCliente());
                }
                case 2 -> {
                    e.registrarVehiculoPedidaDatos(crearVehiculo());
                }
                case 3 -> {

                    e.registrarAlquilerIntroducir();

                }
                case 4 -> {
                    JOptionPane.showMessageDialog(null, "Saliendo.....");
                }

            }

        } while (opcion != 4);

        System.out.println(e);

    }

    public static int filtrarOpcion() {

        String menu = """
                    Aplicación de nuestra empresa
                    
                    1- Dar de alta cliente
                    2- Dar de alta vehiculo
                    3- Registrar alquiler
                    
                    4- Salir de la aplicacion
                    
                    Para seleccionar la opcion deberá
                    introducir el número correspondiente
                    a la opción.
                    """;

        int numero = 0;
        final int MIN = 1;
        final int MAX = 4;
        boolean seguir = true;
        do {

            try {
                numero = Integer.parseInt(JOptionPane.showInputDialog(menu));
                if (numero >= MIN && numero <= MAX) {
                    seguir = false;
                } else {
                    JOptionPane.showMessageDialog(null, "La opción debe estar entre " + MIN + " y " + MAX);
                }
            } catch (NumberFormatException nfe) {
                JOptionPane.showMessageDialog(null, "Ha introducido un valor incorrecto, repita");
            }

        } while (seguir);

        return numero;

    }

    public static Cliente crearCliente() {

        String nombre = "";
        String apellido = "";
        String nif;

        JOptionPane.showMessageDialog(null, "Datos del cliente");

        nombre = JOptionPane.showInputDialog("Nombre del cliente");
        apellido = JOptionPane.showInputDialog("Apellido del cliente");
        nif = JOptionPane.showInputDialog("Nif del cliente");

        Cliente c = new Cliente(nombre, apellido, nif);

        return c;

    }

    public static Vehiculo crearVehiculo() {

        String bastidor = "";
        String matricula = "";
        String color = "";
        String modelo = "";

        JOptionPane.showMessageDialog(null, "Datos del Vehiculo");

        bastidor = JOptionPane.showInputDialog("Bastidor del Vehiculo");

        matricula = JOptionPane.showInputDialog("Matricula del vehiculo");

        color = JOptionPane.showInputDialog("Color del vehiculo");

        modelo = JOptionPane.showInputDialog("Modelo del vehiculo");

        Vehiculo v = new Vehiculo(bastidor, matricula, color, modelo);

        return v;

    }

    public static LocalDate crearFecha() {

        int año = Utilidades.numeroEnteroRandom(LocalDate.now().getYear(), 2030);

        int mes;

        if (año == LocalDate.now().getYear()) {

            mes = Utilidades.numeroEnteroRandom(LocalDate.now().getMonthValue(), 12);

        } else {
            mes = Utilidades.numeroEnteroRandom(1, 12);
        }

        int dia;

        if (mes == 2 && Year.isLeap(año)) {
            dia = Utilidades.numeroEnteroRandom(1, 29);
        } else if (mes == 2) {

            dia = Utilidades.numeroEnteroRandom(1, 28);

        } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {

            dia = Utilidades.numeroEnteroRandom(1, 30);

        } else {
            dia = Utilidades.numeroEnteroRandom(1, 31);
        }

        return LocalDate.of(dia, mes, año);

    }

}
