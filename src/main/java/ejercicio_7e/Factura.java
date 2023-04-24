
package ejercicio_7e;


import java.time.LocalDate;
import java.util.Random;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;
import org.apache.commons.lang3.RandomStringUtils;


public class Factura {
    
    
    private String codigoUnico;
    private LocalDate fechaEmision;
    private String descripcion;
    private double totalImporte;
    
    
    private static int numeroCod=0;

    public Factura() {
        
        this.codigoUnico=String.valueOf(++numeroCod);
        this.fechaEmision=LocalDate.now();
        this.descripcion=RandomStringUtils.randomAlphabetic('a','z');
        
        
        Random rd = new Random();
        
        DoubleStream importe = rd.doubles(1, 100.00, 1000.00);
        
        double [] a = importe.toArray();
        
        
        
        
        this.totalImporte=a[0] ;
        
    }

    public Factura(String codigoUnico, LocalDate fechaEmision, String descripcion, double totalImporte) {
        this.codigoUnico = codigoUnico;
        this.fechaEmision = fechaEmision;
        this.descripcion = descripcion;
        this.totalImporte = totalImporte;
    }

    public LocalDate getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(LocalDate fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getTotalImporte() {
        return totalImporte;
    }

    public void setTotalImporte(double totalImporte) {
        this.totalImporte = totalImporte;
    }

    public String getCodigoUnico() {
        return codigoUnico;
    }

    public void setCodigoUnico(String codigoUnico) {
        this.codigoUnico = codigoUnico;
    }

    

    @Override
    public String toString() {
        return "Factura{" + "codigoUnico=" + codigoUnico + "; fechaEmision=" + fechaEmision + "; descripcion=" + descripcion + "; totalImporte=" + totalImporte + '}';
    }
    
    
    

    
        
    
}
