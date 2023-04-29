/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_6b;

/**
 *
 * @author Juan Diego
 */
public abstract class Conservador extends Empleado {

    public Conservador() {
    }

    public Conservador(String nif, String nombre) {
        super(nif, nombre);
    }
    
    
    public abstract void restaurarObra(Obra o);
}
