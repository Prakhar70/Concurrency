package HowConcurrencyIsDiff.RaceConditionAndLocks.Lec003MoreOnLocks.LockOnDifferentLock;

public class NumberStore {
    private int x;

    public NumberStore() {
        this.x = 0;
    }

    public void increment(Object lock) {
        synchronized(lock){
            x++;
        }
    }

    public int getX() {
        return x;
    }
}
