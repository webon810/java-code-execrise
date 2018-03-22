package test4null.javacodetest800.javacodetest100.test5;

//need to declare the MyException here
//if this class is public class - it will need to create q2myexception.java file
class q2MyException extends Throwable {
}

public class test5q2 {
    
    public static void main(String[] args) throws q2MyException {
        
        test5q2 tc = new test5q2();
        
        try{
            
            tc.m1();
            
        }
        
        //catch block is throw checked exception not unchecked exception
        //catch (q2MyException e){
        catch (q2MyException e){
            
            //tc.m1();
            
        } finally {
            
            //no need to handle unchecked exception here
            //tc.m2();
        
        }
        
        //System.out.println("...");
    }
    
    public void m1() throws q2MyException {
        throw new q2MyException();
    };
    public void m2() throws RuntimeException {
        throw new NullPointerException();
    };
    
}

//It will not compile because of unhandled exception.