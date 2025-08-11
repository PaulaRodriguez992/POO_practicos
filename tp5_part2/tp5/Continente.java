package tp5_part2.tp5;

import java.util.HashSet;
import java.util.Set;

public class Continente {
    private String nombre;
    private Set<Pais> paises;

    public Continente(String nombre) {
        this.nombre = nombre;
        this.paises = new HashSet<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Set<Pais> getPaises() {
        return paises;
    }

    public void agregarPais(Pais pais) {
        paises.add(pais);
    }

    @Override
    public String toString() {
        return nombre;
    }
}
