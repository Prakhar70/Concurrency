package UnderstandingConcurrency.CallStack;
public class Main {
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
            func1();
        }catch(Exception e){
            System.out.println("caught");
        }
    }
}
