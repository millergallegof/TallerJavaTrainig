package ejercicioseis.utilities;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * [Clase con la que se valida que numeros mostrar en el listado de numeros impares
 *
 * MostrarNumerosImpar mostrarNum = new MostrarNumeroImpar();]
 *
 * @version 1.0.0
 *
 * @author Miller Esteban Gallego Forero - miller.gallegof@gmail.com
 *
 * @since [1.0.0]
 *
 */
public class MostrarNumerosImpar {

    /**
     * [Constructor vacio.
     *
     * EsteObjeto objeto1 = new EsteObjeto();
     * ]
     *
     *
     * @author Miller Esteban Gallego Forero - miller.gallegof@gmail.com
     *
     * @since [1.0.0]
     *
     *
     */
    public MostrarNumerosImpar() {
//        No es necesario parametros
    }

    /**
     * [ Valida si los numeros son pares e impares imprimiendo por pantalla los numeros impares
     *
     * Estaclase.mostrarnumeros(100);
     * ]
     *
     * @param numeroFin dato el cual pone limite al listado de numeros impares
     *
     * @author Miller Esteban Gallego Forero - miller.gallegof@gmail.com
     *
     * @since [1.0.0]
     *
     */
    public void mostrarNumeros(Integer numeroFin) {
        Logger loggerMostrarNum = Logger.getLogger(MostrarNumerosImpar.class.getName());

        for (int i = 1; i <= numeroFin; i++)
            if ((i % 2) != 0) {
                loggerMostrarNum.log(Level.INFO, "{0}", i);
            }


    }
}
