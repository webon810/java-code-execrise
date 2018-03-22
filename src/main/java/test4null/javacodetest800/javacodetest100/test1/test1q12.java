package test4null.javacodetest800.javacodetest100.test1;

public class test1q12 {
    
    public static void main(String[] args) {
        
        int i;
        int j;
        
        //loop not print anything since j<i
        for(i= 0, j=0; j<i; ++j, i++) {
            System.out.println(i + j);
        }
        
        System.out.println(i + " " + j);
    }
    
}
