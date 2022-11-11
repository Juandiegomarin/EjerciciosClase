package tema4_ejercicios_introduccion_poo;

public class Vehiculo {

    String matricula;
    String marca;
    String modelo;
    String color;
    double tarifa;
    boolean disponible;

    // el método constructor de la clase Vehiculo 
    public Vehiculo(String matricula,
            String marca, String modelo, String color, double tarifa) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.tarifa = tarifa;
        this.disponible = false;
    }

    public Vehiculo() {
    }
    
    
// los métodos ‘get’ y ‘set’ de la clase Vehiculo 

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getTarifa() {
        return tarifa;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }

    public boolean getDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", tarifa=" + tarifa + ", disponible=" + disponible + '}';
    }
    
    public Vehiculo constructorCopia(Vehiculo v){
    
    Vehiculo aux= new Vehiculo(v.getMatricula(), v.getMarca(),
            v.getModelo(), v.getColor(),v.getTarifa());
    
    
    return aux;
    
    }
    

    public void aplicarDescuentoTarifa(double descuento) {
        this.tarifa -= descuento;
    }
    
    public Vehiculo recibirVehiculoAlquilado(Vehiculo v){
    
        Vehiculo aux;
    
        aux=v;
        
        aux.setMatricula("ZZZZ 000");
        aux.setMarca("Mercedes");
        aux.setModelo("Clase A");
        aux.setColor("Blanco");
        aux.setTarifa(1);
        
        return aux;
    
    }
}
