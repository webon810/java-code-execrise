package test4null.javacodetest800.javacodetest100.test1;

public class test1q26 {
    
    public static void main(String[] args){
        
        
        try{
            
            m1();
            System.out.println("A");
            
        } 
        
        catch (Exception ee){
            
            System.out.println("Some exception here.");
            
        } 
        
        finally {
            System.out.println("B");
        }
        
        
        System.out.println("C");
        
    }
    
    public static void m1() throws Exception { throw new Exception();}
    
    
}


//output:  without catch block will Compile time error
//output: with catch block
//Some exception here.
//B
//C