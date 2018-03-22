package test4null.javacodetest800.javacodetest100.test5;

public class test5q9 {
    
    
    public static void main(String[] args){
        int k = 9, s = 5;
        switch (k){
            
            default:
                if(k==10){s = s*2;}
                else {
                    s = s + 4;
                    break;
                }
            
                //this is not exceute case it is break there
                case 7 : s = s+3;
            
        }
        System.out.println(s);
    }
    
}


//output: 9