package test4null.javacodetest800.javacodetest100.test7;

public class test7q37 {
    
    public static void main(String[] args){
        
        int i=0, j=11;
        do{
            if(i>j){ break;}
            j--;
        }while( ++i < 5);
        System.out.println(i+" "+j);
        
    }
    
    
}


//output:  5 6
//output: 6 5 