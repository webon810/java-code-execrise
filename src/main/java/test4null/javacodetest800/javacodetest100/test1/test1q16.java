package test4null.javacodetest800.javacodetest100.test1;

public class test1q16 {
    
    public static void testInts(Integer obj, int var) {
        obj = var++;
        obj++;
    }
    
    public static void main(String[] args) {
        
        Integer val1 = new Integer(5);
        int val2 = 9;
        testInts(val1++, ++val2);
        System.out.println(val1 + " " + val2);
    }
    
}


//output: 6 10