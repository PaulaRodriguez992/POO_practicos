package tp7P1;

import java.util.Vector;

// Clase que representa una matriz dinámica de objetos usando Vector
public class MatrizObjetos {
    // Tamaños máximos permitidos
    static int max_rows = 200;
    static int max_cols = 200;

    // Array de vectores (cada vector es una fila)
    private Vector<Object>[] cuerpo;

    // Constructor: valida dimensiones y crea la matriz
    public MatrizObjetos(int columnas, int filas) throws MatrizException {
        validarDimensiones(columnas, filas);

        // Creación segura de un array de vectores con generics
        @SuppressWarnings("unchecked")
        Vector<Object>[] temp = (Vector<Object>[]) new Vector<?>[filas];
        cuerpo = temp;

        // Inicializamos cada fila como un Vector con capacidad inicial = columnas
        for (int i = 0; i < filas; i++) {
            cuerpo[i] = new Vector<Object>(columnas);
        }
    }

    // Valida que las dimensiones sean correctas antes de crear la matriz
    private void validarDimensiones(int columnas, int filas) throws MatrizException {
        if (columnas <= 0 || filas <= 0) {
            throw new MatrizException(MatrizException.ERR_DIMENSIONES_NEGATIVAS);
        }
        if (columnas > max_cols) {
            throw new MatrizException(MatrizException.ERR_COLUMNAS_EXCEDIDAS);
        }
        if (filas > max_rows) {
            throw new MatrizException(MatrizException.ERR_FILAS_EXCEDIDAS);
        }
    }

    // Valida que los índices de fila y columna estén dentro de los límites
    private void validarIndices(int row, int col) throws MatrizException {
        if (row < 0 || row >= cuerpo.length) {
            throw new MatrizException(MatrizException.ERR_FILA_FUERA_DE_RANGO);
        }
        if (col < 0 || col >= max_cols) {
            throw new MatrizException(MatrizException.ERR_COLUMNA_FUERA_DE_RANGO);
        }
    }

    // Inserta un objeto en la posición [row][col]
    public void setRowCol(int row, int col, Object obj) throws MatrizException {
        validarIndices(row, col); // Programación defensiva
        cuerpo[row].add(col, obj);
    }

    // Devuelve el objeto almacenado en la posición [row][col]
    public Object getRowCol(int row, int col) throws MatrizException {
        validarIndices(row, col); // Programación defensiva
        return cuerpo[row].elementAt(col);
    }

    // Devuelve todos los elementos en formato String
    @Override
    public String toString() {
        StringBuilder staux = new StringBuilder();
        for (Vector<Object> fila : cuerpo) {
            for (Object obj : fila) {
                staux.append(obj).append(" ");
            }
        }
        return staux.toString().trim();
    }
}
