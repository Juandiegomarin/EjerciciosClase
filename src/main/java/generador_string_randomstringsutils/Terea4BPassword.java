package generador_string_randomstringsutils;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import org.apache.commons.lang3.RandomStringUtils;

public class Terea4BPassword {

    public static void main(String[] args) {

        int opcion = 0;
        int longitud=0;
        
        
        do {
            
            opcion=filtrarOpcionMostrarMenu();
            
            
            switch (opcion) {
                case 1:
                    generadorPinCuatroDigitos();
                    break;
                case 2:
                    generadorContraseniaOchoCaracteres();
                    break;
                case 3:
                    longitud=filtrarLongitud();
                    generarCadenaConArray(longitud);
                    break;
                case 4:
                     JOptionPane.showMessageDialog(null,
                            "Saliendo...");
                    break;

                default:
                    JOptionPane.showMessageDialog(null,
                            "Valor no dispobible repita");

            }

        } while (opcion != 4);

    }

    private static void generadorPinCuatroDigitos() {

        String pin;
        ArrayList<String> listaPin = new ArrayList<String>();

        for (int i = 0; i < 10; i++) {
            pin = RandomStringUtils.randomNumeric(4);
            listaPin.add(pin);
        }

        JOptionPane.showMessageDialog(null, listaPin);
    }

    private static void generadorContraseniaOchoCaracteres() {

        String contrasenia;
        ArrayList<String> listaContrasenia = new ArrayList<String>();

        for (int i = 0; i < 10; i++) {
            contrasenia = RandomStringUtils.randomAlphanumeric(8);
            listaContrasenia.add(contrasenia);
        }

        JOptionPane.showMessageDialog(null, listaContrasenia);
    }

    private static void generarCadenaConArray(int longitud) {

        char[] cadena = {'a', 'b', 'c', 'd', 'e'};
        ArrayList<String> listaSecuencias = new ArrayList<String>();

        for (int i = 0; i < 10; i++) {
            String secuencia = RandomStringUtils.random(longitud, cadena);

            listaSecuencias.add(secuencia);

        }
        JOptionPane.showMessageDialog(null, listaSecuencias);
    }

    private static int filtrarLongitud() {

        int longitud = 0;

        boolean seguir = true;

        do {

            try {
                longitud = Integer.parseInt(
                        JOptionPane.showInputDialog("Introduce la longitud que quieras"
                                + " que tenga la secuencia "));

                seguir = false;
            } catch (NumberFormatException nfe) {

                JOptionPane.showMessageDialog(null,
                        "Valor incorrecto repita");
            }

        } while (seguir);

        return longitud;

    }

    private static int filtrarOpcionMostrarMenu() {

        int opcion = 0;
        boolean seguir = true;
        String menu = """
                    
                    Menú de opciones
                    ------------------------------------
                    1-Generar pin 4 digitos
                    2-Generar contraseña 4 caracteres
                    3-Generar secuencia de n caracteres
                    4-Salir
                    ------------------------------------
                    Introduce una opción
                   """;

        do {

            try {

                opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));

                seguir = false;
            } catch (NumberFormatException nfe) {
                JOptionPane.showMessageDialog(null,
                        "Valor incorrecto, repita");
            }

        } while (seguir);

        return opcion;

    }
}
