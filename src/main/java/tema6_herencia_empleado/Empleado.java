
package tema6_herencia_empleado;


public   abstract class  Empleado extends Persona {
    
    private double salario;

    public Empleado() {
    }

    public Empleado(double salario, String nombre, String nif, int edad) {
        super(nombre, nif, edad);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
             sb.append(super.toString());
        sb.append("Empleado{");
        sb.append("salario=").append(salario);
        sb.append('}');
        return sb.toString();
    }
    // metodo aumentar salario
    public abstract void aumentarSalario (double cantidad);
   
    
    
    
    
    
}
