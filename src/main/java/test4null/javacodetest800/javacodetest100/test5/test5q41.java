package test4null.javacodetest800.javacodetest100.test5;

public class test5q41 {
    
    public static void main(String[] args) {
        
        int c = 0;
        A: for(int i = 0; i<2; i++){
            B: for (int j = 0; j<2; j++) {
                C: for (int k = 0; k < 3; k ++) {
                    c++;
                    if(k>j) break ;
                }
            }
        }
        
        //c or c++ same output as 10
        System.out.println(c);
        
    }
    
}

//output: 10
//not easy to understand here