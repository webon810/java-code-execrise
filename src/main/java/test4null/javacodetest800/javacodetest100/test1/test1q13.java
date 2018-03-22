package test4null.javacodetest800.javacodetest100.test1;

public class test1q13 {
    
    public static void main(String[] args) {
        
        String hello = "Hello", lo = "lo";
        
        System.out.println(q13other.hello == hello + " ");
        System.out.println(hello == ("Hel" + "lo") + " ");
        System.out.println(hello == ("Hel" + lo) + " ");
        System.out.println(hello == ("Hel" + lo).intern());
    }
    
}

class q13other {
    static String hello = "Hello";
}

