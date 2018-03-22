package test4null.javacodetest800.javacodetest100.test2;

public class test2q49 implements I1, I2 {
    
    public void m1(){
        System.out.println("Hello");
    }
    
    public static void main(String[] args){
        
        //create reference here 
        test2q49 tc = new test2q49();
        
        //I1 or I2 - tc to I1 is redundant - still need 
        //without tc will non-static reference static issue
        ((I1)tc).m1();
    }
    
}

interface I1{
    int VALUE = 1;
    void m1();
}

interface I2{
    int VALUE = 2;
    void m1();
}