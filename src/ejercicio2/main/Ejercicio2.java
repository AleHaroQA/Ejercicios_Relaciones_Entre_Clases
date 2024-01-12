
package ejercicio2.main;

import ejercicio2.entities.Revolver;
import ejercicio2.services.JuegoService;


public class Ejercicio2 {

    
    public static void main(String[] args) {
        JuegoService js = new JuegoService();
        Revolver r = new Revolver();
        
        js.ronda(js.llenarJuego(js.cargarLista(),r));
        
    }
    
}
