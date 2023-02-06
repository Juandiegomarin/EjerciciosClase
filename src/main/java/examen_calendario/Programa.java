
package examen_calendario;


public class Programa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int anio;
        
        anio=utilidades.Utilidades.filtrarNumeroEnteroSccanerRango(1950, 2050, "Introduce un año entre 1950 y 2050");
        
        Calendario c=  new Calendario(2, 2023);
        
        
        
    }
    
}
