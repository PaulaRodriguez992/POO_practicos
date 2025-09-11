package tp8;

import java.util.ArrayList;
import java.util.List;

public class MultiplicadorMatrices {
    public static void main(String[] args) {
        // Defino las matrices de prueba
        int[][] A = {
            {1, 2, 3},
            {4, 5, 6}
        };

        int[][] B = {
            {7, 8},
            {9, 10},
            {11, 12}
        };

        // Matriz resultado inicializada en ceros
        int[][] C = new int[A.length][B[0].length];

        // Lista para guardar los hilos
        List<Thread> hilos = new ArrayList<>();

        // Creo un hilo por cada celda de C
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B[0].length; j++) {
                Thread t = new Thread(new TareaMultiplicacion(A, B, C, i, j));
                t.start(); // Arranco el hilo
                hilos.add(t); // Lo guardo para luego esperar que termine
            }
        }

        // Espero a que todos los hilos terminen usando join()
        for (Thread hilo : hilos) {
            try {
                hilo.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Muestro la matriz resultado
        System.out.println("Matriz resultado:");
        for (int i = 0; i < C.length; i++) {
            for (int j = 0; j < C[0].length; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
    }
}

