/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema6_herencia_azar;

/**
 *
 * @author juandi
 */
public class Moneda extends Azar {
    
    
    
    public static int minimo=1;
    public static int maximo=2;

    

    public Moneda() {
        super(2);
    }

    public static int getMinimo() {
        return minimo;
    }

    public static void setMinimo(int minimo) {
        Moneda.minimo = minimo;
    }

    public static int getMaximo() {
        return maximo;
    }

    public static void setMaximo(int maximo) {
        Moneda.maximo = maximo;
    }

    public int getPosibilidades() {
        return posibilidades;
    }

    public void setPosibilidades(int posibilidades) {
        this.posibilidades = posibilidades;
    }

    @Override
    public String toString() {
        return "Moneda{" + '}';
    }
    
    
    
    

    @Override
    public int lanzar() {
        return utilidades.Utilidades.numeroEnteroRandom(minimo, maximo);
            }
    
}
