package test4null.javacodetest800.javacodetest100.test1;

public class test1q3 {
    
    //public InitTest(){
    static class InitTest {
        
        //s1 = sM1("1");
    }
    
    static String s1 ;
    
    String s3 = sM1("2");
    
    {s1 = sM1("3"); }
    
    static { s1 = sM1("b"); }
    
    static String s2 = sM1("c") ;
    
    String s4 = sM1("4") ;
    
    public static void main(String[] args) {
        
        //test1q3 t1q3 = new test1q3();
        
        InitTest it = new InitTest();
        
    }
    
    private static String sM1(String s) {
        
        System.out.println(s);
        return s;
        
    }



}


//output: It will print : a b c 2 3 4 1
//it seems code has bug the first block not work