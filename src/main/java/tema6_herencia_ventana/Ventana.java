
package tema6_herencia_ventana;




public class Ventana {
    private boolean estadoVentana; // true cerrada

    public Ventana(boolean estadoVentana) {
        
        this.estadoVentana = estadoVentana;
    }

    public Ventana() {
    }

    public boolean isEstadoVentana() {
        return estadoVentana;
    }

    public void setEstadoVentana(boolean estadoVentana) {
        this.estadoVentana = estadoVentana;
    }
    
    // abrir ventana
    public void abrirVentana(){
    
    this.estadoVentana=false;
    }
    
    // cerra ventana
      public void cerrarVentana(){
    
    this.estadoVentana=true;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
   
        sb.append("Ventana{");
        sb.append("La ventana está=").append(estadoVentana);
        sb.append('}');
        return sb.toString();
    }
    
      
      
}
