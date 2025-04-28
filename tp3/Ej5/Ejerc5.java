package tp3.Ej5;
public class Ejerc5 {
    private int numero;

    // Constructor
    public Ejerc5 (int numero) {
        this.numero = numero;
    }

    // Getter y Setter
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    // Cuadrado
    public long cuadrado() {
        return (long) numero * numero;
    }

    // Es par
    public boolean esPar() {
        return numero % 2 == 0;
    }

    // Es primo
    public boolean esPrimo() {
        if (numero <= 1) return false;
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) return false;
        }
        return true;
    }

    // Factorial
    public long factorial() {
        if (numero < 0) return -1; // No existe factorial de negativos
        long resultado = 1;
        for (int i = 2; i <= numero; i++) {
            resultado *= i;
        }
        return resultado;
    }
}
