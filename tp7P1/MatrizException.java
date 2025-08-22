package tp7P1;

public class MatrizException extends Exception {

    // Constantes para identificar los tipos de errores
    public static final int ERR_COLUMNAS_EXCEDIDAS = 0;
    public static final int ERR_FILAS_EXCEDIDAS = 1;
    public static final int ERR_DIMENSIONES_NEGATIVAS = 2;
    public static final int ERR_FILA_FUERA_DE_RANGO = 3;
    public static final int ERR_COLUMNA_FUERA_DE_RANGO = 4;

    // Mensajes de error descriptivos
    private static final String[] ERRORES = {
        "El número de columnas excede el máximo permitido.",
        "El número de filas excede el máximo permitido.",
        "Las dimensiones de la matriz no pueden ser negativas o cero.",
        "El índice de la fila está fuera de rango.",
        "El índice de la columna está fuera de rango."
    };

    private String mensaje;

    // Constructor que recibe un mensaje personalizado
    public MatrizException(String mensaje) {
        this.mensaje = mensaje;
    }

    // Constructor que recibe un código de error y lo traduce al mensaje correspondiente
    public MatrizException(int codigoError) {
        this.mensaje = ERRORES[codigoError];
    }

    @Override
    public String toString() {
        return "ERROR MATRIZ: " + mensaje;
    }
}
