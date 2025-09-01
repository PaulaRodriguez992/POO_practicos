package tp7P2;

// Excepcion para validar cadenas de texto
public class StringException extends Exception {
    public StringException(String mensaje) {
        super(mensaje);
    }
}