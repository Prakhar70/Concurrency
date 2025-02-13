package HowConcurrencyIsDiff.RaceConditionAndLocks.Lec005CompoundActionAndReentrancy.CompoundActionConsistent;

public class Worker implements Runnable {

    private final Number number;

    public Worker(Number number) {
        this.number = number;
    }

    @Override
    public void run() {
        number.increment();
    }
}
