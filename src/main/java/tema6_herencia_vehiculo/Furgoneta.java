/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema6_herencia_vehiculo;

/**
 *
 * @author juandi
 */
public class Furgoneta extends Vehiculo {
    
    
    
    private int altura;

    public Furgoneta(int altura) {
        this.altura = altura;
    }

    public Furgoneta(int altura, String nombre, String matricula, String bastidor, int cv) {
        super(nombre, matricula, bastidor, cv);
        this.altura = altura;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Furgoneta{" + "altura=" + altura + '}';
    }
    
    
    
    
}
