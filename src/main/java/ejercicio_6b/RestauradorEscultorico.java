/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_6b;

/**
 *
 * @author Juan Diego
 */
public class RestauradorEscultorico extends Conservador {

    public RestauradorEscultorico() {
    }

    public RestauradorEscultorico(String nif, String nombre) {
        super(nif, nombre);
    }

    @Override
    public void restaurarObra(Obra o) {
        System.out.println("Esta restaurando una escultura");
    }

    
    
    
    
}
