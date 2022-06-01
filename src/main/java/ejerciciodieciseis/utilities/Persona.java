package ejerciciodieciseis.utilities;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * [Clase con la que se representa una persona, la cual maneja diferentes metodos en los que se encuentra el de calcula el IMC]
 *
 * @author Miller Esteban Gallego Forero - miller.gallegof@gmail.com
 * @version 1.0.0
 * @since [1.0.0]
 */
public class Persona {
    Logger loggerPersona = Logger.getLogger(Persona.class.getName());
    private final Random random = new Random();
    private String name;
    private Integer age;
    private final String dni;
    private char gender;
    private double peso;
    private double altura;

    /**
     * [Constructor por defecto, el cual tiene unos valores predeterminados para los atributos.
     * <p>
     * Persona persona = new Persona();
     * ]
     *
     * @author Miller Esteban Gallego Forero - miller.gallegof@gmail.com
     * @since [1.0.0]
     */
    public Persona() {
        this.name = "";
        this.age = 0;
        this.dni = this.generaDNI();
        this.gender = 'M';
        this.peso = 0.0;
        this.altura = 0.0;
    }

    /**
     * [Constructor el cual tiene algunos valores por defecto pero otros son requeridos como parametros.
     * <p>
     * Persona persona = new Persona(name, age, gender);
     * ]
     *
     * @param name nombre del objeto
     * @param age dato tipo entero
     * @param gender dato tipo char donde M es masculino y F es femenino
     *
     * @author Miller Esteban Gallego Forero - miller.gallegof@gmail.com
     * @since [1.0.0]
     */
    public Persona(String name, Integer age, char gender) {
        this.name = name;
        this.age = age;
        this.dni = this.generaDNI();
        this.comprobarSexo(gender);
        this.peso = 0.0;
        this.altura = 0.0;
    }

    /**
     * [constructor el cual el unico atributo por defecto es el DNI, es requerido el resto de atributos como parametros.
     * <p>
     * Persona persona = new Persona(name, age, gender, peso, altura);
     * ]
     *
     * @param name nombre del objeto
     * @param age dato tipo entero
     * @param gender dato tipo char donde M es masculino y F es femenino
     * @param peso dato tipo double
     * @param altura dato tipo double
     *
     * @author Miller Esteban Gallego Forero - miller.gallegof@gmail.com
     * @since [1.0.0]
     */
    public Persona(String name, Integer age, char gender, double peso, double altura) {
        this.name = name;
        this.age = age;
        this.dni = this.generaDNI();
        this.comprobarSexo(gender);
        this.peso = peso;
        this.altura = altura;
    }

    /**
     * [clase para calcular el IMC de una persona, segun los atributos de peso y altura
     * <p>
     * persona.calcularIMC();
     * ]
     *
     *
     * @author Miller Esteban Gallego Forero - miller.gallegof@gmail.com
     * @since [1.0.0]
     */
    public Integer calcularIMC() {
        int indice;
        try {
            double imc = this.peso / (Math.pow(this.altura, 2));
            if (imc < 20) {
                indice = -1;
            } else if (20 <= imc && imc <= 25) {
                indice = 0;
            } else if (imc > 25) {
                indice = 1;
            } else {
                indice = 2;
            }
            return indice;
        } catch (Exception e) {
            throw new MyException(e.getMessage(), e);
        }
    }

    /**
     * [hace una comprobacion para saber si el objeto en su age tiene mas de 18
     * <p>
     * persona.esMayorDeEdad();
     * ]
     *
     *
     * @author Miller Esteban Gallego Forero - miller.gallegof@gmail.com
     * @since [1.0.0]
     */
    public boolean esMayorDeEdad() {
        return this.age >= 18;
    }

    /**
     * [verifica si el atributo ingresado al momento de instanciarlo si no es correcto lo reemplaza por una opcion correcta
     * <p>
     * persona.comprobarSexo();
     * ]
     *
     * @param sexo dato tipo char que indica el genero del objeto
     *
     * @author Miller Esteban Gallego Forero - miller.gallegof@gmail.com
     * @since [1.0.0]
     */
    public void comprobarSexo(char sexo) {
        if (sexo == 'M' || sexo == 'F') {
            this.gender = sexo;
            loggerPersona.log(Level.INFO, "EL genero esta correcto");
        } else {
            this.gender = 'M';
        }
    }

    /**
     * [metodo con la que se asigna un numero aleatorio y una letra aleatoria al atributo DNI del objeto
     * <p>
     * persona.generaDNI();
     * ]
     *
     *
     * @author Miller Esteban Gallego Forero - miller.gallegof@gmail.com
     * @since [1.0.0]
     */
    public String generaDNI() {
        int numRandom = random.nextInt(99999999);
        char letterRandom = (char) (random.nextInt(26) + 'a');
        letterRandom = Character.toUpperCase(letterRandom);
        return numRandom + String.valueOf(letterRandom);
    }

    /**
     * [metodo con el que se retorna un elemento de tipo String con toda la informacion de un objeto
     * <p>
     * persona.generaDNI();
     * ]
     *
     *
     * @author Miller Esteban Gallego Forero - miller.gallegof@gmail.com
     * @since [1.0.0]
     */
    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + name + '\'' +
                ", edad=" + age +
                ", DNI='" + dni + '\'' +
                ", genero=" + gender +
                ", peso=" + peso +
                ", altura=" + altura +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
