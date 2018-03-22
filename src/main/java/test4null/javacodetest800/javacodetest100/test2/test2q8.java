package test4null.javacodetest800.javacodetest100.test2;

public class test2q8 {
    
    public static void main(String[] args){
        int i=0;
        int[] iA = {10, 20};
        iA[i] = i = 30;
        System.out.println(" " + iA[0] + " " + iA[1] + " " + i);
    }
    
}
