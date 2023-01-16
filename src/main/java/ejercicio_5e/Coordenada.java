
package ejercicio_5e;


public class Coordenada {
    
    private int fila;
    private int columna;

    public Coordenada(int fila, int columna) {
        this.fila = fila;
        this.columna = columna;
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public int getColumna() {
        return columna;
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + this.fila;
        hash = 29 * hash + this.columna;
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
        final Coordenada other = (Coordenada) obj;
        if (this.fila != other.fila) {
            return false;
        }
        return this.columna == other.columna;
    }

    @Override
    public String toString() {
        return "Coordenada{" + "fila=" + fila + ", columna=" + columna + '}';
    }
    
    
    
    
}
