package estepona_turronera;

import java.util.Scanner;

public class FabricaDeDulces2 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        String opcion;
        String codigo;

        do {

            System.out.println("Menu de opciones");
            System.out.println("----------------");
            System.out.println("Calcular viabilidad de productos");
            System.out.println("Terminar");
            System.out.println("----------------");

            System.out.println("");
            System.out.println("");

            System.out.println("Para calcular la viabilidad escriba calcular");
            System.out.println("Para terminar escriba salir");
            opcion = entrada.nextLine();
            opcion = opcion.toLowerCase();

            switch (opcion) {
                case "calcular":

                    System.out.println("Ahora introduce el codigo del dulce deseado");
                                           
                        
                  
                    do {
                        codigo = entrada.nextLine();
                        if (!(codigo.equals("M1")
                                || codigo.equals("M2")
                                || codigo.equals("T1")
                                || codigo.equals("T2")
                                || codigo.equals("P1"))) {
                            System.out.println("Codigo incorrecto, vuelva a introducir");
                        }

                    } while (!(codigo.equals("M1")
                            || codigo.equals("M2")
                            || codigo.equals("T1")
                            || codigo.equals("T2")
                            || codigo.equals("P1")));
                    
                    break;

                case "salir":
                    System.out.println("Programa finalizado");
                    break;

                default:
                    System.out.println("Error, vuelva a introducir");
                    System.out.println("");
            }

        } while (!opcion.equals("salir"));
    }

}
