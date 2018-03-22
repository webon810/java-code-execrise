package test4null.javacodetest800.javacodetest100.test3;

public class test3q7 {
    
    public static void main(String[] args) {
        
        int i = 4;
        int ia[][][] = new int[i][i=3][i];
        
        //this is base on ia.length = 4, others is 3
        System.out.println(ia.length +","+ ia[0].length +","+ ia[0][0].length);
        
    }
    
    
}


//output: 4 3 3