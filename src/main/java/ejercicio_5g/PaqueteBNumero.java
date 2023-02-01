/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_5g;

import java.util.Objects;

/**
 *
 * @author juand
 */
public class PaqueteBNumero {

    private String numero;

    private static int n = 1;

    public PaqueteBNumero() {
        

        if (n < 10) {
            this.numero = "000" + String.valueOf(n);
        } else if (n >= 10 && n < 100) {
            this.numero = "00" + String.valueOf(n);
        } else if (n >= 100 && n < 1000) {
            this.numero = "0" + String.valueOf(n);
        } else {
            this.numero = String.valueOf(n);
        }
        n++;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.numero);
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
        final PaqueteBNumero other = (PaqueteBNumero) obj;
        return Objects.equals(this.numero, other.numero);
    }

    @Override
    public String toString() {
        return "Numero{" + "numero=" + numero + '}';
    }
    
}
