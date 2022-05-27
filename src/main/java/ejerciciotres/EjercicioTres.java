package ejerciciotres;

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
public class EjercicioTres {
    /**
     * [Metodo principal, el cual hace la operacion de calcular el area de un circulo,
     * indicandole por consola al usuario que indique el radio exacto del circulo]
     *
     * @param args argumentos que recibe por defecto el método principal
     * @author Miller Esteban Gallego Forero - miller.gallegof@gmail.com
     * @since [1.0.0]
     */
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(EjercicioTres.class.getName());
        Scanner scanner = new Scanner(System.in);
        logger.log(Level.INFO, "Ingrese el valor del radio:");
        String radioString = scanner.nextLine();

        try {
            double radioNum = Double.parseDouble(radioString);
            double areaCirculo = Math.PI * Math.pow(radioNum, 2);
            logger.log(Level.INFO, "el area del circulo es de: {0}", areaCirculo);
        } catch (Exception e) {
            logger.log(Level.SEVERE, e.getMessage());
        }

    }
}
