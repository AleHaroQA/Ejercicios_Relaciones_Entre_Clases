package ejercicio3Extra.entities;

import java.time.LocalDate;
import java.util.List;

public class Poliza {

    /*Gestión de Pólizas: Se registrará una póliza, donde se guardará los datos tanto de un
    vehículo, como los datos de un solo cliente. Los datos incluidos en ella son: número de
    póliza, fecha de inicio y fin de la póliza, cantidad de cuotas, forma de pago, monto total
    asegurado, incluye granizo, monto máximo granizo, tipo de cobertura (total, contra
    terceros, etc.). Nota: prestar atención al principio de este enunciado y pensar en las
    relaciones entre clases. Recuerden que pueden ser de uno a uno, de uno a muchos, de
    muchos a uno o de muchos a muchos.*/

    //Atributos
    private int numPoliza;
    private LocalDate fechaInicio;
    private LocalDate fechaTermino;
    private int cantidadCuotas;
    private String formaDePago;
    private double montoTotal;
    private String tipoCobertura;
    private Cliente cliente;
    private Vehiculo vehiculo;
    private List<Cuota> listaCuotas;

    //Constructores

    public Poliza() {
    }

    //Getters y setters

    public int getNumPoliza() {
        return numPoliza;
    }

    public void setNumPoliza(int numPoliza) {
        this.numPoliza = numPoliza;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaTermino() {
        return fechaTermino;
    }

    public void setFechaTermino(LocalDate fechaTermino) {
        this.fechaTermino = fechaTermino;
    }

    public int getCantidadCuotas() {
        return cantidadCuotas;
    }

    public void setCantidadCuotas(int cantidadCuotas) {
        this.cantidadCuotas = cantidadCuotas;
    }

    public String getFormaDePago() {
        return formaDePago;
    }

    public void setFormaDePago(String formaDePago) {
        this.formaDePago = formaDePago;
    }

    public double getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(double montoTotal) {
        this.montoTotal = montoTotal;
    }

    public String getTipoCobertura() {
        return tipoCobertura;
    }

    public void setTipoCobertura(String tipoCobertura) {
        this.tipoCobertura = tipoCobertura;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public List<Cuota> getListaCuotas() {
        return listaCuotas;
    }

    public void setListaCuotas(List<Cuota> listaCuotas) {
        this.listaCuotas = listaCuotas;
    }

    //toString

    @Override
    public String toString() {
        return "Poliza{" +
                "numPoliza=" + numPoliza +
                ", fechaInicio=" + fechaInicio +
                ", fechaTermino=" + fechaTermino +
                ", cantidadCuotas=" + cantidadCuotas +
                ", formaDePago='" + formaDePago + '\'' +
                ", montoTotal=" + montoTotal +
                ", tipoCobertura='" + tipoCobertura + '\'' +
                ", cliente=" + cliente +
                ", vehiculo=" + vehiculo +
                ", listaCuotas=" + listaCuotas +
                '}';
    }
}
