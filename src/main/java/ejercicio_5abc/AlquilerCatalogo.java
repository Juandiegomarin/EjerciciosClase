package ejercicio_5abc;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class AlquilerCatalogo extends Catalogo<Alquiler>{

    

    public AlquilerCatalogo(int longitud) {
        super(longitud);
       
    }

    public ArrayList<Alquiler>alquiCli(String nif){
    
        ArrayList <Alquiler> list= new ArrayList<>();
        for (int i = 0; i < this.lista.size(); i++) {
            
            if(lista.get(i).getCliente().getNif().equals(nif)){
            
            list.add(lista.get(i));
            }
            
            
        }
    
    
    return list;
    
    }
    
    public ArrayList<Alquiler>alquiVeh(String bastidor){
    
        ArrayList <Alquiler> list= new ArrayList<>();
        for (int i = 0; i < this.lista.size(); i++) {
            
            if(lista.get(i).getVehiculo().getBastidor().equals(bastidor)){
            
            list.add(lista.get(i));
            }
            
            
        }
    
    
    return list;
    
    }
    
    

    public Alquiler buscarAlquiler(int id) {
        Alquiler aux = new Alquiler();
        aux.setIdAlquiler(id);            
        int posicion = this.buscarElemento(aux);

        return (posicion >= 0) ? this.lista.get(posicion) : null;
        
    }
    
    public boolean buscarCliente(String nif){
        boolean comprobar=false;
        for (int i = 0; i < lista.size(); i++) {
            
            if(lista.get(i).getCliente().getNif().equals(nif)){
            comprobar=true;
            
            }
        }
    return comprobar;
    }
    public boolean buscarVehiculo(String bastidor){
    
        boolean comprobar=false;
        for (int i = 0; i < lista.size(); i++) {
            
            if(lista.get(i).getVehiculo().getBastidor().equals(bastidor)){
            comprobar=true;
            
            }
        }
    return comprobar;
    
    
    
    }

}
