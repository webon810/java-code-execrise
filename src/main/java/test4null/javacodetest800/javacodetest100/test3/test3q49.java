package test4null.javacodetest800.javacodetest100.test3;

public class test3q49 {
    
    static test3q49 ref;
    String[] arguments;
    
    public static void main(String[] args) {
        ref = new test3q49();
        ref.func(args);
        //System.out.println("...");
    }
    
    public void func(String[] args) {
        ref.arguments = args;
    }
    
}


//compile and run.