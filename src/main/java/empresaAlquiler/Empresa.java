package empresaAlquiler;

import java.time.LocalDate;
import java.time.Year;
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
    
    public void registrarAlquiler(Cliente c,Vehiculo v,LocalDate fechaAlq,int duracion){
        
        if(this.clientes.buscarCliente(c.getNif())!=null&&this.vehiculos.buscarVehiculo(v.getBastidor())!=null){
        if(v.isDisponible()){
            v.setDisponible(false);
            Alquiler a = new Alquiler(c, v, fechaAlq, duracion);
            this.alquileres.añadirAlquiler(a);
        }
        }
        
    
    }
    

    public void registrarClienteAutomatico() {

        this.clientes.añadirCliente(new Cliente());

    }
    public void registrarClientePedidaDatos(Cliente c){
    
    this.clientes.añadirCliente(c);
    
    }
    
    
    
    public void registrarVehiculoAutomatico() {

        this.vehiculos.añadirVehiculo(new Vehiculo());

    }
    public void registrarVehiculoPedidaDatos(Vehiculo v) {

        this.vehiculos.añadirVehiculo(v);

    }
    
    
    
    public void recibirVehiculo(Alquiler a){
    
        
    a.getVehiculo().setDisponible(true);
    }

    public Cliente buscarCliente(String nif) {

        return this.clientes.buscarCliente(nif);
    }
    public Vehiculo buscarVehiculo(String bastidor) {

        return this.vehiculos.buscarVehiculo(bastidor);
    }
    
    
    
    
    
    public void registrarAlquilerIntroducir(){
        
        Alquiler a= pedirDatosAlquiler();
        if(this.clientes.buscarCliente(a.getCliente().getNif())!=null&&this.vehiculos.buscarVehiculo(a.getVehiculo().getBastidor())!=null){
        if(a.getVehiculo().isDisponible()){
            a.getVehiculo().setDisponible(false);
           
            this.alquileres.añadirAlquiler(a);
        }
        }
        
    
    }
    public Alquiler pedirDatosAlquiler(){
    
    
    String nif="";
    String bastidor="";
    int duracion=0;
    
    nif=JOptionPane.showInputDialog("Introduce el nif del cliente que alquila");
    bastidor=JOptionPane.showInputDialog("Introduce el bastidor del coche a alquilar");
    duracion=Utilidades.filtrarNumeroEnteroJOptionPane("Indica la duración del alquiler");
    return new Alquiler(clientes.buscarCliente(nif), vehiculos.buscarVehiculo(bastidor), LocalDate.now(),duracion);
    
    
    }

    
    
    
    
}
