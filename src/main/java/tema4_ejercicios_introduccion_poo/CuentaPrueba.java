
package tema4_ejercicios_introduccion_poo;

import javax.swing.JOptionPane;


public class CuentaPrueba {

    
    public static void main(String[] args) {
        
        
        Cuenta miCuenta= new Cuenta("09078509H", "Juan Diego", 1000.00, 0);
        
        JOptionPane.showMessageDialog(null, miCuenta);
        
        CuentaCalculos.ingresarIntereses(miCuenta);
        
        JOptionPane.showMessageDialog(null, miCuenta);
        
        CuentaCalculos.ingresarDinero(miCuenta, 2000.00);
        
        JOptionPane.showMessageDialog(null, miCuenta);
        
        CuentaCalculos.retirarDinero(miCuenta, 4000.00);
        
        JOptionPane.showMessageDialog(null, miCuenta);
        
        CuentaCalculos.retirarDinero(miCuenta, 2000.00);
        
        JOptionPane.showMessageDialog(null, miCuenta);
    }   
    
}
