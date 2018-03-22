package test4null.javacodetest800.javacodetest100.test1;

public class test1q15 {
    
    
    public void initData(String[] arr) {
        
        int ind = 0;
        for(String str : arr) {
            
            //without this will print null null
            //with this will exception in main NullPointerException
            //str.concat(str + ind);
            
            ind++;
        }
        
    }
    
    public void printData(String[] arr) {
        
        for(String str : arr) {
            
            //only here to print null null
            System.out.println(str);
        }
        
    }
    
    public static void main(String[] args) {
        
        //create the reference 
        test1q15 ot = new test1q15();
        
        //there are 2 elements, and init null null
        //and print 2 times as output
        String[] arr = new String[2];
        
        ot.initData(arr);
        ot.printData(arr);
        
    }
    
}
