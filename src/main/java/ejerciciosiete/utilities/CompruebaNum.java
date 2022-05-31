package ejerciciosiete.utilities;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * [Clase con la que se valida si un numero ingresado por consola es mayor que 0]
 *
 * @version 1.0.0
 *
 * @author Miller Esteban Gallego Forero - miller.gallegof@gmail.com
 *
 * @since [1.0.0]
 *
 */
public class CompruebaNum {

    /**
     * [Constructor vacio.
     *
     * CompruebaNum nomobjeto = new compruebaNum();
     * ]
     *
     *
     * @author Miller Esteban Gallego Forero - miller.gallegof@gmail.com
     *
     * @since [1.0.0]
     *
     *
     */
    public CompruebaNum() {
//        no es necesario tner atributos
    }

    /**
     * [valida si un numero que se ingresa por consola es mayor a 0, si no lo es solicita nuevamente un valor al usuario.
     *
     * nombreObjeto.compararNum();
     * ]
     *
     *
     * @author Miller Esteban Gallego Forero - miller.gallegof@gmail.com
     *
     * @since [1.0.0]
     *
     *
     */
    public void compararNum() {
        int numero;
        Logger logger = Logger.getLogger(CompruebaNum.class.getName());
        MyScanner myScanner = new MyScanner();
        Mensajes mensajes = new Mensajes();
        do {
            mensajes.solicitarDato();
            numero = myScanner.getInteger();
            if (numero >= 0) {
                logger.log(Level.INFO, "su numero es: {0}", numero);
            }

        } while (numero < 0);
    }
}
