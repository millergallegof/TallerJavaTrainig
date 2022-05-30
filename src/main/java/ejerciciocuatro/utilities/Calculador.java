package ejerciciocuatro.utilities;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * [Clase con la que calcula el valor total de un producto dependiendo una tasa de impuesto predeterminada]
 *
 * @version 1.0.0
 *
 * @author Miller Esteban Gallego Forero - miller.gallegof@gmail.com
 *
 * @since [1.0.0]
 *
 */
public class Calculador {
    Logger loggerCalculador = Logger.getLogger(Calculador.class.getName());
    private final Double valorIva;

    /**
     * [Constructor que no requiere parametros, pero que tiene por defecto el valor de un atributo de la clase.
     *
     * Calculador calculador = new Calculador();
     * ]
     *
     *
     * @author Miller Esteban Gallego Forero - miller.gallegof@gmail.com
     *
     * @since [1.0.0]
     *
     *
     */
    public Calculador() {
        this.valorIva = 21.0;
    }


    /**
     * [Calcular el valor total a pagagar de un producto, recibe el valor base y le calcula
     *          la tasa de impuesto calculando de este modo el tolat a pagar
     *
     *    calculador.clacularValorPagar(valorBase);
     * ]
     *
     * @param precioProducto valor el cual se la calcula el impuesto
     *
     * @author Miller Esteban Gallego Forero - miller.gallegof@gmail.com
     *
     * @since [1.0.0]
     *
     *
     *
     */
    public void calcularValorPagar (Double precioProducto) {
        Double totalPagar = precioProducto * (this.valorIva / 100) + precioProducto;
        loggerCalculador.log(Level.INFO, "el valor total a pagar es: {0}", totalPagar);
    }


}
