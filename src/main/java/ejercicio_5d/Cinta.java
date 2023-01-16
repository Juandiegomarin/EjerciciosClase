package ejercicio_5d;

import java.util.ArrayList;

public class Cinta {

    private ArrayList<Producto> cinta;

    public Cinta() {
        this.cinta = new ArrayList<>();
    }

    public ArrayList<Producto> getCinta() {
        return cinta;
    }

    //Recibimos un objeto tipo producto y lo añadimos a nuestra lista
    public void anadirProducto(Producto p) {

        cinta.add(p);

    }

    //Recibimos objeto producto y lo eliminamos de nuestra lista
    public void eliminarProducto(Producto p) {

        cinta.remove(p);

    }
    
    //Devolvemos de sin la lista contiene 0 elementos 
    public boolean estaVacia() {

        return cinta.size() == 0;
    }
    
    //Este metodo lo usaremos en el toString de ticket para la parte de los datos de cada producto en cinta
    public String generarListaProductosTicket() {

        String lista = "";

        for (Producto p : cinta) {
            lista += p.nombre() + "                 "
                    + p.precio() + "                      "
                    + p.cantidad() + "                   "
                    + p.iva() + "%" + "                "
                    + p.precio() * p.cantidad() + "\n";
        }

        return lista;
    }
    
    //Genera la ultima parte del toString de ticket donde aparece el histograma de cada
    //de productos divididos por iva y que muetsra el precio total a pagar
    public String generarStringTotal() {

        int contador4 = 0;
        int contador10 = 0;
        int contador21 = 0;

        double precio4 = 0;
        double precio10 = 0;
        double precio21 = 0;

        String info4 = "";
        String info10 = "";
        String info21 = "";

        String infoPrecioAPagar = "";

        String infoTotal = "";

        for (Producto producto : cinta) {

            if (producto.iva() == 4) {
                contador4 += producto.cantidad();
                precio4 += producto.precio() * producto.cantidad();
            }
            if (producto.iva() == 10) {
                contador10 += producto.cantidad();
                precio10 += producto.precio() * producto.cantidad();
            }
            if (producto.iva() == 21) {
                contador21 += producto.cantidad();
                precio21 += producto.precio() * producto.cantidad();
            }

        }
        info4 = "Nºprod. iva4%: " + contador4 + "            Precio sin IVA: " + precio4 + "          Precio con IVA: " + (precio4 + (precio4 * 0.04));
        info10 = "Nºprod. iva10%: " + contador10 + "          Precio sin IVA: " + precio10 + "          Precio con IVA: " + (precio10 + (precio10 * 0.1));
        info21 = "Nºprod. iva21%: " + contador21 + "          Precio sin IVA: " + precio21 + "          Precio con IVA: " + (precio21 + (precio21 * 0.21));

        infoPrecioAPagar = "---------------------------------------------------------------------------------------------------\n"
                + "Total a pagar: " + ((precio4 + (precio4 * 0.04)) + (precio10 + (precio10 * 0.1)) + (precio21 + (precio21 * 0.21)) + "  --  Gracias por su visita\n")
                + "---------------------------------------------------------------------------------------------------";
        infoTotal = info4 + "\n" + info10 + "\n" + info21 + "\n" + infoPrecioAPagar;

        return infoTotal;

    }

    @Override
    public String toString() {
        return "Cinta{" + "cinta=" + cinta + '}';
    }

}
