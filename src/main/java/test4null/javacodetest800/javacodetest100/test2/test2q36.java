package test4null.javacodetest800.javacodetest100.test2;

public class test2q36 {
    
    //this is a case of encapulation
    //if change to static is OK to access from main
    //public is not ok to access - need to create 
    //reference to get access
    private double side = 0;
    
    public static void main(String[] args){
        
        //new object - create the reference
        test2q36 sq = new test2q36();
        
        //no value then just 0
        //side = 10;
        sq.side = 10;
        
        double square = sq.side * sq.side;
        
        System.out.println(square);
        
    }
    
}
