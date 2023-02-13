
package tema6_herencia_ventana;


import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public class Casa {
    
    private  int numPlantas ;
    private double metrosCuadrados;
    private List<Ventana> listaVentana;
    private Puerta  puerta;
    private List<Calefactor> listaCalefacto;

    public Casa() {
    }

    public Casa(int numPlantas, double metrosCuadrados) {
        this.numPlantas = numPlantas;
        this.metrosCuadrados = metrosCuadrados;
        this.listaVentana = new ArrayList<>();
        this.puerta = new Puerta();
        this.listaCalefacto = new ArrayList<>();
    }

    public int getNumPlantas() {
        return numPlantas;
    }

    public void setNumPlantas(int numPlantas) {
        this.numPlantas = numPlantas;
    }

    public double getMetrosCuadrados() {
        return metrosCuadrados;
    }

    public void setMetrosCuadrados(double metrosCuadrados) {
        this.metrosCuadrados = metrosCuadrados;
    }

    public List<Ventana> getListaVentana() {
        return listaVentana;
    }

    public void setListaVentana(List<Ventana> listaVentana) {
        this.listaVentana = listaVentana;
    }

    public Puerta getPuerta() {
        return puerta;
    }

    public void setPuerta(Puerta puerta) {
        this.puerta = puerta;
    }

    public List<Calefactor> getListaCalefacto() {
        return listaCalefacto;
    }

    public void setListaCalefacto(List<Calefactor> listaCalefacto) {
        this.listaCalefacto = listaCalefacto;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Casa{");
        sb.append("numPlantas=").append(numPlantas);
        sb.append(", metrosCuadrados=").append(metrosCuadrados);
        sb.append(", listaVentana=").append(listaVentana);
        sb.append(", puerta=").append(puerta);
        sb.append(", listaCalefacto=").append(listaCalefacto);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + this.numPlantas;
        hash = 89 * hash + (int) (Double.doubleToLongBits(this.metrosCuadrados) ^ (Double.doubleToLongBits(this.metrosCuadrados) >>> 32));
        hash = 89 * hash + Objects.hashCode(this.listaVentana);
        hash = 89 * hash + Objects.hashCode(this.puerta);
        hash = 89 * hash + Objects.hashCode(this.listaCalefacto);
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
        final Casa other = (Casa) obj;
        return Double.doubleToLongBits(this.metrosCuadrados) == Double.doubleToLongBits(other.metrosCuadrados);
    }

    
    
 
    
}
