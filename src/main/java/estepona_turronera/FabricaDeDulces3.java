package estepona_turronera;

import javax.swing.JOptionPane;

public class FabricaDeDulces3 {

    public static void main(String[] args) {

        mostrarPrograma();

    }

    //Este metodo contiene el programa
    private static void mostrarPrograma() {

        String opcion;//Variable en la que vamos a almacenar la opcion escrita
        String codigoDulce = "";

        final int PRECIO_BENEFICIO = 2500;
        //Precio fijo delimitado para calcular la unidades que se necesitan para
        //llegar a esa cantidad

        double unidadesParaObtenerBeneficio;

        double precioMateriaPrima;
        double precioManoObra;
        double costeProduccion;
        double costeVentaUnitaria;
        
        
        //Bucle general que se repite mientras la opcion y el codigo sean
        //distintos de salir
        do {
            
            
            //En la variable opcion guardamos el valor que nos devuelve el
            //método mostrarMenuPedirOpcion
            opcion = mostrarMenuPedirOpcion();

            if (opcion == null) {
                System.exit(0);
            }
            //Salimos del programa si pulsamos cancelar ya que al hacerlo la
            //variable se convierte nula y nos salta una excepción

            opcion = opcion.toLowerCase();
            //Aqui convertimos el contenido de la variable en minúscula para que
            //si escribimos en mayúsculas nos lo transforme para que así entre 
            //en lo case del switch

            switch (opcion) {
                case "calcular":
                    
                    
                    //Guardamos en la variable el valor ya filtrado en el método
                    //filtrarCodigoDulce
                    codigoDulce = filtrarCodigoDulce();
                    //Dependiendo de su valor entra en un case o en otro.
                    //Si es salir entra en el case salir y muestra el mensaje de
                    //programa finalizado y se sale del bucle ya que la
                    //condición lo indica
                    
                    //En el otro caso el programa continua con los demás métodos
                    
                    switch (codigoDulce) {
                        case "M1","M2","T1","T2","P1":

                            precioMateriaPrima = filtrarCosteMateriaPrima();

                            precioManoObra = filtrarCosteManoObra();

                            costeProduccion = calcularCosteProduccion(precioMateriaPrima,
                                    precioManoObra, codigoDulce);

                            costeVentaUnitaria = calcularCosteVentaUnitaria(costeProduccion, codigoDulce);

                            unidadesParaObtenerBeneficio = calcularUnidadesParaObtenerBeneficios(costeProduccion, costeVentaUnitaria, PRECIO_BENEFICIO);
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
                    //Mensaje que salta en pantalla si introducimos alguna
                    //opción distinta a la de los case
                    JOptionPane.showMessageDialog(null,
                            "Error, vuelva a intentarlo");
            }
            
            
            //Condición que hace que se repita si opcion o codigo no es salir
        } while (!opcion.equalsIgnoreCase("salir")
                && !codigoDulce.equalsIgnoreCase("salir"));

    }

    //Este método muestra el menu de opciones a la vez que te pide la opcion
    // al escribir la opcion esta se devuelve mediante el return
    private static String mostrarMenuPedirOpcion() {

        //Variable menu que guarda un tectblock sobre el menú principal del código
        String menu = """
                       Menú de opciones
                        ----------------
                        Calcular viabilidad de productos
                        Salir
                        ----------------
                       """;
        //Devuelve el String que escribimos por teclado
        return JOptionPane.showInputDialog(null, menu + "\nIntroduce una opcion\n"
                + "Calcular para seguir, salir o cancelar para terminar");

    }

    //Este método te muestra los códigos de dulces disponibles a la vez que te
    //pide que escribas el código que le quieras a hacer los calculos
    //también devuelve el código que has escrito que se guardara en una variable
    //temporal en el método filtrarCodigoDulce
    private static String leerCodigoDulce() {

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
    
    
    
    //Este método filtra el código para que sea salir o uno de los códigos 
    //disponibles
    private static String filtrarCodigoDulce() {
        //Variable temporal para guardar el código
        String codigo = "";
        
        
            //Bucle que se repite para cuando la introducción del código sea 
            //distinto de salir tanto como de los códigos disponibles
        do {
            //la variable código guarda el valor que devuelve el método leerCodigoDulce
            codigo = leerCodigoDulce();

            if (codigo == null) {
                System.exit(0);
            }
            //Salimos del programa si pulsamos cancelar ya que al hacerlo la
            //variable se convierte nula y nos salta una excepción

            //Esta condición muestra un mensaje si el código es distinto 
            //de salir tanto como de los códigos disponibles
            if ((!codigo.equals("salir") && !(codigo.equals("M1")
                    || codigo.equals("M2")
                    || codigo.equals("T1")
                    || codigo.equals("T2")
                    || codigo.equals("P1")))) {
                //Mensaje que se muestra
                JOptionPane.showMessageDialog(null, "Codigo Icorrecto");
            }
            
            
            
            //Condición del bucle
        } while (!codigo.equals("salir") && !((codigo.equals("M1")
                || codigo.equals("M2")
                || codigo.equals("T1")
                || codigo.equals("T2")
                || codigo.equals("P1"))));
        
        
        //Aqui devuelve ya el código filtrado, o puede ser salir o algunos de
        //los códigos dispinibles
        return codigo;

    }
    
    
    
    
    //Este método te muestra entre que precio debe estar el coste de la materia
    //prima, devuelve el velor que escribas por teclado
    //Este valor se guardara en una variable temporal en el método
    //filtrarCosteMateriaPrima
    private static String leerCosteMateriaPrima() {

        return JOptionPane.showInputDialog("Introduce el precio de la materia prima"
                + ", debe estar entre 0.1 y 1");

    }
    
    
    
    

    private static double filtrarCosteMateriaPrima() {
        
        //Variable temporal para guardar el valor recibido por el método
        //leerCosteMateriaPrima
        double costeMateriaPrima = 0;
        
        //Constantes para marcar el máximo y el mínimo permitido de introducción
        //de coste de materia prima
        final double COSTE_MINIMO_MATERIA_PRIMA = 0.1;
        final double COSTE_MAXIMO_MATERIA_PRIMA = 1.0;
        
        //Variable booleana para usar en el bucle de pedida de datos si no son
        //correctos
        boolean seguir;
        
        //Primer bucle para filtro de rango del coste de materia prima
        do {
            
            //Inicializamos a true
            seguir = true;
            
            //Segundo bucle que se repite si se introduce valores no numéricos
            do {
                
                //Try catch para controlar que al hacer la conversión de String
                //a double no haya un error de introducción de carácteres
                //alfabéticos para transformarlos en números
                
                try {
                    costeMateriaPrima = Double.parseDouble(leerCosteMateriaPrima());
                    
                    //Ponemos la booleana a false si el dato es correcto para
                    //salir del primer bucle
                    seguir = false;
                } catch (NumberFormatException nfe) {
                    
                    //Mensaje que salta si hay error de introducción
                    JOptionPane.showMessageDialog(null,
                            "No has introducido un valor numerico");
                }

            } while (seguir);
            
            //Condición que usamos para que salte un mensaje si el dato es 
            //de valor numérico pero no se encuentra entre el rango
            //predeterminado
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

    private static double calcularCosteVentaUnitaria(double costeProduccion, String codigo) {

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
                "El coste de venta unitaria del código " + codigo + " es: "
                + String.format("%.2f", costeVentaUnitaria) + "€");

        return costeVentaUnitaria;

    }

    private static int calcularUnidadesParaObtenerBeneficios(double costeProduccion, double costeVentaUnitaria, double precioBeneficio) {

        double unidadesParaBeneficio;

        unidadesParaBeneficio = Math.ceil(precioBeneficio
                / (costeVentaUnitaria - costeProduccion));

        JOptionPane.showMessageDialog(null,
                "El numero de unidades para el beneficio son: "
                + (int) unidadesParaBeneficio + " unidades");

        return (int) unidadesParaBeneficio;

    }
}
