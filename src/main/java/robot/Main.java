/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package robot;

import java.text.CollationElementIterator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 *
 * @author juandi
 */
public class Main {

    
    public static void main(String[] args) {
        
        
        
        List<Robot> lista= getListaRobots(20);
        
        lista.forEach(System.out::println);
        Collections.sort(lista, (r1,r2)->Integer.compare(r1.vida(), r2.vida()));
        System.out.println("--------------------------------");
        lista.forEach(System.out::println);
        
    }

    public static List<Robot> getListaRobots(int num) {

        var listaRobots = new ArrayList<Robot>();
        Random rd = new Random();

        if (num <= 0) {
            throw new IllegalArgumentException("El numero para crear robots no es valido");
        }

        for (int i = 0; i < num; i++) {

            listaRobots.add(new Robot(rd.nextInt(0, 5000), rd.nextInt(1, 100)));
        }

        return listaRobots;
    }

}
