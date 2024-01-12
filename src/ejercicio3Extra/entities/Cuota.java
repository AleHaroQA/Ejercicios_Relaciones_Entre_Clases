package ejercicio3Extra.entities;

import java.time.LocalDate;

public class Cuota {

    /*Gestión de cuotas: Se registrarán y podrán consultar las cuotas generadas en cada póliza.
    Esas cuotas van a contener la siguiente información: número de cuota, monto total de la
    cuota, si está o no pagada, fecha de vencimiento, forma de pago (efectivo, transferencia,
    etc.). */

    //Atributos

    private int numCuota;
    private double montoCuota;
    private boolean pagada = false;
    private LocalDate fechaVencimiento;
    private String formaDePago;

    //Constructores

    public Cuota() {
    }

    //Getters y setters

    public int getNumCuota() {
        return numCuota;
    }

    public void setNumCuota(int numCuota) {
        this.numCuota = numCuota;
    }

    public double getMontoCuota() {
        return montoCuota;
    }

    public void setMontoCuota(double montoCuota) {
        this.montoCuota = montoCuota;
    }

    public boolean isPagada() {
        return pagada;
    }

    public void setPagada(boolean pagada) {
        this.pagada = pagada;
    }

    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(LocalDate fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getFormaDePago() {
        return formaDePago;
    }

    public void setFormaDePago(String formaDePago) {
        this.formaDePago = formaDePago;
    }

    //toString

    @Override
    public String toString() {
        return "Cuota{" +
                "numCuota=" + numCuota +
                ", montoCuota=" + montoCuota +
                ", pagada=" + pagada +
                ", fechaVencimiento=" + fechaVencimiento +
                ", formaDePago='" + formaDePago + '\'' +
                '}';
    }
}
