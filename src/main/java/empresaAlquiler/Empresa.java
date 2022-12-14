package empresaAlquiler;

import java.util.Objects;
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

    public void registrarCliente() {

        this.clientes.añadirCliente(new Cliente());

    }

    public void registrarVehiculo() {

        this.vehiculos.añadirVehiculo(new Vehiculo());

    }

    public void buscarCliente(String nif) {

        this.clientes.buscarCliente(nif);
    }

    public void buscarVehiculo(String bastidor) {

        this.vehiculos.buscarVehiculo(bastidor);
    }
}
