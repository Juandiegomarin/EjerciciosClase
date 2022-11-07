
package generador_string_randomstringsutils;

import org.apache.commons.lang3.RandomStringUtils;

public class Terea4BPassword {

    public static void main(String[] args) {
        String identificador;
        String identificador2;
        
        for (int i = 0; i < 10; i++) {
            identificador=RandomStringUtils.randomNumeric(4);
            System.out.println(identificador);
        }
        System.out.println("");
        System.out.println("");
        for (int i = 0; i < 10; i++) {
            identificador2=RandomStringUtils.randomAlphanumeric(8);
            System.out.println(identificador2);
        }
    }
    
}
