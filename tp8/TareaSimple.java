package tp8;

// Ejemplo usando la interfaz Runnable
public class TareaSimple implements Runnable {

    private String nombre;

    public TareaSimple(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void run() {
        // Igual que antes, repito 1000 veces el nombre
        for (int i = 0; i < 1000; i++) {
            System.out.println(nombre);
            try {
                Thread.sleep((long) (Math.random() * 1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(nombre + " HECHO!");
    }
}
