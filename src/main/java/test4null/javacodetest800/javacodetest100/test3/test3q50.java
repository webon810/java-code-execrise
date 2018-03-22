package test4null.javacodetest800.javacodetest100.test3;

public class test3q50 {
    
    
    static double percent=5;
    int offset = 10, base = 50;
    
    public static double calc(double value) {

        //the following 3 need init
        //int coupon, offset, base;
        //looks like this
        int coupon = 0, offset=0, base=2;
        if (percent < 10) {
            
            coupon = 15;
            offset = 20;
            base = 10;
            
        }
        return coupon*offset*base*value/100;
        
    }
    
    public static void main(String[] args) {
        System.out.println(calc(100));
    }
    
}
