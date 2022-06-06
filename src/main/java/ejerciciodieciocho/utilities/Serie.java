package ejerciciodieciocho.utilities;

/**
 * [Clase la cual modela una serie de television]
 *
 * @author Miller Esteban Gallego Forero - miller.gallegof@gmail.com
 * @version [1.0.0 - 05/06/2022]
 * @since [1.0.0]
 */
public class Serie implements Deliverable {
    private String title;
    private Integer numSeason;
    private Boolean delivered;
    private String genre;
    private String creator;

    /**
     * [Constructor por defecto
     * <p>
     * Serie serie = new Serie();
     * ]
     *
     * @author Miller Esteban Gallego Forero - miller.gallegof@gmail.com
     * @since [1.0.0]
     */
    public Serie() {
        this.title = "Breaking Bad";
        this.numSeason = 3;
        this.delivered = false;
        this.genre = "Drama";
        this.creator = "Vince Gilligan";
    }

    /**
     * [Constructor con 2 atributos como parametro
     * <p>
     * Serie serie = new Serie(title, creator);
     * ]
     *
     * @param title titulo del objeto
     * @param creator creador del objeto
     *
     * @author Miller Esteban Gallego Forero - miller.gallegof@gmail.com
     * @since [1.0.0]
     */
    public Serie(String title, String creator) {
        this.title = title;
        this.numSeason = 3;
        this.delivered = false;
        this.genre = "Drama";
        this.creator = creator;
    }

    /**
     * [Constructor con todos los atributos como parametro
     * <p>
     * Serie serie = new Serie(title, numSeason, genre, creator);
     * ]
     *
     *
     * @param title titulo del objeto
     * @param numSeason cantidad de temporadas que tiene el objeto
     * @param genre genero del objeto
     * @param creator creador del objeto
     *
     * @author Miller Esteban Gallego Forero - miller.gallegof@gmail.com
     * @since [1.0.0]
     */
    public Serie(String title, Integer numSeason, String genre, String creator) {
        this.title = title;
        this.numSeason = numSeason;
        this.delivered = false;
        this.genre = genre;
        this.creator = creator;
    }

    /**
     * [Constructor con todos los atributos como parametro privado, solo se puede utilizar en la clase
     * <p>
     * Serie serie = new Serie(title, numSeason, delivered, genre, creator);
     * ]
     *
     *
     * @param title titulo del objeto
     * @param numSeason cantidad de temporadas que tiene el objeto
     * @param delivered indica si el objeto fue entregado
     * @param genre genero del objeto
     * @param creator creador del objeto
     *
     * @author Miller Esteban Gallego Forero - miller.gallegof@gmail.com
     * @since [1.0.0]
     */
    private Serie(String title, Integer numSeason, Boolean delivered, String genre, String creator) {
        this.title = title;
        this.numSeason = numSeason;
        this.delivered = delivered;
        this.genre = genre;
        this.creator = creator;
    }

    /**
     * [Metodo con el que se altera el estado de un atributo
     * <p>
     * serie.deliver()
     * ]
     *
     *
     * @author Miller Esteban Gallego Forero - miller.gallegof@gmail.com
     * @since [1.0.0]
     */
    @Override
    public void deliver() {
        this.delivered = true;
    }

    /**
     * [Metodo con el que se altera el estado de un atributo
     * <p>
     * serie.returnNow()
     * ]
     *
     *
     * @author Miller Esteban Gallego Forero - miller.gallegof@gmail.com
     * @since [1.0.0]
     */
    @Override
    public void returnNow() {
        this.delivered = false;
    }

    /**
     * [retorna el valor de un atributo especifico
     * <p>
     * serie.isDelivered()
     * ]
     *
     * @return valor booleano de el atributo
     *
     * @author Miller Esteban Gallego Forero - miller.gallegof@gmail.com
     * @since [1.0.0]
     */
    @Override
    public boolean isDelivered() {
        return this.delivered;
    }

    /**
     * [Metodo con el que se compara el objeto con otro, teniendo en cuenta el numero de temporadas
     * <p>
     * serie.compareTo(serie2)
     * ]
     *
     * @param a objeto con el que se va a compara
     * @return objeto que tiene mas numero de temporadas
     *
     * @author Miller Esteban Gallego Forero - miller.gallegof@gmail.com
     * @since [1.0.0]
     */
    @Override
    public Object compareTo(Object a) {
        Serie elementCompare = (Serie) a;

        if (elementCompare.getNumSeason() > this.getNumSeason()) {
            return elementCompare;
        } else {
            return new Serie(this.title, this.numSeason, this.delivered, this.genre, this.creator);
        }

    }

    /**
     * [Metodo con el que se envia un string con los datos del objeto
     * <p>
     * serie.toString(serie2)
     * ]
     *
     * @return cadena de caracteres con informacion del objeto
     *
     * @author Miller Esteban Gallego Forero - miller.gallegof@gmail.com
     * @since [1.0.0]
     */
    @Override
    public String toString() {
        return "Serie{" +
                "title='" + title + '\'' +
                ", numSeason=" + numSeason +
                ", delivered=" + delivered +
                ", genre='" + genre + '\'' +
                ", creator='" + creator + '\'' +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getNumSeason() {
        return numSeason;
    }

    public void setNumSeason(Integer numSeason) {
        this.numSeason = numSeason;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }


}
