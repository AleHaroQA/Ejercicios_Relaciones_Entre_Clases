
package ejercicio2.entities;

public class Jugador {
    
    private int ID;
    private String Nombre ;
    private boolean Mojado ;

    public Jugador() {
    }

    public Jugador(int ID) {
        this.ID = ID;
        this.Nombre = "Jugador " + ID;
        this.Mojado = false;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public boolean isMojado() {
        return Mojado;
    }

    public void setMojado(boolean Mojado) {
        this.Mojado = Mojado;
    }

    @Override
    public String toString() {
        return "Jugador{" + "ID=" + ID + ", Nombre=" + Nombre + ", Mojado=" + Mojado + '}';
    }

    
    
    
    
}
