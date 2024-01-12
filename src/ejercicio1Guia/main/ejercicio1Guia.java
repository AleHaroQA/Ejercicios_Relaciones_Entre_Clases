package ejercicio1Guia.main;

import ejercicio1Guia.entities.DNI;
import ejercicio1Guia.entities.Persona;

public class ejercicio1Guia {

    public static void main(String[] args) {

        DNI dni = new DNI("A",54321);
        Persona p = new Persona();
        p.setNombre("Ale");
        p.setApellido("Haro");
        p.setDni(dni);

        System.out.println(p);
    }
}
