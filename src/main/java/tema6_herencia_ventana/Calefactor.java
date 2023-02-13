
package tema6_herencia_ventana;


public class Calefactor {

    private int temperatura;
    private boolean estadoCalefactor; // true encendido

    public Calefactor(int temperatura, boolean estadoCalefactor) {

        this.temperatura = temperatura;
        this.estadoCalefactor = estadoCalefactor;
    }

    public Calefactor() {
    }

    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }

    public boolean isEstadoCalefactor() {
        return estadoCalefactor;
    }

    public void setEstadoCalefactor(boolean estadoCalefactor) {
        this.estadoCalefactor = estadoCalefactor;
    }

    public void encenderCalefactor() {

        this.estadoCalefactor = true;

    }

    public void borrarCalefactor() {

        this.estadoCalefactor = false;

    }

    public void fijarTemperatura(int tempe) {

        this.temperatura = tempe;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Calefactor{");
        sb.append("temperatura=").append(temperatura);
        sb.append(", el calefactor está =").append(estadoCalefactor);
        sb.append('}');
        return sb.toString();
    }

}
