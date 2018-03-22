package test4null.javacodetest800.javacodetest100.test4;


public class test4q23 {


    public int getLoad() { return 1; }

    //this is cann't be same name as abover or error (same signature)
    public double getLoad11() { return 3.0; }
    
    public static void main(String[] args) {
        
        
        //create reference here to access getLoad() method
        test4q23 t = new test4q23();
        
        int i = t.getLoad();
        double d = t.getLoad11();
        
        System.out.println(i + d);
        
    }
    
}
