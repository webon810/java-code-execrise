package test4null.javacodetest800.javacodetest100.test4;

public class test4q34 {
    
    public int luckyNumber(int seed) {
        
        if(seed > 10) return seed%10;
        int x = 0;
        try {
            if(seed%2==0) throw new Exception("No Even no. ");
            else return x; 
        } catch (Exception e) {
            return 3;
        } finally {
            
            //will return 7 
            return 7;
        }
        
    }
    
    public static void main(String[] args) {
        
        int amount = 100, seed= 6;
        switch (new test4q34().luckyNumber(6)) {
            case 3: amount = amount * 2;
            
            //here is 100x2 
            case 7: amount = amount * 2;
            
            //continue here since no break
            case 6: amount = amount + amount;
            default:
        }
        
        System.out.println(amount);
    }
}


//output: 400