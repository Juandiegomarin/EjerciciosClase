
package ejercicio_7e;


import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Juan Diego
 */

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class ListaFacturas {
    
    // XmLElementWrapper define un contenedor para la lista 
    // de muebles
    @XmlElementWrapper(name = "facturas")

    // XmlElement establece el nombre de los elementos
    // Cada elemento de la lista llevará esta etiqueta en el fichero xml
    @XmlElement(name = "factura")
    private List<Factura> lista;

    private String descripcion;
    
    public List<Factura> getListaFacturas() {
        return lista;
    }

    public void setLista(List<Factura> lista) {
        this.lista = lista;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
}
