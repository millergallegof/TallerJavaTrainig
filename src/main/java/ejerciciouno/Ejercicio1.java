package ejerciciouno;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
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
        Scanner scanner = new Scanner(System.in);
        Logger logger = Logger.getLogger(Ejercicio1.class.getName());

        ArrayList<Double> numeros = new ArrayList<>();

        logger.log(Level.INFO, "ingrese el dato 1");
        Double numero1 = scanner.nextDouble();
        logger.log(Level.INFO, "ingrese el dato 2");
        Double numero2 = scanner.nextDouble();

        numeros.add(numero1);
        numeros.add(numero2);

        Collections.sort(numeros);

        if (numeros.get(0).equals(numeros.get(1))){
            logger.log(Level.INFO, "los 2 numeros son iguales");
        } else {
            logger.log(Level.INFO, """
                            sus datos ordenados son:
                            dato 1:------- {0} -------
                            dato 2:------- {1} -------
                            """,
                    new Object[]{numeros.get(0), numeros.get(1)});
        }
    }
}
