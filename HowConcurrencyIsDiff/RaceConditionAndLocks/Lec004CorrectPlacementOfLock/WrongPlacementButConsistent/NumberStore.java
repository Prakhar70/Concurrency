package HowConcurrencyIsDiff.RaceConditionAndLocks.Lec004CorrectPlacementOfLock.WrongPlacementButConsistent;
 
public class NumberStore {
    private int x;

    public NumberStore() {
        this.x = 0;
    }

    public void increment() {
            x++;
    }

    public int getX() {
        return x;
    }
}
