package ejercicio1.services;

import ejercicio1.entities.Persona;

import java.util.Scanner;


public class PersonaService {

    Scanner reader = new Scanner(System.in);


    public Persona crearPersona(){

        System.out.println(" ------ Nuevo ingreso persona ------ ");
        Persona persona =  new Persona();
        System.out.println("Ingrese su nombre");
        persona.setNombre(reader.next());
        System.out.println("Ingrese su apellido");
        persona.setApellido(reader.next());
        System.out.println("Ingrese su edad");
        persona.setEdad(reader.nextInt());
        System.out.println("Ingrese su DNI");
        persona.setDocumento(reader.nextInt());

        return persona;
    }


}
