package test4null.javacodetest800.javacodetest100.test4;

public class test4q39 {
    
    public void doA(int k) throws Exception {
        
        for(int i=0; i<10; i++) {
            if(i == k ) throw new Exception("Index of k is " + i);
        }
        
    }
    
    
    //also need to add throws here
    public void doB(boolean f) throws Exception{
        
        if(f) {
            doA(15);
            
        } else return;
        
    }
    
    
    //need to add throws here
    public static void main(String[] args) throws Exception {
        
        //create reference here to access method in the class
        test4q39 a = new test4q39();
        
        a.doB(args.length>0);
        
        //System.out.println("...");
        
    }
    
    
    
}
