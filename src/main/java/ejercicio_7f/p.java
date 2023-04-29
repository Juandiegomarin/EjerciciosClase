/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_7f;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Juan Diego
 */
public class p {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String fecha="01/01/2022";
        
        DateTimeFormatter df= DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate f= LocalDate.parse(fecha, df);
        
        System.out.println(f);
    }
    
}
