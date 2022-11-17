package ejercicio_4c;

import java.util.Random;
import org.apache.commons.lang3.RandomStringUtils;

public class Persona {

    private String nombre;
    private int edad;
    private String nif;
    private char sexo;
    private double peso;
    private int altura;

    public Persona() {
        this.nombre = "Juan Diego";
        this.edad = 19;
        this.nif = "09078509H";
        this.sexo = 'H';
        this.peso = 73.0;
        this.altura = 174;
    }

    public Persona(String nombre, int edad, char sexo, double peso, int altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.nif = generarNif();

        if (filtrarSexo(sexo)) {

            this.sexo = sexo;

        } else {
            this.sexo = 'O';
        }

        this.peso = peso;
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", nif=" + nif + ", sexo=" + sexo + ", peso=" + peso + ", altura=" + altura + '}';
    }

    private static boolean filtrarSexo(char s) {

        boolean resultado = false;
        if (s == 'H' || s == 'M') {

            resultado = true;
        }

        return resultado;
    }

    public static String generarNif() {

        String nif = "";
        String letra = "";
        int numero;
        int resto;

        nif = RandomStringUtils.randomNumeric(8);

        numero = Integer.parseInt(nif);

        resto = numero % 23;
        
        
        String letras="TRWAGMYFPDXBNJZSQVHLCKE";
        
        
        if (resto == 0) {
            letra = "T";
        } else if (resto == 1) {
            letra = "R";
        } else if (resto == 2) {
            letra = "W";
        } else if (resto == 3) {
            letra = "A";
        } else if (resto == 4) {
            letra = "G";
        } else if (resto == 5) {
            letra = "M";
        } else if (resto == 6) {
            letra = "Y";
        } else if (resto == 7) {
            letra = "F";
        } else if (resto == 8) {
            letra = "P";
        } else if (resto == 9) {
            letra = "D";
        } else if (resto == 10) {
            letra = "X";
        } else if (resto == 11) {
            letra = "B";
        } else if (resto == 12) {
            letra = "N";
        } else if (resto == 13) {
            letra = "J";
        } else if (resto == 14) {
            letra = "Z";
        } else if (resto == 15) {
            letra = "S";
        } else if (resto == 16) {
            letra = "Q";
        } else if (resto == 17) {
            letra = "V";
        } else if (resto == 18) {
            letra = "H";
        } else if (resto == 19) {
            letra = "L";
        } else if (resto == 20) {
            letra = "C";
        } else if (resto == 21) {
            letra = "K";
        } else if (resto == 22) {
            letra = "E";
        }

        nif = nif + letra;
        return nif;
    }

    public boolean esMayorEdad() {

        boolean mayorEdad = true;

        if (this.edad < 18) {
            mayorEdad = false;
        }

        return mayorEdad;

    }

    public float calcularIMC() {

        float imc = 0f;

        imc = (float) (this.peso / Math.pow((double) this.altura / 100, 2));

        return imc;

    }

    public void darLike(Serie s) {

        s.setLikes(s.getLikes() + 1);
    }
}
