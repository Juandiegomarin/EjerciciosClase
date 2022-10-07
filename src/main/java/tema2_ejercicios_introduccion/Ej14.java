
package tema2_ejercicios_introduccion;

import java.util.Scanner;


public class Ej14 {

    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int tiempoSegundos;
        int horas;
        int minutos;
        int segundos;
        
        System.out.println("Indica un tiempo en segundos");
        tiempoSegundos=entrada.nextInt();
        
        
        horas = tiempoSegundos/3600;
        minutos= (tiempoSegundos-(3600*horas))/60;
        segundos= tiempoSegundos-((horas*3600)+(minutos*60));;
        
        System.out.println("El tiempo es = "+"Horas: "+horas+" Minutos: "+minutos+" Segundos: "+segundos);
    }
    
}
