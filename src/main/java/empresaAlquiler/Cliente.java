package empresaAlquiler;

import java.util.Objects;
import org.apache.commons.lang3.RandomStringUtils;

public class Cliente {

    private ClienteNombre nombre;
    private ClienteApellido apellido;
    private String nif;
    private static int contador = 0;

    public Cliente() {
        this.nombre = ClienteNombre.nombreAleatorio();
        this.apellido = ClienteApellido.apellidoAleatorio();
        this.nif = String.valueOf(++contador);
    }

    public ClienteNombre getNombre() {
        return nombre;
    }

    public void setNombre(ClienteNombre nombre) {
        this.nombre = nombre;
    }

    public ClienteApellido getApellido() {
        return apellido;
    }

    public void setApellido(ClienteApellido apellido) {
        this.apellido = apellido;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + Objects.hashCode(this.nif);
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
        final Cliente other = (Cliente) obj;
        return Objects.equals(this.nif, other.nif);
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", apellido=" + apellido + ", nif=" + nif + '}';
    }

}
