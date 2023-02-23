package ejercicio20febrero;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class CadenaCaracteres {
    
    public static void main(String[] args) {
        
            String cadena="Hola me llamo Juan Diego";
//        String cadena = JOptionPane.showInputDialog("Intruduce una frase");
        

        System.out.println(cadena);
        System.out.println("El tamaño de la cadena es " + cadena.length());
        
        System.out.println("La letra j esta en la posicion " + devolverIndice('j', cadena));
        
        System.out.println("La letra a se encientra en las siguientes posiciones ");
        int [] ar=devolverIndices('a', cadena);
        
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i]+"-");
        }
        
        System.out.println("");
        System.out.println("-------------------------------------");
        
        
        for (int i = 0; i < cadena.length(); i++) {
            
            System.out.print((int)Character.valueOf(cadena.charAt(i))+"-");
            
        }
        System.out.println("");
        for (int i = 0; i < cadena.length(); i++) {
            
            if(Character.isLowerCase(cadena.charAt(i))){
            
                System.out.println("El caracter "+cadena.charAt(i)+ " es una letra minnuscula");
            }
            if(Character.isUpperCase(cadena.charAt(i))){
            
                System.out.println("El caracter "+cadena.charAt(i)+ " es una letra mayuscula");
            }
            if(Character.isDigit(cadena.charAt(i))){
            
                System.out.println("El caracter "+cadena.charAt(i)+ " es un numero");
            }
            
        }
        
        System.out.println("------------------------------------------------");
        
        cadena=cadenaSinEspacios(cadena);
        System.out.println("La cadena sin espacios es "+ cadena);
        System.out.println("La nueva longitud es "+cadena.length());
        
    }
    
    public static int devolverIndice(char c, String cadena) {
        
        for (int i = 0; i < cadena.length(); i++) {
            
            if (c == cadena.charAt(i)) {
                
                return i;
            }
            
        }
        
        return -1;
        
    }
    
    public static int[] devolverIndices(char c, String cadena) {
        
        int[] aux = {-1};
        List<Integer> lista = new ArrayList<>();
        
        int tamaño = 0;
        
        for (int i = 0; i < cadena.length(); i++) {
            
            if (cadena.charAt(i) == c) {
                lista.add(i);
                tamaño++;
            }
        }
        
        if (lista.isEmpty()) {
            
            return aux;
        } else {
            
            int[] indices = new int[lista.size()];
            for (int i = 0; i < lista.size(); i++) {
                
                indices[i] = lista.get(i);
            }
            return indices;
        }
        
    }
    public static String cadenaSinEspacios(String cadena){
        
        String aux="";
        
        for (int i = 0; i < cadena.length(); i++) {
            
            if(!String.valueOf(cadena.charAt(i)).contains(" ")){
                
                aux+=String.valueOf(cadena.charAt(i));
            
            }
            
        }
    
    return aux;
    }
    
}
