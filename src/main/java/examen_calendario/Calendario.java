package examen_calendario;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.Year;
import java.time.format.TextStyle;
import java.util.ArrayList;
import java.util.Locale;

public class Calendario {

    private int[][] matriz;
    private int mes;
    private int anio;

    public Calendario(int mes, int anio) {
        this.matriz = new int[6][7];
        this.mes = mes;
        this.anio = anio;
        
        rellenaMatriz(obtenerPrimerDia(), obtenerDiasMes(), matriz);
        
        
    }

    public int[][] getMatriz() {
        return matriz;
    }

    public void setMatriz(int[][] matriz) {
        this.matriz = matriz;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
    
    

    public  int obtenerPrimerDia() {

        int posicion;
        

        LocalDate fecha = LocalDate.of(anio, mes, 1);

        DayOfWeek diaSemana = fecha.getDayOfWeek();

        posicion = diaSemana.getValue() - 1;

        return posicion;
    }

    public int obtenerUltimoDia() {

        int posicion;

        boolean esBisiesto = Year.isLeap(anio);

        LocalDate fecha = LocalDate.of(anio, mes, Month.of(mes).length(esBisiesto));

        DayOfWeek diaSemana = fecha.getDayOfWeek();

        posicion = diaSemana.getValue() - 1;

        return posicion;

    }

    public int obtenerDiasMes() {

        boolean esBisiesto = Year.isLeap(anio);

        LocalDate fecha = LocalDate.of(anio, mes, Month.of(mes).length(esBisiesto));

        return fecha.getDayOfMonth();

    }

    private static void rellenaMatriz(int primerDia, int numeroDiasMes,int[][]matriz) {

        int numero = 1;
        
        boolean seguir;

        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {

                if (i == 0 && j < primerDia) {

                    matriz[i][j] = 0;

                } else {

                    matriz[i][j] = numero;

                    if (numero > numeroDiasMes) {
                        matriz[i][j] = 0;
                    }
                    numero++;
                }

            }

        }
        
    }

    public static String imprimirMatriz(int[][] matriz) {

        String resultado = "";

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {

                if (matriz[i][j] >= 10) {
                    resultado += matriz[i][j] + "  ";
                } else {
                    resultado += matriz[i][j] + "   ";
                }
            }
            resultado += "\n";
        }

        return resultado;

    }
    
    public static String diaSemana(int dia,Calendario c){
        
         Locale configLocal1 = new Locale("es");
        
        boolean esBisiesto = Year.isLeap(c.getAnio());
        LocalDate fecha= LocalDate.of(c.getAnio(), c.getMes(), Month.of(c.getMes()).length(esBisiesto));
        
    if(dia>fecha.getDayOfMonth()||dia<1){
    
    throw new IllegalArgumentException("Dia incorrecto");
    
    
    }else{
    
    LocalDate aux= LocalDate.of(c.anio, c.mes, dia);
    DayOfWeek diaSemana= aux.getDayOfWeek();
    return diaSemana.getDisplayName(TextStyle.FULL, configLocal1);
    }
    
    
    }
    
    public ArrayList<Calendario> calendarioAnual(int anio){
    
    ArrayList<Calendario> calendarios= new ArrayList();
    
        for (int i = 0; i < 12; i++) {
            
            Calendario c= new Calendario(i+1, anio);
            calendarios.add(c);
            
        }
        
    
    
    
    
    
    
    return calendarios;
    
    }
    
    public ArrayList<Calendario> listaCalendarios(int anio){
    
    
    
    
    return calendarioAnual(anio);
    
    
    }

    @Override
    public String toString() {
        return "L   M   X   J   V   S   D\n" + imprimirMatriz(matriz);
    }

}
