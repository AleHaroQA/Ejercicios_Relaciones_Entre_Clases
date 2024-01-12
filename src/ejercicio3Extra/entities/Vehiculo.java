package ejercicio3Extra.entities;

public class Vehiculo {

   /*Gestión de vehículos. Se registra la información de cada vehículo asegurado. Marca,
    modelo, año, número de motor, chasis, color, tipo (camioneta, sedán, etc.).*/

    //Atributos

    private String marca;
    private String modelo;
    private int year;
    private int numMotor;
    private String chasis;
    private String color;
    private String tipo;

    //Constructores

    public Vehiculo() {
    }

    //Getters y setters

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getNumMotor() {
        return numMotor;
    }

    public void setNumMotor(int numMotor) {
        this.numMotor = numMotor;
    }

    public String getChasis() {
        return chasis;
    }

    public void setChasis(String chasis) {
        this.chasis = chasis;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    //toString

    @Override
    public String toString() {
        return "Vehiculo{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", year=" + year +
                ", numMotor=" + numMotor +
                ", chasis='" + chasis + '\'' +
                ", color='" + color + '\'' +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}
