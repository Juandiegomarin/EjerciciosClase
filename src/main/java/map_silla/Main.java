/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package map_silla;

import java.util.Map;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {

        Map<Silla, Double> sillasMap = new TreeMap<>();

        Silla s1 = new Silla(0, "Silla 1");
        Silla s2 = new Silla(0, "Silla 2");
        Silla s3 = new Silla(0, "Silla 3");
        Silla s4 = new Silla(0, "Silla 4");
        Silla s5 = new Silla(0, "Silla 5");

        sillasMap.put(s2, s2.peso());
        sillasMap.put(s4, s4.peso());
        sillasMap.put(s5, s5.peso());
        sillasMap.put(s1, s1.peso());
        sillasMap.put(s3, s3.peso());
        
        for (Map.Entry<Silla, Double> silla : sillasMap.entrySet()) {
            System.out.println("Key->"+silla.getKey()+" Value->"+silla.getValue());
            
        }
    }

}
