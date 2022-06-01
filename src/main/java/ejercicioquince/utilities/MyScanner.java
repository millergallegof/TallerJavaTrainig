package ejercicioquince.utilities;

import java.util.Scanner;

/**
 * [Clase con la que se busca implementar la libreria Scanner la cual nos ayuda a recibir datos por consola]
 *
 * @version 1.0.0
 *
 * @author Miller Esteban Gallego Forero - miller.gallegof@gmail.com
 *
 * @since [1.0.0]
 *
 */
public class MyScanner {

    Scanner scanner = new Scanner(System.in);

    /**
     * [Constructor vacio.
     *
     * MyScanner myScanner = new MyScanner();
     * ]
     *
     *
     * @author Miller Esteban Gallego Forero - miller.gallegof@gmail.com
     *
     * @since [1.0.0]
     *
     *
     */
    public MyScanner() {
//        No son necesarios atributos
    }

    /**
     * [solicita un elemento por consola de tipo String y lo parsea un dato de tipo Integer.
     * myScanner.getinteger();
     * ]
     *
     * @author Miller Esteban Gallego Forero - miller.gallegof@gmail.com
     * @since [1.0.0]
     */
    public int getInteger() {return Integer.parseInt(scanner.nextLine());}

    /**
     * [cierra el metodo scanner.
     * myScanner.close();
     * ]
     *
     * @author Miller Esteban Gallego Forero - miller.gallegof@gmail.com
     * @since [1.0.0]
     */
    public void close() {
        scanner.close();
    }
}
