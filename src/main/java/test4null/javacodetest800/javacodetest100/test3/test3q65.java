package test4null.javacodetest800.javacodetest100.test3;

public class test3q65 {
    
    public static void main(String[] args){
        
        int i = 0, j=5;
        
        lab1: for ( ; ; i++) {
            for( ; ; --j ) if( i>j ) break lab1;
        }
        
        System.out.println(i + " " + j);
        
    }
    
    
    
}


//i = 0 j = 5 
//i = 0 j = 4 
//i = 0 j = 3 
//i = 0 j = 2 
//i = 0 j = 1 
//i = 0 j = 0 
//i = 0 j = -1
//----
//output: 0 -1