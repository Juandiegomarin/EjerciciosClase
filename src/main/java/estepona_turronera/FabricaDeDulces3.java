package estepona_turronera;

import javax.swing.JOptionPane;

public class FabricaDeDulces3 {

    public static void main(String[] args) {

        String opcion;
        String codigoDulce="";

        do {

            mostrarMenu();
            opcion = pedirOpcion();

            switch (opcion) {
                case "calcular":
                    
                    codigoDulce=filtrarCodigo();
                    
                    break;

                case "salir":

                    JOptionPane.showMessageDialog(null,
                            "Programa finalizado");

                    break;
                default:
                    JOptionPane.showMessageDialog(null,
                            "Error, vuelva a intentarlo");
            }
        } while (!opcion.equalsIgnoreCase("salir")&&!codigoDulce.equalsIgnoreCase("salir"));
    }

    private static void mostrarMenu() {

        String menu = """
                       Menú de opciones
                        ----------------
                        Calcular viabilidad de productos
                        Salir
                        ----------------
                       """;

        JOptionPane.showMessageDialog(null, menu);

    }

    private static String pedirOpcion() {

        return JOptionPane.showInputDialog("Introduce una opcion");

    }

    private static String leerCodigo() {

        return JOptionPane.showInputDialog("Introduce un codigo. \n"
                + "Los códigos disponibles son:\n\n"
                + " M1(Mantecado de Limón)\n"
                + " M2(Mazapanes)\n"
                + " T1(Turrón de chocolate)\n"
                + " T2(Turrón clásico)\n"
                + " P1(Polvorones)\n \n"
                + "Para terminar el programa escriba salir o pulse cancelar"
        );

    }
    
    private static String filtrarCodigo(){
    
        String codigo="";
        
        do {       
           
            
            codigo= leerCodigo();
            if(JOptionPane.CANCEL_OPTION==2){codigo="salir";}
                
            
        } while (!codigo.equals("salir") && !((codigo.equals("M1")
                            || codigo.equals("M2")
                            || codigo.equals("T1")
                            || codigo.equals("T2")
                            || codigo.equals("P1"))));
        
        if(codigo.equalsIgnoreCase("salir"))
        {JOptionPane.showMessageDialog(null, "Finalizando programa");}
    
    
    return codigo;
    
    
    
    }
}
