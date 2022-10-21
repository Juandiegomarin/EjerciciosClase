
package tema3_estructuras_repeticion;


public class Ej13 {

    
    public static void main(String[] args) {
        
        char caracter=65;
        int codigo=caracter;
        
        do {      
            
            System.out.print("("+caracter+"-"+codigo+")");
            System.out.print("-");
            caracter++;
            
            
        } while (caracter<91);
        
    }
    
}
