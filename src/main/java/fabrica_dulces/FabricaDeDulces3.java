package fabrica_dulces;

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
                            
                            //En esta variable se almacena el valor devuelto por
                            //el método filtrarCosteMateriaPrima
                            precioMateriaPrima = filtrarCosteMateriaPrima();
                            
                            
                            //En esta variable se almacena el valor devuelto por
                            //el método filtrarCosteManoObra
                            precioManoObra = filtrarCosteManoObra();
                            
                            //En esta variable se almacena el valor devuelto por
                            //el método calcularCosteProduccion
                            costeProduccion = calcularCosteProduccion(
                                    precioMateriaPrima,
                                    precioManoObra,
                                    codigoDulce);

                            
                            //En esta variable se almacena el valor devuelto por
                            //el método calcularCosteVentaUnitaria
                            costeVentaUnitaria = calcularCosteVentaUnitaria(
                                    costeProduccion,
                                    codigoDulce);
                            
                            
                            //En esta variable se almacena el valor devuelto por
                            //el método calcularUnidadesParaObtenerBeneficios
                            unidadesParaObtenerBeneficio =
                                         calcularUnidadesParaObtenerBeneficios(
                                            costeProduccion,
                                            costeVentaUnitaria,
                                            PRECIO_BENEFICIO);
                            break;
                        case "salir":
                            //Si codigo es salir salta este mensaje
                            JOptionPane.showMessageDialog(null,
                                    "Finalizando programa");
                            break;

                    }

                    break;

                case "salir":
                    //Si opcion es salir salta este mensaje
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

        //Variable menu que guarda un tectblock sobre el menú principal
        //del código
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
    //Devuelve un valor String que será guardado posteriormente en variables del
    //método mostrarPrograma
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
    //prima, devuelve el valor que escribas por teclado
    //Este valor se guardara en una variable temporal en el método
    //filtrarCosteMateriaPrima
    //Devuelve un valor String que será guardado posteriormente en variables del
    //método filtrarCosteMateriaPrima
    private static String leerCosteMateriaPrima() {

        return JOptionPane.showInputDialog("Introduce el precio de la materia prima"
                + ", debe estar entre 0.1 y 1");

    }
    
    
    
    
    //Este metodo lo usamos para filtrar la entrada de datos y se encuentre
    //entre los parámetros indicados
    //Cun bucle que llama al método leerCosteMateriaPrima cada vez que nos 
    //equivoquemos al introducir los datos, mas explicado en el interior del
    //método
    //Devuelve un valor double que será guardado posteriormente en variables del
    //método mostrarPrograma
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
            
            //Inicializamos a true, esto se hace ya que en el primer ciclo del
            //segundo bucle que contiene el try catch introducimos un valor
            // numérico la variable seguir = false linea 256, luego si el número 
            //no se comprende entre el rango predeterminado en el while del 
            // primer bucle se repite la entrada de datos porque no se cumple la
            //condicion, esta variable se quedaría a false , entonces al
            //repetir el bucle se saltaria código ya que al ser la variable 
            //seguir=false no entraría en el segundo bucle y habria errores en 
            //el programa
            
            seguir = true;
            
            //Segundo bucle que se repite si se introduce valores no numéricos
            do {
                
                //Try catch para controlar que al hacer la conversión de String
                //a double no haya un error de introducción de carácteres
                //alfabéticos para transformarlos en números
                
                try {
                    costeMateriaPrima =
                            Double.parseDouble(leerCosteMateriaPrima());
                    
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
            
            
            
            //Condición para que se repita el bucle si el numero no se encuentra
            //entre el rango
        } while (costeMateriaPrima < COSTE_MINIMO_MATERIA_PRIMA
                || costeMateriaPrima > COSTE_MAXIMO_MATERIA_PRIMA);
        
        //Aqui devolvemos el valor de la materia prima ya filtrado y correcto
        //Se guarda en una variable en el método mostrar programa
        return costeMateriaPrima;
    }
    
    
    
    
    
    //Este método te muestra entre que precio debe estar el coste de la mano de
    //obra, devuelve el valor que escribas por teclado
    //Este valor se guardara en una variable temporal en el método
    //filtrarCosteManoObra
    //Devuelve un valor String que será guardado posteriormente en variables del
    //método filtrarCosteManoObra
    private static String leerCosteManoObra() {

        return JOptionPane.showInputDialog("Introduce el precio de la mano de obra"
                + ", debe estar entre 0.5 y 0.9");
    }
    
    
    
    
    
    
    
    //Este metodo lo usamos para filtrar la entrada de datos y se encuentre
    //entre los parámetros indicados
    //Cun bucle que llama al método leerCosteManoObra cada vez que nos 
    //equivoquemos al introducir los datos, mas explicado en el interior del
    //método
    //Devuelve un valor double que será guardado posteriormente en variables del
    //método mostrarPrograma
    private static double filtrarCosteManoObra() {
        
        //Variable temporal para guardar el valor recibido por el método
        //leerCosteManoObra
        double costeManoObra = 0;
        
        
        //Constantes para marcar el máximo y el mínimo permitido de introducción
        //de coste de mano de obra
        final double COSTE_MINIMO_MANO_OBRA = 0.5;
        final double COSTE_MAXIMO_MANO_OBRA = 0.9;
        
        
        //Variable booleana para usar en el bucle de pedida de datos si no son
        //correctos
        boolean seguir;
        
         //Primer bucle para filtro de rango del coste de materia prima
        do {
            
            //Inicializamos a true, esto se hace ya que en el primer ciclo del
            //segundo bucle que contiene el try catch introducimos un valor
            // numérico la variable seguir = false linea 353, luego si el número 
            //no se comprende entre el rango predeterminado en el while del 
            // primer bucle se repite la entrada de datos porque no se cumple la
            //condicion, esta variable se quedaría a false , entonces al
            //repetir el bucle se saltaria código ya que al ser la variable 
            //seguir=false no entraría en el segundo bucle y habria errores en 
            //el programa
            
            seguir = true;
            
            //Segundo bucle que se repite si se introduce valores no numéricos
            do {
                
                //Try catch para controlar que al hacer la conversión de String
                //a double no haya un error de introducción de carácteres
                //alfabéticos para transformarlos en números
                
                try {
                    costeManoObra =
                            Double.parseDouble(leerCosteManoObra());
                    
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
            if (costeManoObra < COSTE_MINIMO_MANO_OBRA
                    || costeManoObra > COSTE_MAXIMO_MANO_OBRA) {
                JOptionPane.showMessageDialog(null,
                        "Precio incorrecto, repita");
            }
            
            
            
            //Condición para que se repita el bucle si el numero no se encuentra
            //entre el rango
        } while (costeManoObra < COSTE_MINIMO_MANO_OBRA
                || costeManoObra > COSTE_MAXIMO_MANO_OBRA);
        
        //Aqui devolvemos el valor de la mano de obra ya filtrado y correcto
        //Se guarda en una variable en el método mostrar programa
        

        return costeManoObra;

    }
    
    
    
    
    
    
    
    //Este metodo recibe por parámetros el coste de la materia prima y el 
    //coste de la mano de obra ya guardadas en variables en el método
    //mostrarPrograma e internamente hace los cálculos para obtener el 
    //coste de producción, tambíen se le pasa el código de producto, no es
    //necesario , se usa para compleatar código
    //Devuelve un valor double que será guardado posteriormente en variables del
    //método mostrarPrograma
    private static double calcularCosteProduccion(double materiaPrima, double manoDeObra, String codigo) {
        
        //Variable temporal para calcular la suma de los costes
        double costeProduccion = materiaPrima + manoDeObra;
        
        //Mensaje que muestra el coste de producción de ese "codigo concreto"
        JOptionPane.showMessageDialog(null,
                "El coste de producción del código " + codigo + " es: "
                + String.format("%.2f", costeProduccion) + "€");
        
        //devolvemos el valor que se almacenara en una variable en el método 
        //mostrarPrograma
        return costeProduccion;

    }

    
    
    
    //Este método recibe por parámetros el coste de producción del producto
    //y el código de producto ya guardado en variables en el método 
    //mostrarPrograma para calcular el coste de venta unitaria aquí el código de
    //producto si es necesario ya que dependiendo de cuál sea el coste cambia
    //Devuelve un valor double que será guardado posteriormente en variables del
    //método mostrarPrograma
    
    private static double calcularCosteVentaUnitaria(double costeProduccion, String codigo) {
        
        //Variable temporal para calcular el coste de venta unitaria
        double costeVentaUnitaria;
        
        //Variables constantes que tienen valor diferente según el código de
        //producto
        final double PORCENTAJE_VENTA_UNITARIA_M1_M2_P1 = 0.5;
        final double PORCENTAJE_VENTA_RESTO_ARTICULOS = 0.65;
        
        
        //Mediante este switch hacemos un pequeño filtrado para calcular el
        //coste de venta unitaria dependiendo del codigo de producto
        switch (codigo) {
            case "M1","M2","P1":
                //Formula para calcular el coste de venta unitaria
                costeVentaUnitaria = costeProduccion + costeProduccion
                        * PORCENTAJE_VENTA_UNITARIA_M1_M2_P1;

                break;
            default:
                //equivalente a otro case
                //ya que ya filtramos la entrada de datos anteriormente
                
                //Formula para calcular el coste de venta unitaria
                costeVentaUnitaria = costeProduccion + costeProduccion
                        * PORCENTAJE_VENTA_RESTO_ARTICULOS;
        }
        
        
        //Mensaje que muestra el precio de venta unitaria según el código
        //Limitamos los decimales a 2
        JOptionPane.showMessageDialog(null,
                "El coste de venta unitaria del código " + codigo + " es: "
                + String.format("%.2f", costeVentaUnitaria) + "€");
        
        //Devolvemos el valor que será guardada en una variable en el método
        //mostrarPrograma
        return costeVentaUnitaria;

    }
    
    
    
    //Este método recibe por parámetros el coste de producción, el coste de 
    //venta unitaria y el precio de beneficio y devuelve un valor tipo entero
    //Calcula el número de unidades necesarias para llegar al beneficio
    //internamente con la fórmula

    private static int calcularUnidadesParaObtenerBeneficios(double costeProduccion, double costeVentaUnitaria, double precioBeneficio) {
        
        //Variable temporal para guardar el número de dulces
        //Será guardada en una variable en el método mostrarPrograma
        double unidadesParaBeneficio;
        
        //Formula para calcular las unidades
        unidadesParaBeneficio = Math.ceil(precioBeneficio
                / (costeVentaUnitaria - costeProduccion));
        
        
        //Mensaje que muestra el numero de unidades necesarias
        JOptionPane.showMessageDialog(null,
                "El numero de unidades para el beneficio son: "
                + (int) unidadesParaBeneficio + " unidades");
        //Hacemos conversiones explícitas de int a double para que nos
        //devuelva valores enteros y no decimales
        return (int) unidadesParaBeneficio;
        
    }
}
