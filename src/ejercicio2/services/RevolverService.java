
package ejercicio2.services;

import ejercicio2.entities.Revolver;


public class RevolverService {
    
    public boolean mojar(Revolver r){
        
        return r.getPosicionActual()==r.getPosicionAgua();
        
    }
    
    public void siguienteChorro(Revolver r){
        if (r.getPosicionActual() < 7) {
            r.setPosicionActual(r.getPosicionActual() + 1);
        } else{
            r.setPosicionActual(1);
        }
    }
    
    
}
