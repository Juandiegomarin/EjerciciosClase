package ejercicio_7d;

import java.util.Objects;

public abstract class Vehiculo {

    private String matricula;
    private double kilometros;
    private String numeroBastidor;
    private String marca;


    public Vehiculo(){

    }
    public Vehiculo(String matricula, double kilometros, String numeroBastidor, String marca) {
        this.matricula = matricula;
        this.kilometros = kilometros;
        this.numeroBastidor = numeroBastidor;
        this.marca = marca;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getKilometros() {
        return kilometros;
    }

    public void setKilometros(double kilometros) {
        this.kilometros = kilometros;
    }

    public String getNumeroBastidor() {
        return numeroBastidor;
    }

    public void setNumeroBastidor(String numeroBastidor) {
        this.numeroBastidor = numeroBastidor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehiculo vehiculo = (Vehiculo) o;
        return Double.compare(vehiculo.kilometros, kilometros) == 0 && Objects.equals(matricula, vehiculo.matricula) && Objects.equals(numeroBastidor, vehiculo.numeroBastidor) && Objects.equals(marca, vehiculo.marca);
    }

    @Override
    public int hashCode() {
        return Objects.hash(matricula, kilometros, numeroBastidor, marca);
    }

    @Override
    public String toString() {
        return matricula +
                ";" + kilometros +
                ";" + numeroBastidor +
                ";" + marca ;
    }
}
