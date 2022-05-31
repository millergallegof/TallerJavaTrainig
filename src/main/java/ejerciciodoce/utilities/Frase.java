package ejerciciodoce.utilities;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * [Clase con la que se ejecutan diferentes metodos para comparar 2 palabras]
 *
 * @author Miller Esteban Gallego Forero - miller.gallegof@gmail.com
 * @version 1.0.0
 * @since [1.0.0]
 */
public class Frase {

    /**
     * [compara 2 palabras enviadas como parametros y arroja si las palabras son iguales, de lo contrario arroja las diferecias por consola.
     * <p>
     * frase.compararFrase(frase1, frase2);
     * ]
     *
     * @param frase1 palabra que va a ser comparada como primera instancia
     * @param frase2 palabra que sera comparada
     *
     * @author Miller Esteban Gallego Forero - miller.gallegof@gmail.com
     * @since [1.0.0]
     */
    public void compararFrase(String frase1, String frase2) {
        Logger logger = Logger.getLogger(Frase.class.getName());
        int contador =0;

        StringBuilder fraseDif = new StringBuilder();
        for (char caracter1 : frase1.toCharArray()) {
            int contadorDos =0;
            contador += 1;
            for (char caracter2 : frase2.toCharArray()) {
                contadorDos += 1;
                if (caracter1 != caracter2 && contador == contadorDos) {
                    fraseDif.append(caracter2);
                }
            }
            if ( contador > contadorDos) {
                fraseDif.append(caracter1);
            }
        }
        if (fraseDif.toString().equals("")) {
            logger.log(Level.INFO, "La palabra es la misma");
        } else {
            logger.log(Level.INFO, "La palabra es diferente y la diferencia es: {0}", fraseDif);
        }
    }

}
