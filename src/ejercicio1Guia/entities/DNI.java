package ejercicio1Guia.entities;

public class DNI {

    //Atributos
    private String serie;
    private int num;

    //Constructores

    public DNI() {
    }

    public DNI(String serie, int num) {
        this.serie = serie;
        this.num = num;
    }

    //Getters y setters

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    //toString

    @Override
    public String toString() {
        return "DNI{" +
                "serie='" + serie + '\'' +
                ", num=" + num +
                '}';
    }
}
