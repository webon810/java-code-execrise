package test4null.javacodetest800.javacodetest100.test7;

public class test7q18 {
    
    String global = "111";

    public int parse(String arg){
        
        int value = 0;
        
        //this way to covert string to int
        //value = Integer.parseInt(arg);
        try {
            String global = arg;
            value = Integer.parseInt(global);
        } catch (Exception e) {
            System.out.println(e.getClass());
        }
        
        // 111 333
        System.out.print(global + " " + value + " ");
        
        //return has to be here or error - missing return statement
        return value;

    }


    public static void main(String[] args){
        
        test7q18 ct = new test7q18();
        
        // 333
        System.out.println(ct.parse("333"));
        
    }
    
    
    
}


//output :  111 333 333