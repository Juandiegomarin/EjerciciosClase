
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
    
        
        nombre=utlidades.Utilidades.pedirString("Introduce el nombre de la persona");
        
        System.out.println("Introduce la edad de la persona");
        edad=utlidades.Utilidades.filtrarNumeroEnteroSccaner();
        
        System.out.println("Introduce el sexo de la persona(Hombre/Mujer/Otro)");
        
        sexoString=entrada.nextLine();
        
        sexoString=sexoString.toUpperCase();
        
        
        sexo=sexoString.charAt(0);
        
        System.out.println("Introduce el peso de la persona");
        peso=utlidades.Utilidades.filtrarNumeroDecimalScanner();
        
        System.out.println("Introduce la altura de la persona");
        altura=utlidades.Utilidades.filtrarNumeroEnteroSccaner();
    
         persona=new Persona(nombre, edad, sexo, peso, altura);
    
    return persona;
    }
    
    
}
