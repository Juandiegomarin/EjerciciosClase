package ejercicio_5abc;

import java.time.LocalDate;

public class Alquiler {

    private int idAlquiler;
    private Cliente cliente;
    private Vehiculo vehiculo;
    private LocalDate fechaIncio;
    private int duracion;

    private static int contador = 0;

    public Alquiler(Cliente cliente, Vehiculo vehiculo, LocalDate fechaIncio, int duracion) {
        this.cliente = cliente;
        this.vehiculo = vehiculo;
        this.fechaIncio = fechaIncio;
        this.duracion = duracion;
        contador++;
        this.idAlquiler = contador;
    }

    public Alquiler() {
        this.cliente = new Cliente();
        this.vehiculo = new Vehiculo();
        this.fechaIncio = LocalDate.now();
        this.duracion = utilidades.Utilidades.numeroEnteroRandom(1, 100);
        contador++;
        this.idAlquiler = contador;

    }

    public int getIdAlquiler() {
        return idAlquiler;
    }

    public void setIdAlquiler(int idAlquiler) {
        this.idAlquiler = idAlquiler;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public LocalDate getFechaIncio() {
        return fechaIncio;
    }

    public void setFechaIncio(LocalDate fechaIncio) {
        this.fechaIncio = fechaIncio;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        Alquiler.contador = contador;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + this.idAlquiler;
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
        final Alquiler other = (Alquiler) obj;
        return this.idAlquiler == other.idAlquiler;
    }

    @Override
    public String toString() {
        return "Alquiler{" + "idAlquiler=" + idAlquiler + ", cliente=" + cliente.getNif() + ", vehiculo=" + vehiculo.getBastidor() + ", fechaIncio=" + fechaIncio + ", duracion=" + duracion + '}';
    }

    

}
