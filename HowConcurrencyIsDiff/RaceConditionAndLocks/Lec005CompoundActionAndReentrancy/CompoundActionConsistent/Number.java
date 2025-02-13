package HowConcurrencyIsDiff.RaceConditionAndLocks.Lec005CompoundActionAndReentrancy.CompoundActionConsistent;

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
    public synchronized void increment(){
        int oldVal = getX();
        setX(oldVal+1);
    }
}
