package juegos;

import java.util.InputMismatchException;
import java.util.Random;
import javax.swing.JOptionPane;

public class MorraMetodizado {
    
    
    //Método main del programa
    
    public static void main(String[] args) {

        eleccionOpcion();

    }
    
    
    
    
    //Método que muestra el menú de opciones y te pide la opción a elegir
    
    //Explicado mas a fondo en su interior
    private static int mostrarMenuLeerOpcion() {
        
        //Variable donde se almacena el dato introducido por el usuario que 
        //será recogida por otra variable en el método filtrarOpcion
        
        int opcion;
        
        //Variable para almacenar el menú de opciones y mostrarla por pantalla
        
        String menu = """
                
                Bienvenido al juego de la morra
              ------------------------------------
                  -Menú de opciones.      
                                                                             
                  1-Partida Simple                   
                  2-Salir                         
              ------------------------------------
                   Elija una opcion
                 """;
        
        //Igualamos la variable a lo que introduzca el usuario
        //Hacemos una conversión explícita para pasar de String a int 
        
        opcion = Integer.parseInt(JOptionPane.showInputDialog(null, menu));
        
        //Devolvemos el valor de la variable
        
        return opcion;
    }
    
    
    
    
    
    
    //Método que llama el metodo mostrarMenuLeerOpcion internamente, recoge
    //el valor que devuleve ese metodo y controla que no sea ningún valor
    //no numérico
    
    //Explicado mas a fondo en su interior
    private static int filtrarOpcion() {
        
        //Variable que recibirá y almacenará el valor que devuelve el método
        //mostrarMenuLeerOpcion
        
        int opcion = 0;
        
        //Variable booleana necesaria para la lógica del bucle
        
        boolean seguir = true;
        
        
        //Bucle do while que se repite y vuelve a llamar el método 
        //mostrarMenuLeerOpcion hasta que se introduzca un valor correcto
        
        
        do {
            
            //Try catch para controlar las excepciones 
            
            try {
                
                //Igualamos la variable opcion al metodo para recoger su valor
                
                opcion = mostrarMenuLeerOpcion();
                
                
                //Si todo es correcto ponemos la variable booleana a false
                //para salir del bucle
                
                seguir = false;
                
            } catch (NumberFormatException nfe) {
                
                //Mensaje en caso de introducir valores incorrectos
                
                JOptionPane.showMessageDialog(null,
                        "Has introducido un valor no numérico, repita ");

            }

        } while (seguir);
        
        //Devolvemos el valor de opcion ya filtrado
        
        return opcion;

    }
    
    
    
    
    
    
    
    
    //Este método es el esqueleto del programa donde recoge la opción ya 
    //filtrada por el método filtrarOpcion y comprueba si la opción recogida
    //coincide con alguna del menú de opciones
    //Si no coincide vuelve a llamar al método filtrarOpcion que a la vez llama
    //a el método mostrarMenuLeerOpcion y esto se repite hasta que se elige
    //correctamente la opción
    
    //Explicado mas a fondo en su interior
    private static void eleccionOpcion() {
        
        //Otra variable opcion que recoge el valor devuelto por el método
        //filtrarOpcion y que vamos a usar en el switch
        
        int opcion = 0;
        
        //Bucle do while que se repite mientras opcion sea distinto de 2 ya que
        //la opcion 2 es equivalente a salir de nuestro programa
        
        //Llamamos al método filtrarOpcion que internamente llama al método
        //mostrarMenuLeerOpcion hasta que se introduzca un valor válido
        
        do {
            
            //Igualamos la variable opcion al valor que devuelve el método
            //filtrarOpcion
            
            opcion = filtrarOpcion();

            switch (opcion) {
                case 1:
                    
                    //Opcion 1 llamamos al método que contiene el juego del 
                    //programa
                    
                    partidaSimple();
                    
                    break;

                case 2:
                    
                    //opcion 2 --> Para mostrar mensaje de que estamos saliendo
                    //del programa
                    
                    JOptionPane.showMessageDialog(null,
                            "Saliendo del programa...");
                    break;
                default:
                    
                    //Mensaje que sale en pantalla si se introduce una opcion 
                    //no disponible
                    
                    JOptionPane.showMessageDialog(null,
                            "Opción incorrecta, repita");

            }

        } while (opcion != 2);

    }
    
    
    
    
    
    
    
    //Este método contiene la lógica de nuestro programa, donde se usan
    //las variables necesarias 
    
    //Explicado mas a fondo en su interior
    private static void partidaSimple() {
        
        //Objeto random necesario para calcular tanto el número que saca como
        //el número que predice la máquina
        
        Random rd = new Random();
        
        //Variable booleana que se usa para la lógica del bucle
        
        boolean seguir;
        
        //Variables necesarias para la ejecución del programa
        
        int numeroMaquina;
        int numeroJugador = 0;
        int prediccionMaquina;
        int prediccionJugador = 0;
        int suma;
        int victoriasMaquina = 0;
        int victoriasUsuario = 0;
        int contador = 0;
        int puntos = 0;

        String resultado;
        
        JOptionPane.showMessageDialog(null,
                "Bienvenido al juego de la morra\n"
                + "Ambos jugadores sacareis un numero de 0 a 5"
                + " a la vez que deciis un numero que penseis que será la suma "
                + "entre los dedos de ambos jugadores ");
        
        
        //Inicializamos la variable con el valor que devuelve el método 
        //filtrarPuntos
        
        puntos = filtrarPuntos();
        
        
        
        //Bucle principal del programa que se termina cuando uno de los dos gana
        do {
            
            //Inicializamos esta variable con un número aleatorio entre 0 y 5
            //numero de dedos disponibles a sacar en una mano
            
            numeroMaquina = rd.nextInt(6);
            
            
            //Condición reglas, si se saca el puño cerrado, equivale a 1 dedo
            
            if (numeroMaquina == 0) {
                numeroMaquina = 1;
            }
            
            //Inicializamos la variable con el valor que devuelve el método
            //filtrarNumeroParaSacar
            
            numeroJugador = filtrarNumeroParaSacar();
            
            
            //Inicializamos esta variable con el valor que devuelve el método
            //filtrarNumeroPredecir
            
            prediccionJugador = filtrarNumeroPredecir(numeroJugador);
            
            
            //Inicializamos esta variable entre 10 y un número mayor al que ha
            //sacado la máquina ya que el total de dedos entre ambos jugadores
            // no puede ser igual o menor al número de dedos que se ha sacado
            //anteriormente
            
            prediccionMaquina = rd.nextInt(11 - numeroMaquina + 1) + numeroMaquina+1;
            
            //Incializamos esta variable con la suma del número de dedos que ha
            //sacado cada jugador
            
            suma = numeroJugador + numeroMaquina;
            
            //Inicializamos la variable resultado con el valor que devuelve
            //el método comprobarGanadorRonda
            
            resultado = comprobarGanadorRonda(
                    numeroJugador, numeroMaquina,
                    prediccionJugador, prediccionMaquina, suma);
            
            //Según la cedena que contenga resultado entrara en una condición o
            //en otra

            if (resultado == "Empate, siguiente ronda") {
                
                //Si han empatado se le suma una victoria a cada jugador
                
                victoriasUsuario++;
                victoriasMaquina++;
                
                JOptionPane.showMessageDialog(null,
                        "Empate, un punto para cada uno");
                
                
            } else if (resultado == "Has ganado") {
                
                //Si ha ganado el usuario se le suma una victoria
                
                JOptionPane.showMessageDialog(null,
                        "Has ganado la ronda");
                
                victoriasUsuario++;
                
            } else if (resultado == "Ha ganado la maquina") {
                
                 //Si ha ganado la máquina se le suma una victoria
                
                JOptionPane.showMessageDialog(null,
                        "La máquina ha ganado la ronda");
                
                victoriasMaquina++;
                
            } else {
                
                //Si no ha acertado nadie el programa continua
                
                JOptionPane.showMessageDialog(null,
                        "Nadie ha ganado siguiente ronda");
            }
            
            //Inicializamos la variable que muestra el número de victorias de
            //cada uno y el número de ronda correspondiente
            
            String resultados = """
                           
                           Jugador = %d
                           Maquina = %d
                           
                           Ronda = %d
                           """.formatted(
                    victoriasUsuario,
                    victoriasMaquina,
                    contador + 1);

            JOptionPane.showMessageDialog(null, resultados);
            
            
            
            //Esta condición marca que si el usuario llega al máximo de puntos
            //con una diferencia de dos puntos sobre la máquina ha ganado la 
            //partida
            
            if (victoriasUsuario >= puntos
                    && victoriasUsuario - victoriasMaquina >= 2) {

                JOptionPane.showMessageDialog(null,
                        "Has ganado con " + victoriasUsuario + " puntos a"
                        + " la máquina con " + victoriasMaquina
                        + " puntos en la ronda " + contador);
            }
            
            
            //Esta condición marca que si la máquina llega al máximo de puntos
            //con una diferencia de dos puntos sobre el usuario ha ganado la 
            //partida

            if (victoriasMaquina >= puntos
                    && victoriasMaquina - victoriasUsuario >= 2) {

                JOptionPane.showMessageDialog(null,
                        "Ha ganado la máquina con " + victoriasMaquina
                        + " puntos al usuario con " + victoriasUsuario
                        + " puntos en la ronda " + contador);
            }
            
            //Actualizacion de la ronda
            contador++;
            
            
            //Condicion que marca el fin del bucle cuando alguno de los dos gana
            
        } while (!(victoriasUsuario >= puntos
                && victoriasUsuario - victoriasMaquina >= 2)
                && !(victoriasMaquina >= puntos
                && victoriasMaquina - victoriasUsuario >= 2));
    }
    
    
    
    
    
    
    
    //Este método controla el tipo de modos que se pueden elegir
    
    //Explicado mas a fondo en su interior
    private static int filtrarPuntos() {
        
        
        //Variable que almacenará el valor que introduxca el usuario
        
        int puntos = 0;
        
        //Variable booleana necesaria para la lógica del bucle
        
        boolean seguir = true;
        
        
        //Doble bucle do while, en uno se controla que no se escriban caracteres
        //no númericos y en otro que controla que los puntos tengan que ser o 5
        //o 21
        
        
        do {
            
            //Inicializamos a true, esto se hace ya que en el primer ciclo del
            //segundo bucle que contiene el try catch introducimos un valor
            // numérico la variable seguir = false linea 370, luego si el número 
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
                    
                    //Inicializamos la variable con lo que el usuario introduzca
                    
                    puntos = Integer.parseInt
                    (JOptionPane.showInputDialog(null,
                            "Existen dos formas de juego\n"
                            + " Hasta 21 puntos o hasta 5 puntos\n"
                            + " Elige que el modo"));
                    
                    //Ponemos a false para salir del primer bucle y comprobar la
                    //segunda conndición 
                    
                    seguir = false;

                } catch (NumberFormatException nfe) {
                    
                    //Mensaje que salta si hay error de introducción
                    
                    JOptionPane.showMessageDialog(null,
                            "Valor no numérico, repita");
                }
                ;
            } while (seguir);
            
             //Mensaje que salta si no elegimos ni 5 ni 21
             
            if (puntos != 5 && puntos != 21) {
                JOptionPane.showMessageDialog(null,
                        "No ha elegido ni 5 ni 21, repita");
            }
        } while (puntos != 5 && puntos != 21);
        
        
        //Devolvemos la variable ya filtrada, esta será recogida por la variable
        //puntos en el método partidaSimple
        
        return puntos;

    }
    
    
    
    
    
    
    //Este método filtra el número que introduce el usuario para jugar
    
    //Explicado mas a fondo en su interior
    private static int filtrarNumeroParaSacar() {
        
        
         //Variable que almacenará el valor que introduxca el usuario
         
        int numero = 0;
        
        
        //Variable booleana necesaria para la lógica del bucle
        
        boolean seguir = true;
        
        
        //Doble bucle do while, en uno se controla que no se escriban caracteres
        //no númericos y en otro se controla que no superen el rango de dedos 
        //disponibles para jugar desde el puño cerrado(0)
        //a la manos abierta (5)
        
        do {
            
            
            
            //Inicializamos a true, esto se hace ya que en el primer ciclo del
            //segundo bucle que contiene el try catch introducimos un valor
            // numérico la variable seguir = false linea 370, luego si el número 
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
                    
                    
                    //Inicializamos la variable con lo que el usuario introduzca
                    
                    numero = Integer.parseInt
                (JOptionPane.showInputDialog("La maquina ya tiene un número"
                        + " elegido ahora uno elige tu uno entre el 0 y el 5"));
                    
                     //Ponemos a false para salir del primer bucle y comprobar la
                    //segunda conndición de rango
                    
                    seguir = false;

                } catch (NumberFormatException nfe) {
                    
                     //Mensaje que salta si hay error de introducción
                     
                    JOptionPane.showMessageDialog(null,
                            "Valor no numérico, repita");
                }
                ;
            } while (seguir);
            
            
              //Mensaje que salta si nos pasamos de rango
              
            if (numero < 0 || numero > 5) {
                JOptionPane.showMessageDialog(null,
                        "Numero fuera de rango, repita");
            }
        } while (numero < 0 || numero > 5);
        
        
        //Condición reglas, si se saca el puño cerrado, equivale a 1 dedo
        
        if (numero == 0) {
            numero = 1;
        }
        
        //Devolvemos el valor ya filtrado que será recogida por la variable
        //numeroJugador en el método partidaSimple
        
        return numero;
    }
    
    
    
    
    

    
    //Este método filtra el supuesto total que se prevee que va a salir
    //entre la suma del número del usuario con el número de la máquina
    
    //Explicado mas a fondo en su interior
    private static int filtrarNumeroPredecir(int numeroJugador) {
        
        //Variable que almacenará el valor que introduzca el usuario
        
        int numero = 0;
        
        //Variable booleana necesaria para la lógica del bucle
        
        boolean seguir = true;

        JOptionPane.showMessageDialog(null,
                "Ahora sacareis los numeros mientras dices cual"
                + " crees que será el total\n"
        );
        
        
        
        //Doble bucle do while, en uno se controla que no se escriban caracteres
        //no númericos y en otro se controla que esta variable esté entre 10 y 
        //un número mayor al que has sacado ya que el total de dedos entre ambos 
        //jugadores no puede ser igual o menor al número de dedos que se ha 
        //sacado anteriormente
        
        
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
                    
                    //Inicializamos la variable con lo que el usuario introduzca
                    
                    numero = Integer.parseInt(JOptionPane.showInputDialog(
                            "Piensa cual crees que es el total"));
                    
                    //Ponemos a false para salir del primer bucle y comprobar la
                    //segunda conndición de rango
                    
                    seguir = false;

                } catch (NumberFormatException nfe) {
                    
                    //Mensaje que salta si hay error de introducción
                    
                    JOptionPane.showMessageDialog(null,
                            "Valor no numérico, repita");
                }
                ;
            } while (seguir);
            
            //Mensaje que salta si no coincidimos con el rango disponible
            
            if (numero <= numeroJugador || numero > 10) {
                JOptionPane.showMessageDialog(null,
                        "No puedes predecir un número mas pequeño del"
                        + " que has sacado ni uno más grande que "
                        + " la suma máxima total posible");
            }
        } while (numero <= numeroJugador || numero > 10);
        
        //Devolvemos el valor ya filtrado que será recogida por la variable
        //prediccionJugador en el método partidaSimple
        
        return numero;

    }
    
    
    
    
    
    
    
    //Este método muestra cada uno de los datos de cada jugador y devuelve
    //según los parámetros quien es el vencedor de la ronda
    
    //Explicado mas a fondo en su interior
    private static String comprobarGanadorRonda(
            int numeroJugador, 
            int numeroMaquina,
            int prediccionJugador,
            int prediccionMaquina,
            int suma) {
        
        //Variable que muestra lo que ha sacado cada jugador, cual es la
        //prediccion de cada uno y la suma de los dedos sacados en cada ronda
        
        String resultado = "";
        String datos = """
                     
                     Número que has sacado = %d
                     Numero que has predecido = %d
                     
                     Número que ha sacado la máquina = %d
                     Número que ha predecido la máquina = %d
                     
                     Suma total = %d
                     
                     """.formatted(numeroJugador, prediccionJugador,
                numeroMaquina, prediccionMaquina, suma);

        JOptionPane.showMessageDialog(null, datos);
        
        
        //Segun el valor de cada variable nos encontramos con las posibilidades
        //disponibles
        
        //Dependiendo en que condición se cumpla se inicializa la varaible
        //resultado con diferentes cadenas de texto
        
        //Empate si ambos aciertan
        
        if (prediccionJugador == suma && prediccionMaquina == suma) {
            resultado = "Empate, siguiente ronda";

        } else {
            
            //Gana el usuario si acierta
            
            if (prediccionJugador == suma) {
                resultado = "Has ganado";

            }
            
            //Gana la máquina si acierta
            
            if (prediccionMaquina == suma) {
                resultado = "Ha ganado la maquina";

            }
            
            //No gana nadie si ninguno acierta
            
            if (prediccionJugador != suma && prediccionMaquina != suma) {
                resultado = "Nadie ha ganado se repite la ronda";
            }
        }
        
        
        //Se devuelve el valor de la cadena y este valor se almacenará en la
        //variable resultado en el método partidaSimple que se usara para contar
        //las victorias de ambos jugadores
        
        return resultado;

    }

}
