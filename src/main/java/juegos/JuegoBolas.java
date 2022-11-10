package juegos;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class JuegoBolas {

    public static void main(String[] args) {

        //Los clientes de una tienda casi siempre tienen descuento al llegar a 
        //pagar a la caja durante la semana loca. Cuando van a pagar tienen que
        //sacar una bola de una bolsa, que es la que nos indica el descuento.
        //Si la bola es de color azul se obtiene un 20%, si es roja un 25%, 
        //si es blanca no hay descuento y si es verde, se saca de la bolsa 
        //y se vuelve a sacar otra de las restantes.
        //Escribe un programa que lea el importe a pagar por el cliente e
        //imprima la bola que “sacó” de la bolsa y el importe con el descuento aplicado.
        //El programa, una vez finaliza un cliente, pregunta si hay otro en la 
        //cola para operar de la misma forma. Si no hay clientes, 
        //el programa termina.
        Random rd = new Random();

        Scanner entrada = new Scanner(System.in);

        int bola = 0;

        double precio = 0;

        boolean seguir = true;

        String bolaAzul = " 20%";
        double descuentoAzul = 0.20;

        String bolaRoja = "25%";
        double descuentoRoja = 0.25;

        String bolaBlanca = "No hay descuento";
        String bolaVerde = "Vuelva a repetir";

        String opcion = "";

        System.out.println("Bienvenido a la semana loca, saca una bola"
                + " para comprobar el descuento");
        do {

            do {
                seguir=true;    
            

                System.out.println("Introduce el precio para hacer descuento");
                try {
                    precio = entrada.nextDouble();
                    seguir = false;
                } catch (InputMismatchException ime) {
                    System.out.println("Valor erróneo repita introducción");
                }
                entrada.nextLine();
            } while (seguir);
            
            bola = 3;
            
            do {
                
                if (bola == 3) {

                    System.out.println(bolaVerde + ", has sacado la bola verde");
                    bola = rd.nextInt(3);
                    System.out.println("Sacando otra bola"); 
                    seguir=true;
                } else if (bola == 0) {
                        System.out.println("Has sacado la bola azul, tienes un " + bolaAzul
                                + " de descuento para el precio " + precio);
                        precio = precio - (precio * descuentoAzul);
                        System.out.println("Ahora te costara " + precio + " €");
                        seguir=false;
                    } else if (bola == 1) {

                        System.out.println("Has sacado la bola roja, tienes un " + bolaRoja
                                + " de descuento");

                        precio = precio - (precio * descuentoRoja);
                        System.out.println("Ahora te costara " + precio + " €");
                        seguir=false;

                    } else {

                        System.out.println("Has sacado la bola blanca, " + bolaBlanca
                        );
                        System.out.println("El precio se queda en " + precio + " €");
                        seguir=false;

                    }
                    
                
            } while (seguir);
            do {

                System.out.println("¿Hay mas clientes en la cola?");
                opcion = entrada.nextLine();
                

                if (!opcion.equalsIgnoreCase("si")
                        && !opcion.equalsIgnoreCase("no")) {
                    System.out.println("Repite, no has escrito ni si ni no");
                }

            } while (!opcion.equalsIgnoreCase("si")
                    && !opcion.equalsIgnoreCase("no"));

        } while (opcion.equalsIgnoreCase("si"));

    }

}
