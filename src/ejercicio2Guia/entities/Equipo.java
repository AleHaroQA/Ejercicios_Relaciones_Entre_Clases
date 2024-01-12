package ejercicio2Guia.entities;

import java.util.List;

public class Equipo {

    /*Luego otra clase Equipo que contenga una colección de jugadores. Una vez hecho
    esto, desde el main recorreremos el equipo mostrando la información de cada jugador.*/

    //Atributos

    private List<Jugador> jugadores;

    //Getters y setters

    public List<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(List<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    //toString

    @Override
    public String toString() {
        return "Equipo{" +
                "jugadores=" + jugadores +
                '}';
    }
}
