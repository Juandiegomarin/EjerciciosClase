package fabrica_dulces;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class FabricaDeDulces2 {

    public static void main(String[] args) {

        //Todas las variables necesarias para el programa
        String opcion;
        String codigo = "";

        final double COSTE_MINIMO_MATERIA_PRIMA = 0.1;
        final double COSTE_MAXIMO_MATERIA_PRIMA = 1.0;
        
        final double COSTE_MINIMO_MANO_OBRA = 0.5;
        final double COSTE_MAXIMO_MANO_OBRA = 0.9;

        final double PORCENTAJE_VENTA_UNITARIA_M1_M2_P1 = 0.5;
        final double PORCENTAJE_VENTA_RESTO_ARTICULOS = 0.65;
        
        final int PRECIO_BENEFICIO=2500;
        
        double unidadesParaObtenerBeneficio;

        double precioMateriaPrima;
        double precioManoObra;
        double costeProduccion;
        double costeVentaUnitaria;

        String menu = """
                       Menú de opciones
                        ----------------
                        Calcular viabilidad de productos
                        Terminar
                        ----------------
                       """;
        do {
            //Bucle principal que contiene un switch con las dos opciones que se pide

            JOptionPane.showMessageDialog(null, menu);

           opcion= JOptionPane.showInputDialog(null,
                    "Para calcular la viabilidad escriba calcular "
                    + ", para terminar escriba salir");

            //Transformamos la variable a minuscula para facilitar los case del switch principal
            opcion = opcion.toLowerCase();

            switch (opcion) {
                case "calcular":
                    //Primer caso primer switch
                    
                    
                    JOptionPane.showMessageDialog(null,
                            "Ahora introduce el código del dulce deseado");
                    //Pedimos datos por pantalla y lo introducimos
                    
                    //bucle interno que se repite si la intruduccion del codigo es errónea
                    do {
                      codigo =  JOptionPane.showInputDialog(null,
                                "Los códigos disponibles son:\n\n"
                                        + " M1(Mantecado de Limón)\n"
                                        + " M2(Mazapanes)\n"
                                        + " T1(Turrón de chocolate)\n"
                                        + " T2(Turrón clásico)\n"
                                        + " P1(Polvorones)\n \n"
                                + "Para terminar el programa escriba salir");

                        //switch intermedio que tambien tiene dos opciones o codigo o salir
                                
                        switch (codigo) {
                            case "M1","M2","T1","T2","P1":
                                //Primer caso segundo switch
                                JOptionPane.showMessageDialog(null,
                                        "El codigo es elegido para los cálculos es: " + codigo);
                                
                                //bucle que repite la pedida de datos si no se encuentra entre los
                                // rangos limitados
                                do {
                                    precioMateriaPrima = Double.parseDouble
                                    (JOptionPane.showInputDialog
                                    ("Ahora introduce el precio de la materia prima"
                                            + ", debe estar entre 0.1 y 1"));
                                    
                                    //Condicion que salta mensaje si no se cumple los requisitos de
                                    //entrada
                                    if (precioMateriaPrima < COSTE_MINIMO_MATERIA_PRIMA
                                            || precioMateriaPrima > COSTE_MAXIMO_MATERIA_PRIMA) {
                                        JOptionPane.showMessageDialog(null,
                                                "Precio incorrecto, repita");
                                    }

                                } while (precioMateriaPrima < COSTE_MINIMO_MATERIA_PRIMA
                                        || precioMateriaPrima > COSTE_MAXIMO_MATERIA_PRIMA);
                                
                                //bucle que repite la pedida de datos si no se encuentra entre los
                                // rangos limitados
                                
                                do {
                                    precioManoObra = Double.parseDouble
                                    (JOptionPane.showInputDialog
                                    ("Ahora introduce el precio de la mano de obra"
                                            + ", debe estar entre 0.5 y 0.9"));
                                    
                                    //Condicion que salta mensaje si no se cumple los requisitos de
                                    //entrada
                                    if (precioManoObra < COSTE_MINIMO_MANO_OBRA
                                            || precioManoObra > COSTE_MAXIMO_MANO_OBRA) {
                                        JOptionPane.showMessageDialog(null,
                                                "Precio incorrecto, repita");
                                    }

                                } while (precioManoObra < COSTE_MINIMO_MANO_OBRA
                                        || precioManoObra > COSTE_MAXIMO_MANO_OBRA);
                                
                                //Inicializacion de variable para usarla
                                costeProduccion = precioManoObra + precioMateriaPrima;

                                JOptionPane.showMessageDialog(null,
                                        "El coste de produccion del código " + codigo+" es: "
                                        + String.format("%.2f", costeProduccion) + "€");
                                        //String format para delimitar los decimales a 2
                                
                                //Ultimo switch para diferenciar el precio de venta unitaria
                                //entre codigos
                                switch (codigo) {
                                    case "M1","M2","P1":
                                        //primer caso tercer switch
                                        costeVentaUnitaria = costeProduccion + costeProduccion
                                                * PORCENTAJE_VENTA_UNITARIA_M1_M2_P1;

                                        break;
                                    default:
                                        //equivalente al segundo caso tercer switch
                                        //ya qur ya filtramos la entrada de datos anteriormente
                                        costeVentaUnitaria = costeProduccion + costeProduccion
                                                * PORCENTAJE_VENTA_RESTO_ARTICULOS;
                                }
                                
                                JOptionPane.showMessageDialog(null,
                                        "El coste de venta unitaria del código " + codigo+" es: "
                                        + String.format("%.2f",costeVentaUnitaria ) + "€");
                                
                                //Inicializacion de variable que nos va a servir para calcular las
                                //unidades necesarias para obterner beneficio
                                unidadesParaObtenerBeneficio=Math.ceil(PRECIO_BENEFICIO/
                                        (costeVentaUnitaria-costeProduccion));
                                
                                JOptionPane.showMessageDialog(null, 
                                        "El numero de unidades para el beneficio son: "
                                                +(int)unidadesParaObtenerBeneficio+ " unidades");
                                break;
                            case "salir":
                                //Segundo caso segundo switch
                                JOptionPane.showMessageDialog(null,
                                        "Programa finalizado");
                                
                               
                                break;
                            default:
                                JOptionPane.showMessageDialog(null,
                                        "Código inexsistente, introduzca un códgo válido");

                        }

                    } while (!codigo.equals("salir") && !((codigo.equals("M1")
                            || codigo.equals("M2")
                            || codigo.equals("T1")
                            || codigo.equals("T2")
                            || codigo.equals("P1"))));

                    break;

                case "salir":
                    //Segundo caso primer switch
                     JOptionPane.showMessageDialog(null,
                                        "Programa finalizado");
                    break;

                default:
                     JOptionPane.showMessageDialog(null,
                                        "Error, vuelva a intentarlo");
            }

        } while (!opcion.equals("salir")&&!codigo.equalsIgnoreCase("salir"));
    }   //Condicion para que se repita en el caso de que la variable opcion
    //ni la variable codigo sea salir

}
