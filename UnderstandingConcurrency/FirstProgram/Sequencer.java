package UnderstandingConcurrency.FirstProgram;

public class Sequencer implements Runnable {
    @Override
    public void run() {
        for (int i = 10; i > 0; i--) {
            System.out.print(i + " ");
        }
    }
}
