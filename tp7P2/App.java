package tp7P2;

public class App {
    public static void main(String[] args) {
        // Prueba 1: Constructor con nombre inválido
        try {
            System.out.println("Prueba 1: Nombre inválido");
            Empleado e1 = new Empleado("Jo", 1000);
        } catch (Exception e) {
            System.out.println("Se capturó: " + e.getMessage());
        }

        // Prueba 2: Constructor con sueldo inválido
        try {
            System.out.println("\nPrueba 2: Sueldo inválido");
            Empleado e2 = new Empleado("Juan", -500);
        } catch (Exception e) {
            System.out.println("Se capturó: " + e.getMessage());
        }

        // Prueba 3: Uso de setNombre con error
        try {
            System.out.println("\nPrueba 3: setNombre con error");
            Empleado e3 = new Empleado("Pedro", 2000);
            e3.setNombre("Al");
        } catch (Exception e) {
            System.out.println("Se capturó: " + e.getMessage());
        }

        // Prueba 4: Uso de setLegajo con error
        try {
            System.out.println("\nPrueba 4: setLegajo con error");
            Empleado e4 = new Empleado("Ana", 3000);
            e4.setLegajo(0);
        } catch (Exception e) {
            System.out.println("Se capturó: " + e.getMessage());
        }

        // Prueba 5: mayorSueldo con lista vacía
        try {
            System.out.println("\nPrueba 5: mayorSueldo con lista vacía");
            EmpleadoService.mayorSueldo();
        } catch (Exception e) {
            System.out.println("Se capturó: " + e.getMessage());
        }

        // Prueba 6: sueldoPromedio con lista vacía
        try {
            System.out.println("\nPrueba 6: sueldoPromedio con lista vacía");
            EmpleadoService.sueldoPromedio();
        } catch (Exception e) {
            System.out.println("Se capturó: " + e.getMessage());
        }

        // Prueba 7: eliminar con lista vacía
        try {
            System.out.println("\nPrueba 7: eliminar con lista vacía");
            EmpleadoService.eliminar("Juan");
        } catch (Exception e) {
            System.out.println("Se capturó: " + e.getMessage());
        }

        // Prueba 8: agregar y luego eliminar un empleado
        try {
            System.out.println("\nPrueba 8: agregar y eliminar un empleado");
            Empleado e5 = new Empleado("Mario", 4000);
            e5.setLegajo(1);
            EmpleadoService.agregar(e5);
            EmpleadoService.eliminar("Mario");
            System.out.println("Empleado eliminado correctamente");
        } catch (Exception e) {
            System.out.println("Se capturó: " + e.getMessage());
        }
    }
}
