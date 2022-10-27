package ejercicio_3d;

public class ImprimidorNumeros {

    public static void main(String[] args) {

        int f1 = 1;
        int f0 = 0;

        System.out.println(f0);
        System.out.println(f1);
        int fn;
        int contador=2;
        fn=f1+f0;
        System.out.println(fn);
        for (int i = 0; i < 35; i++) {

            if (i == 0) {
                fn = 0;
            } else if (i == 1) {
                fn = 1;
            } else {
                fn = contador + f1;
                
                
                System.out.println(fn);
                
                f1 = contador;
                contador = fn;
                
                
            }
        }

    }
}
