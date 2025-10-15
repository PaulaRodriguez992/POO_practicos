package tp6;
import java.util.ArrayList;

// ---------------- INTERFAZ ----------------
interface ImpactoEcologico {
    double obtenerImpactoEcologico();
}

// ---------------- CLASE EDIFICIO ----------------
class Edificio implements ImpactoEcologico {
    private String nombre;
    private double consumoEnergiaAnual; // en kWh
    private static final double FACTOR_EMISION = 0.233; // kg CO2/kWh (ejemplo)

    public Edificio(String nombre, double consumoEnergiaAnual) {
        this.nombre = nombre;
        this.consumoEnergiaAnual = consumoEnergiaAnual;
    }

    @Override
    public double obtenerImpactoEcologico() {
        return consumoEnergiaAnual * FACTOR_EMISION;
    }

    @Override
    public String toString() {
        return "Edificio: " + nombre + " | Consumo anual: " + consumoEnergiaAnual + " kWh";
    }
}

// ---------------- CLASE AUTO ----------------
class Auto implements ImpactoEcologico {
    private String modelo;
    private double litrosGasolinaAnual; // litros/año
    private static final double FACTOR_EMISION = 2.31; // kg CO2 por litro de gasolina (aprox)

    public Auto(String modelo, double litrosGasolinaAnual) {
        this.modelo = modelo;
        this.litrosGasolinaAnual = litrosGasolinaAnual;
    }

    @Override
    public double obtenerImpactoEcologico() {
        return litrosGasolinaAnual * FACTOR_EMISION;
    }

    @Override
    public String toString() {
        return "Auto: " + modelo + " | Consumo anual: " + litrosGasolinaAnual + " L gasolina";
    }
}

// ---------------- CLASE BICICLETA ----------------
class Bicicleta implements ImpactoEcologico {
    private String tipo;
    private double kmAnuales; // kilómetros que recorre
    private static final double FACTOR_EMISION = 0.05; 
    // kg CO2/km por fabricación/mantenimiento (aprox, ya que pedaleando no emite directamente)

    public Bicicleta(String tipo, double kmAnuales) {
        this.tipo = tipo;
        this.kmAnuales = kmAnuales;
    }

    @Override
    public double obtenerImpactoEcologico() {
        return kmAnuales * FACTOR_EMISION;
    }

    @Override
    public String toString() {
        return "Bicicleta: " + tipo + " | Km anuales: " + kmAnuales;
    }
}

// ---------------- CLASE MAIN ----------------
public class tp6 {
    public static void main(String[] args) {
        ArrayList<ImpactoEcologico> lista = new ArrayList<>();

        // Crear objetos
        Edificio e1 = new Edificio("Biblioteca Central", 15000);
        Auto a1 = new Auto("Toyota Corolla", 1200);
        Bicicleta b1 = new Bicicleta("Mountain Bike", 2000);

        // Agregarlos al ArrayList
        lista.add(e1);
        lista.add(a1);
        lista.add(b1);

        // Iterar polimórficamente
        for (ImpactoEcologico obj : lista) {
            System.out.println(obj.toString());
            System.out.println("Impacto ecológico anual: " + obj.obtenerImpactoEcologico() + " kg CO2");
            System.out.println("-------------------------------------------");
        }
    }
}
