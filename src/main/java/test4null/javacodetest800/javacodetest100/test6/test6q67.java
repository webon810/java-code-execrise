package test4null.javacodetest800.javacodetest100.test6;

public class test6q67 {
    
    public static void main(String[] args) {
    
        int a = 5, b = 7, k = 0;
        Integer m = null;
        
        //k = new Integer(a) + new Integer(b);
        //k = new Integer(a) + b;
        //k = a + new Integer(b);
        m = new Integer(a) + new Integer(b);
        
        
        System.out.println(m);
        
    }
    
}


//output: 12 // all good