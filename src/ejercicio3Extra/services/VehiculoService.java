package ejercicio3Extra.services;

import ejercicio3Extra.entities.Vehiculo;

import java.util.Scanner;


public class VehiculoService {

    Scanner reader = new Scanner(System.in);

    public Vehiculo crearVehiculo(){

        Vehiculo v = new Vehiculo();
        System.out.println("----------INGRESO VEHICULO----------");
        System.out.println("Ingrese marca del vehículo:");
        v.setMarca(reader.next());
        System.out.println("Ingrese número de motor:");
        v.setNumMotor(reader.nextInt());
        System.out.println("Ingrese color del vehiculo");
        v.setColor(reader.next());
        v.setModelo("VX625");
        v.setYear(2020);
        System.out.println("Ingrese tipo de vehiculo");
        System.out.println("Auto, Moto, Camioneta, Camión, Bus");
        v.setTipo(reader.next());
        if (v.getTipo().equalsIgnoreCase("auto") || v.getTipo().equalsIgnoreCase("moto")) {
            v.setChasis("Monocasco");
        }else {
            v.setChasis("Bastidor");
        }

        return v;
    }
}
