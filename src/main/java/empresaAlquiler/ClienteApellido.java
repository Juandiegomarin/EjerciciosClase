
package empresaAlquiler;


public enum ClienteApellido {
    
    
    
    MARIN,MARTINEZ,COLLADO,SALCEDO,JIMENEZ;
    
    public static ClienteApellido apellidoAleatorio() {

        ClienteApellido[] apellidos = ClienteApellido.values();
        int posicion = utilidades.Utilidades.numeroEnteroRandom(0, apellidos.length-1);

        return apellidos[posicion];

    }
    
}
