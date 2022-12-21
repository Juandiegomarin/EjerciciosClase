package ejercicio_5b;

import java.time.LocalDate;

public class AlquilerCatalogo extends Catalogo<Alquiler>{

    

    public AlquilerCatalogo(int longitud) {
        super(longitud);
        

    }

    public Alquiler buscarAlquiler(int id) {
        Alquiler aux = new Alquiler();
        aux.setIdAlquiler(id);            
        int posicion = this.buscarElemento(aux);

        return (posicion >= 0) ? this.lista.get(posicion) : null;
        
    }

}
