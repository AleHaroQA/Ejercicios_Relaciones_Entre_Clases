
package ejercicio2.entities;

public class Revolver {
    
    //Atributos
    private int posicionActual = (int) (Math.random()*7) + 1;
    private int posicionAgua = (int) (Math.random()*7) + 1;

    //Constructor
    public Revolver() {
    }
    
    //Getters 

    public int getPosicionActual() {
        return posicionActual;
    }

    public void setPosicionActual(int posicionActual) {
        this.posicionActual = posicionActual;
    }

    public int getPosicionAgua() {
        return posicionAgua;
    }

    public void setPosicionAgua(int posicionAgua) {
        this.posicionAgua = posicionAgua;
    }

    @Override
    public String toString() {
        return "revolver{" + "posicionActual=" + posicionActual + ", posicionAgua=" + posicionAgua + '}';
    }
    
    
    
    
}
