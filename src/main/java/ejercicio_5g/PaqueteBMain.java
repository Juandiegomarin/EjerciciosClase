
package ejercicio_5g;


public class PaqueteBMain {

    
    public static void main(String[] args) {
        
        PaqueteBListaDePremios listaPremios= new PaqueteBListaDePremios();
        
        
       listaPremios.imprimirLista();
       
        System.out.println("");
       
     double p=  listaPremios.saberPremio("0001");
        System.out.println("El premio del numero es 0001 es:");
        System.out.println(p);
        
    }
    
}
