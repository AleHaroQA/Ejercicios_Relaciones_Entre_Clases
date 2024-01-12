package ejercicio3.services;

import ejercicio3.entities.Carta;
import ejercicio3.enums.Palo;

public class CartaService {

    public Carta crearCarta(int num, Palo palo){

        return new Carta(num, palo);
    }
}
