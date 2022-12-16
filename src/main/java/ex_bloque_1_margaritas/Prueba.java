package ex_bloque_1_margaritas;

import java.util.InputMismatchException;
import java.util.Scanner;
import utilidades.Utilidades;

public class Prueba {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        
        //Variable que almacena el número de dado
        int numeroDado = 0;
        final int MINIMO_NUMERO_DADO = 1;
        final int MAXIMO_NUMERO_DADO = 6;

        
        int numeroMargaritas;
        final int NUMERO_MINIMO_MARGARITAS = 1;
        final int NUMERO_MAXIMO_MARGARITAS = 10;

        
        int numeroDeHojas;
        final int MINIMO_NUMERO_HOJAS = 1;
        

        boolean resultado = true;//Importante, le damos valor true y damos por
        // asimilado que siempre se empieza con me quiere si no se muestra lo 
        //contrario
        
        String opcionSalida = "";
        //Salir del programa
        
        
        do {
            

            System.out.println("Bienvenido al programa para ver si Julieta "
                    + "quiere a Romeo o no");
            

            System.out.println("Debemos de introducir el número de margaritas"
                    + " a desahojar, debe de estar entre 1 y 10");
            
            
            //Le damos valor la variable el valor que devuelve el método ya
            //filtrado .Le pasamos por parámetro el mínimo y el máximo de 
            //margaritas posibles
            
            numeroMargaritas = Utilidades.filtrarNumeroEnteroSccanerRango(
                NUMERO_MINIMO_MARGARITAS, NUMERO_MAXIMO_MARGARITAS,"¿Cuantas margaritas"
                        + "vas a desenbainar?");
            
            
            //Bucle for para preguntar el número de pétalos y mostrar 
            //el resultado final por cada margarita
            
            for (int i = 1; i <= numeroMargaritas; i++) {

             System.out.println("Cuantas hojas tiene la margarita número " + i);
             
                
              //Le damos valor la variable el valor que devuelve el método ya
              //filtrado .Le pasamos por parámetro el mínimo de petalos posibles
              
                numeroDeHojas = filtrarNumeroPetalosMargaritas
                                          (MINIMO_NUMERO_HOJAS);
                
                

                System.out.println("Ahora se lanzará un dado para saber si"
                        + " empieza con me quiere o no me quiere");
                
                //Bucle que se repite cuando el numero que sale = 3
                
                do {
                    
                    
                 //Le damos valor la variable el valor que devuelve el método ya
                 //filtrado .Le pasamos por parámetro el mínimo y el máximo de 
                 // numero a salir del dado
                 
                    numeroDado = Utilidades.numeroEnteroRandom
                           (MINIMO_NUMERO_DADO, MAXIMO_NUMERO_DADO);
                    
                    
                    //Le damos valor a resultado con lo que devuelve el método
                    
                    resultado = comprobarMeQuiereNoMeQuiere(numeroDado);
                    
                } while (numeroDado == 3);
                
                
                //Como desde el principio hemos asignado el valor true a 
                //"me quiere" entra en la primera condición
                
                if (resultado) {

                    System.out.println("Romeo ha empezado a desahojar la"
                            + " margarita número "+i+" de "+numeroDeHojas
                                    + " pétalos con me quiere");
                    System.out.println("");
                    
                    //Siempre que el numero de petalos sea par al ir contando
                    //hojas el resultado siempre es opuesto al que comenzamos
                    
                    //Por lo tanto
                    if (numeroDeHojas % 2 == 0) {
                        System.out.println("El resultado es que Julieta"
                                + " no le quiere");
                    } else {
                        System.out.println("El resultado es que Julieta"
                                + " si le quiere");
                    }

                } else {
                    //En este caso resultado = false , mejor explicado en el
                    //método
                    
                    //Misma lógica en el caso que empecemos con no me quiere
                    System.out.println("Romeo ha empezado a desahojar la"
                            + " margarita número "+i+" de "+numeroDeHojas
                                    + " pétalos con no me quiere");
                    System.out.println("");
                    
                    if (numeroDeHojas % 2 == 0) {
                        System.out.println("El resultado es que Julieta"
                                + " si le quiere");
                    } else {
                        System.out.println("El resultado es que Julieta"
                                + " no le quiere");
                    }
                }

            }
            
            //Bucle que hace de filtro para que no se introduzca algo diferente
            // a si o no
            
            do {

                System.out.println("¿Quieres repetir, escriba si o no?");
                opcionSalida = entrada.nextLine();

                if (!opcionSalida.equalsIgnoreCase("si")
                        && !opcionSalida.equalsIgnoreCase("no")) {
                    System.out.println("Repite, no has escrito ni si ni no");
                }

            } while (!opcionSalida.equalsIgnoreCase("si")
                    && !opcionSalida.equalsIgnoreCase("no"));
            
            //Al estar ya filtrado ya la variable opcionSalida es o si o no
            //Entonces si escribimos si se repite el programa y al escribir no
            //se cierra
            
        } while (!opcionSalida.equalsIgnoreCase("no"));
    }

    
    
    //Controlar que no se puedan introducir menos de un petalo, le pasamos por
    //parámetro el número mínimo de pétalos
    public static int filtrarNumeroPetalosMargaritas(int numeroMinimoPetalos) 
    {
        
        Scanner entrada = new Scanner(System.in);
        int numero = 0;
        
        boolean seguir = true;
        
        //Este bucle se repite mientras se esciba algo no esperado como
        //un caracter no numérico o un numero de petalos inferior a 1
        do {

            System.out.println("Introduce el número");
            
            //Controlamos la excepción para cuando se introduzcan valores no
            //numéricos
            try {
                numero = entrada.nextInt();
                
                //Si el número es válido seguier=false y salimos del bucle
                
                if (numero >= numeroMinimoPetalos) {
                    seguir = false;
                } else {
                    
                    //Mensaje que salta si no cumple con la condición
                    
                    System.out.println("Una margarita no puede tener menos"
                            + " de un petalo");
                }
            } catch (InputMismatchException ime) {
                
                //Mesaje que salta si introducimos un valor no numérico
                
                System.out.println("Ha introducido un valor no numérico,"
                        + " repita");
            }
            //Limpiada de buffer
            entrada.nextLine();
        } while (seguir);
        
        //devolvemos el número ya filtrado
        return numero;

    }

    
    
    //Método que tenga como parámetro el número que ha salido en el dado y
    //devuelva un booleano indicando si empieza con me quiere o no me quiere. 
    public static boolean comprobarMeQuiereNoMeQuiere(int numeroDado) 
    {

        boolean resultado = true;
        //Asignamos a true ya que como he explicado antes damos por asimilado
        //que empezamos siempre por me quiere
        if (numeroDado == 3) {
            
            //Mensaje que salta si sale el número 3
            System.out.println("Ha salido el número " + numeroDado);
            System.out.println("Numero de mala suerte se repite tirada");
            System.out.println("");
        } else {
            //Si sale otro número comprobamos si es par o impar
            System.out.println("Ha salido el número " + numeroDado);
            System.out.println("");
            if (numeroDado % 2 != 0) {
                //Si es impar->Empezamos con no me quiere y asignamos la
                //variable a false
                resultado = false;
            }
        }
        //Devovemos el valor dependiendo del número que haya salido par->true
        //impar->false
        return resultado;
        //Por lo tanto si es false no entraría en el if ya que inicialmente 
        //hemos inicializado la variable como true, al ser false ya el valor 
        //inicial y el que le asignamos ahora no concuerdan y pasa al false
    }

}
