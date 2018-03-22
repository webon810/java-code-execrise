package test4null.javacodetest800.javacodetest100.test1;

public class test1q4 {
    
    
    public static void main(String[] args) {
        
        int i=1, j=10;
        
        //int k = 1;
        
        do {
            
            //System.out.println("k: " + k + " i: " + i + " j: " + j);
            //k++;
            
            if(i++ > --j) continue;
        } while(i<5); 
        
        System.out.println("here is real output - i " + i + " j "+ j );

    }
    
}

//k and system.out.println(kij) is for understanding the loop
//output: i 5 j 6