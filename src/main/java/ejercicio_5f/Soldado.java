
package ejercicio_5f;


public class Soldado implements Comparable<Soldado> {
    
    
    private int nif;
    private String nombre;
    private String apellido1;
    private String apellido2;
    private int edad;
    
    private static int contador=0;

    public Soldado() {
    }

    public Soldado(String nombre, String apellido1, String apellido2, int edad) {
        this.nif=++contador;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.edad = edad;
    }

    public int getNif() {
        return nif;
    }

    public void setNif(int nif) {
        this.nif = nif;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        Soldado.contador = contador;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + this.nif;
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
        final Soldado other = (Soldado) obj;
        return this.nif == other.nif;
    }

    @Override
    public String toString() {
        return "Soldado{" + "nif=" + nif + ", nombre=" + nombre + ", apellido1=" + apellido1 + ", apellido2=" + apellido2 + ", edad=" + edad + '}';
    }

    @Override
    public int compareTo(Soldado s) {
        return this.nif- s.getNif();
    }
    
    
    
    
}
