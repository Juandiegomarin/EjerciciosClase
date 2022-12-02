
package tema5_ejercicios_estructuras_almacenamiento;

public class Ej04 {

  
    public static void main(String[] args) {
        
        
        int[] array= new int[50];
        
        for (int i = 0; i < array.length; i++) {
            
            array[i]=utilidades.Utilidades.numeroEnteroRandom(1, 50);
            
        }
        
        for (int i = 0; i < array.length; i++) {
            
            System.out.println(array[i]);
        }
        
        int numero=30;
        
        for (int i = 0; i < array.length; i++) {
            
            if(array[i]==numero){
            
                System.out.println("El numero "+numero+" se encuentra en la posicion "+i+" del array");
                break;
            }
        }
       
    }
    
}
