package test4null.javacodetest800.javacodetest100.test3;

public class test3q67 {
    
    public int base;
    public int height;
    
    //will error not able to assign value to final
    //private final double ANGLE;

    private double ANGLE;
    
    
    //cannot assign a value to final ANGLE
    public void setAngle(double a) { ANGLE = a;}
    
    public static void main(String[] args) {
        
        test3q67 t = new test3q67();
        
        t.setAngle(90);
        
        System.out.println(t.ANGLE);
        
    }
    
    
}



//output: 