package ejercicio3Extra.main;

import ejercicio3.services.BarajaService;
import ejercicio3Extra.entities.Poliza;
import ejercicio3Extra.services.PolizaService;

import java.util.Scanner;

public class ejercicio3Extra {

    public static void main(String[] args) {

        PolizaService ps = new PolizaService();
        Poliza p = ps.crearPoliza();
        ps.pagarCuota(p);
        System.out.println(p);

    }
}
