package ejerciciodiecisiete.utilities;

/**
 * [Clase en la que se pretende representar un televisor, la cual extiende de
 * electrodomesticos, en la que se busca clacular el precio del mismo]
 *
 * @author Miller Esteban Gallego Forero - miller.galegof@gmail.com
 * @version [1.0.0]
 * @since [1.0.0]
 */
public class Television extends Electrodomestico {
    private double resolucion;
    private boolean sintonizadorTDT;

    /**
     * [Constructor por default el cual tiene valores predeterminados a los diferentes atributos
     * <p>
     * Television clase = new Television();
     * ]
     *
     * @author Miller Esteban Gallego Forero - miller.gallegof@gmail.com
     * @since [1.0.0]
     */
    public Television() {
        this.resolucion = 20.0;
        this.sintonizadorTDT = false;
    }

    /**
     * [Constructor el cual solicita 2 atributos de la clase padre y los demas atributos son por defecto
     * <p>
     * Television clase = new Television(price, weight);
     * ]
     *
     * @param price dato tipo double que indica el precio base del objeto
     * @param weight dato que indica el peso en kg del objeto
     *
     * @author Miller Esteban Gallego Forero - miller.gallegof@gmail.com
     * @since [1.0.0]
     */
    public Television(double price, double weight) {
        super(price, weight);
        this.resolucion = 20.;
        this.sintonizadorTDT = false;
    }

    /**
     * [Constructor el cual solicita todos los atributos para la creacion del objteo
     * <p>
     * Television clase = new Television(price, color, energyConsumption, weight, resolucion, sintonizadorTDT);
     * ]
     *
     * @param price dato tipo double que indica el precio base del objeto
     * @param color valida si el color se encuentra en las opciones y asigna el valor
     * @param energyConsumption indica un elemento del objeto
     * @param weight dato que indica el peso en kg del objeto
     * @param resolucion dato que indica el tamaño del objeto
     * @param sintonizadorTDT indica si tiene una caracteristica especifica
     *
     * @author Miller Esteban Gallego Forero - miller.gallegof@gmail.com
     * @since [1.0.0]
     */
    public Television(double price, String color, char energyConsumption, double weight, Double resolucion, boolean sintonizadorTDT) {
        super(price, color, energyConsumption, weight);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
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
        if (this.resolucion > 40 && Boolean.TRUE.equals(this.sintonizadorTDT)) {
            valorfinal = super.precioFinal() + super.precioFinal() * (30.0 / 100.0);
            valorfinal += 50;
            return valorfinal;
        } else if (this.resolucion > 40) {
            return super.precioFinal() + super.precioFinal() * (30.0 / 100.0);
        } else if (Boolean.TRUE.equals(this.sintonizadorTDT)) {
            return super.precioFinal() + 50;
        } else {
            return super.precioFinal();
        }
    }

    public double getResolucion() {
        return resolucion;
    }

    public void setResolucion(double resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }

    public void setSintonizadorTDT(boolean sintonizadorTDT) {
        this.sintonizadorTDT = sintonizadorTDT;
    }
}



