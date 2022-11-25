
package p41elevador;


public enum Estado {
    
    SUBIENDO("Subiendo"),
    BAJANDO("Bajando"),
    PARADO("Parado"),
    AVERIADO("Averiado");
    
    private String estado;

    private Estado(String estado) {
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }
    
    
    
}
