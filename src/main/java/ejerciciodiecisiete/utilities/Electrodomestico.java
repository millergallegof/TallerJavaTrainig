package ejerciciodiecisiete.utilities;

import java.util.HashMap;
import java.util.Map;

/**
 * [Clase padre, la cual su objetivo es modelar los electrodomesticos en general, puede ser extendida
 *
 * @author Miller Esteban Gallego Forero - miller.galegof@gmail.com
 * @version [1.0.0]
 * @since [1.0.0]
 */
public class Electrodomestico {
    private double price;
    private String color;
    private char energyConsumption;
    private double weight;

    static final String COLORDEFAULT = "blanco";

    /**
     * [Constructor por default el cual tiene valores predeterminados a los diferentes atributos, son validados varios atributos
     * <p>
     * Electrodomestico clase = new Electrodomestico();
     * ]
     *
     * @author Miller Esteban Gallego Forero - miller.gallegof@gmail.com
     * @since [1.0.0]
     */
    public Electrodomestico() {
        this.price = 100.0;
        this.comprobarColor(COLORDEFAULT);
        this.comprobarConsumoEnergetico('F');
        this.weight = 5;
    }

    /**
     * [Constructor el cual solicita 2 atributos de la clase padre y los demas atributos son por defecto,
     * son validados algunos atributos sgeun informacion de iteracion
     * <p>
     * Electrodomestico clase = new Electrodomestico(price, wight);
     * ]
     *
     * @param price  dato tipo double que indica el precio base del objeto
     * @param weight dato que indica el peso en kg del objeto
     * @author Miller Esteban Gallego Forero - miller.gallegof@gmail.com
     * @since [1.0.0]
     */
    public Electrodomestico(double price, double weight) {
        this.price = price;
        this.comprobarColor(COLORDEFAULT);
        this.comprobarConsumoEnergetico('F');
        this.weight = weight;
    }

    /**
     * [Constructor el cual solicita todos los atributos para la creacion del objteo
     * <p>
     * Electrodomestico clase = new Electrodomestico(price, color, energyConsumption, weight);
     * ]
     *
     * @param price dato tipo double que indica el precio base del objeto
     * @param color valida si el color se encuentra en las opciones y asigna el valor
     * @param energyConsumption indica un elemento del objeto
     * @param weight dato que indica el peso en kg del objeto
     *
     * @author Miller Esteban Gallego Forero - miller.gallegof@gmail.com
     * @since [1.0.0]
     */
    public Electrodomestico(double price, String color, char energyConsumption, double weight) {
        this.price = price;
        this.comprobarColor(color);
        this.comprobarConsumoEnergetico(energyConsumption);
        this.weight = weight;
    }

    /**
     * [comprueba que al instanciar el objeto los valores que son asignados para el atributo energyConsumption,
     * esten en un rango determinado, de igual forma asigna el valor al objeto
     * <p>
     * clase.comprobarConsumoEnergetico('S');
     * ]
     *
     * @param estado estado del atributo a comprobar
     *
     * @author Miller Esteban Gallego Forero - miller.gallegof@gmail.com
     * @since [1.0.0]
     */
    public void comprobarConsumoEnergetico(char estado) {
        char[] letras = {'A', 'B', 'C', 'D', 'E', 'F'};
        int indice = 0;
        for (int letra : letras) {
            if (estado == letra) {
                indice = 1;
                break;
            }
        }
        if (indice == 0) {
            this.energyConsumption = 'F';
        } else {
            this.energyConsumption = estado;
        }
    }

    /**
     * [comprueba que al instanciar el objeto los valores que son asignados para el atributo color,
     * esten en un rango determinado, de igual forma asigna el valor al objeto
     * <p>
     * clase.comprobarConsumoEnergetico('S');
     * ]
     *
     * @param colorAtributo valor del atributo a comprobar
     *
     * @author Miller Esteban Gallego Forero - miller.gallegof@gmail.com
     * @since [1.0.0]
     */
    public void comprobarColor(String colorAtributo) {
        String[] colors = {COLORDEFAULT, "negro", "rojo", "azul", "gris"};
        int indice = 0;
        for (String colorAtr : colors) {
            if (colorAtr.equals(colorAtributo.toLowerCase())) {
                indice = 1;
                break;
            }
        }
        if (indice == 0) {
            this.color = COLORDEFAULT;
        } else {
            this.color = colorAtributo;
        }
    }

    /**
     * [Calcula el precio final del producto teniendo en cuenta diferentes atributos del objeto
     * <p>
     * clase.precioFinal();
     * ]
     *
     *
     * @author Miller Esteban Gallego Forero - miller.gallegof@gmail.com
     * @since [1.0.0]
     */
    public Double precioFinal() {
        HashMap<String, Double> priceConsumption = new HashMap<>();
        Double[] priceWeight = {10.0, 50.0, 80.0, 100.0};
        Double priceFinal = this.price;
        priceConsumption.put("A", 100.0);
        priceConsumption.put("B", 80.0);
        priceConsumption.put("C", 60.0);
        priceConsumption.put("D", 50.0);
        priceConsumption.put("E", 30.0);
        priceConsumption.put("F", 10.0);

        for (Map.Entry<String, Double> priceCon : priceConsumption.entrySet()) {
            if (String.valueOf(this.energyConsumption).equals(priceCon.getKey())) {
                priceFinal += priceCon.getValue();
                break;
            }
        }

        if (this.weight >= 0 && this.weight <= 19) {
            priceFinal += priceWeight[0];
        } else if (this.weight >= 20 && this.weight <= 49) {
            priceFinal += priceWeight[1];
        } else if (this.weight >= 50 && this.weight <= 79) {
            priceFinal += priceWeight[2];
        } else if (this.weight >= 80) {
            priceFinal += priceWeight[3];
        }
        return priceFinal;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getEnergyConsumption() {
        return energyConsumption;
    }

    public void setEnergyConsumption(char energyConsumption) {
        this.energyConsumption = energyConsumption;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
