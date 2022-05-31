package ejerciciodoce;

import ejerciciodoce.utilities.Frase;
import ejerciciodoce.utilities.Mensajes;

import java.util.Scanner;

/**
 * [Clase principal donde se ejecuta el metodo main]
 *
 * @author Miller Esteban Gallego Forero - miller.gallegof@gmail.com
 * @version 1.0.0
 * @since [1.0.0]
 */
public class EjercicioDoce {
    /**
     * [metodo principar por el cual se instancian los diferentes objetos para que el usuario pueda interactura con el programa]
     *
     * @param args parametros pro defecto del metdo main
     * @author Miller Esteban Gallego Forero - miller.gallegof@gmail.com
     * @since [1.0.0]
     */
    public static void main(String[] args) {
        Mensajes mensajes = new Mensajes();
        Frase frase = new Frase();
        Scanner scanner = new Scanner(System.in);

        mensajes.mostrarInfoUno();
        String frase1 = scanner.nextLine();
        mensajes.mostrarInfoDos();
        String frase2 = scanner.nextLine();
        frase.compararFrase(frase1, frase2);
    }
}
