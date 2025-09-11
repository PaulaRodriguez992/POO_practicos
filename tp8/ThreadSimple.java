package tp8;

// Ejemplo creando un Thread extendiendo la clase Thread
public class ThreadSimple extends Thread {

    // El constructor recibe el nombre del hilo
    public ThreadSimple(String nombre) {
        super(nombre); // Llamo al constructor de Thread para asignar el nombre
    }

    @Override
    public void run() {
        // Este método se ejecuta cuando llamamos a start()
        for (int i = 0; i < 1000; i++) {
            // Imprimo el nombre del thread
            System.out.println(getName());
            try {
                // Espero entre 0 y 1 segundo (pausa aleatoria)
                Thread.sleep((long) (Math.random() * 1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        // Cuando termina el bucle, muestro que el hilo finalizó
        System.out.println(getName() + " HECHO!");
    }
}
