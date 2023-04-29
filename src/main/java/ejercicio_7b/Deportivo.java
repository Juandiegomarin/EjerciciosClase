package ejercicio_7b;

public class Deportivo extends Vehiculo {

    private int cilindrada;
    private int caballos;

    public Deportivo(){

    }

    public Deportivo(String matricula, double kilometros, String numeroBastidor, String marca, int cilindrada, int caballos) {
        super(matricula, kilometros, numeroBastidor, marca);
        this.cilindrada = cilindrada;
        this.caballos = caballos;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public int getCaballos() {
        return caballos;
    }

    public void setCaballos(int caballos) {
        this.caballos = caballos;
    }

    public void getAtributos(){
        String atributos;
        atributos="Marca: "+super.getMarca()+", Matricula: "+super.getMatricula()+", NumeroBastidor: "+super.getNumeroBastidor()+
                ", Kilometros: "+super.getKilometros()+ ", Cilindrada: "+this.cilindrada+", Caballos: "+ this.caballos;

        System.out.println(atributos);
    }

    @Override
    public String toString() {
        return super.toString() + ":" + cilindrada +
                ":" + caballos;
    }
}

