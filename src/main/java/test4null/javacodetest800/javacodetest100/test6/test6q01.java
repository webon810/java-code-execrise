package test4null.javacodetest800.javacodetest100.test6;

public class test6q01 {
    
    public static void main(String[] args){
        
        StringBuilder sb = new StringBuilder("12345678");
        
        //if has this - it will print 12345
        sb.setLength(5);
        
        //it will printe 12345nullnull...for rest of 5
        sb.setLength(10);
        
        //this will print 10
        //System.out.println(sb.length());
        
        System.out.println(sb);
    }
}
