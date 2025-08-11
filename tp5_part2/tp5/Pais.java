package tp5_part2.tp5;

import java.util.HashSet;
import java.util.Set;

public class Pais {
    private String nombre;
    private String capital;
    private double superficie;
    private Continente continente;
    private Set<Provincia> provincias;
    private Set<Pais> limitrofes;

    public Pais(String nombre, String capital, double superficie, Continente continente) {
        this.nombre = nombre;
        this.capital = capital;
        this.superficie = superficie;
        this.continente = continente;
        this.provincias = new HashSet<>();
        this.limitrofes = new HashSet<>();
    }

    public String getNombre() {
        return nombre;
    }

    public String getCapital() {
        return capital;
    }

    public double getSuperficie() {
        return superficie;
    }

    public Continente getContinente() {
        return continente;
    }

    public Set<Provincia> getProvincias() {
        return provincias;
    }

    public void agregarProvincia(Provincia provincia) {
        provincias.add(provincia);
    }

    public Set<Pais> getLimitrofes() {
        return limitrofes;
    }

    public void agregarLimitrofe(Pais pais) {
        limitrofes.add(pais);
    }

    @Override
    public String toString() {
        return nombre + " (Capital: " + capital + ", Superficie: " + superficie + " km²)";
    }
}
