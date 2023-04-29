
package ejercicio_7e;


import java.time.LocalDate;
import java.util.Random;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.apache.commons.lang3.RandomStringUtils;

@XmlRootElement(name = "factura")
// Anotación @XmlAccesorType define el elemento que usará JAXB durante el 
// procesamiento de datos (en este caso por atributo)
@XmlAccessorType(XmlAccessType.FIELD)

public class Factura {
    
    
    
    
    private String codigoUnico;
    @XmlJavaTypeAdapter(value = LocalDateAdapter.class)
    
    private LocalDate fechaEmision;
    private String descripcion;
    
    private double totalImporte;
    
    private static int Cod=0;
    

    public Factura() {
        
        this.codigoUnico=String.valueOf(++Cod);
        this.fechaEmision=LocalDate.now();
        this.descripcion=RandomStringUtils.randomAlphabetic(10);
        
        
        Random rd = new Random();
        
        DoubleStream importe = rd.doubles(1, 100.00, 1000.00);
        
        
        this.totalImporte=importe.findFirst().getAsDouble() ;
        
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
