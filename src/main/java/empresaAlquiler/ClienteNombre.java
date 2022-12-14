
package empresaAlquiler;


public enum ClienteNombre {
    
    
    JUANDIEGO,ALVARO,NACHO,FERNANDO,SAMUEL,ALBERTO;
    
    
    public static ClienteNombre nombreAleatorio() {

        ClienteNombre[] nombres = ClienteNombre.values();
        int posicion = utilidades.Utilidades.numeroEnteroRandom(0, nombres.length-1);

        return nombres[posicion];

    }
    
}
