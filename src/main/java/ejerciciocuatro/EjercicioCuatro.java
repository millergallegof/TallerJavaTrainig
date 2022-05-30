package ejerciciocuatro;

import ejerciciocuatro.utilities.Calculador;
import ejerciciocuatro.utilities.Mensajes;
import ejerciciocuatro.utilities.MyScanner;


/**
 * [Clase principal, donde se ejecuta el metodo de salida main]
 *
 * @author Miller Esteban Gallego Forero - miller.gallegof@gmail.com
 * @version 1.0.0
 * @since [1.0.0]
 */
public class EjercicioCuatro {

    /**
     * [metodo principar el cual contine los diferentes metodos de salida]
     *
     * @param args parametros pro defecto del metdo main
     *
     * @author Miller Esteban Gallego Forero - miller.gallegof@gmail.com
     * @since [1.0.0]
     */
    public static void main(String[] args) {
        Mensajes mensajes = new Mensajes();
        MyScanner myScanner = new MyScanner();
        Calculador calculador = new Calculador();

        mensajes.solicitarDato();
        calculador.calcularValorPagar(myScanner.getDouble());
    }
}
