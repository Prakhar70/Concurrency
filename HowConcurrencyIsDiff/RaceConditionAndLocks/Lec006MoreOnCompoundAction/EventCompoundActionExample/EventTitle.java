package HowConcurrencyIsDiff.RaceConditionAndLocks.Lec006MoreOnCompoundAction.EventCompoundActionExample;

import java.util.Arrays;
import java.util.List;

public class EventTitle {
    public static final List<String> titles = Arrays.asList("DSA", "LLD", "Concurrency", "HLD", "ReactDev");

    private int counter = 0;

    public synchronized void next() {
        counter = (counter + 1) % titles.size();
    }

    public String get() {
        return titles.get(counter);
    }
}
