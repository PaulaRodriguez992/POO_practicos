package tp7P2;

// Excepcion para validar numeros enteros positivos
public class EnteroPositivoException extends Exception {
    public EnteroPositivoException(String mensaje) {
        super(mensaje);
    }
}
