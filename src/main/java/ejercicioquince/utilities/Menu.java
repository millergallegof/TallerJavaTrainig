package ejercicioquince.utilities;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * [Clase con la que se ejecuta el menu necesario para el algoritmo
 * Menu menu = new Menu();]
 *
 * @author Miller Esteban Gallego Forero - miller.gallegof@gmail.com
 * @version 1.0.0
 * @since [1.0.0]
 */
public class Menu {

    /**
     * [metodo donde se ejecutan diferentes acciones que determina el parametro option.
     * <p>
     * Mensaje mensaje = new Mensaje();
     * ]
     *
     * @param option dato tipo entero que es la opcion que implementara el switchcase
     *
     * @author Miller Esteban Gallego Forero - miller.gallegof@gmail.com
     * @since [1.0.0]
     */
    public boolean seleccionaropcion(Integer option) {
        Logger logger = Logger.getLogger(Menu.class.getName());
        MyScanner scanner = new MyScanner();
        switch (option) {
            case 1 -> logger.log(Level.INFO, "NUEVO ACTOR");
            case 2 -> logger.log(Level.INFO, "BUSCAR ACTOR");
            case 3 -> logger.log(Level.INFO, "ELIMINAR ACTOR");
            case 4 -> logger.log(Level.INFO, "MODIFICAR ACTOR");
            case 5 -> logger.log(Level.INFO, "VER TODOS LOS ACTORES");
            case 6 -> logger.log(Level.INFO, "VER PELICULAS DE LOS ACTORES");
            case 7 -> logger.log(Level.INFO, "VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES");
            case 8 -> {
                scanner.close();
                return false;
            }
            default -> logger.log(Level.INFO, "Ingrese una opcion correcta");
        }
        return true;
    }
}
