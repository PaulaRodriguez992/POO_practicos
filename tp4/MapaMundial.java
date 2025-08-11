package tp4;

import java.util.*;

public class MapaMundial {
    private List<Continente> continentes;

    public MapaMundial() {
        continentes = new ArrayList<>();
    }

    public void inicializarDatos() {
        Continente america = new Continente("América");
        Continente europa = new Continente("Europa");
        continentes.addAll(Arrays.asList(america, europa));

        Pais argentina = new Pais("Argentina", "Buenos Aires", 2780400, america);
        argentina.agregarProvincia(new Provincia("Entre Ríos", argentina));
        argentina.agregarProvincia(new Provincia("Buenos Aires", argentina));

        Pais uruguay = new Pais("Uruguay", "Montevideo", 176215, america);
        uruguay.agregarProvincia(new Provincia("Salto", uruguay));

        america.agregarPais(argentina);
        america.agregarPais(uruguay);

        Pais espana = new Pais("España", "Madrid", 505990, europa);
        espana.agregarProvincia(new Provincia("Madrid", espana));

        europa.agregarPais(espana);

        argentina.agregarLimitrofe(uruguay);
        uruguay.agregarLimitrofe(argentina);
    }

    public void agregarPais(String nombre, String capital, double superficie, String nombreContinente) {
        Continente continente = buscarContinente(nombreContinente);
        if (continente == null) {
            continente = new Continente(nombreContinente);
            continentes.add(continente);
        }
        Pais nuevoPais = new Pais(nombre, capital, superficie, continente);
        continente.agregarPais(nuevoPais);
    }

    public void agregarProvincia(String nombreProvincia, String nombrePais) {
        Pais pais = buscarPais(nombrePais);
        if (pais != null) {
            pais.agregarProvincia(new Provincia(nombreProvincia, pais));
        }
    }

    public void agregarLimitrofe(String nombrePais, String nombreLimitrofe) {
        Pais pais = buscarPais(nombrePais);
        Pais paisLimitrofe = buscarPais(nombreLimitrofe);
        if (pais != null && paisLimitrofe != null) {
            pais.agregarLimitrofe(paisLimitrofe);
            paisLimitrofe.agregarLimitrofe(pais);
        }
    }

    public Set<Pais> getPaises(String nombreContinente) {
        Continente continente = buscarContinente(nombreContinente);
        if (continente != null) {
            return new HashSet<>(continente.getPaises());
        }
        return Collections.emptySet();
    }

    public Set<Provincia> getProvincias(String nombrePais) {
        Pais pais = buscarPais(nombrePais);
        if (pais != null) {
            return new HashSet<>(pais.getProvincias());
        }
        return Collections.emptySet();
    }

    public Set<Pais> getLimitrofes(String nombrePais) {
        Pais pais = buscarPais(nombrePais);
        if (pais != null) {
            return new HashSet<>(pais.getLimitrofes());
        }
        return Collections.emptySet();
    }

    public Pais buscarPais(String nombrePais) {
        for (Continente continente : continentes) {
            for (Pais pais : continente.getPaises()) {
                if (pais.getNombre().equalsIgnoreCase(nombrePais)) {
                    return pais;
                }
            }
        }
        return null;
    }

    private Continente buscarContinente(String nombre) {
        for (Continente c : continentes) {
            if (c.getNombre().equalsIgnoreCase(nombre)) {
                return c;
            }
        }
        return null;
    }
}
