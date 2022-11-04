package juegos_de_dedos;

import java.util.InputMismatchException;
import java.util.Random;
import javax.swing.JOptionPane;

public class ParesYNonesRondas {

    public static void main(String[] args) {

        mostrarPrograma();

    }

    private static void mostrarPrograma() {

        eleccionOpcion();

    }

    private static String menu() {

        String menu = """
                Bienvenido al juego de pares y nones
                ------------------------------------
                    -Menú de opciones.      
                                                             
                    1-Partida Simple        
                    2-Partida con Rondas            
                    3-Salir                         
                                                    
                ------------------------------------
                
                Elija una opcion
                """;

        return JOptionPane.showInputDialog(null, menu);
    }

    private static void eleccionOpcion() {

        int opcion = 0;

        do {

            opcion = mostrarMenuFiltrarOpcion();
            switch (opcion) {
                case 1:
                    partidaSimple();
                    break;
                case 2:
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null,
                            "Saliendo del programa...");
                    break;
                default:
                    JOptionPane.showMessageDialog(null,
                            "Opción incorrecta, repita");

            }

        } while (opcion != 3);

    }

    private static int leerOpcion() {

        int opcion;

        opcion = Integer.parseInt(menu());

        return opcion;

    }

    private static int mostrarMenuFiltrarOpcion() {

        int opcion = 0;
        boolean seguir = true;
        do {

            try {
                opcion = leerOpcion();
                seguir = false;
            } catch (NumberFormatException nfe) {
                JOptionPane.showMessageDialog(null,
                        "Has introducido un valor no numérico, repita ");
            }

        } while (seguir);

        return opcion;

    }

    private static void partidaSimple() {
        Random rd = new Random();

        String paresONones;
        int numeroUsuario = 0;
        int numeroMaquina = 0;
        boolean seguir;

        do {

            paresONones = JOptionPane.showInputDialog(null,
                    "Elija pares o nones");
            paresONones = paresONones.toLowerCase();
            //Pasamos a minúsculas, lo utilizaremos para entrar a los case del 
            //Switch

            //Condición que saca mensaje si la opcion no es ni pares ni nones
            if (!paresONones.equalsIgnoreCase("pares")
                    && !paresONones.equalsIgnoreCase("nones")) {
                JOptionPane.showMessageDialog(null,
                        "No has escrito ni pares ni nones, repita");
            }

        } while ((!paresONones.equalsIgnoreCase("pares")
                && !paresONones.equalsIgnoreCase("nones")));

        if (paresONones.equals("pares")) {
            JOptionPane.showMessageDialog(null,
                    "Has elegido pares, por lo tanto la maquina será"
                    + " nones");
        } else {
            JOptionPane.showMessageDialog(null,
                    "Has elegido nones, por lo tanto la maquina será"
                    + " pares");
        }

        do {
            seguir = true;
            do {

                try {
                    numeroUsuario = Integer.parseInt(JOptionPane.showInputDialog(null,
                            "Elige un número del 0 al 10")
                    );
                    seguir = false;

                } catch (NumberFormatException nfe) {
                    JOptionPane.showMessageDialog(null,
                            "Valor no numérico, repita");
                }

            } while (seguir);

            if (numeroUsuario < 0 || numeroUsuario > 10) {
                JOptionPane.showMessageDialog(null,
                        "Número fuera de rango, repita");
            }
        } while (numeroUsuario < 0 || numeroUsuario > 10);

        numeroMaquina = rd.nextInt(11);

        //Inicializamos la variable con el valor de la suma de los dos números
        //el nuestro ya filtrado y el generado de la máquina
        int suma = numeroMaquina + numeroUsuario;

        JOptionPane.showMessageDialog(null,
                "Tu numero es " + numeroUsuario + " y el numero de la máquina"
                + " es " + numeroMaquina);

        switch (paresONones) {
            case "pares":

                //Si hemos elegido pares y el resto de dividir entre 2 es 0
                //Habremos ganado al contrario habremos perdido
                JOptionPane.showMessageDialog(null,
                        "La suma es " + suma);
                if (suma % 2 == 0) {
                    JOptionPane.showMessageDialog(null,
                            "Has ganado ");
                } else {
                    JOptionPane.showMessageDialog(null,
                            "Has perdido ");
                }

                break;
            case "nones":
                //Si hemos elegido nones y el resto de dividir entre 2 es 0
                //Habremos perdido al contrario habremos ganado
                System.out.println("La suma es " + suma);
                if (suma % 2 == 0) {
                    JOptionPane.showMessageDialog(null,
                            "Has perdido ");
                } else {
                    JOptionPane.showMessageDialog(null,
                            "Has ganado ");
                }
                break;

        }

    }
}
