package juegos;

import java.util.InputMismatchException;
import java.util.Random;
import javax.swing.JOptionPane;

public class ParesYNonesRondas {

    public static void main(String[] args) {

        eleccionOpcion();

    }
    
    
    
    
    

    //Este método sirve para mostrar el menu de opciones a la vez que 
    //pedimos al usuario que la introduzca
    
    //Más explicación dentro del método
    private static int mostrarMenuLeerOpcion() {
        
        //Este método devuelve un valor de tipo entero , la opcion del switch
        // que usaremos más adelante para la funcionalidad del programa

        int opcion; // Esta variable será la que guardara ese valor de opción

        //Esta variable la usamos para mostrar mediante un panel/pantalla
        //el menú de opciones que contiene nuestro programa
        
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

        //Pedimos al usuario que introduzca la opcion que desee a la ves que 
        //le mostramos el menú de opciones
        //Esta linea contiene una conversión de String a Int
        //JOptionPane.showInputDialog devuelve dato de tipo String que 
        //tenemos que transformar a entero para poder usar la variable en el 
        //switch posterior
        
        opcion = Integer.parseInt(JOptionPane.showInputDialog(null, menu));

        //Devolvemos el valor que el usuario ha introducido
        
        return opcion;
    }
    
    
    
    

    
    //En este metodo filtramos que lo que hayamos escrito no sea algo diferente
    //a un número
    
    //Más explicación dentro del método
    private static int filtrarOpcion() {

        //Variable que almacenara el valor de lo que devuelve el metodo anterior
        
        int opcion = 0;

        //Variable booleana para la lógica del bucle
        
        boolean seguir = true;

        //Bucle que se repite si introducimos un valor no numérico
        //y que llamará al metodo anterior hasta que introduzcamos un número
        
        do {
            
            
            //Try catch para controlar excepciones
            //En este caso NumberFormatException porque en el metodo anterior
            //existe una conversión de String a int y si intentamos convertir
            //un String con valor no numérico nos saltaría esta excepción
            
            
            try {
                
                opcion = mostrarMenuLeerOpcion();

                //Damos valor a false para salir del bucle
                
                seguir = false;
                
            } catch (NumberFormatException nfe) {
                
                JOptionPane.showMessageDialog(null,
                        "Has introducido un valor no numérico, repita ");
                
                //Mensaje cuándo salta la excepción
            }

        } while (seguir);

        return opcion;
        
        //Devolvemos la variable para usarla en el siguiente método
    }
    
    
    
    

    
    //Metodo que contiene la funcionalidad del programa
    
    //Detalladamente explicado dentro del método
    private static void eleccionOpcion() {

        //Variable que guardará el valor de la opción ya filtrada
        //alfabeticamente por el método anterior
        int opcion = 0;

        //bucle que nos hace la función de un pequeño filtro, en este caso
        //numérico para que se repita si se introduce una opción distinta a la
        //de los case de nuestro switch
        do {

            //opcion guarda el valor que devuelve este método
            //Como podemos ver a lo largo del programa hemos hecho uso de la 
            //llamada de los métodos en cadena, cada uno llama al anterior 
            //internamente para distintas funcionalidades del programa
            opcion = filtrarOpcion();

            //Switch simple con 3 case , cada uno dependiendo de la opción que
            //hayamos elegido
            switch (opcion) {
                case 1:
                    //Llamada al método correspondiente con la opción 1
                    partidaSimple();
                    break;
                case 2:
                    //Llamada al método correspondiente con la opción 2
                    partidaRondas();
                    break;
                case 3:
                    //Saliendo del programa en caso de introducir el 3
                    JOptionPane.showMessageDialog(null,
                            "Saliendo del programa...");
                    break;
                default:
                    //Mensaje que salta si ponemos una opcion distintas a la de
                    //las posibles en nuestro programa
                    JOptionPane.showMessageDialog(null,
                            "Opción incorrecta, repita");

            }
            //Condición para salir del bucle
        } while (opcion != 3);

    }
    
    
    

    
    //En este metodo esta el código de funcionalidad de una partida normal 
    
    //Detalladamente explicado en su interior
    private static String partidaSimple() {

        //Creamos un objeto random que vamos a utilizar para que la máquina
        //saque un número aleatorio
        
        Random rd = new Random();

        //Esta variable la vamos a usar para guardar si hemos ganado
        //o hemos perdido, no tiene funcionalidad en la partida simple pero
        //la vamos a usar para la partida con rondas para ir almacenando cuantas
        //victorias lleva cada uno.
        //Por eso este método devuelve un String , al final de cada partida
        //devuelve quien ha ganado, lo usaremos más tarde
        
        String resultado = "";

        //Esta variable almacena si has elegido jugar con pares o nones
        
        String paresONones;

        int numeroUsuario = 0;//Numero que eliges sacar para pares o nones
        int numeroMaquina = 0;//Almacenará el numero aleatorio de la máquina

        //Variable necesaria para la lógica del bucle
        
        boolean seguir;

        //bucle para controlar si introduces pares o nones, si introduces otra
        //cosa se repite
        
        
        do {

            paresONones = JOptionPane.showInputDialog(null,
                    "Elija pares o nones");
            paresONones = paresONones.toLowerCase();
            
            //Pasamos a minúsculas, lo utilizaremos para entrar a los case del 
            //Switch

            //Condición que saca mensaje si la opcion no es ni pares ni nones
            
            if (!paresONones.equals("pares")
                    && !paresONones.equals("nones")) {
                JOptionPane.showMessageDialog(null,
                        "No has escrito ni pares ni nones, repita");
            }

        } while ((!paresONones.equals("pares")
                && !paresONones.equals("nones")));

        //Como ya hemos filtrado la introducción de pares o nones
        //Mensajes para recordar que roll lleva cada jugador
        //Si uno es par y otro impar y viceversa
        
        if (paresONones.equals("pares")) {
            
            JOptionPane.showMessageDialog(null,
                    "Has elegido pares, por lo tanto la maquina será"
                    + " nones");
            
        } else {
            
            JOptionPane.showMessageDialog(null,
                    "Has elegido nones, por lo tanto la maquina será"
                    + " pares");
            
        }

        //Doble bucle do while, en uno se controla que no se escriban caracteres
        //no númericos y en otro se controla que no superen el rango de dedos 
        //disponibles para jugar desde el puño cerrado(0)
        //a las 2 manos abiertas (10)
        
        
        do {

            //Inicializamos a true, esto se hace ya que en el primer ciclo del
            //segundo bucle que contiene el try catch introducimos un valor
            // numérico la variable seguir = false linea 256, luego si el número 
            //no se comprende entre el rango predeterminado en el while del 
            // primer bucle se repite la entrada de datos porque no se cumple la
            //condicion, esta variable se quedaría a false , entonces al
            //repetir el bucle se saltaria código ya que al ser la variable 
            //seguir=false no entraría en el segundo bucle y habria errores en 
            //el programa
            
            
            seguir = true;
            
            do {

                //Try catch para coger la excepción si introducimos valores no
                //numéricos
                //Y así poder hacer la conversión de String a int correctamente
                
                
                try {
                    
                    numeroUsuario = Integer.parseInt(JOptionPane.showInputDialog
                         (null,"Elige un número del 0 al 10")
                    );
                    
                    //Ponemos a false para salir del primer bucle y comprobar la
                    //segunda conndición de rango
                    
                    seguir = false;

                } catch (NumberFormatException nfe) {

                    //Mensaje que salta si hay error de introducción
                    
                    JOptionPane.showMessageDialog(null,
                            "Valor no numérico, repita");
                }

            } while (seguir);

            //Mensaje que salta si nos pasamos de rango
            
            if (numeroUsuario < 0 || numeroUsuario > 10) {
                JOptionPane.showMessageDialog(null,
                        "Número fuera de rango, repita");
            }
        } while (numeroUsuario < 0 || numeroUsuario > 10);

        //Inicializamos con un valor aleatorio entre 0 y 10
        //Aqui no hay ningún problema
        
        numeroMaquina = rd.nextInt(11);
        
        

        //Inicializamos la variable con el valor de la suma de los dos números
        //el nuestro ya filtrado y el generado de la máquina
        
        int suma = numeroMaquina + numeroUsuario;

        //Mensaje que nos muestra el número de cada uno para comprobar que vaya
        //todo correcto y comprobar si el resultado final es el esperado
        
        JOptionPane.showMessageDialog(null,
                "Tu numero es " + numeroUsuario + " y el numero de la máquina"
                + " es " + numeroMaquina);
        

        //Switch para calcular quien ha ganado, dependiendo de cual opcion 
        //hayamos elegido anteriormente (pares o nones) podremos saber si hemos
        
        //ganado o no
        switch (paresONones) {
            case "pares":

                //Si hemos elegido pares y el resto de dividir entre 2 es 0
                //habremos ganado al contrario habremos perdido
                
                JOptionPane.showMessageDialog(null,
                        "La suma es " + suma);
                if (suma % 2 == 0) {
                    JOptionPane.showMessageDialog(null,
                            "Has ganado ");

                    //Le damos valor a resultado para usarlo luego en la partida
                    //con rondas
                    //Este paso lo haremos en cada if else de cada case
                    //para tener todas las posibilidades posibles
                    
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
        //Devolvemos el resultado dependiendo de ganar o perder en los distintos
        //casos otra variable en el siguiente metodo la recogerá
        
        return resultado;
    }
    
    
    
    
    

    //En este metodo esta el código de funcionalidad de una partida con rondas 
    
    //Detalladamente explicado en su interior
    private static void partidaRondas() {

        //Variable que guardará el número de rondas de la partida que queramos 
        //e introduciremos más adelante
        
        int rondas = 0;

        //Variable booleana para usar en la lógica del bucle
        
        boolean seguir = true;

        //Esta varibale guardará el valor que devuelve el método anterior e ir
        //controlando la partida y el número de victorias de cada jugador
        
        String resultado = "";

        //Variables que almacenarán las vistorias durante la partida del 
        //usuario y la máquina respectivamente
        
        int contadorUsuario = 0;
        int contadorMaquina = 0;

        //Mensaje explicativo sobre este modo de juego
        
        JOptionPane.showMessageDialog(null, "Este estilo"
                + " es igual que al de la partida simple pero cambia que"
                + " comprende de un numero de rondas, esta debera ser impar para"
                + " que hay un ganador");

        //bucle que controla que el numero de rondas no sea un valor no
        //numerico ni que sea par ya que entonces puede haber el caso de empate
        //o que el número de rondas sea 1 o mas pequeña ya que ya tenemos
        //un modo de una ronda y las rondas no pueden ser 0 o negativas
        
        
        do {

            //Try catch para coger la excepción si introducimos valores no
            //numéricos
            //Y así poder hacer la conversión de String a int correctamente
            
            
            try {

                //Inicializamos las rondas con el número que introduzca el
                //usuario
                
                rondas = Integer.parseInt(JOptionPane.showInputDialog
                       (null,"Introduce el número de rondas"));

                //Si es correcto seguir=false para salir del bucle
                
                seguir = false;

            } catch (NumberFormatException nfe) {

                //Mensaje que salta cuando no introducimos bien el dato
                
                JOptionPane.showMessageDialog(null,
                        "Has introducido un valor no numerico, repita");
            }
            if (rondas < 1) {

                //Mensaje que salta cuando el número de rondas es 0 o negativo
                
                JOptionPane.showMessageDialog(null,
                        "No se puede jugar " + rondas + " rondas,repita");
                
            } else if (rondas == 1) {
                
                //Mensaje que salta cuando el número de rondas es 1
                
                JOptionPane.showMessageDialog(null,
                        "Para jugar una ronda, seleccione juego simple");
                
            } else if (rondas % 2 == 0) {
                
                //Mensaje que salta cuando el número de rondas es par
                
                JOptionPane.showMessageDialog(null,
                        "Has introducido un valor numerico par, repita");
                
            }

        } while (seguir || rondas % 2 == 0 || rondas < 2);

        //bucle for que nos servirá para jugar el número de rondas que deseemos
        
        for (int i = 1; i <= rondas; i++) {

            //Mensaje decorativo que nos muestra en que ronda nos encontramos
            
            JOptionPane.showMessageDialog(null,
                    "Ronda numero " + i);

            //En esta linea llamamos al metodo de partida simple ya que no se
            //diferencia en nada solo que esta es una partida de más rondas
            //a la vez que guardamos quien ha ganado de resultado que devuelve
            //internamente el metodo
            
            resultado = partidaSimple();

            if (resultado.equals("Has ganado")) {

                //Al tener solo dos posibilidades ganr o perder
                //si ganamos nos sumamos una victoria, en otro caso(perder)
                //se lo sumamos a la máquina
                
                contadorUsuario++;
            } else {
                
                contadorMaquina++;
            }

            //Control de victorias que lleva cada uno tras cada ronda
            
            JOptionPane.showMessageDialog(null,
                    "Llevas " + contadorUsuario + " rondas ganadas y "
                    + "la maquina lleva " + contadorMaquina + " rondas ganadas");

            if (rondas == 3) {

                //Esta condición nos sirve para que en caso de que haya 3 rondas
                //Si alguno de los dos ha ganado 2 partidas seguidas no es 
                //necesario seguir jugando ya que no hay opción de remontar
                //y se termina el bucle
                
                if (contadorUsuario == 2 && contadorMaquina == 0) {

                    JOptionPane.showMessageDialog(null,
                            "Has ganado ya que la maquina no tiene"
                                + " opcion de remontar con el numero de rondas"
                                    + " que quedan");
                    break;
                }

                if (contadorMaquina == 2 && contadorUsuario == 0) {
                    JOptionPane.showMessageDialog(null,
                            "Ha ganado la maquina ya que no tienes "
                                + " opcion de remontar con el numero de rondas"
                                    + " que quedan");
                    break;
                }

            } else {

                //Condiciones que cierran el bucle si alguno de los dos supera
                //la mitad de rondas disponibles con victorias ya que el
                //contrario no tiene opcion de remontar
                
                if (contadorUsuario > Math.ceil((double) rondas / 2)) {
                    JOptionPane.showMessageDialog(null,
                            "Has ganado ya que la maquina no tiene opcion"
                            + " de remontar con el numero de rondas"
                            + " que quedan");
                    break;
                }

                if (contadorMaquina > Math.ceil((double) rondas / 2)) {
                    JOptionPane.showMessageDialog(null,
                            "Ha ganado la maquina ya que no tienes opcion"
                            + " de remontar con el  numero de rondas"
                            + " que quedan");
                    break;
                }
            }
        }
        //Cuando termina el bucle indica quien ha ganado con cuantas victorias
        
        if (contadorUsuario > contadorMaquina) {
            
            JOptionPane.showMessageDialog(null,
                    "Has ganado la partida de " + rondas
                    + " rondas con " + contadorUsuario + " victorias");
            
        } else {
            
            JOptionPane.showMessageDialog(null,
                    "La maquina ha ganado la partida de " + rondas
                    + " rondas con " + contadorMaquina + " victorias");
            
        }

    }

}
