package ejercicio_5d;

import java.util.ArrayList;
import java.util.Objects;
import javax.swing.JOptionPane;

public class Caja {

    private int identificador;
    private Cinta cinta;

    private static int id = 0;

    public Caja(Cinta cinta) {
        this.identificador = id++;
        this.cinta = cinta;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public Cinta getCinta() {
        return cinta;
    }

    public void setCinta(Cinta cinta) {
        this.cinta = cinta;
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Caja.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + this.identificador;
        hash = 79 * hash + Objects.hashCode(this.cinta);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Caja other = (Caja) obj;
        if (this.identificador != other.identificador) {
            return false;
        }
        return Objects.equals(this.cinta, other.cinta);
    }

    @Override
    public String toString() {
        return "Caja{" + "identificador=" + identificador + ", cinta=" + cinta + '}';
    }

    //Metodo que crea ticket con los productos que contiene la cinta de la caja
    public Ticket generarTicket() {

        Ticket t = new Ticket(this.cinta);

        return t;
    }

    //Metodo para pasar un Producto o Volver atras
    public void pasarProducto() {
        int opcion;

        opcion = JOptionPane.showOptionDialog(null, "           Nuevo Producto",
                "Selector cinta", JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE, null,// null para icono por defecto.
                new Object[]{"Introdicir datos", "Atrás"}, 0);
        if (opcion == 0) {
            cinta.anadirProducto(crearProducto());
        } else {
            opcion = JOptionPane.CANCEL_OPTION;
        }

    }

    //Metodo que nos permite crea un producto desde cero para poder añadirlo a la cinta
    public Producto crearProducto() {

        String nombre;
        int cantidad;
        double precio;
        Iva iva;

        int opcion;
        do {
            nombre = Utilidades.pedirString("Introducir nombre del producto");
            if (nombre == null || nombre.equalsIgnoreCase("")) {
                nombre = "";
                JOptionPane.showMessageDialog(null, "No se puede crear un producto sin nombre");
            }

        } while (nombre == "");

        do {
            precio = Utilidades.filtrarNumeroDecimalJOptionPane("Introducir precio del producto");
            if (precio == 0) {
                JOptionPane.showMessageDialog(null, "El precio no puede ser 0, reptita");
            }
        } while (precio == 0);

        do {
            cantidad = Utilidades.filtrarNumeroEnteroJOptionPane("¿Cuantas unidades hay?");
            if (cantidad == 0) {
                JOptionPane.showMessageDialog(null, "La cantidad no puede ser 0, reptita");
            }
        } while (cantidad == 0);
        opcion = JOptionPane.showOptionDialog(null, "Seleccione tipo de iva",
                "Selector de IVA", JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE, null,// null para icono por defecto.
                new Object[]{"4%", "10%", "21%"}, 0);

        if (opcion == 0) {
            iva = Iva.CUATRO;
        } else if (opcion == 1) {
            iva = Iva.DIEZ;
        } else {
            iva = Iva.VEINTIUNO;
        }

        return new Producto(nombre, precio, cantidad, iva.getIva());
    }

    //Metodo que elimina el producto introduciendo su nombre
    public void eliminarProducto() {
        String nombre = "";

        if (cinta.estaVacia()) {
            JOptionPane.showMessageDialog(null, "La cinta esta vacia"
                    + " no se puede quitar ningun producto");
        } else {
            do {

                nombre = JOptionPane.showInputDialog("Escribe el nombre del producto "
                        + " para quitar de la cinta\n\n" + listaProductos());
                if (nombre == null) {
                    nombre = "";
                }

            } while (!comprobarNombre(nombre) || nombre.equals(""));

        }
    }

    //Comprobamos que si el nombre que ponemos en eliminarProducto existe en nuestra
    //cinta , si existe  eliminamos el producto que coincide con el nombre pasado por parametro
    public boolean comprobarNombre(String s) {

        boolean existe = false;
        for (Producto p : cinta.getCinta()) {
            if (s.equalsIgnoreCase(p.nombre())) {
                existe = true;
                cinta.eliminarProducto(p);
                break;
            }

        }
        if (existe == false) {
            JOptionPane.showMessageDialog(null, "No existe ese producto en la cinta"
                    + " vuelva a repetir");
        }

        return existe;
    }

    //Devuelve la lista de productos en cinta
    public String listaProductos() {
        String msj = "";
        if (cinta.estaVacia()) {
            msj = "No hay productos en la cinta";
        } else {
            for (Producto p : cinta.getCinta()) {
                msj += p.toString() + "\n";
            }
        }
        return msj;

    }

    //Mostramos por pantalla la lista de productos en la cinta
    public void mostrarProductos() {

        int opcion;
        opcion = JOptionPane.showOptionDialog(null, listaProductos(),
                "Productos en cinta\n", JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE, null,// null para icono por defecto.
                new Object[]{"Volver"}, 0);

    }

}
