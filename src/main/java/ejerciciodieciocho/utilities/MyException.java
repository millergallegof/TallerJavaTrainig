package ejerciciodieciocho.utilities;


/**
 * [Interfaz que extiende de una clase para capturar errores en tiempo de ejecucion]
 *
 * @author Miller Esteban Gallego Forero - miller.gallegof@gmail.com
 * @version 1.0.0
 * @since [1.0.0]
 */
public class MyException extends RuntimeException {

    public MyException(String message) {
        super(message);
    }


}
