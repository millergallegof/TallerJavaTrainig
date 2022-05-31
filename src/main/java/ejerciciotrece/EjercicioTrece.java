package ejerciciotrece;

import java.time.LocalDateTime;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * [Clase principal donde se ejecuta el metodo main]
 *
 * @author Miller Esteban Gallego Forero - miller.gallegof@gmail.com
 * @version 1.0.0
 * @since [1.0.0]
 */
public class EjercicioTrece {
    /**
     * [metodo principar por el cual se instancian los diferentes objetos para que el usuario pueda interactura con el programa]
     *
     * @param args parametros pro defecto del metdo main
     * @author Miller Esteban Gallego Forero - miller.gallegof@gmail.com
     * @since [1.0.0]
     */
    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.now();
        Logger logger = Logger.getLogger(EjercicioTrece.class.getName());

        logger.log(Level.INFO,"la fecha es: ({0}/{1}/{2}) ({3}:{4}:{5})",
                new Object[]{dateTime.getYear(), dateTime.getMonthValue(), dateTime.getDayOfMonth(),
                        dateTime.getHour(), dateTime.getMinute(), dateTime.getSecond()});
    }

}
