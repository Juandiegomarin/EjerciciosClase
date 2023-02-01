/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_5g;

import java.util.Objects;

/**
 *
 * @author juandi
 */
public class PaqueteAPalabraEspaniola {
    
    private String texto;

    public PaqueteAPalabraEspaniola(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 43 * hash + Objects.hashCode(this.texto);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final PaqueteAPalabraEspaniola other = (PaqueteAPalabraEspaniola) obj;
        return Objects.equals(this.texto, other.texto);
    }

    @Override
    public String toString() {
        return "PalabraInglesa{" + "texto=" + texto + '}';
    }
    
    
}
