package tp9;

// Clase genérica que guarda un par de valores de distintos tipos
public class Par<T, U> {
    private T primero;  // primer elemento del par
    private U segundo;  // segundo elemento del par

    // Constructor
    public Par(T primero, U segundo) {
        this.primero = primero;
        this.segundo = segundo;
    }

    // Getters y Setters
    public T getPrimero() {
        return primero;
    }

    public void setPrimero(T primero) {
        this.primero = primero;
    }

    public U getSegundo() {
        return segundo;
    }

    public void setSegundo(U segundo) {
        this.segundo = segundo;
    }

    @Override
    public String toString() {
        return "Par(" + primero + ", " + segundo + ")";
    }
}
