package HowConcurrencyIsDiff.RaceConditionAndLocks.Lec001IntroToRaceCondition.NumberStoreInConsistent;

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
