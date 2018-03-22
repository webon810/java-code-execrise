package test4null.javacodetest800.javacodetest100.test3;

public class test3q64 {
    
    
    public static void main(String[] args) {
        
        int k = 1;
        int[] a = {1};
        k += (k=4) * (k + 2);
        a[0] += (a[0] =4) * (a[0] + 2);
        System.out.println(k + " " + a[0]);
        
    }
}


//output: 25 25