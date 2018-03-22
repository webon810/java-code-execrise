package test4null.javacodetest800.javacodetest100.test1;

public class test1q35 implements q35IInt{
    
    
    public static void main(String[] args){
        
        test1q35 s = new test1q35();
        
        //this is valid class implemtent the interface
        //otherwise not able to find this way
        int j = s.thevalue;
        
        
        //this one is good
        int k = q35IInt.thevalue;
        
        //it is valid if class implemtent the interface
        //otherwise not able to find this way
        int l = thevalue;
        
        System.out.println("i: " + j + " k: " + k + " l: " + l);
    
    }
    
}

//this interface should not public or need to create a file for that
//public interface q35IInt {
interface q35IInt {
    
    int thevalue = 0;
}


//output:  (after modify the code)  ... 0