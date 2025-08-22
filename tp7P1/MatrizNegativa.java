package tp7P1;

// Clase específica para el error de dimensiones negativas
// Hereda de MatrizException y pasa automáticamente el código de error correspondiente
public class MatrizNegativa extends MatrizException {

    public MatrizNegativa() {
        super(MatrizException.ERR_DIMENSIONES_NEGATIVAS);
    }

}
