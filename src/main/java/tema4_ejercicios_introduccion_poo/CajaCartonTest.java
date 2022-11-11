/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema4_ejercicios_introduccion_poo;

import javax.swing.JOptionPane;


public class CajaCartonTest {

    
    public static void main(String[] args) {
        
        String cajaCh;
        String cajaGr;
        
        CajaCarton cajaGrande= new CajaCarton("250mm", "400m", "500mm", "200gr");
        CajaCarton cajaChica= new CajaCarton("25mm", "30mm", "15mm", "17gr");
        
        System.out.println("Caja grande");
        System.out.println("Ancho: "+cajaGrande.getAncho()+" Alto: "+cajaGrande.getAlto()
        +" Largo: "+cajaGrande.getLargo()+" Peso: "+cajaGrande.getPeso());
        
         System.out.println("Caja chica");
        System.out.println("Ancho: "+cajaChica.getAncho()+" Alto: "+cajaChica.getAlto()
        +" Largo: "+cajaChica.getLargo()+" Peso: "+cajaChica.getPeso());
        
        cajaGr=cajaGrande.toString();
        cajaCh=cajaChica.toString();
        
        JOptionPane.showMessageDialog(null, cajaGr);
        JOptionPane.showMessageDialog(null, cajaCh);
    }
    
}
