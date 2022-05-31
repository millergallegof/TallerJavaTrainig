package ejerciciocinco;

import ejerciciocinco.utilities.Mensajes;
import ejerciciocinco.utilities.MostrarNumerosImpar;
import ejerciciocinco.utilities.MyScanner;

/**
 * [Clase principal donde se ejecuta el metodo main]
 *
 * @version 1.0.0
 *
 * @author Miller Esteban Gallego Forero - miller.gallegof@gmail.com
 *
 * @since [1.0.0]
 *
 */
public class EjercicioCinco {

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
        MostrarNumerosImpar mostrarNumerosImpar = new MostrarNumerosImpar();

        mensajes.solicitarDato();

        mostrarNumerosImpar.mostrarNumeros(myScanner.getInteger());

    }
}
