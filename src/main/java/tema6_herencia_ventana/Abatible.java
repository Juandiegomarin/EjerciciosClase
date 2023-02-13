
package tema6_herencia_ventana;




public class Abatible extends Ventana {
    
    private int angulo;
    private boolean estado;

    public Abatible() {
    }

    public Abatible(int angulo, boolean estadoVentana, boolean estado) {
        super(estadoVentana);
        this.angulo = angulo;
        this.estado= estado;
    }

    public int getAngulo() {
        return angulo;
    }

    public void setAngulo(int angulo) {
        this.angulo = angulo;
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
        sb.append("Abatible{");
        sb.append("angulo=").append(angulo);
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
