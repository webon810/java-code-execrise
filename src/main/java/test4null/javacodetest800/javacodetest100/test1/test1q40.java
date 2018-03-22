package test4null.javacodetest800.javacodetest100.test1;


class q40A {}

class q40AA extends q40A {}

public class test1q40 {
    
    public static void main(String[] args) {
        
        q40A a = new q40A();
        
        //base class access sub class
        q40AA aa = new q40AA();
        
        a = aa;
        
        System.out.println("a = " + a.getClass());
        System.out.println("aa = " + aa.getClass());
        
    }
    
}


//output: a = class q40AA
