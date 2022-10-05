
package tema2_ejercicios_introduccion;


public class Ej05 {

   
    public static void main(String[] args) {
        
        
        boolean verdadero= true;
        boolean falso=false;
        
        
        
         String operaciones ="""
                          
                          verdadero&&verdadero = %b
                         verdadero && falso = %b
                          falso && verdadero = %b
                          falso && falso = %b
                          verdadero || verdadero = %b
                          verdadero || falso = %b
                          falso || verdadero = %b
                          falso || falso = %b
                          
                          
                          """.formatted(verdadero,falso,falso,falso,verdadero,verdadero,verdadero,falso);
        
        
        System.out.println(operaciones);
        
        
    }
    
}
