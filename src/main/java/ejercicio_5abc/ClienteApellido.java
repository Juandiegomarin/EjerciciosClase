
package ejercicio_5abc;


public enum ClienteApellido {
    
    
    
    MARIN("Marin"),
    MARTINEZ("Martinez"),
    COLLADO("Collado"),
    SALCEDO("Salcedo"),
    JIMENEZ("Jimenez");
    
    private String apellido;

    private ClienteApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getApellido() {
        return apellido;
    }
    
    public static String apellidoAleatorio() {

        ClienteApellido[] apellidos = ClienteApellido.values();
        int posicion = utilidades.Utilidades.numeroEnteroRandom(0, apellidos.length-1);

        return apellidos[posicion].getApellido();

    }
    
}
