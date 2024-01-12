
package ejercicio2.services;

import ejercicio2.entities.Revolver;
import ejercicio2.entities.Jugador;

public class JugadorService {
    
    RevolverService rs = new RevolverService();
    
    public boolean disparo(Revolver r, Jugador j){
        
        if (!rs.mojar(r)) {
            rs.siguienteChorro(r);
        }else{
            j.setMojado(true);
        }
        return rs.mojar(r);
    }
}
