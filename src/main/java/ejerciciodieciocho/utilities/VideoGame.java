package ejerciciodieciocho.utilities;

/**
 * [Clase la cual modela un videojuego]
 *
 * @author Miller Esteban Gallego Forero - miller.gallegof@gmail.com
 * @version [1.0.0 - 05/06/2022]
 * @since [1.0.0]
 */
public class VideoGame implements Deliverable {
    private String title;
    private Integer estimatedTime;
    private Boolean delivered;
    private String company;

    /**
     * [Constructor por defecto
     * <p>
     * VideoGame juego = new VideoGame();
     * ]
     *
     * @author Miller Esteban Gallego Forero - miller.gallegof@gmail.com
     * @since [1.0.0]
     */
    public VideoGame() {
        this.title = "GOW";
        this.estimatedTime = 10;
        this.delivered = false;
        this.company = "Epic Games";
    }

    /**
     * [Constructor con 2 atributos como parametro
     * <p>
     * VideoGame juego = new VideoGame(title, estimatedTime);
     * ]
     *
     * @param title titulo del objeto
     * @param estimatedTime horas estimadas de juego
     *
     * @author Miller Esteban Gallego Forero - miller.gallegof@gmail.com
     * @since [1.0.0]
     */
    public VideoGame(String title, Integer estimatedTime) {
        this.title = title;
        this.estimatedTime = estimatedTime;
        this.delivered = false;
        this.company = "Epic Games";
    }

    /**
     * [Constructor con todos los atributos como parametro
     * <p>
     * VideoGame juego = new VideoGame(title, estimatedTime, company);
     * ]
     *
     *
     * @param title titulo del objeto
     * @param estimatedTime tiempo estimado de juego
     * @param company desarrolladores del juego
     *
     * @author Miller Esteban Gallego Forero - miller.gallegof@gmail.com
     * @since [1.0.0]
     */
    public VideoGame(String title, Integer estimatedTime, String company) {
        this.title = title;
        this.estimatedTime = estimatedTime;
        this.delivered = false;
        this.company = company;
    }

    /**
     * [Constructor con todos los atributos como parametro, es de tipo privado
     * <p>
     * VideoGame juego = new VideoGame(title, estimatedTime, company);
     * ]
     *
     *
     * @param title titulo del objeto
     * @param estimatedTime tiempo estimado de juego
     * @param delivered esta entregado
     * @param company desarrolladores del juego
     *
     * @author Miller Esteban Gallego Forero - miller.gallegof@gmail.com
     * @since [1.0.0]
     */
    private VideoGame(String title, Integer estimatedTime, Boolean delivered, String company) {
        this.title = title;
        this.estimatedTime = estimatedTime;
        this.delivered = delivered;
        this.company = company;
    }

    /**
     * [Metodo con el que se altera el estado de un atributo
     * <p>
     * juego.deliver()
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
     * juego.returnNow()
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
     * juego.isDelivered()
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
     * [Metodo con el que se compara el objeto con otro, teniendo en cuenta el numero de horas estimadas
     * <p>
     * juego.compareTo(serie2)
     * ]
     *
     * @param a objeto con el que se va a compara
     * @return objeto que tiene mas horas de juego
     *
     * @author Miller Esteban Gallego Forero - miller.gallegof@gmail.com
     * @since [1.0.0]
     */
    @Override
    public Object compareTo(Object a) {
        VideoGame elementCompare = (VideoGame) a;

        if (elementCompare.getEstimatedTime() > this.getEstimatedTime()) {
            return elementCompare;
        } else {
            return new VideoGame(this.title, this.estimatedTime, this.delivered, this.company);
        }

    }

    /**
     * [Metodo con el que se envia un string con los datos del objeto
     * <p>
     * juego.toString(serie2)
     * ]
     *
     * @return cadena de caracteres con informacion del objeto
     *
     * @author Miller Esteban Gallego Forero - miller.gallegof@gmail.com
     * @since [1.0.0]
     */
    @Override
    public String toString() {
        return "VideoGame{" +
                "title='" + title + '\'' +
                ", estimatedTime=" + estimatedTime +
                ", delivered=" + delivered +
                ", company='" + company + '\'' +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getEstimatedTime() {
        return estimatedTime;
    }

    public void setEstimatedTime(Integer estimatedTime) {
        this.estimatedTime = estimatedTime;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}
