package tp9;

public class TestGenericos {
    public static void main(String[] args) {
        // Prueba con un array de enteros (Integer)
        Integer[] numeros = {10, 20, 30, 40, 50};
        System.out.println("Array de enteros original:");
        ArrayUtils.imprimirArray(numeros);

        // Intercambio de posiciones 1 y 3 (20 <-> 40)
        ArrayUtils.intercambiar(numeros, 1, 3);

        System.out.println("Array de enteros después del intercambio:");
        ArrayUtils.imprimirArray(numeros);

        System.out.println("\n---------------------------------\n");

        // Prueba con un array de Strings
        String[] palabras = {"Hola", "Mundo", "desde", "Java"};
        System.out.println("Array de strings original:");
        ArrayUtils.imprimirArray(palabras);

        // Intercambio de posiciones 0 y 2 ("Hola" <-> "desde")
        ArrayUtils.intercambiar(palabras, 0, 2);

        System.out.println("Array de strings después del intercambio:");
        ArrayUtils.imprimirArray(palabras);
    }
}
