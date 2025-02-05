package src.lab5.exec2;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Laptop implements Chargebale {

    private int batteryLevel;

    @Override
    public int getBatteryLevel() {
        return 0;
    }

    @Override
    public void charge(int durationInMinutes) {


        Timer t = new Timer();

        t.schedule(new TimerTask() {
            final int period = 100 / durationInMinutes;
            int percentage = 0;
            @Override
            public void run() {
                percentage += period;
                System.out.println("Charged " + percentage);
                if (percentage == 100) {
                    System.out.println("Fully charged");
                    t.cancel();
                    t.purge();
                }
            }
        }, 0, 1000);
    }

}
