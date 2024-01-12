package ejercicio3Extra.services;

import ejercicio3Extra.entities.Cliente;

import java.util.Scanner;


public class ClienteService {

    Scanner reader = new Scanner(System.in);

    public Cliente crearCliente(){

        Cliente c = new Cliente();
        System.out.println("----------INGRESO CLIENTE----------");
        System.out.println("Ingrese nombre cliente:");
        c.setNombre(reader.next());
        System.out.println("Ingrese apellido cliente:");
        c.setApellido(reader.next());
        System.out.println("Ingrese documento del cliente:");
        c.setDocumento(reader.nextInt());
        c.setMail("cliente@mail.com");
        c.setTelefono(987654321);

        return c;

    }
}
