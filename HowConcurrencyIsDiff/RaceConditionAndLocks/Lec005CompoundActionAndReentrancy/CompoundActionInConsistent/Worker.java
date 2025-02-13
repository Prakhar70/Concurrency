package HowConcurrencyIsDiff.RaceConditionAndLocks.Lec005CompoundActionAndReentrancy.CompoundActionInConsistent;

public class Worker implements Runnable {

    private final Number number;

    public Worker(Number number) {
        this.number = number;
    }

    @Override
    public void run() {
        int oldVal = number.getX();
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        number.setX(oldVal + 1);
    }
    // compound action = A1,A2

}
