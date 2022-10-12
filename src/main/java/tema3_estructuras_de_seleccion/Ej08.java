
package tema3_estructuras_de_seleccion;


public class Ej08 {

    
    public static void main(String[] args) {
        
        // Asignamos el valor "B" a la variable departamento
        //Entramos en la estructura switch y entra en el caso que corresponde con el valor de la variable
        // e imprime por pantalla REcursos Humanos
        char departamento = 'B';

      switch(departamento)
      {
         case 'A' :
            System.out.println("Desarrollo");
            break;
         case 'B' :
    	System.out.println("Recursos Humanos");
            break;
         case 'C' :
            System.out.println("Finanzas");
            break;
         case 'D' :
            System.out.println("Mercadeo");
         default :
            System.out.println("Departamento no válido");
      }
      System.out.println("Código para el departamento es " + departamento);

        
        
    }
    
}
