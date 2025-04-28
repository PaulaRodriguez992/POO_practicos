package tp3.Ej5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Mensaje de entrada
        System.out.print("Ingresá un número entero: ");
        int numeroUsuario = sc.nextInt();

        // Creamos un objeto Entero con ese número
        Ejerc5 e = new Ejerc5(numeroUsuario);

        // Mostramos resultados usando los métodos de la clase Entero
        System.out.println("Número ingresado: " + e.getNumero());
        System.out.println("Cuadrado: " + e.cuadrado());
        System.out.println("¿Es par?: " + (e.esPar() ? "Sí" : "No"));
        System.out.println("¿Es primo?: " + (e.esPrimo() ? "Sí" : "No"));
        long fact = e.factorial();
        System.out.println("Factorial: " + (fact != -1 ? fact : "No existe para números negativos"));

        sc.close();
    }
}
