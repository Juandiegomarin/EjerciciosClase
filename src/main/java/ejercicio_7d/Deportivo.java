package ejercicio_7d;

import java.util.Objects;

public class Deportivo extends Vehiculo {

    private int puertas;
    private boolean marchaAutomatica;
    private String neumaticos;

    public Deportivo(){

    }

    public Deportivo(String matricula, double kilometros, String numeroBastidor, String marca, int puertas, boolean marchaAutomatica, String neumaticos) {
        super(matricula, kilometros, numeroBastidor, marca);
        this.puertas = puertas;
        this.marchaAutomatica = marchaAutomatica;
        this.neumaticos= neumaticos;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public boolean isMarchaAutomatica() {
        return marchaAutomatica;
    }

    public void setMarchaAutomatica(boolean marchaAutomatica) {
        this.marchaAutomatica = marchaAutomatica;
    }

    public String getNeumaticos() {
        return neumaticos;
    }

    public void setNeumaticos(String neumaticos) {
        this.neumaticos = neumaticos;
    }

    public void getAtributos(){
        String atributos;
        atributos="Marca: "+super.getMarca()+", Matricula: "+super.getMatricula()+", NumeroBastidor: "+super.getNumeroBastidor()+
                ", Kilometros: "+super.getKilometros()+ ", MarchaAutomatica: "+this.marchaAutomatica+", Puertas: "+ this.puertas +
                ", Neumaticos: "+ this.neumaticos;

        System.out.println(atributos);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Deportivo)) return false;
        if (!super.equals(o)) return false;
        Deportivo deportivo = (Deportivo) o;
        return puertas == deportivo.puertas && marchaAutomatica == deportivo.marchaAutomatica && Objects.equals(neumaticos, deportivo.neumaticos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), puertas, marchaAutomatica, neumaticos);
    }

    @Override
    public String toString() {
        return super.toString()+";" + puertas +
                ";" + marchaAutomatica + ";" + neumaticos;
    }
}

