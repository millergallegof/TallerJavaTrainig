package ejerciciouno;

import java.util.ArrayList;
import java.util.Collections;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * [Clase principal, la cual contiene el metodo main]
 *
 * @author Miller Esteban Gallego Forero - miller.gallegof@gmail.com
 * @version 1.0.0
 * @since Esta presente desde la version 1.0.0
 */
public class Ejercicio1 {
    /**
     * [Metodo principal, el cual hace la operacion de comparar 2 numeros y ordenarlos de mayor a menor.]
     *
     * @param args argumentos que recibe por defecto el método principal
     * @author Miller Esteban Gallego Forero - miller.gallegof@gmail.com
     * @since [1.0.0]
     */
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(Ejercicio1.class.getName());

        ArrayList<Double> lista = new ArrayList<>();

        Double dato1 = 5.0;
        Double dato2 = 10.0;

        lista.add(dato1);
        lista.add(dato2);

        Collections.sort(lista);

        if (lista.get(0).equals(lista.get(1))){
            logger.log(Level.INFO, "los 2 lista son iguales");
        } else {
            logger.log(Level.INFO, """
                            sus datos ordenados son:
                            dato 1:------- {0} -------
                            dato 2:------- {1} -------
                            """,
                    new Object[]{lista.get(0), lista.get(1)});
        }
    }
}
