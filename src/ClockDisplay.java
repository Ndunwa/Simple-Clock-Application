public class ClockDisplay extends Thread {
    private Clock clock;

    public ClockDisplay(Clock clock) {
        this.clock = clock;
        setPriority(Thread.MAX_PRIORITY); // Set higher priority
    }

    @Override
    public void run() {
        while (true) {
            System.out.println(clock.getCurrentTime());
            try {
                Thread.sleep(1000); // Update every second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
