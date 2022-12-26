/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package ejercicio_5abc;

import java.util.Random;

/**
 *
 * @author juandi
 */
public enum VehiculoModelo {

    SEAT_PANDA("Seat", "Panda", "48"),
    FORD_KUGA("Ford", "Kuga", "120"),
    CUPRA("Seat", "Cupra", "140");
   private String marca;
   private String modelo;
   private String cilindrada;

    private VehiculoModelo(String marca, String modelo, String cilindrada) {
        this.marca = marca;
        this.modelo = modelo;
        this.cilindrada = cilindrada;

    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(String cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public String toString() {
        return "VehiculoModelo{" + "marca=" + marca + ", modelo=" + modelo + ", cilindrada=" + cilindrada + '}';
    }

    public static String modeloAleatorio() {

        VehiculoModelo[] modelos = VehiculoModelo.values();
        int posicion = utilidades.Utilidades.numeroEnteroRandom(0, modelos.length-1);

        return modelos[posicion].getMarca()+" "+modelos[posicion].getModelo()+" "+modelos[posicion].getCilindrada();

    }

}
