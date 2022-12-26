
package ejercicio_5abc;


public enum ClienteNombre {
    
    
    JUANDIEGO("Juan Diego"),
    ALVARO("Alvaro"),
    NACHO("Nacho"),
    FERNANDO("Fernando"),
    SAMUEL("Samuel"),
    ALBERTO("Alberto");
    
    private String nombre;

    private ClienteNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
    
    
    public static String nombreAleatorio() {

        ClienteNombre[] nombres = ClienteNombre.values();
        int posicion = utilidades.Utilidades.numeroEnteroRandom(0, nombres.length-1);

        return nombres[posicion].getNombre();

    }
    
}
