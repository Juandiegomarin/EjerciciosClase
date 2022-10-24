package numeros_romanos;

import java.util.Scanner;

public class NumerosRomanos {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        //Declaracion de las variables necesarias
        int opcion;
        int numero;
        String nombre;

        System.out.println("Bienvenido al programa");

        do {
            // Menu de opciones del programa
            System.out.println("Seleccione una opcion del menú");

            System.out.println("1-Representar decimal en romano");
            System.out.println("2-Calcular vocales de un nombre");
            System.out.println("3-Terminar programa");

            opcion = entrada.nextInt();

            //Switch para la eleccion de las opciones del programa
            switch (opcion) {
                case 1:
                    System.out.println("Ha seleccionado la primera opcion, introduce"
                            + " el numero a representar en romano entre 1 y 10");
                    //Bucle para que los datos esten en el rango pedido
                    do {
                        numero = entrada.nextInt();

                        //Mensaje que se muestra si las condiciones no se cumplen
                        if (numero < 1 || numero > 10) {
                            System.out.println("Ha introducido un valor incorrecto repita,"
                                    + " introduce de nuevo");
                        }
                    } while (numero < 1 || numero > 10);

                    // Distintos if dependiendo del valor del numero
                    System.out.print("EL numero " + numero + " en romano es: ");
                    if (numero == 1) {
                        System.out.println("I");
                    }
                    if (numero == 2) {
                        System.out.println("II");
                    }
                    if (numero == 3) {
                        System.out.println("III");
                    }
                    if (numero == 4) {
                        System.out.println("IV");
                    }
                    if (numero == 5) {
                        System.out.println("V");
                    }
                    if (numero == 6) {
                        System.out.println("VI");
                    }
                    if (numero == 7) {
                        System.out.println("VII");
                    }
                    if (numero == 8) {
                        System.out.println("VIII");
                    }
                    if (numero == 9) {
                        System.out.println("IX");
                    }
                    if (numero == 10) {
                        System.out.println("X");
                    }

                    break;

                case 2:

                    System.out.println("Ha elegido calcular las vocales de un nombre");
                    System.out.println("Introduce el nombre a calcular las vocales");
                    //Limpiamos el buffer para que no haya problemas de introduccion
                    entrada.nextLine();

                    nombre = entrada.nextLine();
                    nombre = nombre.toLowerCase();

                    //Pasamos el String a minuscula para reducir el numero de condiciones
                    // y eliminar las mayúsculas
                    int contador = 0;

                    //bucle que recorre la cadena y mira posicion por posicion si contiene una 
                    //vocal
                    for (int i = 0; i < nombre.length(); i++) {

                        if (nombre.charAt(i) == 'a'
                                || nombre.charAt(i) == 'e'
                                || nombre.charAt(i) == 'i'
                                || nombre.charAt(i) == 'o'
                                || nombre.charAt(i) == 'u') {
                            contador++;
                        }

                    }
                    System.out.println("El nombre tiene " + contador + " vocales");
                    break;

                case 3:
                    System.out.println("Programa finalizado");
                    break;
                default:
                    System.out.println("Valor incorrecto de menu, vuelva a introducir opcion");
                    ;
            }

        } while (opcion != 3);

    }
}
