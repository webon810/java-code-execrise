package test4null.javacodetest800.javacodetest100.test4;

public class test4q56 {
    
    public static void main(String[] args) {
        
        Float f = null;
        try {
            
            //will output this value
            f = Float.valueOf("12.3");
            
            String s = f.toString();
            int i = Integer.parseInt(s);
            System.out.println("i = " + i);
            
        } catch (Exception e) {
            
            System.out.println("trouble : " +f);
            
        }
        
        //System.out.println("...");
        
    }
    
}


//output:  trouble 12.3


