
package tema2_ejercicios_introduccion;


public class Ej06 {

    
    public static void main(String[] args) {
        
        
        //Apartafo a
        boolean adivina = ((83 == 'a') && false);
		System.out.println(adivina);
                
        // Si funciona ya que compara el valor unicode de la letra a con el número 83
        // y da falso , el valor de la letra a es 97
        
        //Apartado b
        
        int a = 'a';
		System.out.println(a);
        // Funciona ya que guarda el valor unicode de a en un valor entero , luego lo imprime
        
        //Apartado c
        // No funciona porque se esta guardando una variable de tipo double en un int

        //Apartado d
        // No funciona ya que la parte decimal se escribe con punto en vez de coma
        
        //Apartado e
        boolean test = (1==1);
		System.out.println(test);
                
               // Si funciona esta todo bien escrito
    }
    
}
