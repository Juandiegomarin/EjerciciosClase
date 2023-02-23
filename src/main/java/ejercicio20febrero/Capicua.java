package ejercicio20febrero;

public class Capicua {

    public static void main(String[] args) {

        final int INICIAL = 0;
        int n;
        String numero;

        n = utilidades.Utilidades.filtrarNumeroEnteroJOptionPane("Introduce el numero para comprobar si es capicua");

        numero = String.valueOf(n);

        char[] cadena = new char[numero.length()];
        
        for (int i = 0; i < numero.length(); i++) {
            cadena[i]=numero.charAt(i);
        }
        
        System.out.println(recursivo(cadena, INICIAL));

    }

    public static boolean recursivo(char[] c, int pos) {

        if (c[pos] == c[c.length - 1 - pos]) {
            if (pos > c.length - pos - 1 || pos == c.length - pos - 1) {

                return true;
            }

            return recursivo(c, pos + 1);

        } else {
            return false;
        }

    }

}
