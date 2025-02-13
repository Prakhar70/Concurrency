package HowConcurrencyIsDiff.UnderstandingConcurrency.FirstProgram;

public class FirstProgram {
    public static void main(String[] args) {
        System.out.println("starting main");
        Thread t1 = new Thread(new Sequencer());
        Thread t2 = new Thread(new ReverseSequencer());
        t1.start();// it will start the run method in t1 thread
        t2.start();// it will start the run method in t1 thread
        for (int i = 100; i < 110; i++) {
            System.out.print(i + " ");
        }
    }
}
