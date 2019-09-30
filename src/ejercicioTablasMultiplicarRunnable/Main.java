package ejercicioTablasMultiplicarRunnable;

public class Main {
    public static void main(String[] args){
        Thread thread1 = new Thread(new Tabla(1));
        thread1.start();
        Thread thread2 = new Thread(new Tabla(2));
        thread2.start();
        Thread thread3 = new Thread(new Tabla(3));
        thread3.start();
        Thread thread4 = new Thread(new Tabla(4));
        thread4.start();

    }
}
