package test4null.javacodetest800.javacodetest100.test6;

interface Pow {
    
    static void wow() {
        System.out.println("In Pow.wow");
    }
    
}

abstract class Wow {
    
    static void wow() {
        System.out.println("In Wow.wow");
    }
    
}

public class test6q52 extends Wow implements Pow {
    
    public static void main(String[] args) {
        
        //here is create a reference
        test6q52 f = new test6q52();
        
        //call the base class i assume here
        f.wow();
        
        //same result as above
        ((Wow)f).wow();
        
        //this is call interface 
        Pow.wow();
        
    }
}


//output:  In Wow.wow