
package ejercicio_4c;


public class Prueba {

    
    public static void main(String[] args) {
        
        Persona p1=new Persona();
        boolean edad;
        float imc=0;
        
        Persona p2 = ServicioPersona.solictarDatosPersona();
        
        
        System.out.println(p1);
        System.out.println("");
        System.out.println(p2);
        
        System.out.println("¿Es "+p1.getNombre()+" mayor de edad?");
        edad=p1.esMayorEdad();
        System.out.println(edad);
        
        System.out.println("¿Es "+p2.getNombre()+" mayor de edad?");
        edad=p2.esMayorEdad();
        System.out.println(edad);
        
        
        
        imc=p1.calcularIMC();
        System.out.println("El imc de "+p1.getNombre()+" es "+imc);
        calcularClasificacionImc(imc);
        
        imc=p2.calcularIMC();
        System.out.println("El imc de "+p2.getNombre()+" es "+imc);
        calcularClasificacionImc(imc);
        
        Serie s1=new Serie("Peaky Blinders", "Drama", "Guerra", 6, 100, "Yo");
        System.out.println(s1);
        
        p1.darLike(s1);
        
        System.out.println(s1);
    }
    
    private static void calcularClasificacionImc(float imc){
    
    String resultado="";
    
    if(imc<18.5){
    resultado="Insuficiencia ponderal";
    }
    if(imc>=18.5&&imc<25){
    resultado="Intervalo normal";
    }
    if(imc>=25){
    resultado="Sobrepeso";
    }
    
        System.out.println("El imc de esta persona se encuentra en "+resultado);
    
    
    
    }
}
