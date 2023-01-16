
package ejercicio_5d;


public enum Iva {
    
    CUATRO(4),
    DIEZ(10),
    VEINTIUNO(21);
    
    
    private double iva;

    private Iva(double iva) {
        this.iva = iva;
    }

    public double getIva() {
        return iva;
    }
    
    
}
