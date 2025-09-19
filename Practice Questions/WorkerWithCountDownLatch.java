public class WorkerWithCountDownLatch extends Thread {
    private CountDownLatch latch;

    public WorkerWithCountDownLatch(String name, CountDownLatch latch) {
        this.latch = latch;
        setName(name);
    }

    @Override public void run() {
        try {
            System.out.printf("[ %s ] created, blocked by the latch...\n", getName());
            latch.await();
            System.out.printf("[ %s ] starts at: %s\n", getName(), Instant.now());

        } catch (InterruptedException e) {
            
        }
    }
