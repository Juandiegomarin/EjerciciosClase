
package tema6_herencia_empleado;


public class Programador extends Empleado {
    
    private CategoriaProgamador categoria;

    public Programador() {
    }

    public Programador(CategoriaProgamador categoria, double salario, String nombre, String nif, int edad) {
        super(salario, nombre, nif, edad);
        this.categoria = categoria;
    }

    public CategoriaProgamador getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaProgamador categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
             sb.append(super.toString());
        sb.append("Programador{");
        sb.append("categoria=").append(categoria);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void aumentarSalario(double cantidad) {
        this.setSalario(cantidad);
    }
    
    
    
    
    
}
