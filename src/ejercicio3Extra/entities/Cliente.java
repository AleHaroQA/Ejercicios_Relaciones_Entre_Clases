package ejercicio3Extra.entities;

public class Cliente {

     /*Gestión Integral de clientes. En este módulo vamos a registrar la información personal de
    cada cliente que posea pólizas en nuestra empresa. Nombre y apellido, documento, mail,
    domicilio, teléfono.*/

    //Atributos
    private String nombre;
    private String apellido;
    private int documento;
    private String mail;
    private int telefono;

    //Constructores
    public Cliente() {
    }

    //Getters y setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    //toString

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", documento=" + documento +
                ", mail='" + mail + '\'' +
                ", telefono=" + telefono +
                '}';
    }
}
