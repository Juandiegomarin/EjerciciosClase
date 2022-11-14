package tema4_ejercicios_introduccion_poo;

import javax.swing.JOptionPane;

public class VehiculoMis {

    public static void main(String[] args) {

        Vehiculo miCacharro = new Vehiculo("5312 KDB", "Audi", "A1", "Azul Marino", 0);
        
        Vehiculo miCopia= new Vehiculo();
        
        miCopia=miCopia.constructorCopia(miCacharro);
        
        JOptionPane.showMessageDialog(null, miCopia.toString());
        
        System.out.println("Atributos del coche");
        System.out.println("Matricula: " + miCacharro.matricula);
        System.out.println("Marca: " + miCacharro.marca);
        System.out.println("Modelo: "+miCacharro.modelo);
        System.out.println("Color: "+miCacharro.color);
        System.out.println("Tarifa: "+miCacharro.tarifa);
        System.out.println("Disponible: "+miCacharro.disponible);
        
        
        
        JOptionPane.showMessageDialog(null,
                "Atributos del coche\n"+ 
                       "Matricula: "+miCacharro.getMatricula()+"\n"+
                       "Marca: " +miCacharro.getMarca()+"\n"+
                       "Modelo: " +miCacharro.getModelo()+"\n"+
                       "Color: " +miCacharro.getColor()+"\n"+
                       "Tarifa: " +miCacharro.getTarifa()+"\n"+
                       "Disponible: " +miCacharro.getDisponible()+"\n");
        
        miCacharro.matricula="AAAA 123";
        miCacharro.setMatricula("BBBB 987");
        
        JOptionPane.showMessageDialog(null,
                "Atributos del coche 2 ronda\n"+ 
                       "Matricula: "+miCacharro.getMatricula()+"\n"+
                       "Marca: " +miCacharro.getMarca()+"\n"+
                       "Modelo: " +miCacharro.getModelo()+"\n"+
                       "Color: " +miCacharro.getColor()+"\n"+
                       "Tarifa: " +miCacharro.getTarifa()+"\n"+
                       "Disponible: " +miCacharro.getDisponible()+"\n");
        
       String coche= miCacharro.toString();
       System.out.println(miCacharro);
       System.out.println(coche);
       
       
      miCacharro= miCacharro.recibirVehiculoAlquilado(miCacharro);
      
      JOptionPane.showMessageDialog(null, miCacharro.toString());
    }

}
