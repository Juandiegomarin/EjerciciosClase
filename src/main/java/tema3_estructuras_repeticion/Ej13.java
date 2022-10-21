
package tema3_estructuras_repeticion;


public class Ej13 {

    
    public static void main(String[] args) {
        
        char caracter=65;
        
        
        do {      
            int codigo=caracter;
            System.out.print("("+caracter+"-"+codigo+")");
            System.out.print("-");
            caracter++;
            
            
        } while (caracter<91);
        
    }
    
}
