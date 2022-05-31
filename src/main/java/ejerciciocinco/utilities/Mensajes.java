package ejerciciocinco.utilities;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * [Clase con la que se busca implementar diferentes mensajes que seran imprimidos en consola para que el usuario interactue]
 *
 * @version 1.0.0
 *
 * @author Miller Esteban Gallego Forero - miller.gallegof@gmail.com
 *
 * @since [1.0.0]
 *
 */
public class Mensajes {

    Logger loggerMensaje = Logger.getLogger(Mensajes.class.getName());

    /**
     * [Constructor vacio.
     *
     * Mensaje mensaje = new Mensaje();
     * ]
     *
     *
     * @author Miller Esteban Gallego Forero - miller.gallegof@gmail.com
     *
     * @since [1.0.0]
     *
     *
     */
    public Mensajes() {
//        Vacio ya que no es necesario manejar atributos
    }

    /**
     * [enviar por consola mensaje para que el usuario interactue con el programa.
     *
     * mensaje.solicitarDato();
     * ]
     *
     *
     * @author Miller Esteban Gallego Forero - miller.gallegof@gmail.com
     *
     * @since [1.0.0]
     *
     *
     */
    public void solicitarDato() {
        loggerMensaje.log(Level.INFO, "ingrese hasta que numero desea ver los numeros impares: ");
    }


}
