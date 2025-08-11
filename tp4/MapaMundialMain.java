package tp4;

import java.util.*;

public class MapaMundialMain {
    public static void main(String[] args) {
        MapaMundial mapa = new MapaMundial();
        mapa.inicializarDatos();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== Mapa Mundial ===");
            System.out.println("1. Listar países de un continente");
            System.out.println("2. Listar provincias de un país");
            System.out.println("3. Agregar país");
            System.out.println("4. Agregar provincia");
            System.out.println("5. Agregar países limítrofes");
            System.out.println("6. Ver países limítrofes");
            System.out.println("0. Salir");
            System.out.print("Opción: ");

            int opcion = Integer.parseInt(sc.nextLine());

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese nombre del continente: ");
                    String cont = sc.nextLine();
                    mapa.getPaises(cont).forEach(System.out::println);
                    break;
                case 2:
                    System.out.print("Ingrese nombre del país: ");
                    String pais = sc.nextLine();
                    mapa.getProvincias(pais).forEach(System.out::println);
                    break;
                case 3:
                    System.out.print("Nombre país: ");
                    String np = sc.nextLine();
                    System.out.print("Capital: ");
                    String cap = sc.nextLine();
                    System.out.print("Superficie: ");
                    double sup = Double.parseDouble(sc.nextLine());
                    System.out.print("Continente: ");
                    String contn = sc.nextLine();
                    mapa.agregarPais(np, cap, sup, contn);
                    System.out.println("País agregado.");
                    break;
                case 4:
                    System.out.print("Nombre provincia: ");
                    String prov = sc.nextLine();
                    System.out.print("País: ");
                    String paisProv = sc.nextLine();
                    mapa.agregarProvincia(prov, paisProv);
                    System.out.println("Provincia agregada.");
                    break;
                case 5:
                    System.out.print("País: ");
                    String p1 = sc.nextLine();
                    System.out.print("País limítrofe: ");
                    String p2 = sc.nextLine();
                    mapa.agregarLimitrofe(p1, p2);
                    System.out.println("Relación de países limítrofes agregada.");
                    break;
                case 6:
                    System.out.print("País: ");
                    String p3 = sc.nextLine();
                    mapa.getLimitrofes(p3).forEach(System.out::println);
                    break;
                case 0:
                    sc.close();
                    return;
                default:
                    System.out.println("Opción inválida.");
            }
        }
    }
}
