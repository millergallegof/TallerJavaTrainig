package ejercicioquince;

import ejercicioquince.utilities.Mensajes;
import ejercicioquince.utilities.Menu;
import ejercicioquince.utilities.MyScanner;

/**
 * [Clase principal donde se ejecuta el metodo main]
 *
 * @author Miller Esteban Gallego Forero - miller.gallegof@gmail.com
 * @version 1.0.0
 * @since [1.0.0]
 */
public class EjercicioQuince {

    /**
     * [metodo principar por el cual se instancian los diferentes objetos para que el usuario pueda interactura con el programa]
     *
     * @param args parametros pro defecto del metdo main
     * @author Miller Esteban Gallego Forero - miller.gallegof@gmail.com
     * @since [1.0.0]
     */
    public static void main(String[] args) {
        Mensajes message = new Mensajes();
        MyScanner myScanner = new MyScanner();
        Menu menu = new Menu();
        boolean option = true;

        while (Boolean.TRUE.equals(option)) {
            message.mensajeInfo();
            option = menu.seleccionaropcion(myScanner.getInteger());


        }


    }
}
