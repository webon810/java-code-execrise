package test4null.javacodetest800.javacodetest100.test3;

public class test3q16 {
    
    public static int operators() {
        
        int x1 = -4;
        
        // here is -5
        // x2 is first assigned the value of x1 i.e. -4 
        // and then x1 in decremented by 1 to become -5
        int x2 = x1--;
        
        // here is -3  -- why here is -3?
        //becomes -3 first*** and  then its value i.e. -3 is assigned to x3 
        int x3 = ++x2;
        
        // -5 > -4 = false
        if(x2 > x3) {
            
            --x3;
            
        } else {
            
            //here is -4 - first assign -4 
            // and then x1 in incremented by 1 to become -5
            // so x1 still -4 ?
            x1++;
        }
        
        
        //-4 + -3 + -3 = -10
        return x1 + x2 + x3;
    }
    
    
    public static void main(String[] args) {
        
        test3q16 tq16 = new test3q16();
        
        System.out.println(operators());
    }
}


//output: -10