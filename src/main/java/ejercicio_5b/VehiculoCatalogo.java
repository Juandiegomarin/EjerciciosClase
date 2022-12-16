package ejercicio_5b;

public class VehiculoCatalogo {

    private int longitud;
    private Vehiculo[] vehiculos;

    public VehiculoCatalogo(int longitud) {
        Math.abs(longitud);
        this.longitud = longitud;
        this.vehiculos = new Vehiculo[longitud];

        for (int i = 0; i < vehiculos.length; i++) {

            this.vehiculos[i] = new Vehiculo();

        }

    }

    @Override
    public String toString() {

        String cadena = "";

        for (Vehiculo v : vehiculos) {
            if (v != null) {
                cadena += v.toString() + "\n";
            }

        }

        return cadena;
    }

    public int getLongitud() {
        return longitud;
    }

    public Vehiculo[] getVehiculos() {
        return vehiculos;
    }
    
    private int buscarVehiculo(Vehiculo v) {

        for (int i = 0; i < vehiculos.length; i++) {
            if (v.equals(this.vehiculos[i])) {
                return i;
            }
        }
        return -1;

    }

    public Vehiculo buscarVehiculo(String bastidor) {

        Vehiculo aux = new Vehiculo();
        aux.setBastidor(bastidor);

        int posicion = buscarVehiculo(aux);

        return (posicion >= 0) ? this.vehiculos[posicion] : null;

    }

    public void añadirVehiculo(Vehiculo v) {

        if (this.longitud < this.vehiculos.length) {
            for (int i = 0; i < this.vehiculos.length; i++) {
                if (this.vehiculos[i] == null) {
                    this.vehiculos[i] = v;
                    this.longitud++;
                    break;

                }
            }

        } else {
            this.longitud++;
            this.vehiculos = copiar();
            this.vehiculos[this.longitud - 1] = v;
        }

    }

    private Vehiculo[] copiar() {

        Vehiculo[] aux = new Vehiculo[this.longitud + 1];

        for (int i = 0; i < this.vehiculos.length; i++) {
            aux[i] = this.vehiculos[i];
        }

        return aux;
    }

    //borrar clientes
    public boolean borrarVehiculo(Vehiculo v) {
        int pos = buscarVehiculo(v);
        if (pos >= 0) {
            this.longitud--;
            this.vehiculos[pos] = null;
            return true;
        }
        return false;
    }

}
