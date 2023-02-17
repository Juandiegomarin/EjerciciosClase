/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema6_herencia_azar;

/**
 *
 * @author juandi
 */
public class Dado extends Azar {
    
    private static int minimo=1;
    private static int maximo=6;

    public Dado() {
    }

    public Dado(int posibilidades) {
        super(posibilidades);
    }

    public static int getMinimo() {
        return minimo;
    }

    public static void setMinimo(int minimo) {
        Dado.minimo = minimo;
    }

    public static int getMaximo() {
        return maximo;
    }

    public static void setMaximo(int maximo) {
        Dado.maximo = maximo;
    }

    public int getPosibilidades() {
        return posibilidades;
    }

    public void setPosibilidades(int posibilidades) {
        this.posibilidades = posibilidades;
    }

    @Override
    public String toString() {
        return "Dado{" + '}';
    }

    
    
    
    @Override
    public int lanzar() {
       return utilidades.Utilidades.numeroEnteroRandom(minimo, maximo);
    }
    
}
