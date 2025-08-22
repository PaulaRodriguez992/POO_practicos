package tp7P1;

import java.util.ArrayList;
import java.util.List;

// Implemento mi propio "Vector" pero usando internamente un ArrayList
public class Vector {

    private List<Object> elementos;

    public Vector(int capacidadInicial) {
        // Creo la lista con capacidad inicial
        elementos = new ArrayList<>(capacidadInicial);
        // Lleno la lista con null para que ya tenga el tamaño definido
        for (int i = 0; i < capacidadInicial; i++) {
            elementos.add(null);
        }
    }

    // Método para agregar un elemento en un índice específico
    public void add(int index, Object obj) {
        elementos.set(index, obj);
    }

    // Método para obtener el elemento en un índice
    public Object elementAt(int index) {
        return elementos.get(index);
    }

    // Método para saber el tamaño del vector
    public int size() {
        return elementos.size();
    }
}
