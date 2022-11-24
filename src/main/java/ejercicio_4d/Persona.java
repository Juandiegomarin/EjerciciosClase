
package ejercicio_4d;

public class Persona {
    
    
    private String nombre;
    private int edad;

    public Persona() {
    }

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + '}';
    }
    
    public void llamar(Animal pet){
    
        pet.despertarAnimal();
    }
    public void alimetar(Animal pet, int gramos){
    
        pet.darDeComer(gramos);
    
    }
    
    public void jugar(Animal pet, int cantidadMinutos){
    
        try {
            pet.ponerAJugar(cantidadMinutos);
        } catch (IllegalArgumentException e) {
            System.out.println("No puedes jugar más de 180 minutos, reducimos la cantidad de minutos a 180");
            pet.ponerAJugar(180);
            pet.setEstado(Estado.JUGANDO);
        }
    
    }
    
    
}
