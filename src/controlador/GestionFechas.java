
package controlador;

import com.toedter.calendar.JDateChooser;
import java.sql.Date;
import java.time.LocalDate;

/**
 *
 * @author acebin
 */
public class GestionFechas {
    
    public void limitarFecha(JDateChooser entrada, JDateChooser salida){
        entrada.setMinSelectableDate(Date.valueOf(LocalDate.now())); 
        salida.setMinSelectableDate(Date.valueOf(LocalDate.now().plusDays(1)));
    }
}
