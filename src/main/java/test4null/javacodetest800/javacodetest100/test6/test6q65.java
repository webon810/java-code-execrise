package test4null.javacodetest800.javacodetest100.test6;

public class test6q65 {

    public float parseFloat(String s) {

        float f = 0.0f;

        try {

            f = Float.valueOf(s).floatValue();
            
            //can be removed
            return f;
            
        } catch (NumberFormatException nfe) {

            f = Float.NaN;
            return f;
            
        } finally {
            
            //because return statement execture here
            //or can be removed
            return f;
            
        }
        
        //unreachable statement
        //return f;


    }
    
    
    public static void main(String[] args) {
        
    }
    
    
}
