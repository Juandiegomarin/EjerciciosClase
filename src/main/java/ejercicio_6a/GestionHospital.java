
package ejercicio_6a;

import java.time.LocalDate;
import java.util.Random;
import org.apache.commons.lang3.RandomStringUtils;

/**
 *
 * @author Juan Diego
 */
public class GestionHospital {
    
    
    private Hospital hospital;

    private static String[] listaNombres = {"Juan", "Alberto", "Paco", "Rodolfo", "Maria", "Antonia", "Paquita", "Lola", "Ramon", "Penelopez", "Ivan", "Pepe", "Lucia"};
    private static String[] listaApellidos = {"Fernandez", "Calderon", "Garcia", "Rodriguez", "Mena", "Mora", "Martinez", "Sanchez", "Perez", "Lopez", "Gonzalez", "Silva"};

    public GestionHospital(Hospital hospital) {
        this.hospital = hospital;
    }

    public Hospital getHospital() {
        return hospital;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }

    @Override
    public String toString() {
        return "GestionHospital{" +
                "hospital=" + hospital +
                '}';
    }

    public Medico crearMedico() {
        Random rd = new Random();

        String especialidades[] = {"cirugia", "odontologia", "laringologia", "neurologia", "pediatria"};
        double salario = rd.nextDouble() * rd.nextInt(500) + 1000;

        return new Medico(listaNombres[rd.nextInt(listaNombres.length)], listaApellidos[rd.nextInt(listaApellidos.length)],
                new NIF(RandomStringUtils.randomNumeric(8), getRandomDate()),
                RandomStringUtils.randomNumeric(6), salario, especialidades[rd.nextInt(especialidades.length)]);
    }

    public Administrativo crearPersonalPAS() {
        Random rd = new Random();
        double salario = rd.nextDouble() * rd.nextInt(500) + 1000;
        return new Administrativo(listaNombres[rd.nextInt(listaNombres.length)], listaApellidos[rd.nextInt(listaApellidos.length)],
                new NIF(RandomStringUtils.randomNumeric(8), getRandomDate()),
                RandomStringUtils.randomNumeric(6), salario, Grupo.values()[rd.nextInt(Grupo.values().length)]);
    }

    public Paciente crearPaciente() {
        Random rd = new Random();
        return new Paciente(listaNombres[rd.nextInt(listaNombres.length)], listaApellidos[rd.nextInt(listaApellidos.length)],
                new NIF(RandomStringUtils.randomNumeric(8), getRandomDate()),
                RandomStringUtils.randomAlphanumeric(5));
    }

    private static LocalDate getRandomDate() {
        Random rd = new Random();
        LocalDate now = LocalDate.now();

        int años = rd.nextInt(3);
        int meses = rd.nextInt(12) + 1;
        int dias = rd.nextInt(30) + 1;

        now = now.plusDays(dias);
        now = now.plusYears(años);
        now = now.plusMonths(meses);
        return now;
    }

    public static void main(String[] args) {
        Random rd = new Random();
        Hospital hospital = new Hospital("Ramoncin", "La veleta", 200);

        GestionHospital gestionHospital = new  GestionHospital(hospital);
        hospital.contratarEmpleado(gestionHospital.crearMedico());
        hospital.contratarEmpleado(gestionHospital.crearMedico());
        hospital.contratarEmpleado(gestionHospital.crearPersonalPAS());
        hospital.contratarEmpleado(gestionHospital.crearPersonalPAS());
        hospital.contratarEmpleado(gestionHospital.crearPersonalPAS());
        hospital.ingresarPaciente(gestionHospital.crearPaciente());
        hospital.ingresarPaciente(gestionHospital.crearPaciente());
        hospital.ingresarPaciente(gestionHospital.crearPaciente());
        hospital.ingresarPaciente(gestionHospital.crearPaciente());
        hospital.ingresarPaciente(gestionHospital.crearPaciente());

        //Elige un médico y un paciente, aleatoriamente, para que ese medico trate a ese paciente con Pancetamol
        for (int i = 0; i < hospital.getEmpleados().size(); i++) {
            if (hospital.getEmpleados().get(i) instanceof Medico) {
                Paciente pacienteTratar = hospital.getPacientes().get(rd.nextInt(hospital.getPacientes().size()));
                ((Medico) hospital.getEmpleados().get(i)).tratar(pacienteTratar, "Paracetamol");
                break;
            }
        }

        //Ejecuta el método abstracto de todos los empleados.
        hospital.getEmpleados().forEach((empleado) -> {
            System.out.printf("%.2f\n", empleado.calcularIRPF());
        });

        //Renueva el NIF a un paciente cualquiera.
        Paciente pacienteCualquiera = hospital.getPacientes().get(rd.nextInt(hospital.getPacientes().size()));
        System.out.println(pacienteCualquiera);
        System.out.println();
        pacienteCualquiera.renovarNIF(LocalDate.of(2027, 05, 14));
        System.out.println(pacienteCualquiera);
    
}
}
