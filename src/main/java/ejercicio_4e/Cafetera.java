package ejercicio_4e;

public class Cafetera {

    private double capacidadMaxima;
    private double cantidadActual;

    public Cafetera() {
    }

    public Cafetera(double capacidadMaxima, double cantidadActual) {
        if (capacidadMaxima < 0) {
            this.capacidadMaxima = 1000.00;
        } else {
            this.capacidadMaxima = capacidadMaxima;
        }

        if (cantidadActual < 0) {
            this.cantidadActual = 0;
        } else if (cantidadActual > capacidadMaxima) {
            this.cantidadActual = capacidadMaxima;

        } else {
            this.cantidadActual = cantidadActual;
        }
    }

    public Cafetera(double capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = capacidadMaxima;
    }

    public void llenarCafetera() {

        this.cantidadActual = this.capacidadMaxima;

    }

    public void servirTaza(double cantidad) {

        if (cantidad >= this.cantidadActual) {
            this.cantidadActual =0;

        } else {
            this.cantidadActual -= cantidad;
        }

    }

    public void vaciarCafetera() {

        this.cantidadActual = 0;
    }

    public void rellenarCafetera(double cantidad) {

        if (cantidad + this.cantidadActual > capacidadMaxima) {

            this.cantidadActual = this.capacidadMaxima;
        } else {
            this.cantidadActual += cantidad;
        }

    }

   

    @Override
    public String toString() {
        return "Cafetera{" + "capacidadMaxima=" + capacidadMaxima + ", cantidadActual=" + cantidadActual + '}';
    }
    
    

}
