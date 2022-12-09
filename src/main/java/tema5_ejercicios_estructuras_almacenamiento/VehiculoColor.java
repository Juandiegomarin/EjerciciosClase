
package tema5_ejercicios_estructuras_almacenamiento;


public enum VehiculoColor {
    
    
    ROJO,AZUL,VERDE,AMARILLO;
    
    public static VehiculoColor colorAleatorio() {

        VehiculoColor[] colores = VehiculoColor.values();
        int posicion = utilidades.Utilidades.numeroEnteroRandom(0, colores.length);

        return colores[posicion];

    }
}
