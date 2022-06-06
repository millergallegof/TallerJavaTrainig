package ejerciciodieciocho.utilities;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * [Clase con la que se busca implementar diferentes mensajes que seran imprimidos en consola para que el usuario interactue]
 *
 * @author Miller Esteban Gallego Forero - miller.gallegof@gmail.com
 * @version 1.0.0
 * @since [1.0.0]
 */
public class Mensajes {

    Logger loggerMensaje = Logger.getLogger(Mensajes.class.getName());

    /**
     * [Constructor vacio.
     * <p>
     * Mensaje mensaje = new Mensaje();
     * ]
     *
     * @author Miller Esteban Gallego Forero - miller.gallegof@gmail.com
     * @since [1.0.0]
     */
    public Mensajes() {
//        Vacio ya que no es necesario manejar atributos
    }

    /**
     * [ imprimer el error
     * <p>
     * mensaje.mostrarSeriesEntregadas();
     * ]
     *
     * @param mensaje error
     *
     * @author Miller Esteban Gallego Forero - miller.gallegof@gmail.com
     * @since [1.0.0]
     */
    public void mostrarExepcion(String mensaje) {
        loggerMensaje.log(Level.INFO, "Error: {0} ", mensaje);
    }

    /**
     * [ imprime un atributo especifico de el objeto que es enviado por parametro
     * <p>
     * mensaje.mostrarSeriesEntregadas();
     * ]
     *
     * @param serie elemento tipo serie
     *
     * @author Miller Esteban Gallego Forero - miller.gallegof@gmail.com
     * @since [1.0.0]
     */
    public void mostrarSeriesEntregadas(Serie serie) {
        loggerMensaje.log(Level.INFO, "la serie entregada es: {0} ", serie.getTitle());
    }

    /**
     * [imprime un atributo especifico de el objeto que es enviado por parametro
     * <p>
     * mensaje.mostrarJuegosEntregadas();
     * ]
     *
     * @param videoGame dato el cual se va a mostrar en consola
     *
     * @author Miller Esteban Gallego Forero - miller.gallegof@gmail.com
     * @since [1.0.0]
     */
    public void mostrarJuegosEntregadas(VideoGame videoGame) {
        loggerMensaje.log(Level.INFO, "El video juego entregado es: {0} ", videoGame.getTitle());
    }

    /**
     * [ imprime un atributo especifico de el objeto que es enviado por parametro
     * <p>
     * mensaje.mostrarSerieMayor();
     * ]
     *
     * @param serie elemento tipo serie
     *
     * @author Miller Esteban Gallego Forero - miller.gallegof@gmail.com
     * @since [1.0.0]
     */
    public void mostrarSerieMayor(String serie) {
        loggerMensaje.log(Level.INFO, "la serie con mas temporadas es: {0} ", serie);
    }

    /**
     * [imprime un atributo especifico de el objeto que es enviado por parametro
     * <p>
     * mensaje.mostrarJuegosMayor();
     * ]
     *
     * @param videoGame dato el cual se va a mostrar en consola
     *
     * @author Miller Esteban Gallego Forero - miller.gallegof@gmail.com
     * @since [1.0.0]
     */
    public void mostrarJuegosMayor(String videoGame) {
        loggerMensaje.log(Level.INFO, "el juego con mas horas es {0} ", videoGame);
    }

}
