package juegos;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class ParesYNones {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        Random rd = new Random();

        int opcionMenu=0;
        int numeroMaquina;
        int numeroUsuario = 0;
        int suma = 0;
        boolean seguir=true;
        String opcion = "";
        do {
            
            do{
                //Menu inicial del juego, controlamos que en la opcion
                //no sea una valor no numérico 
            System.out.println("Bienvenido al juego de pares o nones");
            System.out.println("Menu de opciones");
            System.out.println("1-Jugar");
            System.out.println("2-Salir");
            System.out.println("Eliga opcion");
                try {
                    opcionMenu = entrada.nextInt();
                    seguir=false;
                } catch (InputMismatchException ime) {
                    System.out.println("Ha introducido un valo no numérico, repita");
                }
            entrada.nextLine();
            }while(seguir);
            switch (opcionMenu) {
                case 1:
                    System.out.println("En este programa vas a jugar contra la maquina");
                    System.out.println("Para ello elige primero pares o nones");

                    //Bucle que se repite si introducimos algo que no sea ni pares ni nones
                    do {

                        opcion = entrada.nextLine();
                        opcion = opcion.toLowerCase();
                        //Pasamos a minúsculas, lo utilizaremos para entrar a los case del 
                        //Switch

                        //Condición que saca mensaje si la opcion no es ni pares ni nones
                        if (!opcion.equalsIgnoreCase("pares") && !opcion.equalsIgnoreCase("nones")) {
                            System.out.println("No has escrito ni pares ni nones, repita");
                        }

                    } while ((!opcion.equalsIgnoreCase("pares") && !opcion.equalsIgnoreCase("nones")));

                    System.out.println("Has elegido " + opcion);
                    System.out.println("Elige un numero del 0 al 10");
                    //Pedimos al usuario un número del 0 al 10

                    //Filtramos tanto que no se introduzcan valores numéricos tanto como
                    //que se introduzcan numero entre 1 y 10 con doble bucle do while y try
                    //catch
                    do {
                        seguir = true;
                        do {

                            try {
                                numeroUsuario = entrada.nextInt();
                                seguir = false;

                            } catch (InputMismatchException ime) {
                                System.out.println("Valor no numerico, repita");
                            }
                            entrada.nextLine();
                        } while (seguir);

                        if (numeroUsuario < 0 || numeroUsuario > 10) {
                            System.out.println("Numero fuera de rango, repita");
                        }
                    } while (numeroUsuario < 0 || numeroUsuario > 10);

                    //Generamos un numero random entre 0 y 10 que será el de la máquina
                    numeroMaquina = rd.nextInt(11);

                    //Inicializamos la variable con el valor de la suma de los dos números
                    //el nuestro ya filtrado y el generado de la máquina
                    suma = numeroMaquina + numeroUsuario;

                    //Mensajes para comprobar los valores de cada número previamente
                    System.out.println("Tu numero es " + numeroUsuario);
                    System.out.println("El numero de la máquina es " + numeroMaquina);

                    //Switch según la opción elegida previamente
                    //La suma habra dado un valor par o impar y según lo que hayamos elegido, pares o 
                    //nones ganaremos o perderemos
                    switch (opcion) {
                        case "pares":

                            //Si hemos elegido pares y el resto de dividir entre 2 es 0
                            //Habremos ganado al contrario habremos perdido
                            System.out.println("La suma es " + suma);
                            if (suma % 2 == 0) {
                                System.out.println("Has ganado");
                            } else {
                                System.out.println("Has perdido");
                            }

                            break;
                        case "nones":
                            //Si hemos elegido nones y el resto de dividir entre 2 es 0
                            //Habremos perdido al contrario habremos ganado
                            System.out.println("La suma es " + suma);
                            if (suma % 2 == 0) {
                                System.out.println("Has perdidio");
                            } else {
                                System.out.println("Has ganado");
                            }
                            break;

                    }
                    break;
                case 2:

                    System.out.println("Saliendo");

                    break;
                default:
                    System.out.println("Opción no disponible repita");
            }
        } while (opcionMenu != 2);
    }

}
