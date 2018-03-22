package test4null.javacodetest800.javacodetest100.test7;

public class test7q21 {
    
    
    public static void main(String[] args){
        
        int i = 1;
        int[] iArr = {1};
        incr(i);
        incr(iArr);
        
        System.out.println("i= " + i + " iArr[0]=" + iArr[0]);
        
    }
    
    public static void incr(int n){ n++; }
    public static void incr(int[] n){n[0]++;}
    
}


//output is 1 2