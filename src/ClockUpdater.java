public class ClockUpdater implements Runnable {
    private Clock clock;

    public ClockUpdater(Clock clock) {
        this.clock = clock;
    }

    @Override
    public void run() {
        // This thread doesn't need to do much since we're using System.currentTimeMillis()
        while (true) {
            // Just keep the thread alive
            try {
                Thread.sleep(1000); // Sleep for one second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
