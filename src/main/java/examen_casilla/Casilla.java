
package examen_casilla;

import java.util.Objects;


public class Casilla {
    
    
    private int fila;
    private int columna;
    private TipoCasilla tipoCasilla;

    public Casilla() {
    }

    public Casilla(int fila, int columna, TipoCasilla tipoCasilla) {
        this.fila = fila;
        this.columna = columna;
        this.tipoCasilla = tipoCasilla;
    }

    public int getFila() {
        return fila;
    }

    public int getColumna() {
        return columna;
    }

    public TipoCasilla getTipoCasilla() {
        return tipoCasilla;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + this.fila;
        hash = 71 * hash + this.columna;
        hash = 71 * hash + Objects.hashCode(this.tipoCasilla);
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
        final Casilla other = (Casilla) obj;
        if (this.fila != other.fila) {
            return false;
        }
        if (this.columna != other.columna) {
            return false;
        }
        return this.tipoCasilla == other.tipoCasilla;
    }
    
    
    @Override
    public String toString() {
        return ""+tipoCasilla;
    }
    
    
    
    
    
}
