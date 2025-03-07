package HowConcurrencyIsDiff.RaceConditionAndLocks.Lec004CorrectPlacementOfLock.WrongPlacementButConsistent;
 

public class Worker implements Runnable {
    private final NumberStore numberStore;

    public Worker(NumberStore numberStore) {
        this.numberStore = numberStore;
    }

    @Override
    public void run() {
        synchronized(numberStore){
            for (int i = 0; i < 1000000; i++) {
                numberStore.increment();
            }
        }
    }

}
