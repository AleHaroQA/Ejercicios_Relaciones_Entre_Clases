package ejercicio3Extra.services;

import ejercicio3Extra.entities.Cuota;
import ejercicio3Extra.entities.Poliza;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.System.in;


public class PolizaService {

    Scanner reader;
    ClienteService clienteS;
    VehiculoService vs;
    CuotaService cuotaS;

    public PolizaService() {
        this.reader =  new Scanner(in);
        this.clienteS = new ClienteService();
        this.vs = new VehiculoService();
        this.cuotaS = new CuotaService();
    }

    public Poliza crearPoliza(){

        Poliza p = new Poliza();
        List<Cuota> listaCuotas = new ArrayList();
        p.setNumPoliza(p.getNumPoliza()+1);
        System.out.println("Ingrese cantidad de cuotas (máx 12):");
        p.setCantidadCuotas(reader.nextInt());
        p.setFechaInicio(LocalDate.now());
        p.setFechaTermino(p.getFechaInicio().plusYears(1));
        System.out.println("Ingrese forma de pago (Crédito|Débito|Efectivo):");
        p.setFormaDePago(reader.next());
        p.setMontoTotal(120000);
        System.out.println("Ingrese tipo de cobertura (Total|Parcial|Terceros):");
        p.setTipoCobertura(reader.next());
        p.setCliente(clienteS.crearCliente());
        p.setVehiculo(vs.crearVehiculo());

        for (int i = 0; i < p.getCantidadCuotas(); i++) {
            listaCuotas.add(cuotaS.crearCuota(p, i));
        }
        p.setListaCuotas(listaCuotas);
        return p;
    }

    public void pagarCuota(Poliza p){

        int cont = 0;
        System.out.println("Elija cuota a pagar:");
        for (Cuota c : p.getListaCuotas()) {
            cont++;
            if (!c.isPagada()) {
                System.out.println(cont + " " + c);
            }
        }
        int opc = reader.nextInt();

        for (int i = 0; i < p.getListaCuotas().size(); i++) {
            if (!p.getListaCuotas().get(opc-1).isPagada()) {
                p.getListaCuotas().get(opc-1).setPagada(true);
            }
        }
    }
}
