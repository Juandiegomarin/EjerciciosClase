
package tema4_ejercicios_introduccion_poo;

import java.util.Scanner;


public class SerieServicio {
    
    
    
    
    private static Scanner teclado= new Scanner(System.in);
    
    
    
    public static Serie leerTecladoSerie(){
    
    Serie serie;
    
    String nombre=teclado.nextLine();
    System.out.println("Nombre de la serie: "+nombre);
    
    String genero=teclado.nextLine();
    System.out.println("Género de la serie: "+genero);
    
    String productora=teclado.nextLine();
    System.out.println("Productora: "+productora);
    
    String sinopsis=teclado.nextLine();
    System.out.println("Sinopsis: "+sinopsis);
    
    int temporadas=teclado.nextInt();
    System.out.println("Temporadas: "+temporadas);
    
    int likes=teclado.nextInt();
    System.out.println("Likes: "+likes);
    
    serie=new Serie(nombre, genero, sinopsis, temporadas, likes, productora);
    
    return serie;
    
    }
    
}
