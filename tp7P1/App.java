package tp7P1;

// Clase de prueba para MatrizObjetos
public class App {
    public static void main(String[] args) {

        // Caso 1: Crear matriz con dimensiones inválidas (columnas negativas)
        try {
            System.out.println("Prueba 1: Matriz con columnas negativas");
            new MatrizObjetos(-5, 10);
        } catch (MatrizException e) {
            System.out.println("Se capturó: " + e);
        }

        // Caso 2: setRowCol con fila fuera de rango
        try {
            System.out.println("\nPrueba 2: setRowCol con fila fuera de rango");
            MatrizObjetos m2 = new MatrizObjetos(5, 5);
            m2.setRowCol(10, 0, "Fuera de rango");
        } catch (MatrizException e) {
            System.out.println("Se capturó: " + e);
        }

        // Caso 3: getRowCol con columna fuera de rango
        try {
            System.out.println("\nPrueba 3: getRowCol con columna fuera de rango");
            MatrizObjetos m3 = new MatrizObjetos(5, 5);
            m3.getRowCol(0, 50);
        } catch (MatrizException e) {
            System.out.println("Se capturó: " + e);
        }

        // Caso 4: Operaciones correctas
        try {
            System.out.println("\nPrueba 4: Operaciones válidas");
            MatrizObjetos m4 = new MatrizObjetos(5, 5);
            m4.setRowCol(0, 0, "Hola");
            m4.setRowCol(1, 1, 123);
            System.out.println("Elemento (0,0): " + m4.getRowCol(0, 0));
            System.out.println("Elemento (1,1): " + m4.getRowCol(1, 1));
            System.out.println("Contenido matriz: " + m4);
        } catch (MatrizException e) {
            System.out.println("Se capturó: " + e);
        }
    }
}
