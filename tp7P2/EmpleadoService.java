package tp7P2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EmpleadoService {

    private static List<Empleado> empleados = new ArrayList<>();

    //propaga la excepcion de setLegajo()
    public static Boolean agregar(Empleado empleado) throws EnteroPositivoException {
        // Llamo a setLegajo para validar antes de agregar
        empleado.setLegajo(empleado.getLegajo());
        return empleados.add(empleado);
    }

    // Devuelve el empleado con mayor sueldo
    // Modificacion: lanza CollectionVaciaException si la lista está vacía
    public static Empleado mayorSueldo() throws CollectionVaciaException {
        if (empleados.isEmpty()) {
            throw new CollectionVaciaException("No hay empleados.");
        }

        Empleado mayor = empleados.get(0);
        for (Empleado empleado : empleados) {
            if (empleado.getSueldo() > mayor.getSueldo()) {
                mayor = empleado;
            }
        }
        return mayor;
    }

    // Devuelve el sueldo promedio
    // Modificacion: lanza CollectionVaciaException si la lista está vacía
    public static Double sueldoPromedio() throws CollectionVaciaException {
        if (empleados.isEmpty()) {
            throw new CollectionVaciaException("No hay empleados.");
        }

        Double total = 0.0;
        for (Empleado empleado : empleados) {
            total += empleado.getSueldo();
        }
        return total / empleados.size();
    }

    // Elimina un empleado por nombre
    // Modificacion: lanza CollectionVaciaException si la lista está vacía
    // y NoEncontradoException si no lo encuentra
    public static void eliminar(String nombre) throws CollectionVaciaException, NoEncontradoException {
        if (empleados.isEmpty()) {
            throw new CollectionVaciaException("No hay empleados.");
        }

        Iterator<Empleado> iterador = empleados.iterator();
        boolean encontrado = false;
        while (iterador.hasNext()) {
            Empleado empl = iterador.next();
            if (empl.getNombre().equalsIgnoreCase(nombre)) {
                iterador.remove();
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            throw new NoEncontradoException("No se encontró el empleado.");
        }
    }

    public static List<Empleado> getEmpleados() {
        return empleados;
    }
}
