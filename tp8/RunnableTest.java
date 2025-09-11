package tp8;

public class RunnableTest {
    public static void main(String[] args) {
        // Creo hilos a partir de tareas Runnable
        Thread t1 = new Thread(new TareaSimple("Runnable-1"));
        Thread t2 = new Thread(new TareaSimple("Runnable-2"));

        // Arranco ambos
        t1.start();
        t2.start();
    }
}
