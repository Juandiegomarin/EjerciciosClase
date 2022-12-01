
package tema5_ejercicios_estructuras_almacenamiento;


public class Ej01 {

    
    public static void main(String[] args) {
        
        
        int[] numeros= new int[]{1,2,3,4,5,6};
        
        int suma=0;
        for (int i = 0; i < numeros.length; i++) {
            
            System.out.println(numeros[i]);
            suma+=numeros[i];
            
        }
        System.out.println("La suma total es: "+suma);
        
    }
    
}
