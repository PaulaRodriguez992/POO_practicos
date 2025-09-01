package tp7P2;

// Excepcion para cuando no se encuentra un elemento buscado
public class NoEncontradoException extends Exception {
    public NoEncontradoException(String mensaje) {
        super(mensaje);
    }
}
