package test4null.javacodetest800.javacodetest200.exam2;

public class exam2q7 {
    
    public static void main(String[] args) {
        
        int num[][] = new int[1][3];
        
        for (int i=0; i<num.length; i++) {
            
            for(int j=0; j < num[i].length; j++ ) {
                
                num[i][j] = 10;
                System.out.println(" i==" + i + " j== " + j);
                
            }
        }
    }
    
}

//output
//i==0 j==0
//i==0 j==1
//i==0 j==2






