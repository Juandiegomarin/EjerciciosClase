
package tema4_ejercicios_introduccion_poo;


public class CajaCarton {
    
    private String ancho;
    private String alto;
    private String largo;
    private String peso;

    public CajaCarton(String ancho, String alto, String largo, String peso) {
        this.ancho = ancho;
        this.alto = alto;
        this.largo = largo;
        this.peso = peso;
    }

    public String getAncho() {
        return ancho;
    }

    public void setAncho(String ancho) {
        this.ancho = ancho;
    }

    public String getAlto() {
        return alto;
    }

    public void setAlto(String alto) {
        this.alto = alto;
    }

    public String getLargo() {
        return largo;
    }

    public void setLargo(String largo) {
        this.largo = largo;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "CajaCarton{" + "ancho=" + ancho + ", alto=" + alto + ", largo=" + largo + ", peso=" + peso + '}';
    }
    
    
    
    
    public void abrir(){}
    public void cerrar(){}
    
    
}
