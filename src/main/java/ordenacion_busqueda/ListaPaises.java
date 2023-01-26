
package ordenacion_busqueda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


/**
 *
 * @author juandi
 */
public class ListaPaises {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        List<Pais> paises= new ArrayList<>();
        
        paises.add(new Pais("España", 46, 505_400, "Euro"));
        paises.add(new Pais("Portugal", 23, 25_400, "Euro"));
        paises.add(new Pais("EE.UU", 146, 1_505_400, "Dollar"));
        paises.add(new Pais("Italia", 46, 505_400, "Euro"));
        
        paises.forEach(System.out::println);
        
        Collections.sort(paises);
        System.out.println("");
        paises.forEach(System.out::println);
        
        Collections.sort(paises, (p1,p2)-> Long.compare(p1.getPoblacion(), p2.getPoblacion()));
        System.out.println("");
        paises.forEach(System.out::println);
    }
    
}
