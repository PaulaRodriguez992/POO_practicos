package tp7P1;

// Clase de excepción personalizada para errores de la MatrizObjetos
public class MatrizException extends Exception {

    // Códigos de error como constantes públicas y finales
    public static final int ERR_COLUMNAS_EXCEDIDAS = 0;
    public static final int ERR_FILAS_EXCEDIDAS = 1;
    public static final int ERR_DIMENSIONES_NEGATIVAS = 2;
    public static final int ERR_FILA_FUERA_DE_RANGO = 3;
    public static final int ERR_COLUMNA_FUERA_DE_RANGO = 4;

    // Mensajes de error correspondientes a cada código
    private static final String[] ERRORES = {
        "El número de columnas excede el máximo permitido.",
        "El número de filas excede el máximo permitido.",
        "Las dimensiones de la matriz no pueden ser negativas o cero.",
        "El índice de la fila está fuera de rango.",
        "El índice de la columna está fuera de rango."
    };

    private String mensaje; // Guarda el mensaje de error actual

    // Constructor que recibe el código de error y asigna el mensaje correspondiente
    public MatrizException(int codigoError) {
        super(ERRORES[codigoError]);
        this.mensaje = ERRORES[codigoError];
    }

    // Sobrescribimos toString para mostrar un formato más claro
    @Override
    public String toString() {
        return "ERROR MATRIZ: " + mensaje;
    }
}
