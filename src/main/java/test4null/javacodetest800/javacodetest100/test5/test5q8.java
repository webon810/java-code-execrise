package test4null.javacodetest800.javacodetest100.test5;

public class test5q8 {
    
    public static int m1(int i){
        
        return ++i;
    }
    
    
    public static void main(String[] args){
        
        int k = m1(args.length);
        
        k += 3 + ++k;
        System.out.println(k);
    
    }
    
}

//output: 6 