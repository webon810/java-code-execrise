package test4null.javacodetest800.javacodetest100.test1;

public class test1q1 {
    
    public static void main(String[] args) {
        
        try{
        
            hello();
            
        }catch (q1Myexpetion me){
            
            System.out.println(me);
        }
        
    }
    
    static void hello() throws q1Myexpetion {
        
        int[] dear = new int[7];
        dear[0] = 747;
        //foo();
        
        //add this will print 747 or 0 if between 1-6
        System.out.println(dear[0]);
        
    }
    
    static void foo() throws q1Myexpetion {
        
        throw new q1Myexpetion("Exception form foo");
        
    }
}

class q1Myexpetion extends Exception {

    public q1Myexpetion(String msg) {

        super(msg);

    }


}


//output: exception from foo (uncomment foo())
//add system.out - this will print 747 or 0 if between 1-6