package test4null.javacodetest800.javacodetest100.test7;

class q9BestClass {
    
    public void print(String s) {
        System.out.println("BaseClass :" + s);
    }
}


public class test7q9 extends q9BestClass {
    
    public void print(String s) {
        System.out.println("SubClass :" + s);
        
        //with super here will also print "BaseClass :location" under base
        super.print(s);
    }
    
    public static void main(String[] args){
        
        test7q9 sc = new test7q9();
        
        sc.print("location");
        
        //System.out.println("Hello...");
        
    }
    
}

//without super here will also print "SubClass :location"
//with super here will also print "BaseClass :location"
