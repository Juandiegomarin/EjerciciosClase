
package tema4_ejercicios_introduccion_poo;


public class SerieTest {

    
    public static void main(String[] args) {
        
        Serie losSimpson=new Serie("Los Simpson", "Cartoons", "Familia amarilla", 15, "Martinez");
        
        
        System.out.println(losSimpson);
        
        
        Serie peaky= new   Serie("Peaky Blinders", "Acción", "Guerra", 6, "Yo");
        
        
        System.out.println(peaky.hashCode());
        
    }
    
}
