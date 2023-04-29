package ejercicio_7b;

public class Furgoneta extends Vehiculo {

    private int cargaMaxima;
    private int numeroPuertas;


    public Furgoneta(){

    }
    public Furgoneta(String matricula, double kilometros, String numeroBastidor, String marca, int cargaMaxima, int numeroPuertas) {
        super(matricula, kilometros, numeroBastidor, marca);
        this.cargaMaxima = cargaMaxima;
        this.numeroPuertas = numeroPuertas;
    }



    public int getCargaMaxima() {
        return cargaMaxima;
    }

    public void setCargaMaxima(int cargaMaxima) {
        this.cargaMaxima = cargaMaxima;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public void getAtributos(){
        String atributos;
        atributos="Marca: "+super.getMarca()+", Matricula: "+super.getMatricula()+", NumeroBastidor: "+super.getNumeroBastidor()+
                ", Kilometros: "+super.getKilometros()+ ", CargaMaxima: "+this.cargaMaxima+", NumeroPuertas: "+ this.numeroPuertas;

        System.out.println(atributos);
    }

    @Override
    public String toString() {
        return super.toString() + ":" + cargaMaxima +
                ":" + numeroPuertas;
    }
}

