package p41elevador;

import java.time.LocalDate;
import org.apache.commons.lang3.RandomStringUtils;

public class Elevador {

    private String numeroSerie;
    private String fabricante;
    private int capacidadMaximaPersonas;
    private double pesoMaximo;
    private LocalDate fechaFabricacion;
    private LocalDate fechaUltimaRevision;
    private Estado estado;
    private int numeroPlanta;

    public Elevador(String fabricante, int capacidadMaximaPersonas, double pesoMaximo) {

        this.numeroSerie = RandomStringUtils.randomNumeric(8);
        this.fabricante = fabricante;

        if (capacidadMaximaPersonas < 0) {
            this.capacidadMaximaPersonas = 0;
        } else if (capacidadMaximaPersonas > 10) {
            this.capacidadMaximaPersonas = 10;
        } else {
            this.capacidadMaximaPersonas = capacidadMaximaPersonas;
        }

        if (pesoMaximo < 0) {
            this.pesoMaximo = 0;
        } else if (pesoMaximo > 800.00) {
            this.pesoMaximo = 800.00;
        } else {
            this.pesoMaximo = pesoMaximo;
        }

        this.fechaFabricacion = LocalDate.now();
        this.fechaUltimaRevision = LocalDate.now();
        this.estado = null;
        this.numeroPlanta = 0;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public String getFabricante() {
        return fabricante;
    }

    public int getCapacidadMaximaPersonas() {
        return capacidadMaximaPersonas;
    }

    public double getPesoMaximo() {
        return pesoMaximo;
    }

    public LocalDate getFechaFabricacion() {
        return fechaFabricacion;
    }

    public LocalDate getFechaUltimaRevision() {
        return fechaUltimaRevision;
    }

    public Estado getEstado() {
        return estado;
    }

    public int getNumeroPlanta() {
        return numeroPlanta;
    }

    public void setFechaUltimaRevision(LocalDate fechaUltimaRevision) {
        this.fechaUltimaRevision = fechaUltimaRevision;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public void setNumeroPlanta(int numeroPlanta) {
        this.numeroPlanta = numeroPlanta;
    }

    @Override
    public String toString() {
        return "Elevador{" + "numeroSerie=" + numeroSerie + ", fabricante=" + fabricante + ", capacidadMaximaPersonas=" + capacidadMaximaPersonas + ", pesoMaximo=" + pesoMaximo + ", fechaFabricacion=" + fechaFabricacion + ", fechaUltimaRevision=" + fechaUltimaRevision + ", estado=" + estado + ", numeroPlanta=" + numeroPlanta + '}';
    }

    public boolean mover(int numeroViajeros, double pesoTotal, int numeroPlanta) {

        if (this.estado == Estado.AVERIADO) {
            return false;
        } else {

            if (numeroViajeros < 0 || numeroViajeros > this.capacidadMaximaPersonas
                    || pesoTotal < 0 || pesoTotal > this.pesoMaximo || numeroPlanta < 0 || numeroPlanta > 8) {
                return false;
            } else {

                
                if (numeroPlanta > this.numeroPlanta) {
                    this.estado = Estado.SUBIENDO;
                } else if (numeroPlanta < this.numeroPlanta) {
                    this.estado = Estado.BAJANDO;
                } else {
                    this.estado = Estado.PARADO;
                }
                this.numeroPlanta = numeroPlanta;
                return true;
            }
        }
    }

}
