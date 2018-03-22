package test4null.javacodetest800.javacodetest100.test5;


class q40XXX {
    
    public void m() throws RuntimeException {
        //throw new RuntimeException();
    }
    
}

class q40YYYY {
    
    public void m() throws IllegalArgumentException{
        //throw new IllegalArgumentException();
    }
    
}

public class test5q40 {
    
    public static void main(String[] args) throws Exception {
        
        //this is for class and sub/base class
       // q40XXX obj = new q40YYYY();
        //obj.m();
    }
}


//comment out will print exception in main