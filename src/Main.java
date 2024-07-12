import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Clock clock = new Clock();

        // Create and start the display thread
        ClockDisplay clockDisplay = new ClockDisplay(clock);
        clockDisplay.start();

        // Create and start the updater thread
        Thread clockUpdater = new Thread(new ClockUpdater(clock));
        clockUpdater.setPriority(Thread.MIN_PRIORITY); // Set lower priority
        clockUpdater.start();
    }
}
