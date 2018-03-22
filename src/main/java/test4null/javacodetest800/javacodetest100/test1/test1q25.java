package test4null.javacodetest800.javacodetest100.test1;

public class test1q25 {
    
    public static void main(String[] args) throws Exception {
        
        String[] sa = {"a", "b", "c"};
        
        for(String s: sa) {
            
            if("b".equals(s)) continue;
            
            System.out.println(s);
            
            if("b".equals(s)) break;
            
            System.out.println(s + " again");
        }
        
        //System.out.println("...");
        
    }
}

//output
//a a again
//c c again