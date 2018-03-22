package test4null.javacodetest800.javacodetest100.test3;

public class test3q4 {
    
    public float parseFloat(String s) {
        
        float f = 0.0f;
        try {
            f = Float.valueOf(s).floatValue();
            return f;

        } catch (NumberFormatException nfe) {

            System.out.println("Invalid input " + s);
            f = Float.NaN;
            return f;

        }
        
        finally {
            System.out.println("finally...");
        }
        
        //unreachable statement here
        //return f;
    }
    
    public static void main(String[] args) {
        
        test3q4 t3q4 = new test3q4();
        
        System.out.println(t3q4.parseFloat("Hello..."));
        
    }
    
    
}


//output: Invalid input Hello... NaN


