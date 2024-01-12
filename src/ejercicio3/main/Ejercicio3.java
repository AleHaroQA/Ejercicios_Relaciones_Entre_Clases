package ejercicio3.main;

import ejercicio3.entities.Baraja;
import ejercicio3.services.BarajaService;
import ejercicio3.services.CartaService;

import java.util.Scanner;

import static java.lang.System.in;

public class Ejercicio3 {

    public static void main(String[] args) {

        jugar();

    }

    public static void jugar() {

        BarajaService bs = new BarajaService();
        Scanner reader = new Scanner(System.in);
        boolean salir = false;
        boolean barajadas = false;
        boolean repartidas = false;

        do {
            System.out.println("----------JUGAR CARTAS----------");
            System.out.println("1. Barajar");
            System.out.println("2. Repartir cartas");
            System.out.println("3. Conocer cantidad de cartas que quedan por repartir");
            System.out.println("4. Sacar una carta del montón");
            System.out.println("5. Cartas del montón");
            System.out.println("6. Ver baraja");
            System.out.println("7. Salir");
            int opc = reader.nextInt();

            switch (opc) {

                case 1:
                    bs.barajar();
                    barajadas = true;
                    break;
                case 2:
                    if (barajadas) {
                        bs.darCartas();
                        repartidas = true;
                    } else {
                        System.out.println("Las cartas deben barajarse primero");
                    }
                    break;
                case 3:
                    if (repartidas) {
                        bs.cartasDisponibles();
                    } else {
                        System.out.println("Las cartas deben barajarse y repartirse primero");
                    }
                    break;
                case 4:
                    if (repartidas) {
                        if (!bs.siguienteCarta()) {
                            System.out.println("No hay mas cartas para sacar");
                        }
                        break;
                    } else {
                        System.out.println("Las cartas deben barajarse y repartirse primero");
                    }
                    break;
                case 5:
                    if (repartidas) {
                        bs.cartasMonton();
                    } else {
                        System.out.println("Las cartas deben barajarse y repartirse primero");
                    }
                    break;
                case 6:
                    if (repartidas) {
                        bs.mostrarBaraja();
                    } else {
                        System.out.println("Las cartas deben barajarse y repartirse primero");
                    }
                    break;
                case 7:
                    salir = true;
                    System.out.println("BYE");
                default:
                    System.out.println("Opción inválida");
            }

        } while (!salir);
    }

}
