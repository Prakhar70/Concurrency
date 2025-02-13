package HowConcurrencyIsDiff.RaceConditionAndLocks.Lec002IntroToLocks.NumberStoreConsistent;

public class NumberStore {
    private int x;
    private Object lock;

    public NumberStore() {
        this.x = 0;
        this.lock = new Object();
    }

    public void increment() {
        synchronized(this.lock){
            x++;
        }
    }

    public int getX() {
        return x;
    }
}
