package tema3_estructuras_de_seleccion;

public class Ej09 {

    public static void main(String[] args) {

        int variable = 3;
        int variable2;
        switch (variable) {

            case 1:
                variable2 = 5;
                break;
            case 2:
                variable2 = 20;
                break;
            case 3:
                variable2 = 30;
            case 4:
                variable2 = 10;
            default:
                variable2 = 100;
                break;

        }
        System.out.println(variable2);// No hay break y no entra en el caso 3
    }

}
