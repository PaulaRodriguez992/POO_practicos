package tp3.Ej4;

import java.util.Arrays;

public class main {
    public static void Ejerc4(String[] args) {
        Ejerc4 miArray = new Ejerc4();

        System.out.println("Análisis del array:");
        System.out.println("Cantidad de números: " + miArray.getCantidad());
        System.out.println("Número mayor: " + miArray.getMayor());
        System.out.println("Promedio: " + miArray.getPromedio());
        System.out.println("Orden ascendente: " + Arrays.toString(miArray.getOrdenAscendente()));
        System.out.println("Orden descendente: " + Arrays.toString(miArray.getOrdenDescendente()));
    }
}
