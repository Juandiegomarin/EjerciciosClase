package ejercicio_7b;




import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;


public class ParteB {

    public static ArrayList<Vehiculo> lectura(){
        ArrayList<Vehiculo> vehiculos = new ArrayList<>();


        String ruta = "vehiculos.txt";


        try(Scanner sc = new Scanner(new FileReader(ruta))){
            while(sc.hasNextLine()){
                String linea = sc.nextLine();
                String[] parts = linea.substring(2).split(":");

                if(linea.charAt(0)=='0'){
                    Turismo turismo = new Turismo();
                    turismo.setMatricula(parts[0]);
                    turismo.setKilometros(Double.parseDouble(parts[1]));
                    turismo.setNumeroBastidor(parts[2]);
                    turismo.setMarca(parts[3]);
                    turismo.setPuertas(Integer.parseInt(parts[4]));
                    turismo.setMarchaAutomatica(Boolean.parseBoolean(parts[5]));
                    turismo.setColor(parts[6]);
                    vehiculos.add(turismo);

                }else if(linea.charAt(0)=='1'){
                    Deportivo deportivo = new Deportivo();
                    deportivo.setMatricula(parts[0]);
                    deportivo.setKilometros(Double.parseDouble(parts[1]));
                    deportivo.setNumeroBastidor(parts[2]);
                    deportivo.setMarca(parts[3]);
                    deportivo.setCilindrada(Integer.parseInt(parts[4]));
                    deportivo.setCaballos(Integer.parseInt(parts[5]));

                    vehiculos.add(deportivo);
                }else{
                    Furgoneta furgoneta = new Furgoneta();
                    furgoneta.setMatricula(parts[0]);
                    furgoneta.setKilometros(Double.parseDouble(parts[1]));
                    furgoneta.setNumeroBastidor(parts[2]);
                    furgoneta.setMarca(parts[3]);
                    furgoneta.setCargaMaxima(Integer.parseInt(parts[4]));
                    furgoneta.setNumeroPuertas(Integer.parseInt(parts[5]));
                    vehiculos.add(furgoneta);
                }
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return vehiculos;
    }

}
