package ejercicioReloj;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Clock implements Runnable {

    LocalDateTime localTime;

    @Override
    public void run() {
        boolean isInterrupted = false;
        while(!isInterrupted){
            localTime = LocalDateTime.now();
            System.out.printf("Hora: %s%n", localTime);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                isInterrupted = true;
            }
        }
    }
}
