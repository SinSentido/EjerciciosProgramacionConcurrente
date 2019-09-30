package ejercicioTablasMultiplicarRunnable;


public class Tabla implements Runnable{
    int num;

    public Tabla(int num){

        this.num = num;
    }

    @Override
    public void run() {
        for(int i=0; i<=10; i++){
            System.out.printf("%d x %d = %d%n", num, i, num*i);
        }
    }
}
