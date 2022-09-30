
package tema2_ejercicios_introduccion;


public class Ej01 {
    
    public static void main(String[] args) {

        byte entero1 = 1;
        short entero2 = 2;
        int entero3 = 3;
        long entero4 = 4l;

        float decimal1 = 10.1111f;
        double decimal2 = 20.2222;

        char caracter = 'A';
        boolean booleano = true;

        final int CONSTANTE1 = 30;
        final double CONSTANTE2 = 30.3333;

        String cadena = "JuanDiego";

        System.out.println("Byte: " + entero1);
        System.out.println("Short:" + entero2);
        System.out.println("Int: " + entero3);
        System.out.println("Long: " + entero4);
        System.out.println("Float: " + decimal1);
        System.out.println("Double: " + decimal2);
        System.out.println("Char: " + caracter);
        System.out.println("Boolean: " + booleano);
        System.out.println("Final Int: " + CONSTANTE1);
        System.out.println("Final Double: " + CONSTANTE2);
        System.out.println("String: " + cadena);

        System.out.println("--------------------------------------------");

        System.out.printf("Byte: " + entero1);
        System.out.printf(" Short:" + entero2);
        System.out.printf(" Int: " + entero3);
        System.out.printf(" Long: " + entero4);
        System.out.printf(" Float: %.2f", decimal1);
        System.out.printf(" Double: %.2f", decimal2);
        System.out.printf(" Char: " + caracter);
        System.out.printf(" Boolean: " + booleano);
        System.out.printf(" Final Int: " + CONSTANTE1);
        System.out.printf(" Final Double: " + CONSTANTE2);
        System.out.printf(" String: " + cadena);

    }
}
