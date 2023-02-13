
package tema6_herencia_ventana;




public class Corredera extends Ventana {
    
    private int rieles;
    private Persiana persiana;
    private boolean estado;

    public Corredera() {
    }

    public Corredera(int rieles, Persiana persiana, boolean estadoVentana, boolean apertura) {
        super(estadoVentana);
        this.rieles = rieles;
        this.persiana = persiana;
        this.estado= apertura;
    }

    public int getRieles() {
        return rieles;
    }

    public void setRieles(int rieles) {
        this.rieles = rieles;
    }

    public Persiana getPersiana() {
        return persiana;
    }

    public void setPersiana(Persiana persiana) {
        this.persiana = persiana;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
         sb.append(super.toString());
        sb.append("Corredera{");
        sb.append("rieles=").append(rieles);
        sb.append(", persiana=").append(persiana);
        sb.append('}');
        return sb.toString();
    }
    
    
    
   
    @Override
    public void abrirVentana(){
    
    this.estado=false;
    }
    
    // cerra ventana
    @Override
      public void cerrarVentana(){
    
    this.estado=true;
    }

    
    
}
