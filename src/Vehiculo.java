
public class Vehiculo {

    private String noSerie;
    private String marca;
    private String modelo;
    private char color;

    public Vehiculo(String noSerie, String marca, String modelo, char color) {
        setNoSerie(noSerie);
        setMarca(marca);
        setModelo(modelo);
        setColor(color);
    }

    public Vehiculo() {
        this("SIN NÚMERO", "SIN MARCA", "SIN MODELO", 'N');
    }

    /**
     * @return the noSerie
     */
    public String getNoSerie() {
        return noSerie;
    }

    /**
     * @param noSerie the noSerie to set
     */
    public void setNoSerie(String noSerie) {
        this.noSerie = noSerie;
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the color
     */
    public char getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(char color) {
        this.color = color;
    }

}
