package ejerciciodiecisiete;

import ejerciciodiecisiete.utilities.Electrodomestico;
import ejerciciodiecisiete.utilities.Lavadora;
import ejerciciodiecisiete.utilities.Mensajes;
import ejerciciodiecisiete.utilities.Television;

import java.util.ArrayList;

/**
 * [Clase principal, donde se ejecuta el metodo de salida main]
 *
 * @author Miller Esteban Gallego Forero - miller.gallegof@gmail.com
 * @version 1.0.0
 * @since [1.0.0]
 */
public class EjercicioDiecisiete {
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
        ArrayList<Electrodomestico> listaElectrodomesticos = new ArrayList<>();
        listaElectrodomesticos.add(new Electrodomestico(200, 30));
        listaElectrodomesticos.add(new Electrodomestico(300, "azul", 'C', 25));
        listaElectrodomesticos.add(new Lavadora());
        listaElectrodomesticos.add(new Lavadora(400, 35));
        listaElectrodomesticos.add(new Lavadora(200, "negra", 'A', 25, 20));
        listaElectrodomesticos.add(new Electrodomestico());
        listaElectrodomesticos.add(new Television());
        listaElectrodomesticos.add(new Television(500, 45));
        listaElectrodomesticos.add(new Television(250, "blanco", 'C', 33, 25.0, false));
        listaElectrodomesticos.add(new Electrodomestico());

        Double valorElectrodomesticos = 0.0;
        Double valorLavadoras = 0.0;
        Double valorTv = 0.0;

        for (Electrodomestico e : listaElectrodomesticos) {
            if (e instanceof Lavadora) {
                valorLavadoras += e.precioFinal();
            } else if (e instanceof Television) {
                valorTv += e.precioFinal();
            }
            valorElectrodomesticos += e.precioFinal();

        }

        mensajes.mostrarMensaje(valorElectrodomesticos, valorLavadoras, valorTv);

    }
}
