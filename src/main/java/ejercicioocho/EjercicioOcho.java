package ejercicioocho;

import ejercicioocho.utilities.Mensajes;
import ejercicioocho.utilities.MyScanner;

/**
 * [Clase principal donde se ejecuta el metodo main]
 *
 * @author Miller Esteban Gallego Forero - miller.gallegof@gmail.com
 * @version 1.0.0
 * @since [1.0.0]
 */
public class EjercicioOcho {
    /**
     * [metodo principar el cual contine los diferentes metodos de salida, donde se
     * evaluan diferentes opciones, segun la informacion que ingresa el usuario]
     *
     * @param args parametros pro defecto del metdo main
     * @author Miller Esteban Gallego Forero - miller.gallegof@gmail.com
     * @since [1.0.0]
     */
    public static void main(String[] args) {
        MyScanner myScanner = new MyScanner();
        Mensajes mensajes = new Mensajes();

        mensajes.solicitarInfo();
        switch (myScanner.getInteger()) {
            case 1 -> mensajes.mensajeDiaLaboral("Lunes");
            case 2 -> mensajes.mensajeDiaLaboral("Martes");
            case 3 -> mensajes.mensajeDiaLaboral("Miercoles");
            case 4 -> mensajes.mensajeDiaLaboral("Jueves");
            case 5 -> mensajes.mensajeDiaLaboral("Viernes");
            case 6 -> mensajes.mensajeDiaNoLaboral("Sabado");
            case 7 -> mensajes.mensajeDiaNoLaboral("Domingo");
            default -> mensajes.mensajeNumError();
        }
    }
}
