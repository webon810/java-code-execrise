package test4null.javacodetest800.javacodetest100.test6;

public class test6q46 {
    
    public static void main(String[] args){
    
        int i;
        int j;
        for (i=0, j=0; j<1; ++j, i++) {
            System.out.println(i + " " + j);
            
            //0 1
            //System.out.println(i++ + " " + ++j);
            
            //1 1
            //System.out.println(i + " " + j);
        }
        
        System.out.println(i + " " + j);
        
    }
    
}

//output 0 0 and 1 1