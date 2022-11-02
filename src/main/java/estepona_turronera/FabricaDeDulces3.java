package estepona_turronera;

import javax.swing.JOptionPane;

public class FabricaDeDulces3 {

    public static void main(String[] args) {

        mostrarPrograma();
    }

    private static void mostrarPrograma() {

        String opcion;
        String codigoDulce = "";

        

        final int PRECIO_BENEFICIO = 2500;

        double unidadesParaObtenerBeneficio;

        double precioMateriaPrima;
        double precioManoObra;
        double costeProduccion;
        double costeVentaUnitaria;

        do {

            opcion = mostrarMenuPedirOpcion();
            opcion = opcion.toLowerCase();

            switch (opcion) {
                case "calcular":

                    codigoDulce = filtrarCodigoDulce();
                    switch (codigoDulce) {
                        case "M1","M2","T1","T2","P1":

                            precioMateriaPrima = filtrarCosteMateriaPrima();

                            precioManoObra = filtrarCosteManoObra();

                            costeProduccion = calcularCosteProduccion(precioMateriaPrima,
                                    precioManoObra, codigoDulce);
                            
                            costeVentaUnitaria=calcularCosteVentaUnitaria(costeProduccion, codigoDulce);
                            
                            unidadesParaObtenerBeneficio=calcularUnidadesParaObtenerBeneficios(costeProduccion, costeVentaUnitaria, PRECIO_BENEFICIO);
                            break;
                        case "salir":
                            JOptionPane.showMessageDialog(null,
                                    "Finalizando programa");
                            break;

                    }

                    break;

                case "salir":

                    JOptionPane.showMessageDialog(null,
                            "Programa finalizado");

                    break;
                default:
                    JOptionPane.showMessageDialog(null,
                            "Error, vuelva a intentarlo");
            }
        } while (!opcion.equalsIgnoreCase("salir") && !codigoDulce.equalsIgnoreCase("salir"));

    }

    private static String mostrarMenuPedirOpcion() {

        String menu = """
                       Menú de opciones
                        ----------------
                        Calcular viabilidad de productos
                        Salir
                        ----------------
                       """;

        return JOptionPane.showInputDialog(null, menu + "\nIntroduce una opcion");

    }

    private static String leerCodigoDulce() {

        return JOptionPane.showInputDialog("Introduce un codigo. \n"
                + "Los códigos disponibles son:\n\n"
                + " M1(Mantecado de Limón)\n"
                + " M2(Mazapanes)\n"
                + " T1(Turrón de chocolate)\n"
                + " T2(Turrón clásico)\n"
                + " P1(Polvorones)\n \n"
                + "Para terminar el programa escriba salir"
        );

    }

    private static String filtrarCodigoDulce() {

        String codigo = "";

        do {

            codigo = leerCodigoDulce();

            if ((!codigo.equals("salir") && !(codigo.equals("M1")
                    || codigo.equals("M2")
                    || codigo.equals("T1")
                    || codigo.equals("T2")
                    || codigo.equals("P1")))) {
                JOptionPane.showMessageDialog(null, "Codigo Icorrecto");
            }

            if (codigo.isEmpty()) {
                codigo = "salir";
            }

        } while (!codigo.equals("salir") && !((codigo.equals("M1")
                || codigo.equals("M2")
                || codigo.equals("T1")
                || codigo.equals("T2")
                || codigo.equals("P1"))));

        return codigo;

    }

    private static String leerCosteMateriaPrima() {

        return JOptionPane.showInputDialog("Introduce el precio de la materia prima"
                + ", debe estar entre 0.1 y 1");

    }

    private static double filtrarCosteMateriaPrima() {

        double costeMateriaPrima = 0;
        final double COSTE_MINIMO_MATERIA_PRIMA = 0.1;
        final double COSTE_MAXIMO_MATERIA_PRIMA = 1.0;
        boolean seguir;
        do {
            seguir = true;
            do {

                try {
                    costeMateriaPrima = Double.parseDouble(leerCosteMateriaPrima());
                    seguir = false;
                } catch (NumberFormatException nfe) {
                    JOptionPane.showMessageDialog(null,
                            "No has introducido un valor numerico");
                }

            } while (seguir);

            if (costeMateriaPrima < COSTE_MINIMO_MATERIA_PRIMA
                    || costeMateriaPrima > COSTE_MAXIMO_MATERIA_PRIMA) {
                JOptionPane.showMessageDialog(null,
                        "Precio incorrecto, repita");
            }

        } while (costeMateriaPrima < COSTE_MINIMO_MATERIA_PRIMA
                || costeMateriaPrima > COSTE_MAXIMO_MATERIA_PRIMA);

        return costeMateriaPrima;
    }

    private static String leerCosteManoObra() {

        return JOptionPane.showInputDialog("Introduce el precio de la mano de obra"
                + ", debe estar entre 0.5 y 0.9");
    }

    private static double filtrarCosteManoObra() {

        double costeManoObra = 0;
        final double COSTE_MINIMO_MANO_OBRA = 0.5;
        final double COSTE_MAXIMO_MANO_OBRA = 0.9;
        boolean seguir;
        do {
            seguir = true;
            do {

                try {
                    costeManoObra = Double.parseDouble(leerCosteManoObra());
                    seguir = false;
                } catch (NumberFormatException nfe) {
                    JOptionPane.showMessageDialog(null,
                            "No has introducido un valor numerico");
                }

            } while (seguir);

            if (costeManoObra < COSTE_MINIMO_MANO_OBRA
                    || costeManoObra > COSTE_MAXIMO_MANO_OBRA) {
                JOptionPane.showMessageDialog(null,
                        "Precio incorrecto, repita");
            }

        } while (costeManoObra < COSTE_MINIMO_MANO_OBRA
                || costeManoObra > COSTE_MAXIMO_MANO_OBRA);

        return costeManoObra;

    }

    private static double calcularCosteProduccion(double materiaPrima, double manoDeObra, String codigo) {

        double costeProduccion = materiaPrima + manoDeObra;

        JOptionPane.showMessageDialog(null,
                "El coste de producción del código " + codigo + " es: "
                + String.format("%.2f", costeProduccion) + "€");

        return costeProduccion;

    }
    
    private static double calcularCosteVentaUnitaria(double costeProduccion,String codigo){
    
    double costeVentaUnitaria;
    final double PORCENTAJE_VENTA_UNITARIA_M1_M2_P1 = 0.5;
    final double PORCENTAJE_VENTA_RESTO_ARTICULOS = 0.65;
    
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
    
    return costeVentaUnitaria;
    
    }
    
    private static int calcularUnidadesParaObtenerBeneficios(double costeProduccion,double costeVentaUnitaria,double precioBeneficio){
    
    double unidadesParaBeneficio;
    
    unidadesParaBeneficio=Math.ceil(precioBeneficio/
                                        (costeVentaUnitaria-costeProduccion));
    
    
    
    JOptionPane.showMessageDialog(null, 
                                        "El numero de unidades para el beneficio son: "
                                                +(int)unidadesParaBeneficio+ " unidades");
    
    
    
    return (int)unidadesParaBeneficio;
    
    }
}
