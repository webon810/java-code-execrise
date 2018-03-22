package test4null.javacodetest800.javacodetest100.test1;

public class test1q47 {
    
    public static void main(String[] args) {
        
        int i=0;
        boolean bool1 = true;
        boolean bool2 = false;
        boolean bool = false;
        
        bool = ( bool2 & method1(i++));
        bool = ( bool2 && method1(i++));
        bool = ( bool1 | method1(i++));
        bool = ( bool1 || method1(i++));
        
        System.out.println(i);
        
    }
    
    public static boolean method1(int i) {
        return i > 0 ? true : false;
    }
    
    
}



//output: 2
//&& and || do not evaluate the rest of the expression, 
// so method1() is not called for 2 and 4.
//value of i is incremented only twice.
