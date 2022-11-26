package bingo;

import java.util.ArrayList;

public class Carton {

    private ArrayList<Integer> carton;

    public Carton() {
        this.carton = generarCarton();
    }

    public ArrayList<Integer> getCarton() {
        return carton;
    }

    public void setCarton(ArrayList<Integer> carton) {
        this.carton = carton;
    }

    private ArrayList generarCarton() {

        ArrayList<Integer> numeros = new ArrayList();

        for (int i = 0; i < 24; i++) {
            int numero = utilidades.Utilidades.numeroEnteroRandom(1, 90);
            if (comprobarNumero(numero, numeros)) {
                numeros.add(numero);

            } else {
                i--;
            }

        }

        return numeros;
    }

    public boolean comprobarNumero(int numero, ArrayList<Integer> lista) {

        boolean opcion = true;
        for (int i : lista) {
            if (i == numero) {
                opcion = false;
                break;
            } else {
                opcion = true;
            }

        }

        return opcion;

    }

    public void imprimirCarton() {

        for (int i = 0; i < 24; i++) {

            if (i != 23) {
                System.out.print(carton.get(i) + "-");
            } else {
                System.out.print(carton.get(i));
            }

        }

    }

    public void ordenarLista() {

        int menor;

        for (int i = 0; i < 24; i++) {
            menor = carton.get(i);

            if (carton.get(i) < menor) {
                menor = carton.get(i);
            } else {
                if (carton.get(i) > menor) {
                    menor = menor;
                }
            }
        }

        imprimirCarton();

    }

}
