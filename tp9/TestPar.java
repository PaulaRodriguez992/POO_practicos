package tp9;

public class TestPar {
    public static void main(String[] args) {
        System.out.println("\n--- Ejercicio Clase Genérica ---\n");

        // Ejemplo: producto (String + Integer)
        Par<String, Integer> producto = new Par<>("Laptop Gamer", 101);
        System.out.println("Producto: " + producto);

        // Ejemplo: estudiante (String + Double)
        Par<String, Double> estudiante = new Par<>("Ana Pérez", 9.5);
        System.out.println("Estudiante: " + estudiante);

        // Recupero el valor de forma segura (ya es Integer, no necesita cast)
        Integer idProducto = producto.getSegundo();
        System.out.println("ID recuperado: " + idProducto);

        // Si intento asignar un String en lugar de Integer → error de compilación
        // producto.setSegundo("ciento-uno"); // Descomentar para ver error
    }
}
