package HowConcurrencyIsDiff.RaceConditionAndLocks.Lec006MoreOnCompoundAction.EventCompoundActionExample;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        EventContainer container = new EventContainer(new EventTitle(), new EventSyllabus());
        System.out.println(container.get());
        Thread t1 = new Thread(new Worker(container));
        t1.start();
        Thread.sleep(200);
        System.out.println(container.get());
    }
}
