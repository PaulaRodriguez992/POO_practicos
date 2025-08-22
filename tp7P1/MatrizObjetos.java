package tp7P1;

public class MatrizObjetos {

    // Valores máximos permitidos para filas y columnas
    static int max_rows = 200;
    static int max_cols = 200;

    // La matriz en sí, representada como un arreglo de "Vector"
    private Vector[] cuerpo;

    // Constructor con validaciones
    public MatrizObjetos(int columnas, int filas) throws MatrizException {
        // Primero valido que las dimensiones sean positivas
        if (columnas <= 0 || filas <= 0) {
            throw new MatrizNegativa();
        }
        // Valido que no exceda columnas máximas
        if (columnas > max_cols) {
            throw new MatrizException(MatrizException.ERR_COLUMNAS_EXCEDIDAS);
        }
        // Valido que no exceda filas máximas
        if (filas > max_rows) {
            throw new MatrizException(MatrizException.ERR_FILAS_EXCEDIDAS);
        }

        // Si pasó todas las validaciones, inicializo la matriz
        cuerpo = new Vector[filas];
        for (int i = 0; i < filas; i++) {
            cuerpo[i] = new Vector(columnas);
        }
    }

    // Método para asignar un valor en una posición
    public void setRowCol(int row, int col, Object obj) throws MatrizException {
        // Valido que la fila esté dentro del rango
        if (row < 0 || row >= cuerpo.length) {
            throw new MatrizException(MatrizException.ERR_FILA_FUERA_DE_RANGO);
        }
        // Valido que la columna esté dentro del rango
        if (col < 0 || col >= cuerpo[row].size()) {
            throw new MatrizException(MatrizException.ERR_COLUMNA_FUERA_DE_RANGO);
        }
        // Si está todo bien, asigno el valor
        cuerpo[row].add(col, obj);
    }

    // Método para obtener un valor de la matriz
    public Object getRowCol(int row, int col) throws MatrizException {
        // Valido fila
        if (row < 0 || row >= cuerpo.length) {
            throw new MatrizException(MatrizException.ERR_FILA_FUERA_DE_RANGO);
        }
        // Valido columna
        if (col < 0 || col >= cuerpo[row].size()) {
            throw new MatrizException(MatrizException.ERR_COLUMNA_FUERA_DE_RANGO);
        }
        // Devuelvo el elemento
        return cuerpo[row].elementAt(col);
    }

    // Método para mostrar toda la matriz en texto
    @Override
    public String toString() {
        StringBuilder staux = new StringBuilder();
        for (Vector fila : cuerpo) {
            for (int j = 0; j < fila.size(); j++) {
                staux.append(fila.elementAt(j)).append(" ");
            }
            staux.append("\n");
        }
        return staux.toString();
    }
}
