package empresaAlquiler;

public class ClienteCatalogo {

    private int longitud;
    private Cliente[] listaCliente;

    public ClienteCatalogo(int longitud) {
        longitud = Math.abs(longitud);
        this.longitud = longitud;

        this.listaCliente = new Cliente[longitud];
        for (int i = 0; i < listaCliente.length; i++) {

            this.listaCliente[i] = new Cliente();

        }
    }

    @Override
    public String toString() {

        String cadena = "";

        for (Cliente c : listaCliente) {
            if (c != null) {
                cadena += c.toString() + "\n";
            }

        }

        return cadena;
    }

    public int getLongitud() {
        return longitud;
    }

    public Cliente[] getListaCliente() {
        return listaCliente;
    }
    
    
    private int buscarCliente(Cliente c) {

        for (int i = 0; i < listaCliente.length; i++) {
            if (c.equals(this.listaCliente[i])) {
                return i;
            }
        }
        return -1;

    }

    public Cliente buscarCliente(String nif) {

        Cliente aux = new Cliente();
        aux.setNif(nif);

        int posicion = buscarCliente(aux);

        return (posicion >= 0) ? this.listaCliente[posicion] : null;

    }

    public void añadirCliente(Cliente c) {

        if (this.longitud < this.listaCliente.length) {
            for (int i = 0; i < this.listaCliente.length; i++) {
                if (this.listaCliente[i] == null) {
                    this.listaCliente[i] = c;
                    this.longitud++;
                    break;

                }
            }

        } else {
            this.longitud++;
            this.listaCliente = copiar();
            this.listaCliente[this.longitud - 1] = c;
        }

    }

    private Cliente[] copiar() {

        Cliente[] aux = new Cliente[this.longitud + 1];

        for (int i = 0; i < this.listaCliente.length; i++) {
            aux[i] = this.listaCliente[i];
        }

        return aux;
    }

    //borrar clientes
    public boolean borrarCliente(Cliente c) {
        int pos = buscarCliente(c);
        if (pos >= 0) {
            this.longitud--;
            this.listaCliente[pos] = null;
            return true;
        }
        return false;
    }

}
