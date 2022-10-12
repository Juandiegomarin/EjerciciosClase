
package tema3_estructuras_de_seleccion;

import java.util.Scanner;


public class Ej05 {

    
    public static void main(String[] args) {
        
        
        Scanner entrada = new Scanner(System.in);
        int opcion;
        
        double ladoCuadrado;
        double areaCuadrado;
        
        double baseTriangulo;
        double alturaTriangulo;
        double areaTriangulo;
        
        double radioCirculo;
        double areaCirculo;
 
        System.out.println("Menú de opciones");
        System.out.println("-------------------------");
        System.out.println("1. Calcular el área de un Cuadrado");
        System.out.println("2. Calcular el área de un Triángulo");
        System.out.println("3. Calcular el área de un Círculo");
        System.out.println("4. Finalizar");
 
        System.out.print("Elija una opción: ");
        opcion = entrada.nextInt();
 
        if (opcion == 1) {
            System.out.println("Ha seleccionado calcular el área de un cuadrado...");
            
            System.out.println("Introduce uno de los lados del cuadrado");
            ladoCuadrado=entrada.nextDouble();
            
            areaCuadrado=Math.pow(ladoCuadrado, 2);
            
            System.out.println("EL area del cuadrado es: "+areaCuadrado+" u²");
            
        } 
	  else { 
		if (opcion == 2) {
            	System.out.println("Ha seleccionado calcular el área de un triángulo...");
                
                    System.out.println("Introduce la base del triángulo");
                    baseTriangulo=entrada.nextDouble();
                    
                    System.out.println("Ahora introduce la altura del triángulo");
                    alturaTriangulo=entrada.nextDouble();
                    
                    areaTriangulo=(baseTriangulo*alturaTriangulo)/2;
                    
                     System.out.println("EL area del cuadrado es: "+areaTriangulo+" u²");
                
                
        	} 
		else { 
			if (opcion == 3) {
            		System.out.println("Ha seleccionado calcular el área de un círculo...");
                        
                            System.out.println("Introduce el radio del circulo");
                            radioCirculo=entrada.nextDouble();
                            
                            areaCirculo=Math.PI*Math.pow(radioCirculo, 2);
                             System.out.println("EL area del cuadrado es: "+areaCirculo+" u²");
        		} 
			else {
            		System.out.println("Ha seleccionado terminar");
       		} 
    }
    
}
}
}