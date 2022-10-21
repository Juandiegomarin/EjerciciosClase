package switchrandom;

import java.util.Random;
import java.util.Scanner;

public class EjemploSwitchRandom {

    public static void main(String[] args) {
        
        Random rd= new Random();
        Scanner entrada = new Scanner(System.in);
        String letra;
        int numero;

        System.out.println("Introduce una letra->(A,B,C,D,E)");
        letra = entrada.nextLine();

        letra=letra.toLowerCase();
        
        
       
        // Para crear un random de tipo entero entre dos rangos siempre
        //(NumeroMayor-NumeroMenor +1)+NumeroMenor
        switch (letra) {
            case "a","b","c":
                
                numero=rd.nextInt(10)+1;

                break;
            case "d":
                numero=rd.nextInt(25-11+1)+11;
                break;
            case "e":
                numero=rd.nextInt(33-26+1)+26;
                break;
            default:
                numero=rd.nextInt(100-34+1)+34;
        }
        
        System.out.println(numero);
    }
}
