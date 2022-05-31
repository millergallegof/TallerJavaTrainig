package ejerciciodiez.utilietes;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * [Clase con la que se ejecutan diferentes metodos para modificar una cadena de String]
 *
 * @author Miller Esteban Gallego Forero - miller.gallegof@gmail.com
 * @version 1.0.0
 * @since [1.0.0]
 */
public class Frase {
    Logger logger = Logger.getLogger(Frase.class.getName());

    /**
     * [modifica una cadena de texto cambiandole el caracter " " por nada y lo muestra por consola.
     * <p>
     * frase.cambiarCaracteres();
     * ]
     *
     *
     * @author Miller Esteban Gallego Forero - miller.gallegof@gmail.com
     * @since [1.0.0]
     */
    public void cambiarCaracteres (String frase) {
        frase = frase.replace(" ", "");
        logger.log(Level.INFO, "{0}", frase);
    }

}
