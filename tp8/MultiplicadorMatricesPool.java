package tp8;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class MultiplicadorMatricesPool {
    public static void main(String[] args) {
        int[][] A = {
            {1, 2, 3},
            {4, 5, 6}
        };

        int[][] B = {
            {7, 8},
            {9, 10},
            {11, 12}
        };

        int[][] C = new int[A.length][B[0].length];

        // Creo un pool de hilos con el número de procesadores disponibles
        int numHilos = Runtime.getRuntime().availableProcessors();
        ExecutorService executor = Executors.newFixedThreadPool(numHilos);

        // Envío cada tarea de multiplicación al pool
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B[0].length; j++) {
                executor.submit(new TareaMultiplicacion(A, B, C, i, j));
            }
        }

        // Indico que no se acepten más tareas
        executor.shutdown();

        try {
            // Espero hasta 1 minuto que todas las tareas terminen
            executor.awaitTermination(1, TimeUnit.MINUTES);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Imprimo la matriz resultado
        System.out.println("Matriz resultado (ExecutorService):");
        for (int i = 0; i < C.length; i++) {
            for (int j = 0; j < C[0].length; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
    }
}
