package ejercicioonce;

import ejercicioonce.utilities.Frase;
import ejercicioonce.utilities.Mensajes;

import java.util.Scanner;


/**
 * [Clase principal donde se ejecuta el metodo main]
 *
 * @author Miller Esteban Gallego Forero - miller.gallegof@gmail.com
 * @version 1.0.0
 * @since [1.0.0]
 */
public class EjercicioOnce {
    /**
     * [metodo principar por el cual se instancian los diferentes objetos para que el usuario pueda interactura con el programa]
     *
     * @param args parametros pro defecto del metdo main
     * @author Miller Esteban Gallego Forero - miller.gallegof@gmail.com
     * @since [1.0.0]
     */
    public static void main(String[] args) {
        Frase frase = new Frase();
        Mensajes mensajes = new Mensajes();
        Scanner scanner = new Scanner(System.in);

        mensajes.mostrarInfo();
        String mensaje = scanner.nextLine();
        frase.contarTotal(mensaje);
        frase.contarVocal(mensaje);


    }
}
