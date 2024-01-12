package ejercicio3.entities;

import java.util.ArrayList;
import java.util.List;

public class Baraja {

    //Atributos
    private List<Carta> baraja;

    //Constructores

    public Baraja(List<Carta> baraja) {
        this.baraja = baraja;
    }

    //Getters y setters
    public List<Carta> getBaraja() {
        return baraja;
    }

    public void setBaraja(List<Carta> baraja) {
        this.baraja = baraja;
    }

    //toString
    @Override
    public String toString() {
        return "Baraja{" +
                "baraja=" + baraja +
                '}';
    }
}
