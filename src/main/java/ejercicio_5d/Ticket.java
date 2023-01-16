
package ejercicio_5d;


import java.time.LocalDateTime;
import java.util.ArrayList;


public class Ticket {
    
    private LocalDateTime fecha;
    private Cinta cinta;

    public Ticket(Cinta cinta) {
        this.fecha = LocalDateTime.now();
        this.cinta = cinta;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public Cinta getCinta() {
        return cinta;
    }

    
    //toString modificado para qur nos salga el ticket como queremos
    public String toString() {
        return "---------------------------------------------------------------------------------------------------\n"+
               "                                    SuperMercado Cristobal                                            \n"+
               "Fecha: "+fecha.getDayOfMonth()+"/"+fecha.getMonthValue()+"/"+fecha.getYear()+""
                + "              Hora: "+fecha.getHour()+":"+fecha.getMinute()+"\n"+
               "---------------------------------------------------------------------------------------------------\n"+
                "Producto           Precio            Cantidad            IVA           Precio sin IVA\n"+
               "---------------------------------------------------------------------------------------------------\n"+
                cinta.generarListaProductosTicket()+
               "---------------------------------------------------------------------------------------------------\n"+
                cinta.generarStringTotal();
              
    }
    
    
    
}
