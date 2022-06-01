package ejerciciocatorce;

import ejerciciocatorce.utilities.Lista;
import ejerciciocatorce.utilities.Mensajes;
import ejerciciocatorce.utilities.MyScanner;

/**
 * [Clase principal donde se ejecuta el metodo main]
 *
 * @author Miller Esteban Gallego Forero - miller.gallegof@gmail.com
 * @version 1.0.0
 * @since [1.0.0]
 */
public class EjercicioCatorce {
    /**
     * [metodo principar por el cual se instancian los diferentes objetos para que el usuario pueda interactura con el programa]
     *
     * @param args parametros pro defecto del metdo main
     * @author Miller Esteban Gallego Forero - miller.gallegof@gmail.com
     * @since [1.0.0]
     */
    public static void main(String[] args) {
        Lista lista = new Lista();
        Mensajes mensajes = new Mensajes();
        MyScanner myScanner = new MyScanner();

        mensajes.mensajeInfo();
        lista.mostrarNumeros(myScanner.getInteger());

    }
}
