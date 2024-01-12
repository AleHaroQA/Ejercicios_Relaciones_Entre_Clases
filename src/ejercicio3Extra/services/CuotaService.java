package ejercicio3Extra.services;

import ejercicio3Extra.entities.Cuota;
import ejercicio3Extra.entities.Poliza;

import java.time.LocalDate;

public class CuotaService {

    public Cuota crearCuota(Poliza p, int i){

        Cuota c = new Cuota();
        c.setNumCuota(c.getNumCuota()+(i+1));
        c.setMontoCuota(p.getMontoTotal()/p.getCantidadCuotas());
        if (i==0) {
            c.setFechaVencimiento(p.getFechaInicio().plusMonths(1));
        }else{
            c.setFechaVencimiento(p.getFechaInicio().plusMonths((i+1)));
        }

        c.setFormaDePago(p.getFormaDePago());

        return c;
    }
}
