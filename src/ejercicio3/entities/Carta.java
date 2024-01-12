package ejercicio3.entities;

import ejercicio3.enums.Palo;

public class Carta {


   // Una carta tiene un número entre 1 y 12 (el 8 y el 9 no los incluimos) y un palo (espadas, bastos, oros y copas).

    //Atributos

    private int num;
    private Palo palo;

    //Constructor

    public Carta() {
    }

    public Carta(int num, Palo palo) {
        this.num = num;
        this.palo = palo;
    }

    //Getters y setters

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public Palo getPalo() {
        return palo;
    }

    public void setPalo(Palo palo) {
        this.palo = palo;
    }

    //toString

    @Override
    public String toString() {
        return "Carta{" +
                "num=" + num +
                ", palo='" + palo + '\'' +
                '}';
    }
}
