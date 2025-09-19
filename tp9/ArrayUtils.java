package tp9;

// Clase de utilidades con métodos genéricos
public class ArrayUtils {

    // Método genérico para intercambiar dos elementos de un array
    // <T> indica que T es un parámetro de tipo (puede ser Integer, String, etc.)
    public static <T> void intercambiar(T[] array, int indice1, int indice2) {
        // Valido que los índices no estén fuera de rango
        if (indice1 < 0 || indice1 >= array.length || indice2 < 0 || indice2 >= array.length) {
            System.out.println("Índices fuera de rango.");
            return;
        }

        // Intercambio usando una variable temporal
        T temp = array[indice1];
        array[indice1] = array[indice2];
        array[indice2] = temp;
    }

    // Método genérico para imprimir cualquier array
    public static <T> void imprimirArray(T[] array) {
        System.out.print("[ ");
        for (T elemento : array) {
            System.out.print(elemento + " ");
        }
        System.out.println("]");
    }
}
