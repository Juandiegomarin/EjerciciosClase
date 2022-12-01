package bingo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import javax.swing.JOptionPane;

public class Carton {

    private int[][] carton;

    public Carton() {
        this.carton = generarCarton();
    }

    private int[][] generarCarton() {

        int[][] matriz = new int[3][9];

        ArrayList columna1 = new ArrayList();
        ArrayList columna2 = new ArrayList();
        ArrayList columna3 = new ArrayList();
        ArrayList columna4 = new ArrayList();
        ArrayList columna5 = new ArrayList();
        ArrayList columna6 = new ArrayList();
        ArrayList columna7 = new ArrayList();
        ArrayList columna8 = new ArrayList();
        ArrayList columna9 = new ArrayList();

        columna1 = generarColoumnasNumerosNoRepetidos(1, 10);
        columna2 = generarColoumnasNumerosNoRepetidos(11, 20);
        columna3 = generarColoumnasNumerosNoRepetidos(21, 30);
        columna4 = generarColoumnasNumerosNoRepetidos(31, 40);
        columna5 = generarColoumnasNumerosNoRepetidos(41, 50);
        columna6 = generarColoumnasNumerosNoRepetidos(51, 60);
        columna7 = generarColoumnasNumerosNoRepetidos(61, 70);
        columna8 = generarColoumnasNumerosNoRepetidos(71, 80);
        columna9 = generarColoumnasNumerosNoRepetidos(81, 90);

        matriz[0][0] = (int) columna1.get(0);
        matriz[0][1] = (int) columna2.get(0);
        matriz[0][2] = (int) columna3.get(0);
        matriz[0][3] = (int) columna4.get(0);
        matriz[0][4] = (int) columna5.get(0);
        matriz[0][5] = (int) columna6.get(0);
        matriz[0][6] = (int) columna7.get(0);
        matriz[0][7] = (int) columna8.get(0);
        matriz[0][8] = (int) columna9.get(0);
        matriz[1][0] = (int) columna1.get(1);
        matriz[1][1] = (int) columna2.get(1);
        matriz[1][2] = (int) columna3.get(1);
        matriz[1][3] = (int) columna4.get(1);
        matriz[1][4] = (int) columna5.get(1);
        matriz[1][5] = (int) columna6.get(1);
        matriz[1][6] = (int) columna7.get(1);
        matriz[1][7] = (int) columna8.get(1);
        matriz[1][8] = (int) columna9.get(1);
        matriz[2][0] = (int) columna1.get(2);
        matriz[2][1] = (int) columna2.get(2);
        matriz[2][2] = (int) columna3.get(2);
        matriz[2][3] = (int) columna4.get(2);
        matriz[2][4] = (int) columna5.get(2);
        matriz[2][5] = (int) columna6.get(2);
        matriz[2][6] = (int) columna7.get(2);
        matriz[2][7] = (int) columna8.get(2);
        matriz[2][8] = (int) columna9.get(2);

        return matriz;
    }

    private boolean comprobarNumero(int numero, ArrayList<Integer> lista) {

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

    private ArrayList<Integer> generarColoumnasNumerosNoRepetidos(int numeroMin, int numeroMax) {

        ArrayList<Integer> lista = new ArrayList();
        for (int i = 0; i < 3; i++) {
            int numero = utilidades.Utilidades.numeroEnteroRandom(numeroMin, numeroMax);
            if (comprobarNumero(numero, lista)) {
                lista.add(numero);

            } else {
                i--;
            }

        }

        Collections.sort(lista);
        return lista;

    }

    public void imprimirCarton() {

        String resultado = "";

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 9; j++) {
                resultado += carton[i][j] + "   ";
            }

            resultado += "\n";
        }
        JOptionPane.showMessageDialog(null, resultado);
    }

    public void comprobarNumero(int numero) {

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 9; j++) {

                if (carton[i][j] == numero) {

                    carton[i][j] = 0;
                }
            }

        }

    }

    public boolean comprobarLinea() {
        
        
        boolean seguir=true;

        

            if ((carton[0][0] == 0
                    && carton[0][1] == 0
                    && carton[0][2] == 0
                    && carton[0][3] == 0
                    && carton[0][4] == 0
                    && carton[0][5] == 0
                    && carton[0][6] == 0
                    && carton[0][7] == 0
                    && carton[0][8] == 0) || (carton[1][0] == 0
                    && carton[1][1] == 0
                    && carton[1][2] == 0
                    && carton[1][3] == 0
                    && carton[1][4] == 0
                    && carton[1][5] == 0
                    && carton[1][6] == 0
                    && carton[1][7] == 0
                    && carton[1][8] == 0) || (carton[2][0] == 0
                    && carton[2][1] == 0
                    && carton[2][2] == 0
                    && carton[2][3] == 0
                    && carton[2][4] == 0
                    && carton[2][5] == 0
                    && carton[2][6] == 0
                    && carton[2][7] == 0
                    && carton[2][8] == 0)) {

                
                seguir = false;
                
            }
        

        
        return seguir;
    }
    
    public String comprobarBingo(){
    
       String resultado="";
    
       
            if (carton[0][0] == 0
                    && carton[0][1] == 0
                    && carton[0][2] == 0
                    && carton[0][3] == 0
                    && carton[0][4] == 0
                    && carton[0][5] == 0
                    && carton[0][6] == 0
                    && carton[0][7] == 0
                    && carton[0][8] == 0 && carton[1][0] == 0
                    && carton[1][1] == 0
                    && carton[1][2] == 0
                    && carton[1][3] == 0
                    && carton[1][4] == 0
                    && carton[1][5] == 0
                    && carton[1][6] == 0
                    && carton[1][7] == 0
                    && carton[1][8] == 0 && carton[2][0] == 0
                    && carton[2][1] == 0
                    && carton[2][2] == 0
                    && carton[2][3] == 0
                    && carton[2][4] == 0
                    && carton[2][5] == 0
                    && carton[2][6] == 0
                    && carton[2][7] == 0
                    && carton[2][8] == 0) {
                
                 JOptionPane.showMessageDialog(null, "Bingoooooo");
                resultado="Bingoooo";
                
            }
            
            return resultado;
        }
    
    
    
    
    }


