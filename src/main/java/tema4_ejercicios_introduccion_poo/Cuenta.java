package tema4_ejercicios_introduccion_poo;

import org.apache.commons.lang3.RandomStringUtils;

public class Cuenta {

    private String numeroCuenta;
    private String nif;
    private String nombre;
    private double saldo;
    private double interes;

    public Cuenta(String nif, String nombre, double saldo, double interes) {
        this.numeroCuenta = RandomStringUtils.randomNumeric(20);
        this.nif = nif;
        this.nombre = nombre;
        this.saldo = saldo;

        if (interes < 0.1||interes > 3) {
            this.interes = 0.1;

        } else {
            this.interes = interes;
        }
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public String getNif() {
        return nif;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getInteres() {
        return interes;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "numeroCuenta=" + numeroCuenta + ", nif=" + nif + ", nombre=" + nombre + ", saldo=" + saldo + ", interes=" + interes + '}';
    }

}
