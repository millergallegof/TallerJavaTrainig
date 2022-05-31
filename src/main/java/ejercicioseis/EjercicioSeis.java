package ejercicioseis;


import ejercicioseis.utilities.Mensajes;
import ejercicioseis.utilities.MostrarNumerosImpar;
import ejercicioseis.utilities.MyScanner;

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
public class EjercicioSeis {

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
