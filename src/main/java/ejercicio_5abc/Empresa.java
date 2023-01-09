package ejercicio_5abc;

import java.time.LocalDate;
import java.time.Year;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.swing.JOptionPane;
import org.apache.commons.lang3.RandomStringUtils;

public class Empresa {

    private String cif;
    private String nombre;
    private VehiculoCatalogo vehiculos;
    private ClienteCatalogo clientes;
    private AlquilerCatalogo alquileres;

    private static int contador = 0;

    public Empresa(String nombre) {
        this.cif = String.valueOf(contador++);
        this.nombre = nombre;
        this.vehiculos = new VehiculoCatalogo(10);
        this.clientes = new ClienteCatalogo(10);
        this.alquileres = new AlquilerCatalogo(10);
    }

    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public VehiculoCatalogo getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(VehiculoCatalogo vehiculos) {
        this.vehiculos = vehiculos;
    }

    public ClienteCatalogo getClientes() {
        return clientes;
    }

    public void setClientes(ClienteCatalogo clientes) {
        this.clientes = clientes;
    }

    public AlquilerCatalogo getAlquileres() {
        return alquileres;
    }

    public void setAlquileres(AlquilerCatalogo alquileres) {
        this.alquileres = alquileres;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.cif);
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
        final Empresa other = (Empresa) obj;
        return Objects.equals(this.cif, other.cif);
    }

    @Override
    public String toString() {
        return "Empresa{" + "cif=" + cif + ",\n nombre=" + nombre + ",\n vehiculos=" + vehiculos + ",\n clientes=" + clientes + ",\n alquileres=" + alquileres + '}';
    }

    public void registrarClienteAutomatico() {

        this.clientes.anadirElemento(new Cliente());

    }

    public void registrarVehiculoAutomatico() {

        this.vehiculos.anadirElemento(new Vehiculo());

    }

    public void recibirVehiculo(Alquiler a) {

        a.getVehiculo().setDisponible(true);
        borrarAlquilerId(a.getIdAlquiler());
    }

    public Cliente buscarCliente(String nif) {

        return this.clientes.buscarCliente(nif);
    }

    public Vehiculo buscarVehiculo(String bastidor) {

        return this.vehiculos.buscarVehiculo(bastidor);
    }

    public void registrarAlquilerIntroducir() {

        Alquiler a = pedirDatosAlquiler();
        if (this.clientes.buscarCliente(a.getCliente().getNif()) != null && this.vehiculos.buscarVehiculo(a.getVehiculo().getBastidor()) != null) {
            if (a.getVehiculo().isDisponible()) {
                a.getVehiculo().setDisponible(false);

                this.alquileres.anadirElemento(a);
            }
        }

    }

    public Alquiler pedirDatosAlquiler() {

        String nif = "";
        String bastidor = "";
        int duracion = 0;

        JOptionPane.showMessageDialog(null,
                "Estos son los clientes de tu empresa para elegir el cliente "
                + "introduzca el nif correspondiente\n"
                + getClientes());
        nif = JOptionPane.showInputDialog("Introduce el nif del cliente que alquila");

        JOptionPane.showMessageDialog(null,
                "Estos son vehiculos de tu empresa para elegir el vehiculo "
                + "introduzca el bastridor correspondiente\n"
                + getVehiculos());

        bastidor = JOptionPane.showInputDialog("Introduce el bastidor del coche a alquilar");

        duracion = Utilidades.filtrarNumeroEnteroJOptionPane("Indica la duración del alquiler");
        return new Alquiler(clientes.buscarCliente(nif), vehiculos.buscarVehiculo(bastidor), LocalDate.now(), duracion);

    }

    public ArrayList<Alquiler> obtenerAlquilerCliente(String nif) {

        return this.alquileres.alquiCli(nif);

    }

    public ArrayList<Alquiler> obtenerAlquilerVehiculo(String bastidor) {

        return this.alquileres.alquiVeh(bastidor);

    }

    public void borrarAlquilerId(int Id) {
        this.alquileres.buscarAlquiler(Id).getVehiculo().setDisponible(true);
        this.alquileres.lista.remove(this.alquileres.buscarAlquiler(Id));

    }

    public void borrarClienteSinAlquiler(String nif) {
        boolean b=alquileres.buscarCliente(nif);
        
        if(!b){clientes.borrarElemento(buscarCliente(nif));}

    }

    public void borrarVehiculoSinAlquiler(String bastidor) {

        boolean b=alquileres.buscarVehiculo(bastidor);
        
        if(!b){vehiculos.borrarElemento(buscarVehiculo(bastidor));}

    }

    public ArrayList<Vehiculo> obtenerVehiculosFechaFinalizacionAlquiler(LocalDate fecha) {

        ArrayList<Vehiculo> vehiculos = new ArrayList() {
        };

        for (Alquiler a : alquileres.lista) {
            if (a.getFechaIncio().plusDays(a.getDuracion()).equals(fecha)) {
                vehiculos.add(a.getVehiculo());
            }

        }

        return vehiculos;
    }

}
