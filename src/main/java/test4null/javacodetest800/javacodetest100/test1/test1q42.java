package test4null.javacodetest800.javacodetest100.test1;

public class test1q42 {
    
    public static void main(String[] args) {
        
        Object t = new Integer(107);
        
        //this one OK
        int k = ((Integer)t).intValue()/9;

        //it will not compile
        //int k = (Integer)t.intValue()/9;
        
        System.out.println(k);
        
    }
    
}


//output: 11