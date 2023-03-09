/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio20febrero;

/**
 *
 * @author juand
 */
public class MamiferoMarino extends Mamifero {

    private int longitudCola;

    public MamiferoMarino(int longitudCola, String nombre, double peso, int altura, Alimentacion tipoAlimentacion) {
        super(nombre, peso, altura, tipoAlimentacion);
        this.longitudCola = longitudCola;
    }

    public MamiferoMarino() {
    }

    public int getLongitudCola() {
        return longitudCola;
    }

    public void setLongitudCola(int longitudCola) {
        this.longitudCola = longitudCola;
    }

    public void nadar() {

        System.out.println("El mamifero " + getNombre() + " esta nadando");
    }

    @Override
    public String toString() {
        return "MamiferoMarino{" + super.toString() + "longitudCola=" + longitudCola + '}';
    }

    @Override
    public void comer() {
        System.out.println("El mamifero " + getNombre() + " esta comiendo");
    }

}
