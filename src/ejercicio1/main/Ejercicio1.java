package ejercicio1.main;

import ejercicio1.entities.Perro;
import ejercicio1.entities.Persona;

import ejercicio1.services.PerroService;
import ejercicio1.services.PersonaService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Ejercicio1 {

    public static void main(String[] args) {

        /*Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
        pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
        la clase Persona, la información del Perro y de la Persona. */

        /*Perro perro =  new Perro("Pekita", "Jack Russell Terrier", 10, "Pequeño");
        Perro perro1 = new Perro("Benji", "Golden Retriever", 3, "Mediano");
        Persona persona = new Persona("Max", "Perez", 32, 775623, perro);
        Persona persona1 = new Persona("Leo", "Rodriguez", 25, 798812, perro1);

        System.out.println(persona);
        System.out.println(persona1);*/

    /*Ahora se debe realizar unas mejoras al ejercicio de Perro y Persona. Nuestro programa va a
    tener que contar con muchas personas y muchos perros. El programa deberá preguntarle a
    cada persona, que perro según su nombre, quiere adoptar. Dos personas no pueden adoptar
    al mismo perro, si la persona eligió un perro que ya estaba adoptado, se le debe informar a la
    persona.
    Una vez que la Persona elige el Perro se le asigna, al final deberemos mostrar todas las
    personas con sus respectivos perros.*/

        Scanner reader = new Scanner(System.in);
        List<Persona> personaList = new ArrayList<>();
        PersonaService personaService = new PersonaService();
        PerroService perroService = new PerroService();
        boolean adopcionExitosa = false;

        perroService.agregarPerro();

        for (int i = 0; i < 2; i++) {
            Persona p = personaService.crearPersona();
            perroService.mostrarListaPerros();

            do {
                System.out.println("Ingrese nombre del perro que quiere adoptar");
                String nombrePerro = reader.next();

                for (Perro perro : perroService.getListaPerros()) {
                    if (perro.getNombre().equalsIgnoreCase(nombrePerro)) {
                        if (!perro.isAdoptado()) {
                            p.setPerro(perro);
                            perro.setAdoptado(true);
                            adopcionExitosa = true;
                            System.out.println("Adopción exitosa");
                            personaList.add(p);
                            break;
                        }else{
                            System.out.println("El perro ya fue adoptado");
                        }
                    }
                }
            }while(!adopcionExitosa || p.getPerro() == null);
        }

        for (Persona p : personaList) {
            System.out.println(p);
        }


    }
}
