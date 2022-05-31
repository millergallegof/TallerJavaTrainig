package ejercicioonce.utilities;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * [Clase con la que se ejecutan diferentes metodos para contar String]
 *
 * @author Miller Esteban Gallego Forero - miller.gallegof@gmail.com
 * @version 1.0.0
 * @since [1.0.0]
 */
public class Frase {
    Logger logger = Logger.getLogger(Frase.class.getName());

    /**
     * [cuenta cuantos numeros de caracteres tiene un elemento String.
     * <p>
     * frase.contarTotal();
     * ]
     *
     * @param frase elemento al que se le van a contar los caracteres
     *
     * @author Miller Esteban Gallego Forero - miller.gallegof@gmail.com
     * @since [1.0.0]
     */
    public void contarTotal(String frase) {
        logger.log(Level.INFO, "la frase: |{0}| tiene {1} caracteres", new Object[] {frase, frase.length()});
    }

    /**
     * [cuenta el numero de vocales que tiene la frase que se le envia como parametro.
     * <p>
     * frase.contarVocal();
     * ]
     *
     *
     * @param frase cadena de string que concatena a un mensaje ya establecido
     *
     * @author Miller Esteban Gallego Forero - miller.gallegof@gmail.com
     * @since [1.0.0]
     */
    public void contarVocal(String frase) {
        Map<String, Integer> vocales = new HashMap<>();
        vocales.put("a", 0);
        vocales.put("e", 0);
        vocales.put("i", 0);
        vocales.put("o", 0);
        vocales.put("u", 0);

        for (char letra: frase.toCharArray()) {
            if ("aeiou".contains(String.valueOf(letra).toLowerCase())) {
                vocales.put(String.valueOf(letra).toLowerCase(), vocales.get(String.valueOf(letra).toLowerCase()) + 1);
            }
        }
        vocales.forEach((x, y) -> logger.log(Level.INFO, "la vocal {0} aparece {1}", new Object[] {x,y}));
    }
}
