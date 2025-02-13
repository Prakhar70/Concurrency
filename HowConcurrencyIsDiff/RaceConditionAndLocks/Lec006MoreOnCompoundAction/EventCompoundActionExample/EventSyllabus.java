package HowConcurrencyIsDiff.RaceConditionAndLocks.Lec006MoreOnCompoundAction.EventCompoundActionExample;

import java.util.Arrays;
import java.util.List;

public class EventSyllabus {
    public static final List<String> syllabus = Arrays.asList("Array DP HashMap", "SOLID principles Design pattern",
            "Locking", "Caching", "Async JS");

    private int counter = 0;

    public synchronized void next() {
        counter = (counter + 1) % syllabus.size();
    }

    public String get() {
        return syllabus.get(counter);
    }
}
