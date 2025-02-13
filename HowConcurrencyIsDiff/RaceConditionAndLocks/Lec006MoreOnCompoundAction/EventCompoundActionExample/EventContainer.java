package HowConcurrencyIsDiff.RaceConditionAndLocks.Lec006MoreOnCompoundAction.EventCompoundActionExample;

public class EventContainer {
    private final EventTitle title;
    private final EventSyllabus syllabus;

    public EventContainer(EventTitle title, EventSyllabus syllabus) {
        this.syllabus = syllabus;
        this.title = title;
    }
    public synchronized void increment(){
        title.next();
        try{
            Thread.sleep(2000);
        }catch(InterruptedException e){
            throw new RuntimeException();
        }
        syllabus.next();
    }
    public synchronized String get(){
        String s = "Title: " + title.get() + "|" + "Syllabus: " + syllabus.get();
        return s;
    }
}
