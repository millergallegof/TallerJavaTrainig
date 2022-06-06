package ejerciciodieciocho;

import ejerciciodieciocho.utilities.Mensajes;
import ejerciciodieciocho.utilities.Serie;
import ejerciciodieciocho.utilities.VideoGame;


import java.util.ArrayList;
import java.util.Objects;


/**
 * [Clase principal, donde se ejecuta el metodo de salida main]
 *
 * @author Miller Esteban Gallego Forero - miller.gallegof@gmail.com
 * @version 1.0.0
 * @since [1.0.0]
 */
public class EjercicioDieciocho {

    /**
     * [metodo principar el cual contine los diferentes metodos de salida]
     *
     * @param args parametros pro defecto del metdo main
     * @author Miller Esteban Gallego Forero - miller.gallegof@gmail.com
     * @since [1.0.0]
     */
    public static void main(String[] args) {
        Mensajes mensajes = new Mensajes();
        Serie serie = null;
        VideoGame videoGame = null;
        ArrayList<Serie> listSeries = new ArrayList<>();
        ArrayList<VideoGame> listVideoGames = new ArrayList<>();

        //        Lista de Series
        listSeries.add(new Serie());
        listSeries.add(new Serie("Vikingos", "Adam"));
        listSeries.add(new Serie("Los simposons", 19, "comedia", "Matt Groening"));
        listSeries.add(new Serie("Stranger Things", 4, "Misterio", "Hermanos Duffer"));
        listSeries.add(new Serie("Friends", 10, "Comedia", "David Crane"));

        //        Lista de Series
        listVideoGames.add(new VideoGame());
        listVideoGames.add(new VideoGame("Apex Legends", 20));
        listVideoGames.add(new VideoGame("Halo 2", 50, "343 Industries"));
        listVideoGames.add(new VideoGame("Gears Of War 3", 48, "Epic Games"));
        listVideoGames.add(new VideoGame("Assassin's Creed", 100, "Ubisof"));

        listSeries.get(2).deliver();
        listSeries.get(3).deliver();

        listVideoGames.get(0).deliver();
        listVideoGames.get(4).deliver();
        listVideoGames.get(1).deliver();

        try {
            listSeries.forEach(x -> {
                if (Boolean.TRUE.equals(x.isDelivered())) {
                    mensajes.mostrarSeriesEntregadas(x);
                }
            });

            listVideoGames.forEach(x -> {
                if (Boolean.TRUE.equals(x.isDelivered())) {
                    mensajes.mostrarJuegosEntregadas(x);
                }
            });

            for (int i = 0; i < listSeries.size(); i++) {
                if (i == 0) {
                    serie = listSeries.get(i);
                } else {
                    serie = (Serie) listSeries.get(i).compareTo(serie);
                }
            }
            mensajes.mostrarSerieMayor(Objects.requireNonNull(serie).toString());
            for (int i = 0; i < listVideoGames.size(); i++) {
                if (i == 0) {
                    videoGame = listVideoGames.get(i);
                } else {
                    videoGame = (VideoGame) listVideoGames.get(i).compareTo(videoGame);
                }
            }
            mensajes.mostrarJuegosMayor(Objects.requireNonNull(videoGame).toString());
        } catch (Exception e) {
            mensajes.mostrarExepcion(e.getMessage());
        }

    }
}
