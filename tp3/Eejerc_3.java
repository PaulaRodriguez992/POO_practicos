import java.util.Scanner;

public class Eejerc_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese una palabra: ");
        String palabra = scanner.nextLine();

        if (Ejerc3.esPalindromo(palabra)) {
            System.out.println("La palabra es un palíndromo.");
        } else {
            System.out.println("La palabra no es un palíndromo.");
        }

        scanner.close();
    }
}