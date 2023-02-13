
package tema6_herencia_ventana;


import java.util.Objects;


public class Puerta {
    
    private String color;
    private boolean estadoPuerta;//tue cerrada; false abierta

    public Puerta(String color, boolean estado) {
       
        this.color = color;
        this.estadoPuerta = estado;
    }

    public Puerta() {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isEstadoPuerta() {
        return estadoPuerta;
    }

    public void setEstadoPuerta(boolean estadoPuerta) {
        this.estadoPuerta = estadoPuerta;
    }
    //abrir puerta
    public void abrirPuerta(){
    
    this.estadoPuerta=false;
    }
    //cerrar puerta
     public void cerraPuerta(){
    
    this.estadoPuerta=true;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
    
        sb.append("Puerta{");
        sb.append("color=").append(color);
        sb.append(", la puerta está=").append(estadoPuerta);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.color);
        hash = 97 * hash + (this.estadoPuerta ? 1 : 0);
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
        final Puerta other = (Puerta) obj;
        return Objects.equals(this.color, other.color);
    }
    
     
     
     
}
