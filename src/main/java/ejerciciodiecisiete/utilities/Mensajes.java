package ejerciciodiecisiete.utilities;

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
     * [por parametro recibe un dato de tipo String y lo imprime en pantalla.
     * <p>
     * mensaje.solicitarAltura();
     * ]
     *
     * @param objeto1 dato el cual se va a mostrar en consola
     * @param objeto2 dato el cual se va a mostrar en consola
     * @param objeto3 dato el cual se va a mostrar en consola
     *
     * @author Miller Esteban Gallego Forero - miller.gallegof@gmail.com
     * @since [1.0.0]
     */
    public void mostrarMensaje(double objeto1, double objeto2, double objeto3) {
        loggerMensaje.log(Level.INFO, """
                precio total para loo electrodomesticos : {0}
                precio total para las lavadoras: {1}
                precio total para los televisores: {2}
                """, new Object[] {objeto1, objeto2, objeto3});
    }

}
