
package tema3_estructuras_de_seleccion;


public class Ej03 {

   
    public static void main(String[] args) {
        
      //Apartado A      
      //boolean unaCondicion = true;
      //resultado = unaCondicion ? valor1 : valor2
      
      //Devuelve valor1 ya que al ser verdadero elige el primer valor
      
      //Apartado B
      
         int x = 10;
         int y = (x > 9) ? 100 : 200;

         //Y vale 100 ya que 10>9
         
         //Apartado C
        int publico = 19500;
    	int vendidas = 19000;
	int aforo = 2000;
  	String status = (publico < aforo) ? "Cabe mas gente": (vendidas < aforo) ? "Aun no hemos vendido todo" : "Esta todo vendido";
        //Esta todo vendido
    }
    
}
