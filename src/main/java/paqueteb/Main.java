
package paqueteb;


public class Main {

    
    public static void main(String[] args) {
        
        ListaDePremios listaPremios= new ListaDePremios();
        
        
       listaPremios.imprimirLista();
       
        System.out.println("");
       
     double p=  listaPremios.saberPremio("0001");
        System.out.println("El premio del numero es 0001 es:");
        System.out.println(p);
        
    }
    
}
