package ejercicioocho.utilities;

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
     * [muestra por consola diferentes opciones para que el usuario ingrese una de ellas.
     * <p>
     * mensaje.solicitarInfo();
     * ]
     *
     * @author Miller Esteban Gallego Forero - miller.gallegof@gmail.com
     * @since [1.0.0]
     */
    public void solicitarInfo() {
        loggerMensaje.log(Level.INFO, """
                Ingrese un numero para indicar un dia de la semana:
                1. Lunes
                2. Martes
                3. Miercoles
                4. Jueves
                5. Viernes
                6. Sabado
                7. domingo
                """);
    }

    /**
     * [muestra por consola la concatenacion del parametro que se le envie y un texto informativo.
     * <p>
     * mensaje.mensajeDiaLAbrola("Lunes");
     * ]
     *
     * @param dia dato string que indica el dia que se esta evaluando
     *
     * @author Miller Esteban Gallego Forero - miller.gallegof@gmail.com
     * @since [1.0.0]
     */
    public void mensajeDiaLaboral(String dia) {
        loggerMensaje.log(Level.INFO, "el dia {0} un dia laboral", dia);
    }

    /**
     * [muestra por consola la concatenacion del parametro que se le envie y un texto informativo.
     * <p>
     * mensaje.mensajeDiaNoLAbrola("domingo");
     * ]
     *
     * @param dia dato string que indica el dia que se esta evaluando
     *
     * @author Miller Esteban Gallego Forero - miller.gallegof@gmail.com
     * @since [1.0.0]
     */
    public void mensajeDiaNoLaboral(String dia) {
        loggerMensaje.log(Level.INFO, "el dia {0} un dia laboral", dia);
    }

    /**
     * [muestra por consola un mensaje de error cuando el usuario ingresa un dato erroneo.
     * <p>
     * mensaje.mensajeNumError();
     * ]
     *
     *
     * @author Miller Esteban Gallego Forero - miller.gallegof@gmail.com
     * @since [1.0.0]
     */
    public void mensajeNumError() {
        loggerMensaje.log(Level.WARNING, "ingrese un numero correcto");
    }
}
