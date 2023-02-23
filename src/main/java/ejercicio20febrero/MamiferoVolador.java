package ejercicio20febrero;

public class MamiferoVolador extends Mamifero {

    private int longitudAlas;

    public MamiferoVolador(int longitudAlas, String nombre, double peso, int altura, Alimentacion tipoAlimentacion) {
        super(nombre, peso, altura, tipoAlimentacion);
        this.longitudAlas = longitudAlas;
    }

    public MamiferoVolador() {
    }

    public int getLongitudAlas() {
        return longitudAlas;
    }

    public void setLongitudAlas(int longitudAlas) {
        this.longitudAlas = longitudAlas;
    }

    public void volar() {

        System.out.println("El mamifero" + getNombre() + " esta volando");
    }

    ;
    @Override
    public String toString() {
        return "MamiferoVolador{" + super.toString() + "longitudAlas=" + longitudAlas + '}';
    }

    @Override
    public void comer() {
        System.out.println("El mamifero " + getNombre() + " esta comiendo");
    }

}
