
package tema3_estructuras_repeticion;


public class Ej04 {

    
    public static void main(String[] args) {
        
        int numero = 1;
         
          while (numero < 11)
          {
               System.out.println("Número: " + numero);
               numero++;
               //Primero imprime el numero y lo actualiza
          }
          do {
               System.out.println("Número " + --numero);
          } while(numero > 1);
          //Aqui mientras sea mayor qeu 1 imprime el numero -1
    }
    
}
