package ejerciciocatorce.utilities;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * [Clase con la que se imprimen los numeros hasta 1000 de 2 en 2
 * Lista lista = new Lista()]
 *
 * @version 1.0.0
 *
 * @author Miller Esteban Gallego Forero - miller.gallegof@gmail.com
 *
 * @since [1.0.0]
 *
 */
public class Lista {

    /**
     * [ Imprime en consola y selecciona los numeros desde el dato inicial hasta 1000 de 2 en 2
     *
     * lista.mostrarNumero
     * ]
     *
     * @param limite dato de tipo integer que indica desde que numero comienza el listado
     *
     * @author Miller Esteban Gallego Forero - miller.gallegof@gmail.com
     *
     * @since [1.0.0]
     *
     *
     */
    public void mostrarNumeros(Integer limite) {
        Logger logger = Logger.getLogger(Lista.class.getName());
        for (int i = limite; i <= 1000; i += 2) {
            logger.log(Level.INFO, "{0}", i);
        }

    }
}
