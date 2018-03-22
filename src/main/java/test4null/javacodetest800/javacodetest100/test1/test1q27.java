package test4null.javacodetest800.javacodetest100.test1;

public class test1q27 {
    
    public static int getSwitch(String str) {
        return (int) Math.round( Double.parseDouble(str.substring(1, str.length()-1)));
    }
    
    public static void main(String[] args) {
        
        //switch (getSwitch(args[0])) {
        //switch (getSwitch("--0.50")) {
        switch (0) {
            case 0: System.out.print("Hello ");
            
            //break here then by pass default
            case 1: System.out.print("World"); break;
            
            default: System.out.print("Good Bye");
        }
        
        //System.out.println("...");
    }
    
}


//output:  Hello World
