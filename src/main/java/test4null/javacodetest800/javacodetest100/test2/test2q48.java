package test4null.javacodetest800.javacodetest100.test2;

public class test2q48 {
    
    public static void main(String[] args){
        
        int var=20, i= 0;
        do{
            //inner loop execute until i = 21, 21<20
            while(true){
                if(i++ > var) break;
            }
            
        }while(i<var--);
        
        System.out.println(var);
        
    }
    
}
//output is 19