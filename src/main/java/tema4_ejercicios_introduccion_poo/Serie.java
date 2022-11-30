
package tema4_ejercicios_introduccion_poo;

import java.util.Objects;


public class Serie {
    
    
    
    private String titulo;
    private String genero;
    private String sinopsis;
    private int numeroTemporadas;
    private int likes;
    private String productor;

    public Serie(String titulo, String genero, String sinopsis, int numeroTemporadas, String productor) {
        this.titulo = titulo;
        this.genero = genero;
        this.sinopsis = sinopsis;
        this.numeroTemporadas = numeroTemporadas;
        this.productor = productor;
    }

    public Serie() {
    }

    public Serie(String titulo, String genero, String sinopsis, int numeroTemporadas, int likes, String productor) {
        this.titulo = titulo;
        this.genero = genero;
        this.sinopsis = sinopsis;
        this.numeroTemporadas = numeroTemporadas;
        this.likes = likes;
        this.productor = productor;
    }
    
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String tiitulo) {
        this.titulo = tiitulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public int getNumeroTemporadas() {
        return numeroTemporadas;
    }

    public void setNumeroTemporadas(int numeroTemporadas) {
        this.numeroTemporadas = numeroTemporadas;
    }

    public String getProductor() {
        return productor;
    }

    public void setProductor(String productor) {
        this.productor = productor;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.titulo);
        hash = 59 * hash + Objects.hashCode(this.genero);
        hash = 59 * hash + Objects.hashCode(this.sinopsis);
        hash = 59 * hash + this.numeroTemporadas;
        hash = 59 * hash + this.likes;
        hash = 59 * hash + Objects.hashCode(this.productor);
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
        final Serie other = (Serie) obj;
        if (this.numeroTemporadas != other.numeroTemporadas) {
            return false;
        }
        if (this.likes != other.likes) {
            return false;
        }
        if (!Objects.equals(this.titulo, other.titulo)) {
            return false;
        }
        if (!Objects.equals(this.genero, other.genero)) {
            return false;
        }
        if (!Objects.equals(this.sinopsis, other.sinopsis)) {
            return false;
        }
        return Objects.equals(this.productor, other.productor);
    }
    
    

    @Override
    public String toString() {
        return "Serie{" + "titulo=" + titulo + ", genero=" + genero + ", sinopsis=" + sinopsis + ", numeroTemporadas=" + numeroTemporadas + ", productor=" + productor + '}';
    }
    
    
    public void añadirTemporada(){
    
    this.numeroTemporadas++;
    }
    
}
