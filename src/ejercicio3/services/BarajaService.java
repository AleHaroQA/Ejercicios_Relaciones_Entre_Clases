package ejercicio3.services;

import ejercicio3.entities.Baraja;
import ejercicio3.entities.Carta;
import ejercicio3.enums.Palo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import static java.lang.System.in;

public class BarajaService {

    ArrayList<Carta> baraja;
    Baraja b1;
    CartaService cs;
    Scanner reader;
    ArrayList<Carta> cartasPedidas;
    ArrayList<Carta> cartasMonton;

    public BarajaService() {

        this.baraja = new ArrayList<>();
        this.cs = new CartaService();
        this.reader = new Scanner(System.in);
        this.b1 = new Baraja(llenarBaraja());
        this.cartasMonton = new ArrayList<>();
        this.cartasPedidas = new ArrayList<>();
    }

    private ArrayList<Carta> llenarBaraja() {

        for (Palo palo : Palo.values()) {

            for (int i = 1; i < 13; i++) {

                if (i != 8 && i != 9) {

                    baraja.add(cs.crearCarta(i, palo));
                }
            }
        }
        return baraja;
    }

    //barajar(): cambia de posición todas las cartas aleatoriamente.

    public void barajar() {

        Collections.shuffle(b1.getBaraja());
    }

    //darCartas(): dado un número de cartas que nos pidan, le devolveremos ese número de
    //cartas. En caso de que haya menos cartas que las pedidas, no devolveremos nada, pero
    //debemos indicárselo al usuario.

    public void darCartas() {

        System.out.println("Cuantas cartas quiere?");
        int cantidadCartas = reader.nextInt();

        if (cartasPedidas.size()<41 && b1.getBaraja().size()!=0) {

            for (int i = 0; i < cantidadCartas; i++) {

                for (Carta carta : b1.getBaraja()) {

                    cartasPedidas.add(carta);
                    b1.getBaraja().remove(carta);
                    break;
                }
            }
            System.out.println(cartasPedidas);
        }else {
            System.out.println("No hay mas cartas para repartir");
        }
    }

    //siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando no haya más o
    //se haya llegado al final, se indica al usuario que no hay más cartas.

    public boolean siguienteCarta() {

        boolean entregada = false;
        for (Carta carta : b1.getBaraja()) {

            if (!b1.getBaraja().isEmpty()) {
                System.out.println(carta);
                b1.getBaraja().remove(carta);
                cartasMonton.add(carta);
                entregada = true;
                break;
            }
        }

        return entregada;
    }

    //cartasDisponibles(): indica el número de cartas que aún se puede repartir.

    public void cartasDisponibles() {

        System.out.println("Quedan " + b1.getBaraja().size() + " para repartir.");
    }

    //cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido ninguna
    //indicárselo al usuario

    public void cartasMonton() {

        if (cartasMonton.isEmpty()) {
            System.out.println("Aún no ha salido ninguna carta");
        } else {
            for (Carta carta : cartasMonton) {
                System.out.println(carta);
            }
        }
    }

    //mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, si se saca una carta y
    //luego se llama al método, este no mostrara esa primera carta.

    public void mostrarBaraja() {

        if (b1.getBaraja().isEmpty()) {
            System.out.println("No quedan cartas en la baraja");
        } else {
            for (Carta carta : b1.getBaraja()) {
                System.out.println(carta);
            }
        }

    }


}