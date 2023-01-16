package ejercicio_5d;


import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Utilidades {

    public static int filtrarNumeroEnteroSccaner() {

        Scanner entrada = new Scanner(System.in);

        int numero = 0;
        boolean seguir = true;
        do {

            System.out.println("Introduce el número");

            try {
                numero = entrada.nextInt();
                seguir = false;
            } catch (InputMismatchException ime) {
                System.out.println("Ha introducido un valor incorrecto, repita");
            }

            entrada.nextLine();
        } while (seguir);

        return numero;
    }

    public static int filtrarNumeroEnteroSccanerRango(int minimo, int maximo) {

        Scanner entrada = new Scanner(System.in);

        int numero = 0;
        boolean seguir = true;
        do {

            System.out.println("Introduce el número");

            try {
                numero = entrada.nextInt();
                if (numero >= minimo && numero <= maximo) {
                    seguir = false;
                } else {
                    System.out.println("El número debe estar entre " + minimo + " y " + maximo);
                }
            } catch (InputMismatchException ime) {
                System.out.println("Ha introducido un valor incorrecto, repita");
            }

            entrada.nextLine();
        } while (seguir);

        return numero;
    }

    public static int filtrarNumeroEnteroJOptionPane(String msj) {

        int numero = 0;
        boolean seguir = true;
        do {

            try {
                numero = Integer.parseInt(JOptionPane.showInputDialog(msj));
                seguir = false;
            } catch (NumberFormatException nfe) {
                JOptionPane.showMessageDialog(null, "Ha introducido un valor incorrecto, repita");
            }

        } while (seguir);

        return numero;
    }

    public static int filtrarNumeroEnteroJOptionPaneRango(int minimo, int maximo,String msj) {

        int numero = 0;
        boolean seguir = true;
        do {
            try {
                numero = Integer.parseInt(JOptionPane.showInputDialog(msj));
                if (numero >= minimo && numero <= maximo) {
                    seguir = false;
                } else {
                    JOptionPane.showMessageDialog(null, "El número debe estar entre " + minimo + " y " + maximo);
                }
            } catch (NumberFormatException nfe) {
                JOptionPane.showMessageDialog(null, "Ha introducido un valor incorrecto, repita");
            }
        } while (seguir);
        return numero;
    }
    
    
    
    
    public static double filtrarNumeroDecimalScanner() {

        Scanner entrada = new Scanner(System.in);

        double numero = 0;
        boolean seguir = true;
        do {

            System.out.println("Introduce el número");

            try {
                numero = entrada.nextDouble();
                seguir = false;
            } catch (InputMismatchException ime) {
                System.out.println("Ha introducido un valor incorrecto, repita");
            }

            entrada.nextLine();
        } while (seguir);

        return numero;

    }

    public static double filtrarNumeroDecimalSccanerRango(double minimo, double maximo) {

        Scanner entrada = new Scanner(System.in);

        double numero = 0;
        boolean seguir = true;
        do {

            System.out.println("Introduce el número");

            try {
                numero = entrada.nextDouble();
                if (numero >= minimo && numero <= maximo) {
                    seguir = false;
                } else {
                    System.out.println("El número debe estar entre " + minimo + " y " + maximo);
                }
            } catch (InputMismatchException ime) {
                System.out.println("Ha introducido un valor incorrecto, repita");
            }

            entrada.nextLine();
        } while (seguir);

        return numero;
    }

    public static double filtrarNumeroDecimalJOptionPane(String msj) {

        double numero = 0;
        boolean seguir = true;
        do {

            try {
                numero = Double.parseDouble(JOptionPane.showInputDialog(msj));
                seguir = false;
            } catch (NumberFormatException nfe) {
                JOptionPane.showMessageDialog(null, "Ha introducido un valor incorrecto, repita");
            }
            catch(NullPointerException npe){
                 JOptionPane.showMessageDialog(null, "Ha introducido un valor incorrecto, repita");
            numero=1;
            }

        } while (seguir);

        return numero;
    }

    public static double filtrarNumeroDecimalJOptionPaneRango(double minimo, double maximo,String msj) {

        double numero = 0;
        boolean seguir = true;
        do {
            try {
                numero = Double.parseDouble(JOptionPane.showInputDialog(msj));
                if (numero >= minimo && numero <= maximo) {
                    seguir = false;
                } else {
                    JOptionPane.showMessageDialog(null, "El número debe estar entre " + minimo + " y " + maximo);
                }
            } catch (NumberFormatException nfe) {
                JOptionPane.showMessageDialog(null, "Ha introducido un valor incorrecto, repita");
            }
        } while (seguir);
        return numero;
    }
    
    
    
    public static int numeroEnteroRandom(int minimo, int maximo) {

        Random random = new Random();
        int numero = random.nextInt(maximo - minimo + 1) + minimo;
        return numero;
    }

    public static double numeroDecimalRandom(double minimo, double maximo) {

        Random random = new Random();
        double numero = random.nextDouble(maximo - minimo + 1) + minimo;
        return numero;
    }
    
    
    
    public static String pedirString(String mensaje) {
        String string = JOptionPane.showInputDialog(mensaje);
        return string;
    }
}
