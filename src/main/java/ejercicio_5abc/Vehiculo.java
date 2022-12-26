
package ejercicio_5abc;

import java.util.Objects;
import java.util.Random;
import org.apache.commons.lang3.RandomStringUtils;


public class Vehiculo {
    
    private String bastidor;
    private String matricula;
    private String color;
    private String modelo;
    private boolean disponible;
    private double tarifa;
    
    private static int contador=0;

    public Vehiculo() {
        
        this.bastidor = String.valueOf(++contador);
        this.matricula = RandomStringUtils.randomNumeric(4)+RandomStringUtils.randomAlphabetic(3).toUpperCase();
        this.color = VehiculoColor.colorAleatorio();
        this.modelo = VehiculoModelo.modeloAleatorio();
        this.disponible=true;
    }

    public Vehiculo(String bastidor, String matricula, String color, String modelo) {
        this.bastidor = bastidor;
        this.matricula = matricula;
        this.color = color;
        this.modelo = modelo;
        this.disponible=true;
    }

    
    
    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public double getTarifa() {
        return tarifa;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }
    
    
    public String getBastidor() {
        return bastidor;
    }

    public void setBastidor(String bastidor) {
        this.bastidor = bastidor;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

   

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.bastidor);
        hash = 59 * hash + Objects.hashCode(this.matricula);
        hash = 59 * hash + Objects.hashCode(this.color);
        hash = 59 * hash + Objects.hashCode(this.modelo);
        hash = 59 * hash + (this.disponible ? 1 : 0);
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.tarifa) ^ (Double.doubleToLongBits(this.tarifa) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Vehiculo other = (Vehiculo) obj;
        return Objects.equals(this.bastidor, other.bastidor);
    }

    

    @Override
    public String toString() {
        return "Vehiculo{" + "bastidor=" + bastidor + ", matricula=" + matricula + ", color=" + color + ", modelo=" + modelo + ", disponible=" + disponible + ", tarifa=" + tarifa + '}';
    }

    
    
    
    
    
    
}
