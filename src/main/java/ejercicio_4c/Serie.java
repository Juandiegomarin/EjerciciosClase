package ejercicio_4c;

import tema4_ejercicios_introduccion_poo.*;

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

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    @Override
    public String toString() {
        return "Serie{" + "titulo=" + titulo + ", genero=" + genero + ", sinopsis=" + sinopsis + ", numeroTemporadas=" + numeroTemporadas + ", likes=" + likes + ", productor=" + productor + '}';
    }

    public void añadirTemporada() {

        this.numeroTemporadas++;
    }
    
    

}
