package empresaAlquiler;

import java.time.LocalDate;

public class AlquilerCatalogo {

    private int longitud;
    private Alquiler[] alquileres;

    public AlquilerCatalogo(int longitud) {
        Math.abs(longitud);
        this.longitud = longitud;
        this.alquileres = new Alquiler[longitud];

        for (int i = 0; i < alquileres.length; i++) {

            this.alquileres[i] = new Alquiler();

        }

    }

    @Override
    public String toString() {

        String cadena = "";

        for (Alquiler a : alquileres) {
            if (a != null) {
                cadena += a.toString() + "\n";
            }

        }

        return cadena;
    }

    public int getLongitud() {
        return longitud;
    }

    private int buscarAlquiler(Alquiler a) {

        for (int i = 0; i < alquileres.length; i++) {
            if (a.equals(this.alquileres[i])) {
                return i;
            }
        }
        return -1;

    }

    public Alquiler buscarAlquiler(int id) {

        Alquiler aux = new Alquiler();
        aux.setIdAlquiler(id);

        int posicion = buscarAlquiler(aux);

        return (posicion >= 0) ? this.alquileres[posicion] : null;

    }

    public void añadirAlquiler(Alquiler a) {

        if (this.longitud < this.alquileres.length) {
            for (int i = 0; i < this.alquileres.length; i++) {
                if (this.alquileres[i] == null) {
                    this.alquileres[i] = a;
                    this.longitud++;
                    break;

                }
            }

        } else {
            this.longitud++;
            this.alquileres = copiar();
            this.alquileres[this.longitud - 1] = a;
        }

    }

    private Alquiler[] copiar() {

        Alquiler[] aux = new Alquiler[this.longitud + 1];

        for (int i = 0; i < this.alquileres.length; i++) {
            aux[i] = this.alquileres[i];
        }

        return aux;
    }

    //borrar clientes
    public boolean borrarAlquiler(Alquiler a) {
        int pos = buscarAlquiler(a);
        if (pos >= 0) {
            this.longitud--;
            this.alquileres[pos] = null;
            return true;
        }
        return false;
    }

}
