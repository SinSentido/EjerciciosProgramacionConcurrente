package ejercicioReloj;

public class Main {
    public static void main(String[] args) {
        Thread clockThread = new Thread(new Clock());

        System.out.println("Iniciando reloj...");
        clockThread.start();
        try {
            Thread.currentThread().sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        clockThread.interrupt();
    }
}
