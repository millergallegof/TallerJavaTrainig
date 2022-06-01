package ejerciciodiecisiete.utilities;

/**
 * [Clase en la que se pretende representar una lavadora, la cual extiende de
 * electrodomesticos, en la que se busca clacular el precio del mismo]
 *
 * @author Miller Esteban Gallego Forero - miller.galegof@gmail.com
 * @version [1.0.0]
 * @since [1.0.0]
 */
public class Lavadora extends Electrodomestico {
    private double carga;

    /**
     * [Constructor por default el cual tiene valores predeterminados a los diferentes atributos
     * <p>
     * Lavadora clase = new Lavadora();
     * ]
     *
     * @author Miller Esteban Gallego Forero - miller.gallegof@gmail.com
     * @since [1.0.0]
     */
    public Lavadora() {
        this.carga = 5.0;
    }

    /**
     * [Constructor el cual solicita 2 atributos de la clase padre y los demas atributos son por defecto
     * <p>
     * Lavadora clase = new Lavadora(price, weight);
     * ]
     *
     * @param price dato tipo double que indica el precio base del objeto
     * @param weight dato que indica el peso en kg del objeto
     *
     * @author Miller Esteban Gallego Forero - miller.gallegof@gmail.com
     * @since [1.0.0]
     */
    public Lavadora(double price, double weight) {
        super(price, weight);
        this.carga = 5.0;
    }

    /**
     * [Constructor el cual solicita todos los atributos para la creacion del objteo
     * <p>
     * Lavadora clase = new Lavadora(price, color, energyConsumption, weight, carga);
     * ]
     *
     * @param price dato tipo double que indica el precio base del objeto
     * @param color valida si el color se encuentra en las opciones y asigna el valor
     * @param energyConsumption indica un elemento del objeto
     * @param weight dato que indica el peso en kg del objeto
     * @param carga cuantos kg puede tener en su interior el objeto
     *
     * @author Miller Esteban Gallego Forero - miller.gallegof@gmail.com
     * @since [1.0.0]
     */
    public Lavadora(double price, String color, char energyConsumption, double weight, double carga) {
        super(price, color, energyConsumption, weight);
        this.carga = carga;
    }

    /**
     * [Calcula el precio final del producto teniendo en cuenta diferentes atributos del objeto y la clase padre
     * <p>
     * clase.precioFinal();
     * ]
     *
     *
     * @author Miller Esteban Gallego Forero - miller.gallegof@gmail.com
     * @since [1.0.0]
     */
    @Override
    public Double precioFinal() {
        double valorfinal;
        if (this.carga > 30) {
            valorfinal = super.precioFinal() + 50;
            return valorfinal;
        } else {
            return super.precioFinal();
        }
    }

    public double getCarga() {
        return carga;
    }

    public void setCarga(double carga) {
        this.carga = carga;
    }
}
