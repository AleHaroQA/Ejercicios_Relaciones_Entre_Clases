package ejercicio2Guia.main;

import ejercicio2Guia.entities.Equipo;
import ejercicio2Guia.entities.Jugador;

import java.util.ArrayList;
import java.util.List;

public class ejercicio2Guia {

    public static void main(String[] args) {

        Jugador j = new Jugador("Alexis", "Sanchez", "Delantero",10);
        Jugador j1 = new Jugador("Claudio", "Bravo", "Portero",1);
        Jugador j2 = new Jugador("Gary", "Medel", "Defensa",17);
        Jugador j3 = new Jugador("Arturo", "Vidal", "Mediocampista",8);
        Jugador j4 = new Jugador("Ben", "Brereton", "Delantero",22);

        List<Jugador> seleccion = new ArrayList<>();
        seleccion.add(j);
        seleccion.add(j1);
        seleccion.add(j2);
        seleccion.add(j3);
        seleccion.add(j4);

        Equipo e = new Equipo();
        e.setJugadores(seleccion);

        System.out.println(e);

    }
}
