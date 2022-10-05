
package tema2_ejercicios_introduccion;


public class Ej03 {

    
    public static void main(String[] args) {
        
        int a = 10;
        int b = 5;
        int i = 0;
        
        double c =71.3;
        double d =4.8;
        
        
        int suma = a+b;
        int resta = a-b;
        int multiplicacion= a*b;
        double division= (double)a/b;
        
        double suma2 = c+d;
        double resta2 = c-d;
        double multiplicacion2 = c*d;
        double division2 = c/d;
        
        String resultados ="""
                          
                          a+b= %d
                          a-b= %d
                          a*b= %d 
                          a/b= %f 
                          c+d= %f
                          c-d= %f
                          c*d= %f
                          c/d= %f 
                          
                          
                          
                          
                          """.formatted(suma,resta,multiplicacion,division,suma2,resta2,multiplicacion2,division2);
        
        System.out.println(resultados);
    }
    
}
