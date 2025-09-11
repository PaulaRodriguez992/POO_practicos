package tp8;

// Cada instancia de esta clase calcula una celda de la matriz C
public class TareaMultiplicacion implements Runnable {
    private int[][] A; // Matriz A
    private int[][] B; // Matriz B
    private int[][] C; // Matriz resultado
    private int fila;  // Índice de la fila a calcular
    private int columna; // Índice de la columna a calcular

    // Constructor: recibe las matrices y la posición a calcular
    public TareaMultiplicacion(int[][] A, int[][] B, int[][] C, int fila, int columna) {
        this.A = A;
        this.B = B;
        this.C = C;
        this.fila = fila;
        this.columna = columna;
    }

    @Override
    public void run() {
        int suma = 0;
        // Producto escalar entre la fila de A y la columna de B
        for (int k = 0; k < B.length; k++) {
            suma += A[fila][k] * B[k][columna];
        }
        // Guardo el resultado en la matriz C
        C[fila][columna] = suma;
    }
}
