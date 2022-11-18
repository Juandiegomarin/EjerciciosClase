
package tema4_ejercicios_introduccion_poo;

import javax.swing.JOptionPane;


public class CuentaCalculos {
    
    
    public static void ingresarIntereses(Cuenta cuenta){
    
    
    cuenta.setSaldo(cuenta.getSaldo()+(cuenta.getSaldo()*cuenta.getInteres()));
    
    
    
    }
    
    
    public static void ingresarDinero(Cuenta cuenta,double dinero){
    
    cuenta.setSaldo(cuenta.getSaldo()+dinero);
    
   
    
    }
    
    public static void retirarDinero(Cuenta cuenta,double dinero){
    
    if(dinero<cuenta.getSaldo()){
    
    cuenta.setSaldo(cuenta.getSaldo()-dinero);
    }else{
    
        JOptionPane.showMessageDialog(null, "No tienes"
                + " dinero suficiente para retirar esta cantidad de €");
    }
    
    }
    
    
}
