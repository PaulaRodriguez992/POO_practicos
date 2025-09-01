package tp7P2;

// Excepcion para listas o colecciones vacias
public class CollectionVaciaException extends Exception {
    public CollectionVaciaException(String mensaje) {
        super(mensaje);
    }
}
