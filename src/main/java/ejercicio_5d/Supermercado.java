package ejercicio_5d;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Supermercado {

    public static void main(String[] args) {

        Caja caja = new Caja(new Cinta());
        int opcion;
        String menu = """
                   --------------------------------------------------------------------------
                   --  SuperMercado Cristobal
                     -------------------------------------------------------------------
                      
                    """;

        do {
            opcion = JOptionPane.showOptionDialog(null, "",
                    menu, JOptionPane.YES_NO_CANCEL_OPTION,
                    -1, null,// null para icono por defecto.
                    new Object[]{"Pasar producto", "Quitar producto", "Productos en cinta", "Generar ticket de compra", "Salir"}, 0);

            switch (opcion) {
                case 0 -> {
                    caja.pasarProducto();
                }
                case 1 -> {
                    caja.eliminarProducto();
                }
                case 2 -> {
                    caja.mostrarProductos();
                }
                case 3 -> {
                    if (caja.getCinta().estaVacia()) {
                        JOptionPane.showMessageDialog(null, "No se puede crear un ticket"
                                + " si la cinta esta vacia");
                        opcion=5;
                    } else {
                        JOptionPane.showMessageDialog(null, generarTicket(caja));
                    }
                }

            }

        } while (opcion != 3 && opcion != 4);

    }
    //Generamos un ticket con una caja en concreto
    public static Ticket generarTicket(Caja c) {

        return c.generarTicket();

    }
}
