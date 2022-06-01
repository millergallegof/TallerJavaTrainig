package ejerciciodieciseis;

import ejerciciodieciseis.utilities.Mensajes;
import ejerciciodieciseis.utilities.MyScanner;
import ejerciciodieciseis.utilities.Persona;

/**
 * [Clase principal, donde se ejecuta el metodo de salida main]
 *
 * @author Miller Esteban Gallego Forero - miller.gallegof@gmail.com
 * @version 1.0.0
 * @since [1.0.0]
 */
public class EjercicioDieciseis {
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
        MyScanner myScanner = new MyScanner();
        Persona personaUno;
        Persona personaDos;
        Persona personaTres;

        mensajes.solicitarNombre();
        String name = myScanner.getString();
        mensajes.solicitarEdad();
        Integer age = myScanner.getInteger();
        mensajes.solicitarGender();
        char gender = myScanner.getString().charAt(0);
        mensajes.solicitarPeso();
        double peso = myScanner.getDouble();
        mensajes.solicitarAltura();
        double altura = myScanner.getDouble();

        personaUno = new Persona(name, age, gender, peso, altura);
        personaDos = new Persona(name, age, gender);
        personaTres = new Persona();

        personaTres.setName("Camila");
        personaTres.setAge(50);
        personaTres.setGender('F');
        personaTres.setPeso(80.0);
        personaTres.setAltura(1.50);

        mensajes.mostrarImc(personaUno.calcularIMC(), personaUno.getName());
        mensajes.mostrarImc(personaDos.calcularIMC(), personaDos.getName());
        mensajes.mostrarImc(personaTres.calcularIMC(), personaTres.getName());

        mensajes.mostrarAge(personaUno.esMayorDeEdad(), personaUno.getName());
        mensajes.mostrarAge(personaDos.esMayorDeEdad(), personaDos.getName());
        mensajes.mostrarAge(personaTres.esMayorDeEdad(), personaTres.getName());

        mensajes.mostrarMensaje(personaUno.toString());
        mensajes.mostrarMensaje(personaDos.toString());
        mensajes.mostrarMensaje(personaTres.toString());

    }
}
