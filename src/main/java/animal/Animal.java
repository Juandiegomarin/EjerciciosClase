package animal;

import java.time.LocalDate;

public class Animal {

    private LocalDate fechaNacimiento;
    private String nombre;
    private Tipo tipo;
    private double peso;
    private Estado estado;

    public Animal() {
    }

    public Animal(LocalDate fechaNacimiento, String nombre, Tipo tipo, double peso, Estado estado) {
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

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
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

    public void darDeComer(double gramos) {
        gramos = Math.abs(gramos);

        this.peso = this.peso + gramos;

    }

    public void dormirAnimal() {

        if (this.estado.equals(Estado.DESPIERTO)) {
            this.estado = Estado.DURMIENDO;
        }

    }

    public void despertarAnimal() {

        if (this.estado.equals(Estado.DURMIENDO)) {
            this.estado = Estado.DESPIERTO;
        }
    }
    
    public void descansarAnimal(){
    
        if (this.estado.equals(Estado.JUGANDO)) {
            this.estado = Estado.REPOSO;
        }
        
    }
    
    public void ponerAJugar(int cantidadMinutos){
        
        
        cantidadMinutos=Math.abs(cantidadMinutos);
        
        if(cantidadMinutos<30){
        this.peso=this.peso-20;
        }
        if(cantidadMinutos>=30&&cantidadMinutos<=180){
        
        this.peso=this.peso-((cantidadMinutos/30)*20);    
            
        }else{throw new IllegalArgumentException("El animal no puede jugar mas de 180 min");};
    
    
    }
    
    public static Animal clonarAnimal(Animal pet){
    
    Animal aux = new Animal();
    
    if(pet.equals(null)){
    
        throw new NullPointerException("La persona es nula, no se puede clonar");
    
    }
    
    aux.setNombre(pet.getNombre());
    aux.setTipo(pet.getTipo());
    aux.setEstado(pet.getEstado());
    aux.setPeso(pet.getPeso());
    aux.setFechaNacimiento(pet.getFechaNacimiento());
    
    return aux;
    
    }
}
