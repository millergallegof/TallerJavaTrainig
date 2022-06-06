package ejerciciodieciocho.utilities;

/**
 * [Interfaz con la que se busca darle unos metodos determinados a diferentes clases
 *
 * @author Miller Esteban Gallego Forero - miller.galegof@gmail.com
 * @version [1.0.0]
 * @since [1.0.0]
 */
public interface Deliverable {

    /**
     * [metodo que indica que se entrego uno d elos objetos
     * ]
     *
     * @author Miller Esteban Gallego Forero - miller.gallegof@gmail.com
     * @since [1.0.0]
     */
    void deliver();

    /**
     * [metodo que indica que se devolvio uno de los objetos
     * ]
     *
     * @author Miller Esteban Gallego Forero - miller.gallegof@gmail.com
     * @since [1.0.0]
     */
    void returnNow();

    /**
     * [muestra si el elemetno ya se entrego
     * ]
     *
     * @author Miller Esteban Gallego Forero - miller.gallegof@gmail.com
     * @since [1.0.0]
     */
    boolean isDelivered();

    /**
     * [compara un atributo especifico del objeto indicando que objeto es mayor
     * ]
     *
     * @param a tipo de objeto por el que se compararan los atributos
     *
     * @author Miller Esteban Gallego Forero - miller.gallegof@gmail.com
     * @since [1.0.0]
     */
    Object compareTo(Object a);

}
