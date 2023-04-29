/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_6b;

import java.util.ArrayList;

/**
 *
 * @author Juan Diego
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ArrayList<Empleado> empleados = new ArrayList();
        ArrayList<Sala> salas = new ArrayList();

        Museo minerva = new Museo("Minerva", "Aqui", empleados, salas);

        Pintura p1 = new Pintura(1, "Yo");
        Escultura es1 = new Escultura(2, "Tu");

        ArrayList<Obra> obrasPinturas = new ArrayList<>();
        ArrayList<Obra> obrasEsculturas = new ArrayList<>();

        obrasPinturas.add(p1);
        obrasEsculturas.add(es1);

        Sensor s1 = new Temperatura(20);
        Sensor s2 = new Humedad(30);

        ArrayList<Sensor> sensores1 = new ArrayList<>();
        ArrayList<Sensor> sensores2 = new ArrayList<>();

        sensores1.add(s1);
        sensores2.add(s2);

        Fija f1 = new Fija(true, obrasPinturas, sensores1);

        Fija f2 = new Fija(true, obrasEsculturas, sensores2);

        minerva.anadirSala(f1);
        minerva.anadirSala(f2);

        ArrayList<Obra> todasLasObras = new ArrayList<>();

        for (int i = 0; i < minerva.getSalas().size(); i++) {

            for (int j = 0; j < minerva.getSalas().get(i).getObras().size(); j++) {

                todasLasObras.add(minerva.getSalas().get(i).getObras().get(j));

            }

        }
        
        
        todasLasObras.forEach(System.out::println);
        
        Conservador c1 =new RestauradorEscultorico("1234", "Juan");
        Conservador c2 = new RestauradorPictorico("4321", "Diego");
        
        minerva.contratarEmpleado(c1);
        minerva.contratarEmpleado(c2);
        
        
        c2.restaurarObra(p1);
    }

}
