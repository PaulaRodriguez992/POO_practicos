package tp7P1;

public class App {
    public static void main(String[] args) {

        // Prueba 1: Intento crear matriz con columnas negativas
        try {
            System.out.println("Prueba 1: Matriz con columnas negativas");
            MatrizObjetos m1 = new MatrizObjetos(-5, 3);
        } catch (MatrizException e) {
            System.out.println("Se capturó: " + e);
        }

        // Prueba 2: Intento crear matriz con columnas que exceden el límite
        try {
            System.out.println("\nPrueba 2: Matriz con columnas excedidas");
            new MatrizObjetos(500, 2);
        } catch (MatrizException e) {
            System.out.println("Se capturó: " + e);
        }

        // Prueba 3: Intento poner un valor en una fila inexistente
        try {
            System.out.println("\nPrueba 3: setRowCol con fila fuera de rango");
            MatrizObjetos m3 = new MatrizObjetos(3, 3);
            m3.setRowCol(5, 0, "dato");
        } catch (MatrizException e) {
            System.out.println("Se capturó: " + e);
        }

        // Prueba 4: Intento obtener un valor de una columna inexistente
        try {
            System.out.println("\nPrueba 4: getRowCol con columna fuera de rango");
            MatrizObjetos m4 = new MatrizObjetos(3, 3);
            m4.getRowCol(0, 10);
        } catch (MatrizException e) {
            System.out.println("Se capturó: " + e);
        }

        // Prueba 5: Caso correcto
        try {
            System.out.println("\nPrueba 5: Uso correcto");
            MatrizObjetos m5 = new MatrizObjetos(3, 3);
            m5.setRowCol(0, 0, "Hola");
            m5.setRowCol(1, 1, 123);
            System.out.println("Elemento [0,0]: " + m5.getRowCol(0, 0));
            System.out.println("Matriz completa:\n" + m5);
        } catch (MatrizException e) {
            System.out.println("Se capturó: " + e);
        }
    }
}
