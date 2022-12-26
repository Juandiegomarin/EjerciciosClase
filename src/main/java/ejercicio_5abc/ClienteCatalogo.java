package ejercicio_5abc;

public class ClienteCatalogo extends Catalogo<Cliente> {

   

    public ClienteCatalogo(int longitud) {
        super(longitud);
        
        for (int i = 0; i < longitud; i++) {
            lista.add(new Cliente());
        }
    }

    
    public Cliente buscarCliente(String nif) {
        Cliente aux = new Cliente();
        aux.setNif(nif);//FUEZO A QUE LE CLIENTE TENGA EL NIF Q BUSCO
        int posicion = this.buscarElemento(aux);

        return (posicion >= 0) ? this.lista.get(posicion) : null;
        //SI ES MAYOR P IGUAL A CERO DEVUELVE LA EL CLIENTE ENTERO
    }

}
