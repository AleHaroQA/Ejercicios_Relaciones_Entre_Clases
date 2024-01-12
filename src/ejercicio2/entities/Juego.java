
package ejercicio2.entities;

import java.util.List;

public class Juego {
    
    private List<Jugador> jugadores;
    private Revolver r;

    public Juego() {
    }

    public Juego(List<Jugador> jugadores, Revolver r) {
        this.jugadores = jugadores;
        this.r = r;
    }

    public List<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(List<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public Revolver getR() {
        return r;
    }

    public void setR(Revolver r) {
        this.r = r;
    }

    @Override
    public String toString() {
        return "Juego{" + "jugadores=" + jugadores + ", r=" + r + '}';
    }
    
    
}
