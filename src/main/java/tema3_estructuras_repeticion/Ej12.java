
package tema3_estructuras_repeticion;


public class Ej12 {

    
    public static void main(String[] args) {
        
        
        char caracter=97;
        int codigo=caracter;
        
        for (int i = 0; i <= 25; i++) {
            
            System.out.print("("+caracter+"-"+codigo+")");
            System.out.print("-");
            caracter++;
        }
        
        
    }
    
}
