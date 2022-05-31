package ejercicionueve.utilietes;

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
    private String contenido;

    /**
     * [Constructor el cual cuenta con 1 atributo el cual esta dado por default.
     * <p>
     * Frase frase = new Frase();
     * ]
     *
     * @author Miller Esteban Gallego Forero - miller.gallegof@gmail.com
     * @since [1.0.0]
     */
    public Frase() {
        this.contenido = "La sonrisa sera la mejor arma contra la tristeza";
    }

    /**
     * [modifica una cadena de texto cambiandole la letra a por la letra e y lo muestra por consola.
     * <p>
     * frase.cambiarCaracteres();
     * ]
     *
     *
     * @author Miller Esteban Gallego Forero - miller.gallegof@gmail.com
     * @since [1.0.0]
     */
    public void cambiarCaracteres () {
        this.contenido = this.contenido.replace('a', 'e');
        logger.log(Level.INFO, "{0}", this.contenido);
    }

    /**
     * [concatena 2 diferentes cadenas de caracteres y los imprime por consola.
     * <p>
     * frase.agregarElementos();
     * ]
     *
     * @param complemento cadena de string que concatena a un mensaje ya establecido
     *
     * @author Miller Esteban Gallego Forero - miller.gallegof@gmail.com
     * @since [1.0.0]
     */
    public void agregarElementos (String complemento) {
        logger.log(Level.INFO, " {0}", this.contenido.concat(complemento));
    }
}
