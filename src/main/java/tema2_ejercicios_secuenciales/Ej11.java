
package tema2_ejercicios_secuenciales;

import java.util.Scanner;


public class Ej11 {

    
    public static void main(String[] args) {
        
        
        Scanner entrada = new Scanner(System.in);
        
        double radioSemicircunferencia;
        double hipotenusaTriangulo;
        double catetoOpuesto;
        double catetoContiguo;
        double pi=Math.PI;
        
        double areaSemicircunferencia;
        double areaTriangulo;
        double areaFigura;
        
        
        System.out.println("Tenemos una figura compuesta por una semicircunferencia y un triangulo"
                + " su area dependera de los valores que le demos al radio y a la hipotenusa");
        
        System.out.println("Introduzca el valor del radio");
        radioSemicircunferencia= entrada.nextDouble();
        
        System.out.println("Ahora introduzca el valor de la hipotenusa");
        hipotenusaTriangulo= entrada.nextDouble();
        
        System.out.println("En este caso segun la figura el cateto opuesto es igual al"
                + " radio de la semicircunferencia, por lo tanto tienen el mismo valor ");
        
        catetoOpuesto=radioSemicircunferencia;
        
        System.out.println("La altura del triangulo equivale al cateto contiguo el que debemos calcular ");
        
        catetoContiguo=Math.sqrt(Math.pow(hipotenusaTriangulo, 2)-Math.pow(catetoOpuesto, 2));
        
        System.out.println("Ya con esto podemos calcular el area de las figuras por separado para luego sumarlas"
                + " y obtener el area final");
        
        areaTriangulo=(radioSemicircunferencia*catetoContiguo);
        
        System.out.println("Area del triangulo: "+areaTriangulo+" u²");
        
        
        areaSemicircunferencia=(pi*Math.pow(radioSemicircunferencia, 2))/2;
        System.out.println("Area de la semicircunferencia: "+areaSemicircunferencia+" u²");
         
        
        areaFigura=areaTriangulo+areaSemicircunferencia;
        
        
        
        System.out.println("El area obtenida es: "+areaFigura+" u²");
    }
    
}
