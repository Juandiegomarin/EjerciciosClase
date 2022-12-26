
package ejercicio_5abc;


public enum VehiculoColor {
    
    
    ROJO("Rojo"),AZUL("Azul"),VERDE("Verde"),AMARILLO("Amarillo");
    
    private String color;

    private VehiculoColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
    
    
    public static String colorAleatorio() {

        VehiculoColor[] colores = VehiculoColor.values();
        int posicion = utilidades.Utilidades.numeroEnteroRandom(0, colores.length-1);

        return colores[posicion].getColor();

    }
}
