package tp3.Ej4;

import java.util.Arrays;

public class Ejerc4 {
    private int[] numeros = {4, 2, 3, 8, 1};

    // Setter y Getter
    public void setNumeros(int[] numeros) {
        this.numeros = numeros;
    }

    public int[] getNumeros() {
        return this.numeros;
    }

    // Cantidad de elementos
    public int getCantidad() {
        return numeros.length;
    }

    // Mayor número
    public int getMayor() {
        int mayor = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }
        }
        return mayor;
    }

    // Promedio
    public double getPromedio() {
        int suma = 0;
        for (int n : numeros) {
            suma += n;
        }
        return (double) suma / numeros.length;
    }

    // Orden ascendente
    public int[] getOrdenAscendente() {
        int[] copia = Arrays.copyOf(numeros, numeros.length);
        Arrays.sort(copia);
        return copia;
    }

    // Orden descendente
    public int[] getOrdenDescendente() {
        int[] copia = getOrdenAscendente();
        for (int i = 0; i < copia.length / 2; i++) {
            int temp = copia[i];
            copia[i] = copia[copia.length - 1 - i];
            copia[copia.length - 1 - i] = temp;
        }
        return copia;
    }
}
