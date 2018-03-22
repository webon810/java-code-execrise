package test4null.javacodetest800.javacodetest100.test3;

public class test3q27 {
    
    int value = 1;
    
    test3q27 link;
    
    public test3q27 (int val) {
        this.value = val;
    }
    
    public static void main(String[] args) {
        
        final test3q27 a = new test3q27(5);
        test3q27 b = new test3q27(10);
                
        a.link = b;
        
        //uncomment here will result - exception in Main - NullPointerException
        //b.link = setIt(a,b);
        
       // System.out.println(a.link.value + " " + b.link.value);

        System.out.println(a.link.value);
    
    }
    
    public static test3q27 setIt(final test3q27 x, final test3q27 y) {
        
        //x.link becomes null because y.link is null 
        x.link = y.link;
        
        return x;
        
    }
    
}

//output:  exception in Main - NullPointExcetion 
//When method setIt() executes, x.link = y.link, 
// x.link becomes null because y.link is null so a.link.value throws NullPointerException.

//by the change here - output : 10