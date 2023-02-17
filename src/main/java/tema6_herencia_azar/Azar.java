/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema6_herencia_azar;

import java.util.logging.Logger;

/**
 *
 * @author juandi
 */
public abstract class Azar {
    
    protected int posibilidades;

    public Azar() {
    }

    public Azar(int posibilidades) {
        this.posibilidades = Math.abs(posibilidades);
    }

    public int getPosibilidades() {
        return posibilidades;
    }

    public void setPosibilidades(int posibilidades) {
        this.posibilidades = posibilidades;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + this.posibilidades;
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
        final Azar other = (Azar) obj;
        return this.posibilidades == other.posibilidades;
    }

    @Override
    public String toString() {
        return "Azar{" + "posibilidades=" + posibilidades + '}';
    }
    
    
    
    
    
    
    
    
    
    public abstract int lanzar();

    
}
