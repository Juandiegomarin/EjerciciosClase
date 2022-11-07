package juegos_de_dedos;

import java.util.InputMismatchException;
import java.util.Random;
import javax.swing.JOptionPane;

public class MorrasMetodizado {

    public static void main(String[] args) {
        
        eleccionOpcion();

    }

    private static int mostrarMenuLeerOpcion() {

        int opcion;
        String menu = """
                
                Bienvenido al juego de la morra
                                ------------------------------------
                                    -Menú de opciones.      
                                                                             
                                    1-Partida Simple                   
                                    2-Salir                         
                                                                    
                                ------------------------------------
                                
                                Elija una opcion
                
                """;

        opcion = Integer.parseInt(JOptionPane.showInputDialog(null, menu));
        return opcion;
    }

    private static int filtrarOpcion() {

        int opcion = 0;
        boolean seguir = true;

        do {

            try {
                opcion = mostrarMenuLeerOpcion();

                seguir = false;
            } catch (NumberFormatException nfe) {
                JOptionPane.showMessageDialog(null,
                        "Has introducido un valor no numérico, repita ");

            }

        } while (seguir);

        return opcion;

    }

    private static void eleccionOpcion() {

        int opcion = 0;

        do {

            opcion = filtrarOpcion();

            switch (opcion) {
                case 1:

                    partidaSimple();
                    break;

                case 2:

                    JOptionPane.showMessageDialog(null,
                            "Saliendo del programa...");
                    break;
                default:

                    JOptionPane.showMessageDialog(null,
                            "Opción incorrecta, repita");

            }

        } while (opcion != 2);

    }

    private static void partidaSimple() {

        Random rd = new Random();

        boolean seguir;
        int numeroMaquina;
        int numeroJugador = 0;
        int prediccionMaquina;
        int prediccionJugador = 0;
        int suma;
        int victoriasMaquina = 0;
        int victoriasUsuario = 0;
        int contador = 0;
        String resultado;

        JOptionPane.showMessageDialog(null,
                "Bienvenido al juego de la morra\n"
                + "Ambos jugadores sacareis un numero de 0 a 5"
                + " a la vez que decis un numero que penseis que será la suma "
                + "entre los dedos de ambos jugadores ");
        do{
        numeroMaquina = rd.nextInt(6);
        //Condición reglas
        if (numeroMaquina == 0) {
            numeroMaquina = 1;
        }

        numeroJugador = filtrarNumeroParaSacar();
        prediccionJugador = filtrarNumeroPredecir();

        prediccionMaquina = rd.nextInt(9) + 2;

        suma = numeroJugador + numeroMaquina;
        
        resultado=comprobarGanadorRonda(numeroJugador, numeroMaquina, prediccionJugador, prediccionMaquina, suma);
        comprobarVictorias(resultado, victoriasUsuario, victoriasMaquina);
        contador++;
        
        if (contador == 20 && victoriasUsuario == victoriasMaquina) {
                JOptionPane.showMessageDialog(null, "Empate técnico,  nadie ha ganado la partida");
                break;
            }
        }while((victoriasUsuario > 5 && victoriasUsuario - victoriasMaquina >= 2)
                || (victoriasMaquina > 5 && victoriasMaquina - victoriasUsuario >= 2) || contador < 21);
    }

    private static int filtrarNumeroParaSacar() {

        int numero = 0;
        boolean seguir = true;
        do {
            seguir = true;
            do {

                try {
                    numero = Integer.parseInt(JOptionPane.showInputDialog("La maquina ya tiene un número escondido ahora"
                            + " elige tu uno entre el 0 y el 5"));
                    seguir = false;

                } catch (NumberFormatException nfe) {
                    System.out.println("Valor no numerico, repita");
                }
                ;
            } while (seguir);

            if (numero < 0 || numero > 5) {
                JOptionPane.showMessageDialog(null,
                        "Numero fuera de rango, repita");
            }
        } while (numero < 0 || numero > 5);

        if (numero == 0) {
            numero = 1;
        }

        return numero;
    }

    private static int filtrarNumeroPredecir() {

        int numero = 0;
        boolean seguir = true;

        JOptionPane.showMessageDialog(null,
                "Ahora sacareis los numeros mientras dices cual"
                + " crees que será el total\n"
        );

        do {
            seguir = true;
            do {

                try {
                    numero = Integer.parseInt(JOptionPane.showInputDialog(
                            "Piensa cual crees que es el total"));
                    seguir = false;

                } catch (NumberFormatException nfe) {
                    System.out.println("Valor no numerico, repita");
                }
                ;
            } while (seguir);

            if (numero < 2 || numero > 10) {
                JOptionPane.showMessageDialog(null,
                        "Numero fuera de rango, repita\n"
                        + "El minimo puede ser 2 ya que la suma minima"
                        + " es de 1 dedo + 1 dedo y el máximo puede ser 10 ya que "
                        + " la suma máxima es 5 dedos + 5 dedos");
            }
        } while (numero < 2 || numero > 10);

        return numero;

    }

    private static String comprobarGanadorRonda(int numeroJugador, int numeroMaquina,
            int prediccionJugador, int prediccionMaquina, int suma) {

        String resultado = "";
        
        JOptionPane.showMessageDialog(null, "Tu has sacado " + numeroJugador
                    + " y tu predicción es " + prediccionJugador);
        
        JOptionPane.showMessageDialog(null, "La máquina ha sacado " + numeroMaquina
                    + " y su predicción es " + prediccionMaquina);
        
        JOptionPane.showMessageDialog(null, "El total es " + suma);

        if (prediccionJugador == suma && prediccionMaquina == suma) {
            resultado = "Empate, siguiente ronda";

        } else {
            //Condiciones para ver si alguien ha ganado o tadavia se sigue jugando
            if (prediccionJugador == suma) {
                resultado = "Has ganado";

            }
            if (prediccionMaquina == suma) {
                resultado = "Ha ganado la maquina";

            }
            if (prediccionJugador != suma && prediccionMaquina != suma) {
                resultado = "Nadie ha ganado se repite la ronda";
            }
        }

        return resultado;

    }

    private static void comprobarVictorias(String resultado, int victoriasJ, int victoriasM) {

        if (resultado == "Empate, siguiente ronda") {
            victoriasJ++;
            victoriasM++;
        } else if (resultado == "Has ganado") {
            victoriasJ++;
        } else if (resultado == "Ha ganado la maquina") {
            victoriasM++;
        } else {
            JOptionPane.showMessageDialog(null,
                    "Nadie ha ganado se repite la ronda");
        }
        
        JOptionPane.showMessageDialog(null,
                    "Llevas " + victoriasJ + " victorias");
        JOptionPane.showMessageDialog(null,
                    "La maquina lleva " + victoriasM + " victorias");

    }
}
