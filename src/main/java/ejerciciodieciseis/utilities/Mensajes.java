package ejerciciodieciseis.utilities;

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
     * @param mensaje dato el cual se va a mostrar en consola
     *
     * @author Miller Esteban Gallego Forero - miller.gallegof@gmail.com
     * @since [1.0.0]
     */
    public void mostrarMensaje(String mensaje) {
        loggerMensaje.log(Level.INFO, "{0}", mensaje);
    }

    /**
     * [enviar por consola mensaje para que el usuario interactue con el programa.
     * <p>
     * mensaje.solicitarNombre();
     * ]
     *
     * @author Miller Esteban Gallego Forero - miller.gallegof@gmail.com
     * @since [1.0.0]
     */
    public void solicitarNombre() {
        loggerMensaje.log(Level.INFO, "ingrese su nombre: ");
    }

    /**
     * [enviar por consola mensaje para que el usuario interactue con el programa.
     * <p>
     * mensaje.solicitarEdad();
     * ]
     *
     * @author Miller Esteban Gallego Forero - miller.gallegof@gmail.com
     * @since [1.0.0]
     */
    public void solicitarEdad() {
        loggerMensaje.log(Level.INFO, "ingrese su edad: ");
    }

    /**
     * [enviar por consola mensaje para que el usuario interactue con el programa.
     * <p>
     * mensaje.solicitarGender();
     * ]
     *
     * @author Miller Esteban Gallego Forero - miller.gallegof@gmail.com
     * @since [1.0.0]
     */
    public void solicitarGender() {
        loggerMensaje.log(Level.INFO, """
                ingrese su genero:
                M -> Masculino
                F -> Femenino
                """);
    }

    /**
     * [enviar por consola mensaje para que el usuario interactue con el programa.
     * <p>
     * mensaje.solicitarPeso();
     * ]
     *
     * @author Miller Esteban Gallego Forero - miller.gallegof@gmail.com
     * @since [1.0.0]
     */
    public void solicitarPeso() {
        loggerMensaje.log(Level.INFO, "ingrese su peso en kilogramos (kg): ");
    }

    /**
     * [enviar por consola mensaje para que el usuario interactue con el programa.
     * <p>
     * mensaje.solicitarAltura();
     * ]
     *
     * @author Miller Esteban Gallego Forero - miller.gallegof@gmail.com
     * @since [1.0.0]
     */
    public void solicitarAltura() {
        loggerMensaje.log(Level.INFO, "ingrese su Altura en metros (m): ");
    }

    /**
     * [valida de acuerdo al indice calculado y muestra el mensaje correspondiente en pantalla.
     * <p>
     * mensaje.mostrarImc();
     * ]
     *
     * @param indice valor int el cual indica que se desea mostrar en consola
     * @param nombre imprimir el atributo nombre de un objeto
     *
     * @author Miller Esteban Gallego Forero - miller.gallegof@gmail.com
     * @since [1.0.0]
     */
    public void mostrarImc(int indice, String nombre) {
        if (indice == -1) {
            loggerMensaje.log(Level.INFO, "la persona: {0} -> esta bajo de peso", nombre);
        } else if (indice == 0) {
            loggerMensaje.log(Level.INFO, "la persona: {0} -> esta en un peso normal", nombre);
        } else if (indice == 1) {
            loggerMensaje.log(Level.INFO, "la persona: {0} -> esta en sobrepeso", nombre);
        } else {
            loggerMensaje.log(Level.SEVERE, "ERROR la persona {0} no ingreso el peso o la altura correctamente", nombre);
        }
    }

    /**
     * [valida de acuerdo si es verdadero o falso  y muestra el mensaje correspondiente en pantalla.
     * <p>
     * mensaje.mostrarImc();
     * ]
     *
     * @param opcion valor int el cual indica que se desea mostrar en consola
     * @param name imprimir el atributo nombre de un objeto
     *
     * @author Miller Esteban Gallego Forero - miller.gallegof@gmail.com
     * @since [1.0.0]
     */
    public void mostrarAge(boolean opcion, String name) {
        if (Boolean.TRUE.equals(opcion)) {
            loggerMensaje.log(Level.INFO, "la persona: {0} -> es mayor de edad", name);
        }
    }

}
