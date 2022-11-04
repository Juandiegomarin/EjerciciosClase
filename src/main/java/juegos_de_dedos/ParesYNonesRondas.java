package juegos_de_dedos;

import java.util.InputMismatchException;
import java.util.Random;
import javax.swing.JOptionPane;

public class ParesYNonesRondas {

    public static void main(String[] args) {

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
                    partidaRondas();
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

    private static String partidaSimple() {
        Random rd = new Random();

        String resultado = "";
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
                    resultado = "Has ganado";
                } else {
                    JOptionPane.showMessageDialog(null,
                            "Has perdido ");
                    resultado = "Has perdido";

                }

                break;
            case "nones":
                //Si hemos elegido nones y el resto de dividir entre 2 es 0
                //Habremos perdido al contrario habremos ganado
                JOptionPane.showMessageDialog(null,
                        "La suma es " + suma);
                if (suma % 2 == 0) {
                    JOptionPane.showMessageDialog(null,
                            "Has perdido ");
                    resultado = "Has perdido";
                } else {
                    JOptionPane.showMessageDialog(null,
                            "Has ganado ");
                    resultado = "Has ganado";
                }
                break;

        }
        return resultado;
    }

    private static void partidaRondas() {

        int rondas = 0;
        boolean seguir = true;
        String resultado = "";

        int contadorUsuario = 0;
        int contadorMaquina = 0;

        JOptionPane.showMessageDialog(null, "Este estilo"
                + " es igual que al de la partida simple pero cambia que"
                + " comprende de un numero de rondas, esta debera ser impar para"
                + " que hay un ganador");

        do {

            try {
                rondas = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Introduce el número de rondas"));
                seguir = false;
            } catch (NumberFormatException nfe) {
                JOptionPane.showMessageDialog(null,
                        "Has introducido un valor no numerico, repita");
            }
            if (rondas < 1) {
                JOptionPane.showMessageDialog(null,
                        "No se puede jugar " + rondas + " rondas,repita");
            } else if (rondas == 1) {
                JOptionPane.showMessageDialog(null,
                        "Para jugar una ronda, seleccione juego simple");
            } else if (rondas % 2 == 0) {
                JOptionPane.showMessageDialog(null,
                        "Has introducido un valor numerico par, repita");
            }

        } while (seguir || rondas % 2 == 0 || rondas < 2);

        for (int i = 1; i <= rondas; i++) {

            JOptionPane.showMessageDialog(null,
                    "Ronda numero " + i);
            resultado = partidaSimple();

            if (resultado.equals("Has ganado")) {
                contadorUsuario++;
            } else {
                contadorMaquina++;
            }

            JOptionPane.showMessageDialog(null,
                    "Llevas " + contadorUsuario + " rondas ganadas y "
                    + "la maquina lleva " + contadorMaquina + " rondas ganadas");

            if (rondas == 3) {

                if (contadorUsuario == 2&&contadorMaquina==0) {
                    JOptionPane.showMessageDialog(null,
                            "Has ganado ya que la maquina no tiene opcion de remontar con el"
                            + " numero de rondas que quedan");
                    break;
                }

                if (contadorMaquina == 2 && contadorUsuario==0) {
                    JOptionPane.showMessageDialog(null,
                            "Ha ganado la maquina ya que no tienes opcion de remontar con el"
                            + " numero de rondas que quedan");
                    break;
                }

            } else {

                if (contadorUsuario + contadorMaquina > Math.ceil((double) rondas / 2) && contadorUsuario > contadorMaquina) {
                    JOptionPane.showMessageDialog(null,
                            "Has ganado ya que la maquina no tiene opcion de remontar con el"
                            + " numero de rondas que quedan");
                    break;
                }

                if (contadorUsuario + contadorMaquina > Math.ceil((double) rondas / 2) && contadorUsuario < contadorMaquina) {
                    JOptionPane.showMessageDialog(null,
                            "Ha ganado la maquina ya que no tienes opcion de remontar con el"
                            + " numero de rondas que quedan");
                    break;
                }
            }
        }

        if (contadorUsuario > contadorMaquina) {
            JOptionPane.showMessageDialog(null,
                    "Has ganado la partida de " + rondas + " rondas");
        } else {
            JOptionPane.showMessageDialog(null,
                    "La maquina ha ganado la partida de " + rondas + " rondas");
        }

    }
}
