package ejercicio1.services;

import ejercicio1.entities.Perro;

import java.util.ArrayList;
import java.util.List;


public class PerroService {

    int contPerro = 0;
    private List<Perro> listaPerros;

    public PerroService() {
        this.listaPerros = new ArrayList<>();
    }

    public Perro crearPerro(){

        contPerro +=1;
        Perro p = new Perro();
        p.setNombre("Chiquito" + (contPerro));
        p.setRaza("Golden Retriever");
        p.setEdad(0 +contPerro );
        p.setTamanio("Grande");
        p.setAdoptado(false);

        return p;
    }

    public void agregarPerro(){

        for (int i = 0; i < 2; i++) {

            listaPerros.add(crearPerro());
        }
    }

    public void mostrarListaPerros(){

        for (Perro p : listaPerros) {
            System.out.println(p);
        }
    }

    public List<Perro> getListaPerros() {
        return listaPerros;
    }
}
