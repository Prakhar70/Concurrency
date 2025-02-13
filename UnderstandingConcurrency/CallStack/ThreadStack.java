package UnderstandingConcurrency.CallStack;

public class ThreadStack {
    public static int func2(){
        return 0;
    }
    public static int func1(){
        int x = func2();
        if(x==0){
            throw new RuntimeException();
        }
        return x;
    }
    public static void main (String[] args){
        try{
            Thread t1 = new Thread(new MyRunnable());
            t1.start();
        }catch(Exception e){
            System.out.println("caught");
        }
    }
}
