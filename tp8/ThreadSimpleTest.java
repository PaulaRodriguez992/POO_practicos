package tp8;

public class ThreadSimpleTest {
    public static void main(String[] args) {
        // Creo dos threads con nombres distintos
        ThreadSimple t1 = new ThreadSimple("Hilo-1");
        ThreadSimple t2 = new ThreadSimple("Hilo-2");

        // Los arranco en paralelo
        t1.start();
        t2.start();
    }
}
