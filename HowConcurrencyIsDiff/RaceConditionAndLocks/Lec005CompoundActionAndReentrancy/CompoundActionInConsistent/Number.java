package HowConcurrencyIsDiff.RaceConditionAndLocks.Lec005CompoundActionAndReentrancy.CompoundActionInConsistent;

public class Number {
    private int x;

    public Number() {
        x = 0;
    }

    public synchronized int getX() {
        return this.x;
    }

    public synchronized void setX(int val) {
        this.x = val;
    }
}
