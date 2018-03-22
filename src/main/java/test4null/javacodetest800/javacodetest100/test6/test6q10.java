package test4null.javacodetest800.javacodetest100.test6;

public class test6q10 {
    
    static String str = "Hello World";
    
    public static void changeIt(String s) {
        
        s = "Good by world";
        
    }
    
    public static void main(String[] args) {
        
        changeIt(str);
        
        System.out.println(str);
        
    }
    
}


//output:  Hello World
