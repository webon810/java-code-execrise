package test4null.javacodetest800.javacodetest100.test5;

public class test5q15 {
    
    int k = 5;

    public boolean checkIt(int k){
        
        return k-->0 ? true : false;
        
    }
    
    public void printThem(){
        
        while (checkIt(k)) {
            
            //chang this k-- and will print 54321
            System.out.println(k--);
        }
    }
    
    public static void main(String[] args){
        
        new test5q15().printThem();
        
        //System.out.println("...");
    }
}


//output: 54321



