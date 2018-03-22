package test4null.javacodetest800.javacodetest100.test6;

public class test6q48 {
    
    static String s = "";
    
    public static void m0(int a, int b){
        
        //s is 1 now
        s += a;
        
        m2();
        
        //m1(b) not execute since m2() call Exception
        m1(b);
        
    }
    
    public static void m1(int i){
        
        s +=1;
        
    }
    
    public static void m2(){
        
        throw new NullPointerException("aa");
        
    }
    
    public static void m(){
        
        m0(1,2);
        m1(3);
    }
    
    
    public static void main(String[] args){
        
        try{
            m();
        } catch (Exception e) {
            
            //output 1 now
            System.out.println(s);
        }
        
    }
}


//output is 1