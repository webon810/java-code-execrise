package test4null.javacodetest800.javacodetest100.test1;

public class test1q31 {
    
    public static void main(String[] args) {
        
        boolean b1 = false;
        boolean b2 = false;
        
        //this way will compile error 
        //if(b2 != b1 = !b2) {
        
        //this way is good
        if(b2 != (b1 = !b2)) {
            
            System.out.println("true");
            
        } else {
            
            System.out.println("false");
            
        }
        
        //System.out.println("...");
    }
    
}


//output: true with ()
//output:  compile error without()