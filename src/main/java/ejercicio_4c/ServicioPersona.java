
package ejercicio_4c;

import java.util.Scanner;

public class ServicioPersona {
    
    
    
    public static Persona solictarDatosPersona(){
    Scanner entrada= new Scanner(System.in);
    
    
    Persona persona;
    String nombre;
    int edad;
    char sexo;
    String sexoString;
    double peso;
    int altura;
    
        
        nombre=utilidades.Utilidades.pedirString("Introduce el nombre de la persona");
        
        
        edad=utilidades.Utilidades.filtrarNumeroEnteroSccaner("Introduce la edad de la persona");
        
        System.out.println("Introduce el sexo de la persona(Hombre/Mujer/Otro)");
        
        sexoString=entrada.nextLine();
        
        sexoString=sexoString.toUpperCase();
        
        
        sexo=sexoString.charAt(0);
        
        
        peso=utilidades.Utilidades.filtrarNumeroDecimalScanner("Introduce el peso de la persona");
        
        
        altura=utilidades.Utilidades.filtrarNumeroEnteroSccaner("Introduce la altura de la persona");
    
         persona=new Persona(nombre, edad, sexo, peso, altura);
    
    return persona;
    }
    
    
}
