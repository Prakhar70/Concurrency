package HowConcurrencyIsDiff.RaceConditionAndLocks.Lec006MoreOnCompoundAction.EventCompoundActionExample;

public class Worker implements Runnable{

    private final EventContainer container;
    public Worker(EventContainer container) {
        this.container = container;
    }
    @Override
    public void run() {
        container.increment();
    }
    
}
