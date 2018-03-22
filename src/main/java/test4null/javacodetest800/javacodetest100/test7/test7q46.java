package test4null.javacodetest800.javacodetest100.test7;

class q46X {
    
    int val = 10;
}

class q46Y extends q46X {
    
    q46Y val = null;
}

public class test7q46 {
    
    public static void main(String[] args) {
        
        q46Y y = new q46Y();
        
        
        //this valid and output 10
        int k = ((q46X)y).val;

        
        //this will error - incompatible types
        //int k = (q46X)y.val;
        
        System.out.println(k);
        
    }
    
}


//output: 10