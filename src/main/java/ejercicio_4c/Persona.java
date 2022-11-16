
package ejercicio_4c;

import java.util.Random;
import org.apache.commons.lang3.RandomStringUtils;


public class Persona {
    
    
    private String nombre;
    private int edad;
    private String nif;
    private char sexo;
    private double peso;
    private int altura;

    public Persona() {
        this.nombre = "Juan Diego";
        this.edad = 19;
        this.nif = "09078509H";
        this.sexo = 'H';
        this.peso = 73.0;
        this.altura = 174;
    }

    public Persona(String nombre, int edad, char sexo, double peso, int altura) {
        this.nombre = nombre;
        this.edad = edad;
        
        if(filtrarSexo(sexo)){
            
        this.sexo = sexo;
        
        }else{
            this.sexo='O';
        }
        
        this.peso = peso;
        this.altura = altura;
    }

    private static boolean filtrarSexo(char s){
        
        boolean resultado=true;
        if(s=='H'||s=='M'){
        
        resultado=true;
        }
        else{resultado=false;}
        
        return resultado;
    }
    private static String generarNif(){
    
    String nif="";
    String letra;
    int numero;
    int resto;
    
    nif=RandomStringUtils.randomNumeric(8);
    
    numero=Integer.parseInt(nif);
    
    resto=numero%23;
    
    if(resto==0){
    letra="T";
    }else if(resto==1){
    letra="R";
    }
    
    return nif;
    }
    
}
