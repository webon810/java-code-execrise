package test4null.javacodetest800.javacodetest100.test3;

public class test3q23 {
    
    public static void main(String[] args) {
        
        int i =0;
        boolean bool1 = true;
        boolean bool2 = false;
        boolean bool = false;
        
        bool = (bool2 & method1("1"));
        bool = (bool2 && method1("2"));
        bool = (bool1 | method1("3"));
        bool = (bool1 || method1("4"));
        
    }
    
    public static boolean method1(String str) {
        System.out.println(str);
        return true;
    }
    
}


//output: 1 3 