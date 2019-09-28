package data;

public class Celular {

    private int nSerie;
    private String marca;
    private int precio;

    public Celular() {
    }

    public Celular(int nSerie) {
        this.nSerie = nSerie;
        this.marca = "Samsung";
    }

    public Celular(int nSerie, String marca) {
        this.nSerie = nSerie;
        this.marca = marca;
    }

    public Celular(int nSerie, String marca, int precio) {
        this.nSerie = nSerie;
        this.marca = marca;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public int getnSerie() {
        return nSerie;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setnSerie(int nSerie) {
        this.nSerie = nSerie;
    }

    @Override
    public String toString() {
        return " marca: " + this.marca + this.nSerie;
    }

}