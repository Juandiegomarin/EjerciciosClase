package fabrica_dulces;

import javax.swing.JOptionPane;

public class FabricaDeDulces {

    public static void main(String[] args) {

        final double COSTE_MANO_DE_OBRA_M1_T1 = 0.15;
        final double COSTE_MANO_DE_OBRA_M2_T2_P1 = 0.22;

        final double PORCENTAJE_VENTA_UNITARIA_M1_M2_P1 = 0.5;
        final double PORCENTAJE_VENTA_RESTO_ARTICULOS = 0.65;

        double costeMateriaPrima;
        String costeMateriaPrimaString;

        double costeProduccion = 0;
        double costeVentaUnitaria;
        
        final int BENEFICIO=2500;
        double numeroUnidades;  //Para calcular cuantos dulces se necesita para conseguir 2500€

        String codigo;
        String menu = """
                    
        Bienvenido al programa de la estepona turronera
        Existen los siguientes códigos de dulces
                    
        M1 (Mantecado de Limón)
        M2 (Mazapanes)
        T1 (Turrón de chocolate)
        T2 (Turrón clásico)
        P1 (Polvorones)
        """;

        JOptionPane.showMessageDialog(null, menu);
        codigo = JOptionPane.showInputDialog(null,
                "Elige un código para calcular el coste de producción y"
                + " precio de venta unitaria");

        if (codigo.equals("M1")
                || codigo.equals("M2")
                || codigo.equals("T1")
                || codigo.equals("T2")
                || codigo.equals("P1")) {
            costeMateriaPrimaString = JOptionPane.showInputDialog(null,
                    "Ahora introduce el precio del coste de la materia prima");

            costeMateriaPrima = Double.parseDouble(costeMateriaPrimaString);

            if (costeMateriaPrima < 0.1 || costeMateriaPrima > 1) {
                JOptionPane.showMessageDialog(null,
                        "El precio de materia prima no es correcto");

                JOptionPane.showMessageDialog(null,
                        "Programa finalizado");
            } else {

                //Aqui calculamos el coste de produccion
                switch (codigo) {
                    case "M1","T1":

                        costeProduccion = costeMateriaPrima + COSTE_MANO_DE_OBRA_M1_T1;

                        break;
                    case "M2","T2","P1":

                        costeProduccion = costeMateriaPrima + COSTE_MANO_DE_OBRA_M2_T2_P1;

                        break;

                }

                //Ahora calculamos el precio de venta unitario
                switch (codigo) {
                    case "M1","M2","P1":

                        costeVentaUnitaria = costeProduccion + costeProduccion
                                * PORCENTAJE_VENTA_UNITARIA_M1_M2_P1;

                        break;
                    default:
                        costeVentaUnitaria = costeProduccion + costeProduccion
                                * PORCENTAJE_VENTA_RESTO_ARTICULOS;
                }
                numeroUnidades=Math.ceil(BENEFICIO/costeVentaUnitaria);
                
                JOptionPane.showMessageDialog(null,
                        "El coste de produccion de " + codigo + " es "
                        + String.format("%.2f", costeProduccion)
                        + "€  y el precio de" + " venta unitaria es "
                        + String.format("%.2f", costeVentaUnitaria) + "€");
                
                
                
                JOptionPane.showMessageDialog(null, 
                        "Para obtener beneficio de 2500€ se necesita es: "+numeroUnidades);
            }
        } else {
            JOptionPane.showMessageDialog(null,
                    "No existe ese código programa finalizado");
        }
    }

}
