package ejercicio_5abc;

public class VehiculoCatalogo extends Catalogo<Vehiculo> {

    

    public VehiculoCatalogo(int longitud) {
        super(longitud);
        
        for (int i = 0; i < longitud; i++) {
            lista.add(new Vehiculo());
        }
    }
    
     public Vehiculo buscarVehiculo(String bastidor) {
        Vehiculo aux = new Vehiculo();
        aux.setBastidor(bastidor);            //FUEZO A QUE LE CLIENTE TENGA EL NIF Q BUSCO
        int posicion = this.buscarElemento(aux);

        return (posicion >= 0) ? this.lista.get(posicion) : null;
        //SI ES MAYOR P IGUAL A CERO DEVUELVE LA EL CLIENTE ENTERO
    }
    

    }

    


