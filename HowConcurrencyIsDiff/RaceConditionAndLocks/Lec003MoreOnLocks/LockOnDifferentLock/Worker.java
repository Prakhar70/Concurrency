package HowConcurrencyIsDiff.RaceConditionAndLocks.Lec003MoreOnLocks.LockOnDifferentLock;

public class Worker implements Runnable {
    private final NumberStore numberStore;
    private final Object lock;

    public Worker(NumberStore numberStore, Object lock) {
        this.numberStore = numberStore;
        this.lock = lock;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000000; i++) {
            numberStore.increment(this.lock);
        }
    }

}
