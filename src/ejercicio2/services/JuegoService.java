
package ejercicio2.services;

import ejercicio2.entities.Juego;
import ejercicio2.entities.Jugador;
import ejercicio2.entities.Revolver;
import java.util.ArrayList;
import java.util.Scanner;


public class JuegoService {
    
    Scanner read = new Scanner(System.in);
    ArrayList <Jugador> jugadores = new ArrayList<>();
    JugadorService js = new JugadorService();
    
    public ArrayList <Jugador> cargarLista(){
        
        System.out.println("Ingrese la cantidad de jugadores (1 a 6)");
        int cantidad = read.nextInt();
        if ((cantidad > 6) || (cantidad < 1 )) {
            cantidad= 6;
        }
        
        for (int i = 0; i < cantidad; i++) {
            jugadores.add(new Jugador (i+1));
        }
        
        return jugadores;
    }
   
    public Juego llenarJuego( ArrayList <Jugador> jugadores, Revolver r){

        return new Juego(jugadores, r);
    }
    
    public void ronda(Juego juego){
        boolean finRonda = false;
        do {
            for (Jugador jugador : juego.getJugadores()) {
                if (js.disparo(juego.getR(), jugador)) {
                    finRonda = true;
                    System.out.println("El " +jugador.getNombre()+ " ha muerto");
                    break;
                }else{
                    System.out.println("El " +jugador.getNombre()+ " se ha salvado");
                }
            }
            
            System.out.println("Fin de la ronda");
        } while (!finRonda);
        
        
        
    }
}
