package juegos;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Morra {

    public static void main(String[] args) {

        Random rd = new Random();
        Scanner entrada = new Scanner(System.in);

        boolean seguir;
        int numeroMaquina;
        int numeroJugador = 0;
        int prediccionMaquina;
        int prediccionJugador = 0;
        int suma;
        int victoriasMaquina = 0;
        int victoriasUsuario = 0;
        int contador = 0;

        System.out.println("Bienvenido al juego de la morra");
        System.out.println("Ambos jugadores sacareis un numero de 0 a 5"
                + " a la vez que decis un numero que penseis que será la suma "
                + "entre los dedos de ambos jugadores ");

        //Bucle general que se repite si ninguno de los dos acierta
        do {
            //Generamos un número entre 0 y 5 aleatorio para la máquina
            //Las reglas dicen que si sacamos puño cerrado(0 dedos)
            //equivale a 1 dedo(1)

            numeroMaquina = rd.nextInt(6);
            //Condición reglas
            if (numeroMaquina == 0) {
                numeroMaquina = 1;
            }

            System.out.println("La maquina ya tiene un número escondido ahora"
                    + " elige tu uno entre el 0 y el 5");

            //Filtramos tanto que no se introduzcan valores numéricos tanto como
            //que se introduzcan numero entre 0 Y 5 con doble bucle do while y try
            //catch
            do {
                seguir = true;
                do {

                    try {
                        numeroJugador = entrada.nextInt();
                        seguir = false;

                    } catch (InputMismatchException ime) {
                        System.out.println("Valor no numerico, repita");
                    }
                    entrada.nextLine();
                } while (seguir);

                if (numeroJugador < 0 || numeroJugador > 5) {
                    System.out.println("Numero fuera de rango, repita");
                }
            } while (numeroJugador < 0 || numeroJugador > 5);

            //Condición reglas
            if (numeroJugador == 0) {
                numeroJugador = 1;
            }

            System.out.println("Ahora sacareis los numeros mientras dices cual"
                    + " crees que será el total");

            System.out.println("Piensa cual crees que es el total");

            //Filtramos tanto que no se introduzcan valores numéricos tanto como
            //que se introduzcan numero entre 2 Y 10 con doble bucle do while y try
            //catch
            do {
                seguir = true;
                do {

                    try {
                        prediccionJugador = entrada.nextInt();
                        seguir = false;

                    } catch (InputMismatchException ime) {
                        System.out.println("Valor no numerico, repita");
                    }
                    entrada.nextLine();
                } while (seguir);

                if (prediccionJugador < 2 || prediccionJugador > 10) {
                    System.out.println("El minimo es 2 ya que la minima suma es 1+1,"
                            + "vuelva a introducir");
                }
            } while (prediccionJugador < 2 || prediccionJugador > 10);

            //Generamos la preddicción de la maquina entre 2 y 10
            prediccionMaquina = rd.nextInt(9) + 2;

            //Total de (dedos sacados)
            suma = numeroJugador + numeroMaquina;

            //Mensajes para ir controlando como van los numeros y si se cumple 
            //si los jugadores aciertan y ganan o pierden
            System.out.println("Tu has sacado " + numeroJugador
                    + " y tu predicción es " + prediccionJugador);

            System.out.println("La máquina ha sacado " + numeroMaquina
                    + " y su predicción es " + prediccionMaquina);

            System.out.println("El total es " + suma);

            if (prediccionJugador == suma && prediccionMaquina == suma) {
                System.out.println("Empate, siguiente ronda");
                victoriasUsuario++;
                victoriasMaquina++;
            } else {
                //Condiciones para ver si alguien ha ganado o tadavia se sigue jugando
                if (prediccionJugador == suma) {
                    System.out.println("Has ganado");
                    victoriasUsuario++;
                }
                if (prediccionMaquina == suma) {
                    System.out.println("Ha ganado la maquina");
                    victoriasMaquina++;
                }
                if (prediccionJugador != suma && prediccionMaquina != suma) {
                    System.out.println("Nadie ha ganado se repite la ronda");
                }
            }
            System.out.println("Llevas " + victoriasUsuario + " victorias");
            System.out.println("La maquina lleva " + victoriasMaquina + " victorias");
            contador++;
            if (contador == 20 && victoriasUsuario == victoriasMaquina) {
                System.out.println("Empate técnico, nadie ha ganado la partida");
                break;
            }
        } while ((victoriasUsuario > 5 && victoriasUsuario - victoriasMaquina >= 2)
                || (victoriasMaquina > 5 && victoriasMaquina - victoriasUsuario >= 2) || contador < 21);
    }
}
