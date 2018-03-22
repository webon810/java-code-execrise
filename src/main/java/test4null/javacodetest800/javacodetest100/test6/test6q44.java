package test4null.javacodetest800.javacodetest100.test6;

public class test6q44 {
    
    public static Integer wiggler(Integer x) {
        
        Integer y = x + 10;
        x++;
        System.out.println(x);
        return y;
        
    }
    
    public static void main(String[] args) {
        
        Integer dataWrapper = new Integer(5);
        Integer value = wiggler(dataWrapper);
        System.out.println(dataWrapper+value);
        
    }
    
}


//output: 6 20