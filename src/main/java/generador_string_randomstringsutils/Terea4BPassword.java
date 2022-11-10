package generador_string_randomstringsutils;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import org.apache.commons.lang3.RandomStringUtils;

public class Terea4BPassword {

    public static void main(String[] args) {
        
        //Variable que almacena el valor que devuelve el método
        //filtrarOpcionMostrarMenu
        
        int opcion = 0;
        
        //Esta variable la utilizaremos para darle longitud a la secuencia del
        //apartado 3 
        
        int longitud=0;
        
        //Bucle principal que se repite siempre que opcion sea distinta de 4
        
        do {
            
            //Inicializamos la varaible con el valor que devuelve el método
            //filtrarOpcionMostrarMenu(
            
            opcion=filtrarOpcionMostrarMenu();
            
            //Switch que hace de esqueleto de nuestro programa y separa las
            //partes de nuestro programa
            
            switch (opcion) {
                
                case 1:
                    
                    //Llamada al método que genera pins de 4 digitos
                    
                    generadorPinCuatroDigitos();
                    
                    break;
                case 2:
                    
                    //Llamada al método que genera contraseñas de 8 caracteres
                    
                    generadorContraseniaOchoCaracteres();
                    
                    break;
                case 3:
                    
                    //Inicializamos la variable con el valor que devuelve el 
                    //método filtrarLongitud
                    
                    longitud=filtrarLongitud();
                    
                    //Llamada al método que genera secuencias de caracteres
                    //de un tamaño determinado
                    
                    generarCadenaConArray(longitud);
                    
                    break;
                case 4:
                    
                    //Mensaje cuando se sale del programa
                     JOptionPane.showMessageDialog(null,
                            "Saliendo...");
                     
                    break;

                default:
                    JOptionPane.showMessageDialog(null,
                            "Valor no dispobible repita");

            }

        } while (opcion != 4);

    }
    
    
    
    //Este método genera pins de 4 dígitos
    private static void generadorPinCuatroDigitos() {
        
        //Inicializamos la variable que guardará la cadena de dígitos
        
        String pin;
        
        //Creamos una lista para almacenar los diferentes pins que se vayan
        //generando
        
        ArrayList<String> listaPin = new ArrayList<String>();
        
        //Bucle for para que cada iteración se genere un pin y se almacene
        // en la lista
        
        for (int i = 0; i < 10; i++) {
            
            //Inicializamos la variable con este método de la clase
            //RandomStringUtils
            
            pin = RandomStringUtils.randomNumeric(4);
            
            //Añadimos el pin a la lista
            
            listaPin.add(pin);
        }
        
        //Mostramos la lista de 10 pins por pantalla
        
        JOptionPane.showMessageDialog(null, listaPin);
    }
    
    
    
    
    //Este método genera contraseñas de 8 caracteres
    private static void generadorContraseniaOchoCaracteres() {
        
         //Inicializamos la variable que guardará contraseñas de 8 caracteres
         
        String contrasenia;
        
        //Creamos una lista para almacenar las diferentes contraseñas que se 
        //vayan generando
        
        ArrayList<String> listaContrasenia = new ArrayList<String>();
        
         //Bucle for para que cada iteración se genere una contraseña y 
        //se almacene en la lista
        
        for (int i = 0; i < 10; i++) {
            
            //Inicializamos la variable con este método de la clase
            //RandomStringUtils
            
            contrasenia = RandomStringUtils.randomAlphanumeric(8);
            
             //Añadimos la contraseña a la lista
             
            listaContrasenia.add(contrasenia);
        }
        
         //Mostramos la lista de 10 contraseñas por pantalla
         
        JOptionPane.showMessageDialog(null, listaContrasenia);
    }
    
    
    
    
    
    //Este método genera secuencias de caracteres con una longitud
    //esta se pasa por parámetro
    private static void generarCadenaConArray(int longitud) {
        
        
        //Inicializamos una array de char con estos valores por defecto
        
        char[] cadena = {'a', 'b', 'c', 'd', 'e'};
        
        //Creamos una lista para almacenar las diferentes secuencias 
        //que se vayan generando
        
        ArrayList<String> listaSecuencias = new ArrayList<String>();
        
        
        //Bucle for para que cada iteración se genere una secuencia y 
        //se almacene en la lista
        
        for (int i = 0; i < 10; i++) {
            
            //Inicializamos la variable con este método de la clase
            //RandomStringUtils
            
            String secuencia = RandomStringUtils.random(longitud, cadena);
            
            //Añadimos la secuencia a la lista
            
            listaSecuencias.add(secuencia);
            
        }
        
        //Mostramos la lista por pantalla
        
        JOptionPane.showMessageDialog(null, listaSecuencias);
    }
    
    
    
    
    
    //Este método filtra la longitud
    private static int filtrarLongitud() {
        
        //Esta variable se devolverá filtrada y la recogerá la variable longitud
        // en el main de nuestro programa
        
        int longitud = 0;
        
        //Variable booleana necesaria para la lógica de nuestro programa
        
        boolean seguir = true;
        
        //Bucle que se repite se nos equivocamos al introducir un dato
        
        do {
            
            //Try catch para controlar que no se introduzca un dato no numnérico
            
            try {
                
                //Inicializamos la variable con el valor que
                //introduzca el usuario
                
                longitud = Integer.parseInt(
                        JOptionPane.showInputDialog("Introduce la longitud que quieras"
                                + " que tenga la secuencia "));

                
                //Ponemos seguir a false para terminar el bucle si se introduce
                //correctamente
                
                seguir = false;
                
            } catch (NumberFormatException nfe) {
                
                //Mensaje que salta si nos equivocamos al introducir
                
                JOptionPane.showMessageDialog(null,
                        "Valor incorrecto repita");
            }

        } while (seguir);
        
        //Devolvemos el valor ya filtrado
        
        return longitud;

    }
    
    
    
    
    
    //Este método filtra la opción y muestra el menú de opciones
    private static int filtrarOpcionMostrarMenu() {
        
        //Variable que filtraremos y que so valor se devolverá, este valor
        //lo guardará la variable opcion en el main de nuestro programa
        
        int opcion = 0;
        
        //Variable booelana necesaria para la lógica del bucle
        
        boolean seguir = true;
        
        //Variable que guarda el menú de nuestro programa
        
        String menu = """
                    
                    Menú de opciones
                    ------------------------------------
                    1-Generar pin 4 digitos
                    2-Generar contraseña 4 caracteres
                    3-Generar secuencia de n caracteres
                    4-Salir
                    ------------------------------------
                    Introduce una opción
                   """;
        
        
        //Bucle que se repite se nos equivocamos al introducir un dato
        
        do {
            
            
            //Try catch para controlar que no se introduzca un dato no numnérico
            
            try {
                
                //Inicializamos la variable con el valor que
                //introduzca el usuario
                
                opcion = Integer.parseInt
                                   (JOptionPane.showInputDialog(menu));
                
                //Ponemos seguir a false para terminar el bucle si se introduce
                //correctamente
                
                seguir = false;
                
            } catch (NumberFormatException nfe) {
                
                 //Mensaje que salta si nos equivocamos al introducir
                
                JOptionPane.showMessageDialog(null,
                        "Valor incorrecto, repita");
            }

        } while (seguir);
        
        //Devolvemos el valor ya filtrado
        
        return opcion;

    }
}
