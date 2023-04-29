/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_6b;

/**
 *
 * @author Juan Diego
 */
public class RestauradorPictorico extends Conservador {

    public RestauradorPictorico() {
    }

    public RestauradorPictorico(String nif, String nombre) {
        super(nif, nombre);
    }

    @Override
    public void restaurarObra(Obra o) {
        System.out.println("Esta restaurando un cuadro");
    }
    
    
}
