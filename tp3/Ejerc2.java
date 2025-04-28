/*Clasificador de Calificaciones:
• Ingresa una calificación numérica (por ejemplo, de 0 a 10).
Utiliza una serie de if-else if-else para clasificar la calificación en categorías como "Aprobado", "Reprobado",
"Sobresaliente", etc. Define tus propios rangos.*/
package tp3;
import java.util.Scanner;

public class Ejerc2{
    public static void main(String[] args) {
        //Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in) ;
       
        System.out.println ("ingrese una calificacion del 1 al 10: ");
        int calificacion = scanner.nextInt();
            
        if (calificacion >= 9) {
            System.out.println ("Sobresaliente");
        } else if (calificacion >= 7) {
            System.out.println ("Aprobado");
        } else if (calificacion == 6) {
            System.out.println ("Regular");
        } else {
            System.out.println ("Reprobado");
        }
        scanner.close();
    }
}