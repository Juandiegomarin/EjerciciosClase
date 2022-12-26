package ejercicio_5abc;

import java.time.LocalDate;
import java.time.Month;
import java.time.Year;
import java.util.ArrayList;
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
        Empresa e = new Empresa("Rentacar");

        System.out.println(e);

        do {
            opcion = filtrarOpcion();

            switch (opcion) {
                case 1 -> {
                    e.getClientes().anadirElemento(crearCliente());
                }
                case 2 -> {
                    e.getVehiculos().anadirElemento(crearVehiculo());
                }
                case 3 -> {

                    e.registrarAlquilerIntroducir();

                }
                case 4 -> {
                    JOptionPane.showMessageDialog(null, e.getClientes());
                    String nif = JOptionPane.showInputDialog(
                            "Introduce el nif del cliente del que queremos obtener los alquileres");
                    JOptionPane.showMessageDialog(null, imprimirLista(e.obtenerAlquilerCliente(nif)));

                }
                case 5 -> {

                    JOptionPane.showMessageDialog(null, e.getVehiculos());
                    String bastidor = JOptionPane.showInputDialog(
                            "Introduce el bastidor del vehiculo del que queremos obtener los alquileres");
                    JOptionPane.showMessageDialog(null, imprimirLista(e.obtenerAlquilerVehiculo(bastidor)));

                }
                case 6 -> {
                    JOptionPane.showMessageDialog(null, e.getAlquileres());
                    int id = utilidades.Utilidades.filtrarNumeroEnteroJOptionPane("Intruce el"
                            + " id del alquiler del que quieres obtener el vehiculo");
                    e.recibirVehiculo(e.getAlquileres().buscarAlquiler(id));

                }
                case 7 -> {
                    JOptionPane.showMessageDialog(null, e.getAlquileres());
                    int id = utilidades.Utilidades.filtrarNumeroEnteroJOptionPane("Intruce el"
                            + " id del alquiler que quieres borrar");
                    e.borrarAlquilerId(id);

                }
                case 8 -> {
                    JOptionPane.showMessageDialog(null, e.getAlquileres());
                    JOptionPane.showMessageDialog(null, e.getClientes());
                    String nif = JOptionPane.showInputDialog(
                            "Introduce el nif del cliente que queremos eliminar");
                    
                    e.borrarClienteSinAlquiler(nif);

                }
                case 9 -> {

                    JOptionPane.showMessageDialog(null, e.getAlquileres());
                    JOptionPane.showMessageDialog(null, e.getVehiculos());
                    String bastidor = JOptionPane.showInputDialog(
                            "Introduce el nif del cliente que queremos eliminar");
                    e.borrarVehiculoSinAlquiler(bastidor);

                }
                case 10 -> {
                    JOptionPane.showMessageDialog(null, e.getAlquileres());
                    LocalDate fecha = crearFecha();
                    JOptionPane.showMessageDialog(null, imprimirLista(e.obtenerVehiculosFechaFinalizacionAlquiler(fecha)));

                }
                case 11 -> {
                    JOptionPane.showMessageDialog(null, e.getClientes());
                }
                case 12 -> {
                    JOptionPane.showMessageDialog(null, e.getVehiculos());
                }
                case 13 -> {
                    JOptionPane.showMessageDialog(null, e.getAlquileres());
                }
                case 14 -> {
                    JOptionPane.showMessageDialog(null, "Saliendo.....");
                }

            }

        } while (opcion != 14);

        System.out.println(e);

    }

    public static int filtrarOpcion() {

        String menu = """
                    Aplicación de nuestra empresa
                    
                    1- Dar de alta un cliente
                    2- Dar de alta un vehiculo
                    3- Registrar un alquiler
                      
                    4- Buscar alquileres de un cliente
                    5- Buscar alquileres de un vehiculo
                    6- Recibir vehiculo  
                    7- Borrar alquiler
                      
                    8- Borrar cliente sin alquiler
                    9- Borrar vehiculo sin alquiler
                    10- Obtener vehiculos que terminan alquiler
                      
                    11- Mostrar clientes
                    12- Mostrar vehiculos 
                    13- Mostrar alquileres  
                      
                    14 - Salir de la aplicacion
                    
                    Para seleccionar la opcion deberá
                    introducir el número correspondiente
                    a la opción.
                    """;

        int numero = 0;
        final int MIN = 1;
        final int MAX = 14;
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

    public static LocalDate crearFechaRandom() {

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

    public static LocalDate crearFecha() {

        int dia;
        int mes;
        int año;

        año = utilidades.Utilidades.filtrarNumeroEnteroJOptionPaneRango(LocalDate.now().getYear(), 2030, "Introduce el año de fin de alquiler");

        if (año == LocalDate.now().getYear()) {

            mes = utilidades.Utilidades.filtrarNumeroEnteroJOptionPaneRango(LocalDate.now().getMonthValue(), 12, "Introduce el mes de fin de alquiler");

        } else {
            mes = utilidades.Utilidades.filtrarNumeroEnteroJOptionPaneRango(1, 12, "Introduce el mes de fin de alquiler");

        }
        if (mes == LocalDate.now().getMonthValue()) {
            dia = utilidades.Utilidades.filtrarNumeroEnteroJOptionPaneRango(LocalDate.now().getDayOfMonth(), LocalDate.now().lengthOfMonth(), "Introduce el dia de fin de alquiler");
        } else {
            if (mes == 2 && Year.isLeap(año)) {
                dia = utilidades.Utilidades.filtrarNumeroEnteroJOptionPaneRango(1, 29, "Introduce el dia de fin de alquiler");
            } else if (mes == 2) {

                dia = utilidades.Utilidades.filtrarNumeroEnteroJOptionPaneRango(1, 28, "Introduce el dia de fin de alquiler");

            } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {

                dia = utilidades.Utilidades.filtrarNumeroEnteroJOptionPaneRango(1, 30, "Introduce el dia de fin de alquiler");

            } else {
                dia = utilidades.Utilidades.filtrarNumeroEnteroJOptionPaneRango(1, 31, "Introduce el dia de fin de alquiler");
            }
        }
        return LocalDate.of(año, mes, dia);
    }

    public static String imprimirLista(ArrayList list) {

        String tmp = "";
        for (Object o : list) {
            tmp += o.toString() + "\n";
        }
        return tmp;

    }
}
