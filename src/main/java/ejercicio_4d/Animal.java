package ejercicio_4d;

import java.time.LocalDate;
import java.time.Month;

public class Animal {

    private LocalDate fechaNacimiento;
    private String nombre;
    private Tipo tipo;
    private int peso;
    private Estado estado;

    public Animal() {
    }

    public Animal(LocalDate fechaNacimiento, String nombre, Tipo tipo, int peso, Estado estado) {
        this.fechaNacimiento = fechaNacimiento;
        this.nombre = nombre;
        this.tipo = tipo;
        this.peso = peso;
        this.estado = estado;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Animal{" + "fechaNacimiento=" + fechaNacimiento + ", nombre=" + nombre + ", tipo=" + tipo + ", peso=" + peso + ", estado=" + estado + '}';
    }

    public void darDeComer(int gramos) {
        gramos = Math.abs(gramos);

        this.peso = this.peso + gramos;
        this.estado=Estado.COMIENDO;

    }

    public void dormirAnimal() {

        this.estado = Estado.DURMIENDO;

    }

    public void despertarAnimal() {

        this.estado = Estado.DESPIERTO;

    }

    public void descansarAnimal() {

        
            this.estado = Estado.REPOSO;
        

    }

    public void ponerAJugar(int cantidadMinutos) {

        cantidadMinutos = Math.abs(cantidadMinutos);

        if (cantidadMinutos > 180) {
            throw new IllegalArgumentException();
        }
        if ( cantidadMinutos >= 30) {
            this.peso -= (cantidadMinutos / 30) * 20;
        } else {
            this.peso -= 10;
        }
        this.estado = Estado.JUGANDO;

    }

    public static Animal clonarAnimal(Animal pet) {

        Animal aux = new Animal();

        try {
            aux.setNombre(pet.getNombre());
            aux.setTipo(pet.getTipo());
            aux.setEstado(pet.getEstado());
            aux.setPeso(pet.getPeso());
            aux.setFechaNacimiento(pet.getFechaNacimiento());
        } catch (NullPointerException npe) {
            System.out.println("No se puede clonar animales nulos");
            aux = new Animal(LocalDate.of(2002, Month.NOVEMBER, 21), "Pet", Tipo.GATO, 5000, Estado.REPOSO);
        }

        return aux;

    }
}
